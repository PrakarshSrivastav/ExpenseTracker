# Personal Expense Tracker Application

## Overview

The **Personal Expense Tracker Application** is a web-based application designed to help users manage and categorize their daily expenses while providing an admin dashboard for managing users. The system includes distinct roles for users and administrators, with authentication and role-based access control ensuring secure access for each.

---

## Key Features

- **Expense Tracking**: Users can log and track daily expenses.
- **Expense Categorization**: Expenses are categorized for better organization and analysis.
- **Transaction History**: View the history of all transactions with detailed breakdowns.
- **Summaries**: Generate monthly and weekly summaries of expenses.
- **User and Admin Authentication**: Secure authentication system differentiating between normal users and admin roles.
- **Admin Dashboard**: Admins can manage users, view all user expenses, and perform administrative tasks.

---

## Technologies Used

### Frontend
- **Thymeleaf**: Used as the templating engine for the application to render dynamic content and integrate seamlessly with the Spring Boot backend.

### Backend
- **Spring Boot**: The core framework for the backend, providing a robust and scalable environment to handle business logic and REST APIs.

### Database
- **PostgreSQL**: Relational database used to store user information, expenses, and transaction data.
- **JPA (Java Persistence API)**: Used for database interaction, enabling object-relational mapping (ORM) between the Java code and PostgreSQL database.

---

## Installation and Setup

To run this application locally, follow these steps:

1. **Clone the Repository**:
    ```bash
    git clone https://github.com/your-username/expensetracker.git
    cd personal-expense-tracker
    ```

2. **Set Up the Database**:
   - Install PostgreSQL.
   - Create a database named `expense_tracker`.
   - Update your PostgreSQL username and password in the `application.properties` file:
     ```properties
     spring.datasource.url=jdbc:postgresql://localhost:5432/expense_tracker
     spring.datasource.username=your_postgres_username
     spring.datasource.password=your_postgres_password
     ```

3. **Run the Application**:
    ```bash
    ./mvnw spring-boot:run
    ```

4. **Access the Application**:
   - Open your browser and go to `http://localhost:8080`.

---

## Usage

### User Role:
- Sign up or log in as a user.
- Track your daily expenses by adding new entries.
- View and categorize your expense transactions.
- Get a summary of your expenses for different time periods.

### Admin Role:
- Log in as an admin.
- View all users and their expenses.
- Manage users through the admin dashboard.

---

## Contributing

Contributions are welcome! If you would like to improve this application, please follow these steps:

1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Commit your changes (`git commit -m 'Add new feature'`).
4. Push to the branch (`git push origin feature-branch`).
5. Open a pull request.

---

## License

This project is licensed under the MIT License. See the `LICENSE` file for more details.

---

## Contact

For any questions or feedback, feel free to reach out to me:

- **Email**: prakarshsrivastava2004@gmail.com
- **LinkedIn**: [PrakarshSrivastava](www.linkedin.com/in/prakarsh-srivastava-2352412a7)

