# Cab Booking System – Spring Boot

A complete **REST API–based Cab Booking System** built using **Java Spring Boot**,and **MySQL**.  
This project provides CRUD operations for cab bookings with well-structured controllers, models, repositories, and exception handling.

---

## Features

### ✔ REST API for Cab Booking
- Add a new cab booking  
- View all bookings  
- Get a booking by ID  
- Update booking details  
- Delete a booking  
- Smooth JSON-based request/response  

### ✔ Backend only (REST APIs)
- Built using **Spring Boot**
- Uses **Spring Data JPA** for database communication
- Auto-generates tables using Hibernate
- Includes timestamps for created & updated entries

---

## 🛠 Tech Stack

- **Java 17+**
- **Spring Boot**
- **Spring Web**
- **Spring Data JPA**
- **Hibernate**
- **MySQL** (or any RDBMS)
- **Maven**

---

## 📁 Project Structure
Cab-Booking/
├── src
│ ├── main
│ │ ├── java/com/app/cabbooking
│ │ │ ├── CabbookingApplication.java # Main class
│ │ │ ├── controller/CabController.java # API endpoints
│ │ │ ├── models/Cab.java # Entity (Cab Booking)
│ │ │ ├── cabrepos/CabRepo.java # JPA Repository interface
│ │ │ └── Exception/ResourceNotFoundException.java # Custom exception
│ │ └── resources/application.properties # DB config
└── pom.xml # Project dependencies


---

### 1️⃣ Add New Booking  
**POST** `/cabs/addbooking`

**Request Body**
```json
{
  "driver_name": "Ramesh",
  "cab_no": "MH12AB1234",
  "price": 500,
  "pickup": "Pune",
  "destination": "Mumbai",
  "distance": 150,
  "cab_type": "Sedan",
  "current_place": "Pune"
}

