private static void listTasks(String filter) throws IOException {
    Path path = Paths.get(FILE_PATH);
    if (!Files.exists(path)) {
        System.out.println("No tasks found.");
        return;
    }

    String content = Files.readString(path);
    if (content.equals("[]")) {
        System.out.println("Task list is empty.");
        return;
    }

    // Como no tenemos un parser de JSON, vamos a imprimir el contenido
    // de una forma un poco más legible quitando los corchetes.
    System.out.println("Listing tasks (" + filter + "):");

    // Limpieza básica para mostrar en consola
    String cleanContent = content.replace("[", "").replace("]", "");
    String[] tasks = cleanContent.split("(?<=\\}),(?=\\{)"); // Divide por la coma entre llaves

    for (String taskJson : tasks) {
        // Aquí podrías añadir lógica para filtrar por status si quieres
        if (filter.equals("all") || taskJson.contains("\"status\":\"" + filter + "\"")) {
            System.out.println(taskJson);
        }
    }
}