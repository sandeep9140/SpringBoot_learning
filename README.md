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
