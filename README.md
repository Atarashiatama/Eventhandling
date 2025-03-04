# Event Handling System  

## 📌 Project Overview  
The **Event Handling System** is a Spring Boot-based project designed to manage events and users efficiently. 
It integrates **PostgreSQL** as the database and leverages **JPA/Hibernate** for ORM (Object-Relational Mapping).  

## 📂 Project Structure  
EventHandling/

<img width="621" alt="Screen Shot 2025-03-04 at 18 13 38" src="https://github.com/user-attachments/assets/999d7e5b-793e-421e-b9b1-d6da53f36419" />


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
```
3️⃣ Configure Database
Update src/main/resources/application.properties with your PostgreSQL credentials:

properties

spring.datasource.url=jdbc:postgresql://localhost:5432/dbevent
spring.datasource.username=your-username
spring.datasource.password=your-password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect

🗂️ Database Schema

<img width="505" alt="schema" src="https://github.com/user-attachments/assets/6e32bc4a-6ad5-40ba-b453-4030c6ef43a9" />


4️⃣ Run the Application
mvn spring-boot:run
The application will start on http://localhost:8080.
