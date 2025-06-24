# 🚀 J2EE-WS-Jersey

## 📝 Project Overview

**J2EE-WS-Jersey** is a practical Java EE project that demonstrates how to build RESTful web services using the Jersey framework (JAX-RS reference implementation). This project covers REST API endpoint creation, MVC integration with JSP, multipart file uploads, dependency injection, and middleware patterns using request and response filters. It’s perfect for developers looking to learn modern REST API development and middleware integration in enterprise Java applications.

---

## 📽️ Demo Video
[![J2EE-WS-Jersey Project Demo](https://github.com/chamikathereal/J2EE-WS-Jersey/blob/main/J2EE-WS-Jersey.png)](https://youtu.be/ClSRi57aYtw)

---

## 🗂️ Project Structure

```
J2EE-WS-Jersey/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── lk.jlat.app.jersey/
│   │   │       ├── annotation/
│   │   │       │   └── UserBind
│   │   │       ├── config/
│   │   │       │   ├── AppConfig
│   │   │       │   └── DependencyBinder
│   │   │       ├── controller/
│   │   │       │   └── HomeController
│   │   │       ├── middleware/
│   │   │       │   ├── RequestFilter
│   │   │       │   └── ResponseFilter
│   │   │       └── model/
│   │   │           └── User
│   │   ├── resources/
│   │   └── webapp/
│   │       ├── upload/
│   │       └── WEB-INF/
│   │           ├── views/
│   │           │   └── index.jsp
│   │           └── web.xml
│   └── test/
├── pom.xml
```

---

## 📦 Module Details

#### 🟦 **annotation**
- **UserBind**  
  Custom annotation for name binding, enabling targeted middleware or dependency injection for user-related resources.

  ##

#### 🟦 **config**
- **AppConfig**  
  Jersey application configuration class. Registers controller and middleware packages, enables JSP MVC integration, and sets the template base path.
- **DependencyBinder**  
  Configures dependency injection for the `User` model using HK2.

  ##

#### 🟦 **controller**
- **HomeController**  
  Handles root REST endpoints and file uploads.  
  - `GET /` renders the JSP view with a dynamic model.
  - `POST /file_upload` supports multipart file uploads and saves files to the server.
 
  ##

#### 🟦 **middleware**
- **RequestFilter**  
  Logs or preprocesses all incoming REST requests.
- **ResponseFilter**  
  (Can be enabled) Handles logging or modification of outgoing REST responses.

  ##

#### 🟦 **model**
- **User**  
  Request-scoped POJO representing user data, supporting dependency injection and annotation-based binding.

  ##

#### 🟦 **webapp/WEB-INF/views**
- **index.jsp**  
  JSP view rendered by Jersey’s MVC feature, displaying dynamic content from the controller.

  ##

#### 🟦 **webapp/WEB-INF**
- **web.xml**  
  Configures Jersey’s servlet filter, application class, and URL mapping for REST endpoints.

---

## ⚙️ Key Features

- ✅ RESTful API endpoints built with Jersey (JAX-RS)
- ✅ MVC integration with JSP for dynamic web views
- ✅ Multipart file upload support
- ✅ Dependency injection with HK2 and custom binding
- ✅ Middleware logic using request and response filters
- ✅ Clean, modular Maven project structure

---

## 💡 How It Works

- **Jersey Configuration:**  
  `AppConfig` sets up the Jersey application, registers controllers and middleware, and enables JSP support for MVC-style views.
  
- **REST Controller:**  
  `HomeController` handles HTTP GET requests for the home page and POST requests for file uploads, saving files to the `/upload` directory.
  
- **Dependency Injection:**  
  `DependencyBinder` ensures the `User` model can be injected where needed.
  
- **Middleware Filters:**  
  `RequestFilter` logs or processes incoming requests; `ResponseFilter` (optional) can log or modify outgoing responses.
  
- **JSP View:**  
  `index.jsp` displays dynamic content from the model, demonstrating REST-to-view integration.

---

## 🛠️ Technologies Used

- Java 11
- Jakarta EE 10 (JAX-RS)
- Jersey (MVC, Filters, Multipart)
- JSP
- Maven
- Commons IO

---

## 📚 Learning Outcomes

- ✅ Build RESTful web services with Jersey in Java EE
- ✅ Integrate MVC patterns with REST endpoints and JSP views
- ✅ Implement multipart file uploads in REST APIs
- ✅ Use dependency injection and annotation-based binding
- ✅ Apply middleware logic with request and response filters
- ✅ Structure enterprise Java projects for clarity and maintainability

---

## 🧑‍💻 Author

Chamika Gayashan  
Undergraduate Software Engineer | Sri Lanka  
Linkedin: @chamikathereal  
Current date: Tuesday, June 24, 2025, 8:46 PM +0530
