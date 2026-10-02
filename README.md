# Student CRUD — Spring Boot

A RESTful **Student Management CRUD application** built using **Spring Boot**, **Spring Data JPA**, and **MySQL**.
The project demonstrates how to build a clean backend application with layered architecture and REST APIs for managing student records.

## 🚀 Features

* Create a new student
* Get all students
* Get student by ID
* Update student details
* Delete a student
* RESTful API architecture
* MySQL database integration
* Spring Data JPA for database operations
* Layered architecture using Controller, Service, Repository, and Entity
* Maven-based project
* Exception handling and validation can be extended easily

## 🛠️ Tech Stack

| Technology      | Usage                         |
| --------------- | ----------------------------- |
| Java            | Programming Language          |
| Spring Boot     | Backend Framework             |
| Spring Data JPA | Database Access               |
| Hibernate       | ORM                           |
| MySQL           | Relational Database           |
| Maven           | Build & Dependency Management |
| REST API        | Client-Server Communication   |
| Git & GitHub    | Version Control               |

## 🏗️ Project Architecture

```text
Client
   │
   ▼
Controller
   │
   ▼
Service
   │
   ▼
Repository
   │
   ▼
JPA / Hibernate
   │
   ▼
MySQL Database
```

### Layer Responsibilities

**Controller**

* Handles HTTP requests
* Defines REST API endpoints
* Communicates with the Service layer

**Service**

* Contains business logic
* Acts as a bridge between Controller and Repository

**Repository**

* Handles database operations
* Uses Spring Data JPA

**Entity**

* Represents the Student table in the database

## 📂 Project Structure

```text
CrudSpringBoots
│
├── .mvn/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/demo/
│   │   │       ├── controller/
│   │   │       │   └── StudentController.java
│   │   │       │
│   │   │       ├── entity/
│   │   │       │   └── Student.java
│   │   │       │
│   │   │       ├── repository/
│   │   │       │   └── StudentRepository.java
│   │   │       │
│   │   │       ├── service/
│   │   │       │   └── StudentService.java
│   │   │       │
│   │   │       └── CrudSpringBootsApplication.java
│   │   │
│   │   └── resources/
│   │       └── application.properties
│   │
│   └── test/
│
├── .gitignore
├── pom.xml
├── mvnw
└── mvnw.cmd
```

## 🔗 REST API Endpoints

### Create Student

```http
POST /students
```

Example request:

```json
{
  "name": "Chetan",
  "email": "chetan@example.com",
  "age": 22
}
```

### Get All Students

```http
GET /students
```

### Get Student By ID

```http
GET /students/{id}
```

Example:

```http
GET /students/1
```

### Update Student

```http
PUT /students/{id}
```

Example:

```json
{
  "name": "Chetan Chaudhari",
  "email": "chetan@example.com",
  "age": 23
}
```

### Delete Student

```http
DELETE /students/{id}
```

Example:

```http
DELETE /students/1
```

> **Note:** Update the endpoint paths above if your `StudentController` uses a different base path.

## 🗄️ Database Configuration

This application uses **MySQL** as the database.

Example configuration:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/student_db
spring.datasource.username=your_username
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### ⚠️ Security

Do not commit real database passwords, API keys, or other secrets to GitHub.

Use environment variables for sensitive configuration in real-world applications.

## ▶️ How to Run

### 1. Clone the repository

```bash
git clone https://github.com/Chetanc99/student-crud-spring-boot.git
```

### 2. Navigate to the project

```bash
cd student-crud-spring-boot
```

### 3. Configure MySQL

Create a database:

```sql
CREATE DATABASE student_db;
```

Then configure your database credentials in `application.properties`.

### 4. Run the application

Using Maven:

```bash
mvn spring-boot:run
```

Or using Maven Wrapper on Windows:

```bash
mvnw.cmd spring-boot:run
```

### 5. Test the APIs

The application will normally start on:

```text
http://localhost:8080
```

You can test the APIs using:

* Postman
* Insomnia
* cURL
* Browser for GET requests

## 🧪 Testing

The project contains a test structure under:

```text
src/test/
```

Run tests using:

```bash
mvn test
```

## 📌 CRUD Flow

```text
POST
  │
  ▼
StudentController
  │
  ▼
StudentService
  │
  ▼
StudentRepository
  │
  ▼
MySQL
```

The same flow is used for retrieving, updating, and deleting student records.

## 🎯 Learning Objectives

This project demonstrates practical usage of:

* Spring Boot
* REST API development
* Dependency Injection
* Spring Data JPA
* Hibernate
* Entity Mapping
* Repository Pattern
* Service Layer
* Controller Layer
* MySQL Integration
* Maven
* Git & GitHub

## 🔮 Future Enhancements

Possible improvements include:

* Input validation using Bean Validation
* Global exception handling
* DTO pattern
* Pagination and sorting
* Search students by name/email
* Swagger / OpenAPI documentation
* Unit and integration testing
* Spring Security authentication
* JWT-based authorization
* Docker support

## 👨‍💻 Author

**Chetan Chaudhari**

GitHub: [Chetanc99](https://github.com/Chetanc99)

