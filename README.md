# Book Store Management System

A REST API for managing bookstore inventory built with Spring Boot, Hibernate JPA, and MySQL. Developed during Java Backend Internship at TVK Technologies.

---

## Tech Stack

| Layer | Technology |
|-------|-----------|
| Language | Java (Core Java, J2EE) |
| Framework | Spring Boot, Spring MVC |
| ORM | Hibernate (JPA), Spring Data JPA |
| Database | MySQL |
| Build Tool | Maven |
| API Testing | Postman |
| Version Control | Git, GitHub |

---

## Features

- Add, view, update, and delete books (CRUD)
- Search books by name (case-insensitive)
- Search books by author (case-insensitive)
- Pagination and sorting support
- Layered architecture with exception handling

---

## Project Architecture

```
Controller → Service → DAO → Repository → Database
```

| Layer | Responsibility |
|-------|---------------|
| Controller | Handles HTTP requests and responses |
| Service | Business logic |
| DAO | Data access operations |
| Repository | JPA repository interface |

---

## API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/book/bookregister` | Add a new book |
| GET | `/book/getallbooks` | Get all books |
| GET | `/book/getbyname?name=` | Search by name |
| GET | `/book/getbyauthor?author=` | Search by author |
| PUT | `/book/updatebook` | Update book details |
| DELETE | `/book/deletebook?id=` | Delete a book |
| GET | `/book/pagination?pageNumber=&pageSize=&sortBy=` | Paginated results |

---

## How to Run

1. Clone the repository
```
git clone https://github.com/Saraswathi-0302/TVK-intern-Book-Store-.git
```

2. Configure MySQL in `src/main/resources/application.properties`
```
spring.datasource.url=jdbc:mysql://localhost:3306/bookstore
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```

3. Run the application
```
mvn spring-boot:run
```

4. Test APIs using Postman at http://localhost:8080

---

## Developer

**Saraswathi M** — Java Backend Developer
- LinkedIn: https://www.linkedin.com/in/saraswathim02
- GitHub: https://github.com/Saraswathi-0302
