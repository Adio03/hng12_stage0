HNG12 Stage 0 - Public API
Description
This is a simple public API created as part of the HNG12 Stage 0 backend task. The API returns basic information, including the email used for registration, the current datetime in ISO 8601 format (UTC), and the GitHub URL of the project's codebase.

Tech Stack
Java
Spring Boot
API Endpoint
GET / -Request:

curl https://hng12-stage0-1-8o1e.onrender.com/api/getInfo
- Response:
  ```json
{
    "email": "adioldmj@gmail.com",
    "current_datetime": "2025-02-05T09:42:55Z",
    "github_url": "https://github.com/Adio03/hng12_stage0.git"
}

email: The registered email address used to sign up for HNG12.
current_datetime: The current datetime generated dynamically in ISO 8601 format (UTC).
github_url: The URL of the project's GitHub repository.
Project Setup
Prerequisites:
Java 11 or higher
Maven (for building the project)
Running Locally:
To run this project locally, follow these steps:

Clone the repository:

bash
git clone https://github.com/Adio03/hng12_stage0.git
Navigate to the project directory:

bash
cd hng12_stage0
Build the project using Maven:

bash
mvn clean package
Run the application:

bash
mvn spring-boot:run
The API will be available at http://localhost:8090/.

Dependencies:
Spring Boot: For creating and managing the REST API.
Maven: For project build and dependency management.
Deployment
This API is deployed to Render and can be accessed publicly at:

https://hng12-stage0-1-8o1e.onrender.com

Additional Information
The current_datetime field is dynamically generated in ISO 8601 format (UTC) on every request. It uses Instant.now() from Java's java.time package to get the current time and then formats it into the desired format.
The project is built with Spring Boot and Java.
Backlink
https://hng.tech/hire/java-developers
