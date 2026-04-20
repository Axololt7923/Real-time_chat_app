# Real-time Chat Application

A modern, responsive real-time chat application built with Spring Boot, WebSockets, and a clean UI Kit.

## Features

- **Real-time Messaging**: Instant communication using WebSockets and STOMP.
- **Image Sharing**: Send images directly in the chat (Base64 encoded).
- **Emoji Picker**: Integrated emoji keyboard for expressive messaging.
- **Responsive UI**: Beautifully designed chat interface using Bootstrap 5 and custom CSS.
- **Username Join**: Simple entry system to join the chat group.
- **Message History (Session)**: View messages in a scrollable chat area with timestamps.

## Technologies Used

### Backend
- **Java 17**
- **Spring Boot 3.x**
- **Spring WebSocket**: For real-time communication.
- **Lombok**: To reduce boilerplate code.
- **Thymeleaf**: For server-side rendering of the chat page.

### Frontend
- **Bootstrap 5**: Responsive layout and styling.
- **Font Awesome 6**: Icons for UI elements.
- **SockJS & STOMP.js**: WebSocket client libraries.
- **Emoji Button**: Interactive emoji picker library.
- **Inter Font**: Clean and modern typography.

## Getting Started

### Prerequisites
- JDK 17 or higher
- Maven 3.6+

### Running the Application

1. **Clone the repository**:
   ```bash
    git clone https://github.com/Axololt7923/Real-time_chat_app
    cd Real-time_chat_app
   ```

2. **Build the project**:
   ```bash
   mvn clean install
   ```

3. **Run the application**:
   ```bash
   mvn spring-boot:run
   ```

4. **Access the Chat**:
   Open your browser and navigate to `http://localhost:8080`.

## Project Structure

- `src/main/java`: Backend source code.
  - `config`: WebSocket configuration.
  - `controller`: Chat and view controllers.
  - `model`: Message data structures.
- `src/main/resources`:
  - `templates`: Thymeleaf HTML templates (chat.html).
  - `application.properties`: Application configuration.

## License

This project is open-source and available under the MIT License.

## Demo
