import java.nio.file.*;
import java.io.IOException;
import java.util.*;

public class Main {
    private static final String FILE_PATH = "tasks.json";

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: task-cli <command> [arguments]");
            return;
        }

        String command = args[0];

        try {
            switch (command) {
                case "list":
                    String filter = args.length > 1 ? args[1] : "all";
                    listTasks(filter);
                    break;
                case "add":
                    if (args.length < 2) {
                        System.out.println("Error: Please provide a description.");
                    } else {
                        addTask(args[1]);
                    }
                    break;
                default:
                    System.out.println("Command not implemented yet.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    private static void listTasks(String filter) {
    }

    private static void addTask(String description) throws IOException {
        Path path = Paths.get(FILE_PATH);

        // Ensure file exists
        if (!Files.exists(path)) {
            Files.writeString(path, "[]");
        }

        // Read existing content
        String content = Files.readString(path).trim();

        // Simple ID generation (for now, let's use a random number or count)
        int id = (int) (Math.random() * 1000);
        Task newTask = new Task(id, description);

        // Very basic JSON array manipulation:
        // If file is "[]", change it to "[task]"
        // If file is "[task1]", change it to "[task1, task2]"
        String jsonTask = newTask.toJson();
        String updatedContent;
        if (content.equals("[]")) {
            updatedContent = "[" + jsonTask + "]";
        } else {
            updatedContent = content.substring(0, content.length() - 1) + "," + jsonTask + "]";
        }

        Files.writeString(path, updatedContent);
        System.out.println("Task added successfully (ID: " + id + ")");
    }
}