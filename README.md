# English Vocabulary Learning Application API

This project is a REST API designed to help users learn English vocabulary. It is built using Spring Boot and provides various endpoints to manage and retrieve vocabulary data.

## Features

- RESTful API for managing English vocabulary
- Integration with Spring Data JPA for database operations
- Security features provided by Spring Security
- Development tools and testing support

## Getting Started

### Prerequisites

- Java 21 or higher
- Maven

### Installation

1. Clone the repository:
   ```sh
   git clone https://github.com/MuhammedCubukcu/EnglishVocabularyLearningApplicationAPI.git
   ```
2. Navigate to the project directory:
   ```sh
   cd EnglishVocabularyLearningApplicationAPI
   ```
3. Build the project using Maven:
   ```sh
   ./mvnw clean install
   ```

### Running the Application

To run the application, use the following command:
```sh
./mvnw spring-boot:run
```

The application will start and be accessible at `http://localhost:8080`.

## Database Tables

### `users` Table

Stores user information.

- **user_id** (Primary Key): Unique ID for the user.
- **username**: Username.
- **email**: User's email address.
- **password**: User's password (hashed).
- **created_at**: Date the user was created.

### `words` Table

Stores vocabulary words.

- **word_id** (Primary Key): Unique ID for the word.
- **word**: The English word.
- **translation**: The Turkish translation of the word.
- **example_sentence**: Example sentence using the word in English.
- **category**: Category of the word (e.g., animals, sports, etc.).

### `user_words` Table

Stores words that users are learning or have learned.

- **user_word_id** (Primary Key): Unique ID.
- **user_id** (Foreign Key): User ID.
- **word_id** (Foreign Key): Word ID.
- **status**: Word status (e.g., "learning", "learned").
- **added_at**: Date the word was added by the user.

## API Operations

### User Operations

1. **User Registration**

   - **Endpoint**: `POST /api/users/register`
   - **Body**:
     ```json
     {
       "username": "example",
       "email": "example@example.com",
       "password": "password123"
     }
     ```
   - **Description**: Creates a new user.

2. **User Login**

   - **Endpoint**: `POST /api/users/login`
   - **Body**:
     ```json
     {
       "email": "example@example.com",
       "password": "password123"
     }
     ```
   - **Description**: Authenticates the user and returns a token.

### Word Operations

1. **Retrieve All Words**

   - **Endpoint**: `GET /api/words`
   - **Description**: Returns all words from the database.

2. **Add a Word**

   - **Endpoint**: `POST /api/words`
   - **Body**:
     ```json
     {
       "word": "example",
       "translation": "örnek",
       "example_sentence": "This is an example sentence.",
       "category": "general"
     }
     ```
   - **Description**: Adds a new word (Admin operation).

### User Word Operations

1. **Retrieve User Words**

   - **Endpoint**: `GET /api/user-words/{userId}`
   - **Description**: Returns the words added by the user.

2. **Add Word to User**

   - **Endpoint**: `POST /api/user-words`
   - **Body**:
     ```json
     {
       "user_id": 1,
       "word_id": 5,
       "status": "learning"
     }
     ```
   - **Description**: Adds a word for the user to learn.

3. **Update Word Status**

   - **Endpoint**: `PUT /api/user-words/{userWordId}`
   - **Body**:
     ```json
     {
       "status": "learned"
     }
     ```
   - **Description**: Updates the learning status of a word for the user.

### Statistics Operations

1. **User Learned Word Count**

   - **Endpoint**: `GET /api/user-words/{userId}/stats`
   - **Description**: Returns the count of words learned by the user.

2. **Category-Based Statistics**

   - **Endpoint**: `GET /api/user-words/{userId}/category-stats`
   - **Description**: Returns the user's learning status of words by category.

## Technologies Used

### Spring Boot Technologies

1. **Spring Web**: To build RESTful APIs and handle HTTP requests.
2. **Spring Data JPA**: To interact with the database using ORM (Object-Relational Mapping).
3. **Spring Security**: To handle user authentication and authorization (e.g., JWT integration).
4. **Spring Boot Actuator**: To monitor and manage the application in production.
5. **Spring Boot DevTools**: For development and testing with hot reload.

### Additional Tools and Frameworks

1. **Backend**: Java Spring Boot
2. **Database**: PostgreSQL (or any other RDBMS of choice)
3. **Frontend**: ReactJS
4. **Authentication**: JWT (JSON Web Tokens)
5. **API Testing**: Postman or Swagger

## Contributing

Contributions are welcome! Please fork the repository and create a pull request with your changes.

## License

This project is licensed under the Apache License 2.0. See the LICENSE file for details.

