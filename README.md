# Banking Core API 🏦

A production-grade banking REST API built with Java and Spring Boot, implementing
real-world banking patterns and industry standards.

> 🚧 **Currently in active development** - Features being added weekly

---

## About This Project

This is a personal learning project where I am actively learning backend engineering
and how real-world banking systems are built. I am researching how banking systems
actually work and attempting to implement the same features, patterns and architectural
decisions they use - even if that means tackling concepts I have never encountered before.

---

## My Learning Journey

I am a developer learning backend engineering and how banking systems work under the hood.
Through building this project I am picking up concepts that were completely new to me,
including:

- **Database Migrations (Flyway)** - Version controlling database schema changes rather than
  letting Hibernate auto-create tables. Understanding why this matters in team environments
  and production deployments.

- **Ledger-Based Accounting** - Learning how banking systems derive balances from transaction
  history rather than storing a balance field directly. Exploring event sourcing and
  immutability as a result.

- **Idempotency** - Understanding why financial APIs need idempotency keys to prevent
  duplicate transactions when users double-click or networks retry requests.

- **Concurrency Control** - Learning how optimistic locking with JPA @Version prevents
  data corruption when multiple requests hit the same account simultaneously.

- **Redis Caching** - Understanding caching strategies, TTLs, and cache invalidation.
  Learning when and why to cache calculated data like account balances.

- **JWT Security** - Implementing stateless authentication from scratch rather than
  using pre-built solutions, to understand how it actually works.

I am documenting this journey honestly. Some of these concepts I have just learned,
others I am still deepening my understanding of as I build.

---

## Planned Features

### Authentication & Security
- JWT-based stateless authentication
- BCrypt password hashing
- Role-based access control (Customer and Admin roles)
- Input validation on all endpoints

### Account Management
- Create and manage bank accounts (Savings and Current)
- Account status management (Active, Frozen, Closed)
- Balance derived from ledger - never stored directly

### Ledger-Based Transactions
- Deposit, withdrawal, and transfer operations
- Every transaction recorded as immutable ledger entry
- Double-entry bookkeeping for transfers
- Complete transaction history with pagination

### Idempotency
- Every transaction requires a unique idempotency key
- Prevents duplicate charges from double clicks or network retries
- Safe for client-side retry logic

### Concurrency Control
- Optimistic locking prevents data corruption
- Safe handling of simultaneous transactions on same account
- Race condition protection

### Multi-Layer Redis Caching
- Calculated balances cached for performance
- Smart cache invalidation on new transactions
- Multiple cache layers with different TTLs based on data access patterns

### Production Standards
- Ledger-based accounting
- Database version control with Flyway migrations
- ACID transactions ensuring financial data integrity
- Comprehensive API documentation with Swagger
- Health checks and monitoring with Spring Actuator
- Structured logging

---

## Technology Stack

| Component | Technology | Version |
|-----------|-----------|---------|
| Language | Java | 21 |
| Framework | Spring Boot | 3.5.10 |
| Database | PostgreSQL | 15 |
| Cache | Redis | 7 |
| ORM | Spring Data JPA | - |
| Security | Spring Security + JWT | - |
| DB Migrations | Flyway | - |
| Build Tool | Maven | - |
| Testing | JUnit 5, Mockito, TestContainers | - |
| API Docs | SpringDoc OpenAPI (Swagger) | - |
| Monitoring | Spring Boot Actuator | - |
| Containerization | Docker | - |

---

## Architecture

```
Controller Layer    →    Handles HTTP requests and responses
       ↓
Service Layer       →    Business logic and transaction management
       ↓
Repository Layer    →    Database access via Spring Data JPA
       ↓
PostgreSQL          →    Ledger entries as source of truth
       ↑
Redis               →    Caches calculated balances for performance
```

---

## Roadmap

- [x] Project setup and infrastructure (Docker, PostgreSQL, Redis)
- [x] Database migrations with Flyway
- [x] User entity and repository
- [ ] JWT authentication (register and login)
- [ ] Account management
- [ ] Ledger-based transactions (deposit, withdraw, transfer)
- [ ] Idempotency implementation
- [ ] Redis caching layer
- [ ] Optimistic locking for concurrency
- [ ] Unit and integration tests
- [ ] Swagger documentation
- [ ] Deployment

---

