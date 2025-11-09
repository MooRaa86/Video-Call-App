# VideoCall Application

A modern, full-stack video conferencing application built with **Spring Boot** for the backend and a pure **HTML/CSS/JavaScript** frontend. This project provides a foundation for real-time communication, featuring user authentication, user status tracking, and the ability to create or join video meetings.

## 🚀 Features

*   **User Authentication:** Secure registration and login functionality.
*   **User Management:** Display a list of registered users with their current online/offline status.
*   **New Meeting Creation:** Easily start a new video call session.
*   **Join Meeting:** Join an existing meeting using a unique Room ID.
*   **Technology Stack:** Built on the robust Spring Boot framework (Java 21) for the backend.

## 🛠️ Technology Stack

| Component | Technology | Version |
| :--- | :--- | :--- |
| **Backend Framework** | Spring Boot | 3.5.7 |
| **Language** | Java | 21 |
| **Build Tool** | Maven | - |
| **Frontend** | HTML5, CSS3, JavaScript | - |
| **Dependencies** | `spring-boot-starter-web`, `lombok` | - |

## ⚙️ Installation and Setup

### Prerequisites

Before running the application, ensure you have the following installed:

*   **Java Development Kit (JDK):** Version 21 or higher.
*   **Maven:** For building and managing project dependencies.

### Steps

1.  **Clone the repository:**
    ```bash
    git clone <your-repository-url>
    cd VideoCall
    ```

2.  **Build the project:**
    Use Maven to compile the code and package the application.
    ```bash
    mvn clean install
    ```

3.  **Run the application:**
    The Spring Boot application can be run directly from the command line using the generated JAR file or the Maven plugin.

    **Option 1: Using Maven Plugin**
    ```bash
    mvn spring-boot:run
    ```

    **Option 2: Running the JAR file**
    ```bash
    java -jar target/VideoCall-0.0.1-SNAPSHOT.jar
    ```

    The application will start on `http://localhost:8080`.

## 💻 Usage

1.  **Access the Application:** Open your web browser and navigate to `http://localhost:8080`. You will be redirected to the login page.

2.  **Initial Users:** For testing purposes, the application is pre-configured with a few hardcoded users in `VideoCallApplication.java`. You can use these credentials to log in:

    | Username | Email | Password |
    | :--- | :--- | :--- |
    | Omar Medhat | mr.omarmedhat@gmail.com | ******** |
    | Hazem Saeed | hazemsaed512@gmail.com | 123456789 |

    *Note: It is highly recommended to remove these hardcoded users and implement a proper database for production use.*

3.  **Video Call:**
    *   **Create a New Meeting:** Click the "Create a New Meeting" button to start a new session.
    *   **Join a Meeting:** Enter a Room ID in the designated field and click "Join Meeting" to connect to an existing session.

## 🤝 Contributing

Contributions are welcome! Please feel free to submit a Pull Request or open an Issue for any bugs or feature requests.


