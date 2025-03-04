# Event Handling System  

## 📌 Project Overview  
The **Event Handling System** is a Spring Boot-based project designed to manage events and users efficiently. It integrates **PostgreSQL** as the database and leverages **JPA/Hibernate** for ORM (Object-Relational Mapping).  

## 📂 Project Structure  
EventHandling/
│-- src/
│   ├── main/
│   │   ├── java/com/eventhandling/
│   │   │   ├── entity/                 # Contains JPA entity classes
│   │   │   │   ├── Events.java
│   │   │   │   ├── Userdb.java
│   │   │   ├── repository/             # Repository interfaces for database access
│   │   │   │   ├── EventRepository.java
│   │   │   │   ├── UserRepository.java
│   │   │   ├── config/                 # Database and application configurations
│   │   │   │   ├── DatabaseConfig.java  # Optional configuration class
│   │   │   ├── EventHandlingApplication.java  # Main entry point for Spring Boot
│   │   
│   ├── resources/
│   │   ├── application.properties  # Database configuration properties
│   │   ├── schema.sql              # SQL script to create database tables
│
│-- pom.xml                         # Maven dependencies and project setup
│-- README.md                       # Project documentation

markdown
Copy
Edit

## 🛠️ Tech Stack  
- **Java** (JDK 17 or later)  
- **Spring Boot** (Spring Web, Spring Data JPA)  
- **PostgreSQL** (Database)  
- **Maven** (Dependency Management)  

## 🛠️ Setup Guide  

### 1️⃣ Prerequisites  
- Install **Java 17+**  
- Install **PostgreSQL** and create a database named `dbevent`  
- Install **Maven**  

### 2️⃣ Clone the Repository  
```bash
git clone https://github.com/your-username/EventHandling.git
cd EventHandling
3️⃣ Configure Database
Update src/main/resources/application.properties with your PostgreSQL credentials:

properties

spring.datasource.url=jdbc:postgresql://localhost:5432/dbevent
spring.datasource.username=your-username
spring.datasource.password=your-password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect

4️⃣ Run the Application
mvn spring-boot:run
The application will start on http://localhost:8080.

🗂️ Database Schema
<img width="505" alt="Screen Shot 2025-03-04 at 17 53 22" src="https://github.com/user-attachments/assets/eaedf1bc-446b-4bd3-aefa-749e7b83a90b" />

