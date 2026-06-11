# SpringSecurity

A simple project demonstrating how to implement **Spring Security** with JWT authentication, role‑based authorization, and secure REST APIs.

---

## 🚀 Features
- User registration and login with encoded passwords (BCrypt).
- JWT (JSON Web Token) authentication and authorization.
- Role‑based access control (`ROLE_USER`, `ROLE_ADMIN`).
- Stateless session management.
- Secure endpoints with custom filters.
- Modular code structure following best practices.

---

## 📂 Project Structure
SpringSecurity/
├── src/main/java/com/security/
│    ├── config/        # Security configuration (filters, auth manager, rules)
│    ├── entity/        # User entity implementing UserDetails
│    ├── repo/          # JPA repositories
│    ├── service/       # Business logic & UserDetailsService
│    └── controller/    # REST endpoints
├── pom.xml             # Maven dependencies
├── mvnw, mvnw.cmd      # Maven wrapper
└── README.md           # Project documentation


---

## ⚙️ Tech Stack
- **Java 17+**
- **Spring Boot 3**
- **Spring Security**
- **JWT**
- **Hibernate / JPA**
- **MySQL** (configurable in `application.properties`)
- **Maven**

---

## 🔑 Endpoints
- `POST /auth/register` → Register new user
- `POST /auth/login` → Authenticate and receive JWT
- `GET /secure-data` → Accessible only to `ROLE_USER`
- `GET /admin/**` → Accessible only to `ROLE_ADMIN`

---

## 🔐 Authentication Flow

sequenceDiagram
    participant Client
    participant Server
    participant DB

    Client->>Server: POST /auth/register (username, password)
    Server->>DB: Save user with encoded password
    DB-->>Server: Success
    Server-->>Client: Registration successful

    Client->>Server: POST /auth/login (username, password)
    Server->>DB: Validate user credentials
    DB-->>Server: Valid user
    Server-->>Client: JWT Token

    Client->>Server: GET /secure-data (Authorization: Bearer Token)
    Server->>Server: Validate JWT & Role
    Server-->>Client: Secure data response




## 🛠️ Setup & Run
1. Clone the repository:
   ```bash
   git clone https://github.com/CoderRushikesh/SpringSecurity.git
   cd SpringSecurity


