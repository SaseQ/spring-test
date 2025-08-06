# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Common Commands

- **Build & Verify:** To run the full build including tests and all quality checks (formatting, static analysis), use:
  ```bash
  mvn verify
  ```
- **Clean the project:**
  ```bash
  mvn clean
  ```
- **Run all tests:**
  ```bash
  mvn test
  ```
- **Run a single test:**
  ```bash
  mvn -Dtest=YourTestClassName#yourTestMethodName test
  ```
- **Apply code formatting:**
  ```bash
  mvn spotless:apply
  ```

## Code Architecture

This is a standard Spring Boot application following a layered architecture.

- **`pom.xml`:** The project is managed by Maven. All dependencies and build plugins (Spotless, Checkstyle, PMD, SpotBugs) are defined here.
- **Controllers (`src/main/java/dev/saseq/springtest/controller`):** Handle incoming HTTP requests, delegate business logic to services, and return HTTP responses.
- **Services (`src/main/java/dev/saseq/springtest/service`):** Contain the core business logic.
- **Tests (`src/test/java/dev/saseq/springtest`):** Unit and integration tests are written using JUnit 5 and Mockito.

## Session Summaries

- @ai_docs/session_summary_20250806.md: Initial project setup, CI/CD configuration, and first feature implementation.
