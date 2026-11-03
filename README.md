# Backend Developer Roadmap

Guía práctica para avanzar hacia el desarrollo backend moderno mediante fundamentos, proyectos y recursos de aprendizaje. Este repositorio combina una hoja de ruta de estudio con proyectos pequeños para aplicar lo aprendido.

## Contenido del repositorio

- [Backend projects](./backend-projects/README.md): proyectos prácticos.
- [Task Tracker](./backend-projects/task-tracker/README.md): primer proyecto Java de línea de comandos.
- [Roadmap.sh — Task Tracker](https://roadmap.sh/projects/task-tracker): enunciado de referencia del proyecto.

## Ruta de aprendizaje

### 1. Fundamentos de programación
- Dominar un lenguaje backend (Java, Python, JavaScript/TypeScript, Go o C#).
- Tipos, estructuras de datos, funciones, módulos y manejo de errores.
- Programación orientada a objetos y principios básicos de diseño.
- Git, terminal y depuración.

### 2. Web y HTTP
- Modelo cliente-servidor, DNS, HTTP/HTTPS y códigos de estado.
- Métodos HTTP, headers, cookies, sesiones y CORS.
- Diseño de APIs REST, validación y paginación.
- JSON y contratos de API.

### 3. Bases de datos
- SQL: consultas, joins, índices, constraints y transacciones.
- Modelado relacional y migraciones.
- Fundamentos de NoSQL y criterios de elección.
- Acceso a datos desde una aplicación.

### 4. Construcción de APIs
- Framework backend y arquitectura por capas.
- Autenticación y autorización.
- Validación de entrada y respuestas de error consistentes.
- Logging, configuración por entorno y documentación OpenAPI.

### 5. Calidad y entrega
- Tests unitarios, integración y pruebas de API.
- GitHub Actions y automatización de comprobaciones.
- Docker y despliegue básico.
- Seguridad: gestión de secretos, dependencias y validación de entradas.

### 6. Diseño y escalabilidad
- Caché, colas y procesamiento asíncrono.
- Observabilidad: logs, métricas y trazas.
- Rendimiento, concurrencia y resiliencia.
- Arquitectura modular y decisiones documentadas.

## Proyectos prácticos

| Proyecto | Objetivo | Estado observado |
|---|---|---|
| [Task Tracker](./backend-projects/task-tracker/) | CLI para registrar y listar tareas con persistencia JSON | En desarrollo |

El Task Tracker contiene actualmente clases Java y datos de ejemplo. La implementación todavía es parcial: el listado está separado en un archivo auxiliar, pero la integración de comandos y las operaciones de actualización/eliminación necesitan completarse. Consulta su README antes de ejecutarlo.

## Cómo contribuir a tu aprendizaje

1. Elige un tema de la ruta.
2. Implementa una pequeña funcionalidad en un proyecto.
3. Añade pruebas que documenten el comportamiento esperado.
4. Registra decisiones y comandos de ejecución en el README del proyecto.
5. Revisa y mejora el código antes de avanzar al siguiente tema.

## Recursos

- [roadmap.sh — Backend Developer](https://roadmap.sh/backend)
- [roadmap.sh — Task Tracker](https://roadmap.sh/projects/task-tracker)
- [MDN — HTTP](https://developer.mozilla.org/docs/Web/HTTP)
- [GitHub Skills](https://skills.github.com/)
- [OWASP Top 10](https://owasp.org/www-project-top-ten/)

## Estado del repositorio

Roadmap y proyectos de práctica en evolución. Los proyectos se documentan según su estado real; una funcionalidad marcada como pendiente no debe considerarse implementada.
