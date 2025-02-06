# Poker Game

This project is a fully functioning **Graphical User Interface (GUI) Poker Game**. It is an extension of the CLI Poker Game developed in Assignment 1. The game is designed to be user-friendly, incorporating object-oriented programming (OOP) principles, and is connected to a **Derby Embedded Database**.

## Features
- User-friendly GUI with multiple game stages.
- Integration with Derby Embedded Database (POKER schema) for data management.
- Supports saving and loading user information.
- Exits cleanly at any point during gameplay.
- Comprehensive use of OOP principles.
- Includes 39 classes (excluding test classes).

## Project Structure
The project follows a well-structured package organization to enhance maintainability and efficiency.

### Database Details
- Schema: `POKER`
- Username: `poker`
- Password: `poker`

## How to Run
1. Clone the repository from the main branch:
   [GitHub Repository](https://github.com/Billie501/COMP603-Assignment1-)
2. Open the project in your preferred Java IDE.
3. Navigate to the `PokerGame.Panel` package.
4. Run the `WelcomeMenu` class to launch the application.

## Division of Tasks

### Juchang Kim
- Developed **Game Stage**, **Announcement Panel**, **Betting Pot Panel**, **Player Panel**, **Poker Controller**, and **Standard Game Stage**.
- Created and implemented all project packages.
- Managed branch merging throughout development and resolved compilation errors.
- Edited the demonstration video.

### Billie-Jean Laing
- Created and developed **WelcomeMenuAddPlayerNames**, **ListOfUsersMenu**, **PlayAgainMenu**, **UserGameLog**, and **UserNameForLog**.
- Sourced game images.
- Developed 5 integration tests: `CardIT`, `ComputerPlayerIT`, `DeckIT`, `HandIT`, and `PlayerIT`.
- Designed and modified the database with `DBManager` and `DBInitialiser`, including modifications to `FileManager`.
- Authored the project report.

## Acknowledgments
This project was developed as part of **Assignment 2** for COMP603. Special thanks to our team members for their collaboration and hard work.

---

For further details, refer to the project repository: [Poker Game Repository](https://github.com/Billie501/COMP603-Assignment1-).
