# ☕ Java UI Automation

A UI test automation project demonstrating web application testing using Java, Selenium WebDriver, TestNG and the Page Object Model design pattern.

The project contains automated functional and negative test scenarios for a demo web application.

---

## 🧪 Testing Scope

Automated scenarios include:

* User authentication
* Successful login
* Invalid login
* Product search
* Product selection
* Shopping cart
* Logout
* Negative scenarios

---

## 🛠️ Tech Stack

| Technology         | Purpose                       |
| ------------------ | ----------------------------- |
| Java               | Programming language          |
| Selenium WebDriver | UI automation                 |
| TestNG             | Test framework                |
| Maven              | Build & dependency management |
| Page Object Model  | Test architecture             |
| GitHub Actions     | CI/CD                         |

---

## 🏗️ Architecture

The project follows the **Page Object Model (POM)** design pattern.

```text
Tests
  ↓
Page Objects
  ↓
WebDriver
  ↓
Web Application
```

This approach separates test logic from UI locators and makes the framework easier to maintain.

---

## 📂 Project Structure

```text
java-ui-automation/
│
├── src/
│   ├── main/
│   │   └── java/
│   │       ├── pages/
│   │       │   ├── LoginPage.java
│   │       │   └── InventoryPage.java
│   │       │
│   │       └── utils/
│   │           └── DriverFactory.java
│   │
│   └── test/
│       └── java/
│           └── tests/
│               ├── LoginTest.java
│               └── InventoryTest.java
│
├── .github/
│   └── workflows/
│       └── tests.yml
│
├── pom.xml
├── testng.xml
├── .gitignore
└── README.md
```

---

## 🚀 How to Run

Clone the repository:

```bash
git clone https://github.com/YOUR_USERNAME/java-ui-automation.git
```

Navigate to the project:

```bash
cd java-ui-automation
```

Run all tests:

```bash
mvn clean test
```

---

## 🔄 CI/CD

GitHub Actions automatically executes the automated tests when changes are pushed to the repository.

---

## 👩‍💻 Author

**Lamunat Ramaldanova**

QA Engineer | Manual QA | AQA Engineer
