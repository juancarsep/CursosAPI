# Course and Topic API

This project is an API built in Java using Spring Boot and Hibernate. It provides functionality for managing courses and topics through HTTP requests. Below are the key features, technologies used, getting started guide, API endpoints, and contribution guidelines.

## Features

- **Create New Courses:** You can create new courses by sending a POST request with the necessary details.
- **Edit Existing Courses:** Update course information using PUT requests.
- **Delete Courses:** Remove courses from the system via DELETE requests.
- **Get All Courses:** Retrieve a list of all available courses.
- **Get a Specific Course by ID:** Fetch details of a specific course using its unique identifier.
- **Manage Topics:** Similar to courses, you can perform CRUD operations on topics.

### Relationships:

- Courses and topics have a OneToMany relationship (one course can have multiple topics).
- Topics and courses have a ManyToMany relationship (multiple topics can be associated with a course).

## Technologies Used

- **Spring Boot:** Provides a framework for building robust and scalable APIs.
- **Hibernate:** Used for object-relational mapping (ORM) to interact with the database.
- **MySQL:** The database system for storing course and topic data.
- **MySQL Workbench:** A visual tool for managing the database schema.
- **POSTMAN:** Used for testing HTTP requests and verifying API functionality.

## Getting Started

1. **Clone the Repository:** Start by cloning this repository to your local machine.
   
2. **Database Configuration:**

   - Set up a MySQL database and configure the connection details in your `application.properties` file.
   - Create tables for courses and topics.

3. **Build and Run the Application:**

   - Use Maven to build the project.
   - Run the Spring Boot application.

4. **Test the API:**

   - Use POSTMAN or any other API testing tool to send requests to the endpoints.
   - Verify that the API behaves as expected.

## API Endpoints

### Courses:

- `POST /cursos/crear`: Create a new course.
- `PUT /cursos/editar/{id}`: Update an existing course.
- `DELETE /cursos/borrar/{id}`: Delete a course.
- `GET /cursos/traer`: Get a list of all courses.
- `GET /cursos/traer/{id}`: Get details of a specific course.

### Topics:

- `POST /temas/crear`: Create a new topic.
- `PUT /temas/editar/{id}`: Update an existing topic.
- `DELETE /temas/eliminar/{id}`: Delete a topic.
- `GET /temas/traer`: Get a list of all topics.
- `GET /temas/traer/{id}`: Get details of a specific topic.

