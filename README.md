# StartupProfile

StartupProfile is a Java Spring Boot-based REST API designed to manage and analyze startup profiles. It allows users to perform
CRUD operations on startup data, ensuring efficient management and retrieval of startup information. This project leverages MySQL for database 
management and Postman for testing the API endpoints, ensuring a robust and reliable service.

<figure>
  <figcaption>Profile created successfully </figcaption>
  <img width="960" alt="image" src="https://github.com/RaahulRaj/StartupProfile/assets/102645220/99be96c7-36d1-4dd7-83f3-9c223ed607ad"></br>
   <figcaption>Implemented Exception Handling</figcaption>
    <img width="960" alt="image" src="https://github.com/RaahulRaj/StartupProfile/assets/102645220/6d316110-75f9-40c8-be07-d09731ce7bad"> </br>
  <figcaption>Database</figcaption>
  <img width="960" alt="image" src="https://github.com/RaahulRaj/StartupProfile/assets/102645220/19c4a24d-68e9-4798-a3de-d668ad1cd88d"></br>
</figure>
 





## Features

- **CRUD Operations**: Create, Read, Update, and Delete functionalities for managing startup profiles.
- **API Testing**: Comprehensive testing setup using Postman to guarantee reliability and performance.
- **Database Management**: Efficient data storage, retrieval, and manipulation using MySQL.
- **Project Automation**: Automated project management and build processes with Maven.

## Getting Started

### Prerequisites

Before you begin, ensure you have installed the following:
- JDK 17 
- MySQL Server
- Maven
- Postman (for API testing)

### Installation

1. Clone the repository to your local machine:
git clone https://github.com/RaahulRaj/StartupProfile.git

 
2. Navigate to the project directory:
cd StartupProfile

3. Update the `application.properties` file with your MySQL database credentials.
4. Build the project with Maven:
   mvn clean install

5. Run the application:
   mvn spring-boot:run
 
The application should now be running and accessible. You can test the API endpoints using Postman.

## Usage

This section should provide instructions on how to use the API, including example requests and responses. Here's a brief example for a CRUD operation:

### Create a Startup Profile

- **URL**: `/api/startups`
- **Method**: `POST`
- **Body**:
```json
{
    "startupId": "S1",
    "startupName": "Swiggy",
    "founderName": "Sriharsha Majety, Nandan Reddy, Rahul Jaimini",
    "companyValuation": "$5.5 billion",
    "grossProfit": "Not Publicly Available"
  },
Success Response:
Code: 200 OK
Content: Startup profile created successfully.
