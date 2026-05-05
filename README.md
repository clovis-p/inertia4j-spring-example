# Inertia4J Spring Boot 4 Example

**This fork works with Spring Boot 4 and is not intended to get merged upstream in it's current form, it's configured to be ran with a debugger and Gradle will look for Inertia4J in `../inertia4j`.**

Example application made using Spring, Inertia and React, with the Inertia4J Spring adapter.

![Demo](https://github.com/Inertia4J/inertia4j-spring-example/blob/assets/Demo.gif)

## Running

1. Install [Docker](https://docker.com) and [Docker Compose](https://docs.docker.com/compose/).
2. Run `docker-compose up`.
3. Start a remote JVM debugger attached to `localhost:5005`
4. Access [http://localhost:5173](http://localhost:5173).

The server running on port 5173 is a custom Vite development server and should work for other frontend and backend frameworks.
If necessary, you can tweak it by modifying [server.js](/src/main/front/server.js).
