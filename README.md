# 🚀 Spring Boot Learning Journey — Day 2

## 📚 Component Scanning & Application Configuration

Day 2 of my Spring Boot learning journey.

Today I learned how Spring Boot discovers components, creates and manages Beans, handles package scanning, and provides basic application configuration.

---

## 📌 Topics Covered

### 1. `@SpringBootApplication`

- Same package
- Inner/Sub-packages
- Different/Outer packages
- Basic understanding of package scanning
- How package structure affects component discovery

---

### 2. `@Component`

`@Component` marks a class as a Spring-managed component.

```java
@Component
public class MyService {

    public String message() {
        return "Hello Spring Boot";
    }
}



======================================================

# 🌱 Spring Boot — Stereotype Annotations & Runners

This project covers the basics of **Spring Boot Stereotype Annotations** and **Spring Boot Runners** with practical examples.

---

## 📚 Topics Covered

### 1. Spring Stereotype Annotations

- `@Component`
- `@Service`
- `@Repository`
- `@Controller`
- `@RestController`
- `@Configuration`
- `@Bean`

### 2. Annotation Differences

- `@Component` vs `@Service`
- `@Service` vs `@Repository`
- `@Controller` vs `@RestController`
- `@Component` vs `@Bean`
- When to use which annotation
- Real Spring Boot project structure

### 3. Spring Boot Runners

- What is a Runner?
- `CommandLineRunner`
- `ApplicationRunner`
- Runner execution during application startup
- Multiple Runners
- `@Order`
- `CommandLineRunner` vs `ApplicationRunner`
- Practical startup examples

---

# 🌱 Spring Stereotype Annotations

Spring stereotype annotations help Spring identify and manage classes as **Spring Beans**.

### `@Component`

Used for a general-purpose Spring-managed component.

```java
@Component
public class EmailSender {

    public void sendEmail() {
        System.out.println("Email Sent");
    }
}



=======================================================================================================

# Spring Boot - JPA, CrudRepository & Dependency Injection

This repository contains my learning notes and practice code for important Spring Boot and Spring Data JPA concepts.

## 📚 Topics Covered

### 1. `spring.jpa.hibernate.ddl-auto`

This property controls how Hibernate manages the database schema when the Spring Boot application starts.

properties
spring.jpa.hibernate.ddl-auto=update



===================================================================================================
==================================================================================================

# Spring Data JPA - CrudRepository

This project demonstrates the basic use of `CrudRepository` in Spring Boot with Spring Data JPA.

## 📚 What is CrudRepository?

`CrudRepository` is an interface provided by **Spring Data** that provides ready-made methods for basic database operations.

CRUD means:

- **C** → Create
- **R** → Read
- **U** → Update
- **D** → Delete

We don't need to write the implementation of these basic methods manually. Spring Data provides them automatically.

---

## 🔹 Creating Repository

```java
package com.sandeep.repo;

import org.springframework.data.repository.CrudRepository;
import com.sandeep.entities.Students;

public interface StudentRepo extends CrudRepository<Students, Integer> {

}


=============================================================================================================
=============================================================================================================


# 🚀 Spring Boot Learning Journey — Day 4

## 📚 JPA Automatic ID Generation & CRUD Repository Operations

Day 4 of my Spring Boot learning journey.

Today I focused on two important areas:

1. **Automatic ID Generation using JPA**
2. **Basic CRUD operations using `CrudRepository`**

---

# 📌 Topics Covered

- `@Id`
- `@GeneratedValue`
- `GenerationType`
- `GenerationType.IDENTITY`
- Automatic ID generation with MySQL
- `CrudRepository`
- `save()`
- `delete(entity)`
- `deleteById(id)`
- Basic JPA + Hibernate + Database flow

---

# 1️⃣ Automatic ID Generation

When inserting a new record into a database, we usually don't want the user to manually provide the ID.

JPA can automatically generate the ID for us.

### Example

```java
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String email;

    // Getters and Setters
}
===================================================================================
===================================================================================


# 🚀 Spring Boot — JpaRepository CRUD Operations

<p align="center">
  <b>Spring Boot + Spring Data JPA + Hibernate + MySQL</b>
</p>

<p align="center">
  A beginner-friendly project demonstrating database operations using 
  <b>JpaRepository</b>.
</p>

---

## 🟢 Project Overview

This project demonstrates how to use **Spring Data JPA's `JpaRepository`**
with a Spring Boot application to perform database operations on an
**Employee** entity.

### 🛠️ Technologies Used

| Technology | Purpose |
|---|---|
| ☕ Java | Programming Language |
| 🌱 Spring Boot | Application Framework |
| 🗄️ Spring Data JPA | Database Access |
| ⚡ Hibernate | ORM Framework |
| 🐬 MySQL | Database |
| 📦 Maven | Dependency Management |

---

## 🏗️ Project Structure

```text
📦 MyProject11
│
└── 📂 src/main/java/com/sandeep
    │
    ├── 🚀 MyProject11Application.java
    │
    ├── 📂 entities
    │   └── 👤 Employee.java
    │
    ├── 📂 repo
    │   └── 🗃️ EmployeeRepo.java
    │
    ├── 📂 service
    │   └── ⚙️ EmployeeService.java
    │
    └── 📂 serviceImp
        └── 🔧 EmployeeServiceImpl.java






=====================================================================

=======================================================================



# 🚀 Spring Boot Learning Journey — Day 5

## 📚 Multiple Records, Pagination & Sorting

Day 5 of my Spring Boot learning journey.

Today I focused on working with **multiple records in a database** and learned how **Pagination and Sorting** can be used with Spring Data JPA to retrieve data in an organized way.

---

# 📌 Topics Covered

- Inserting multiple records into the database
- Automatic ID generation
- `@Id`
- `@GeneratedValue`
- `GenerationType.IDENTITY`
- `Page`
- `Pageable`
- `PageRequest`
- Pagination
- Sorting
- Pagination + Sorting together
- Page number
- Page size
- Total pages
- Total elements
- Getting page content

---

# 1️⃣ Multiple Records in Database

Instead of inserting only one record, we can save multiple entities into the database.

Example:

```java
Student s1 = new Student();
s1.setName("Rahul");

Student s2 = new Student();
s2.setName("Aman");

Student s3 = new Student();
s3.setName("Rohit");

studentRepo.save(s1);
studentRepo.save(s2);
studentRepo.save(s3);


==============================================================================================
==============================================================================================
# JPQL / HQL in Spring Data JPA

This project demonstrates the basics of **JPQL (Java Persistence Query Language)** and **HQL (Hibernate Query Language)** using Spring Data JPA.

The project focuses on writing custom queries with `@Query`, using parameters, applying conditions, sorting, and understanding how JPQL works with entities and their fields.

---

## 📌 Topics Covered

- JPQL
- HQL
- SQL vs JPQL
- `@Query`
- Entity names in JPQL
- Entity field names in JPQL
- Positional Parameters
- Named Parameters
- `@Param`
- Multiple Conditions
- `AND` / `OR`
- `ORDER BY`
- `ASC` / `DESC`
- Update Query
- Delete Query
- Query Result Handling
- Practical debugging of JPQL queries

---

## 🔹 What is JPQL?

JPQL stands for:

**Java Persistence Query Language**

JPQL is used to query JPA entities.

Unlike SQL, JPQL works with:

- Entity class names
- Entity field names
- Java objects

### Example

```java
@Query("SELECT c FROM Course c WHERE c.cname = :mycname")
Course getCourse(@Param("mycname") String mycname);




============================================================================================
===============================================================================================
# Spring Data JPA - Entity Relationships

## 📌 Overview

This project demonstrates different types of Entity Relationships in **Spring Data JPA / Hibernate** using Java and MySQL.

The main goal of this project is to understand how multiple entities are connected with each other and how JPA manages these relationships in the database.

---

## 🛠️ Technologies Used

- Java 21
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- IntelliJ IDEA / Eclipse

---

# 📚 Topics Covered

This project covers:

1. One-to-One Relationship
2. One-to-One Unidirectional
3. One-to-One Bidirectional
4. One-to-Many Relationship
5. Many-to-One Relationship
6. One-to-Many Bidirectional
7. Many-to-Many Relationship
8. Many-to-Many Unidirectional
9. Many-to-Many Bidirectional
10. `@JoinColumn`
11. `@JoinTable`
12. `mappedBy`
13. Owning Side
14. Inverse Side
15. Join Table
16. Foreign Keys

---

# 1️⃣ One-to-One Relationship

In a One-to-One relationship, one record of an entity is associated with only one record of another entity.

### Example

```text
Student  →  Address
