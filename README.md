# Task Manager

A simple full-stack task manager built with Spring Boot.

## Features
- Create, view, update and delete tasks (REST API)
- Input validation
- PostgreSQL database with Spring Data JPA
- Simple HTML/JavaScript front end

## Tech stack
Java, Spring Boot, Spring Data JPA, PostgreSQL, Maven

## Run it locally
1. Install JDK 21+ and PostgreSQL.
2. Create a database named `taskdb`.
3. Set the environment variable `DB_PASSWORD` to your PostgreSQL password.
4. Run `TaskmanagerApplication`.
5. Open http://localhost:8080

## API endpoints
| Method | URL | Description |
|---|---|---|
| GET | /tasks | List all tasks |
| GET | /tasks/{id} | Get one task |
| POST | /tasks | Create a task |
| PUT | /tasks/{id} | Update a task |
| DELETE | /tasks/{id} | Delete a task |
