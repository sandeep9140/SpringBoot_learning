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
