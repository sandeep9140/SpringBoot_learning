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
