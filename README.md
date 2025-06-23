# 🚀 J2EE-WS-Jersey

## 📝 Project Overview

**J2EE-WS-Jersey** is a simple yet robust Java EE project that demonstrates how to build RESTful web services using the Jersey framework (JAX-RS reference implementation). The project showcases the creation of REST endpoints, MVC integration with JSP views, and the use of request/response filters for middleware logic. This is ideal for learning modern REST API development and middleware patterns in enterprise Java applications[1][2][3].

---

## 🗂️ Project Structure

```
J2EE-WS-Jersey/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── lk.jlat.app.jersey/
│   │   │       ├── config/
│   │   │       │   └── AppConfig
│   │   │       ├── controller/
│   │   │       │   └── HomeController
│   │   │       └── middleware/
│   │   │           ├── RequestFilter
│   │   │           └── ResponseFilter
│   │   ├── resources/
│   │   └── webapp/
│   │       └── WEB-INF/
│   │           ├── views/
│   │           │   └── index.jsp
│   │           └── web.xml
├── pom.xml
```


---

## 📦 Module Details

#### 🟦 **config**
- **AppConfig**  
  Jersey application configuration class. Registers controller and middleware packages, sets up JSP MVC integration, and configures the base path for REST endpoints.

##

#### 🟦 **controller**
- **HomeController**  
  REST controller mapped to `/`. Handles GET requests and renders the `index.jsp` view with a dynamic model.

##

#### 🟦 **middleware**
- **RequestFilter**  
  Container request filter for logging or preprocessing all incoming REST requests.
  
- **ResponseFilter**  
  Container response filter for logging or modifying all outgoing REST responses.

##

#### 🟦 **webapp/WEB-INF/views**
- **index.jsp**  
  JSP view rendered by Jersey's MVC feature, displaying dynamic content from the REST controller.

##

#### 🟦 **webapp/WEB-INF**
- **web.xml**  
  Deployment descriptor configuring Jersey's servlet filter, application class, and URL mapping for REST endpoints.

---

## ⚙️ Key Features

- ✅ RESTful API endpoints built with Jersey (JAX-RS)
- ✅ MVC integration with JSP for dynamic web views
- ✅ Request and response filters for middleware logic
- ✅ Clean, modular package structure for easy extension
- ✅ Maven-based build for streamlined setup and deployment

---

## 💡 How It Works

- **Jersey Configuration:**  
  `AppConfig` sets up the Jersey application, registering controllers and middleware, and enabling JSP support for MVC-style views.
  
- **REST Controller:**  
  `HomeController` handles HTTP GET requests, populates a model, and renders `index.jsp` using Jersey's MVC feature.
  
- **Middleware Filters:**  
  `RequestFilter` and `ResponseFilter` allow pre- and post-processing of HTTP requests and responses, ideal for logging, authentication, or custom headers.
  
- **JSP View:**  
  The `index.jsp` file displays dynamic content passed from the controller, demonstrating seamless REST-to-view integration.

---

## 🛠️ Technologies Used

- Java 11
- Jakarta EE 10 (JAX-RS)
- Jersey (MVC, Filters)
- JSP
- Maven

---

## 📚 Learning Outcomes

- ✅ Understand RESTful service development with Jersey in Java EE
- ✅ Integrate MVC patterns with REST endpoints and JSP views
- ✅ Implement middleware logic using request and response filters
- ✅ Structure enterprise Java projects for clarity and maintainability

---

## 🧑‍💻 Author

Chamika Gayashan  
Undergraduate Software Engineer | Sri Lanka  
Linkedin: @chamikathereal  
Current date: Monday, June 23, 2025, 7:16 PM +0530
