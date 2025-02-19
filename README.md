
# 🃏 Poker Game

This project is a fully functioning **Graphical User Interface (GUI) Poker Game**, extending from the CLI Poker Game developed in Assignment 1. The game is designed with **Object-Oriented Programming (OOP) principles** and integrates an **Embedded Derby Database** for data management.

## 📌 Features
- 🎮 **User-friendly GUI** with multiple game stages.
- 🛢 **Embedded Derby Database** (`POKER` schema) for data storage.
- 💾 **Save & Load functionality** to retain user progress.
- 🚪 **Graceful exit** without losing data.
- 🏛 **Strong OOP principles** for better maintainability.
- 📌 **39 classes** (excluding test classes).

---

## 📁 Project Structure
The project is structured to enhance maintainability and efficiency.

### 📊 Database Details
- **Schema Name**: `POKER`
- **Username**: `poker`
- **Password**: `poker`
- **Database Location**: `PokerGameEmbd` (inside the `dist/` folder)

---

## 🚀 How to Download & Run
Follow these steps to run the Poker Game successfully.

### 📥 1️⃣ Download the Required Files
1. **Download `dist.zip`** (which contains `Assignment1.jar` and the `PokerGameEmbd/` folder):  
   ➡ **[Click here to download `dist.zip`](https://github.com/JuchangKim/PokerApp/raw/main/Assignment1/dist.zip)**  

2. **Unzip** the file:
   - `Assignment1.jar` (the executable)

### ▶️ 2️⃣ Run the Game
#### **Windows Users**
1. Open **Command Prompt** or **PowerShell**.
2. Navigate to the unzipped `dist` folder:
   ```sh
   cd path\to\dist
3. Run the program with DerbyDB:
   ```sh
   java -jar Assignment1.jar

#### **Mac/Linux Users**
1. Open Terminal.
2. Navigate to the dist unzipped folder:
   ```sh
   cd /path/to/dist
3. Run the program:
   ```sh
   java -jar Assignment1.jar

## Important Notes

- Do not remove or move the PokerGameEmbd/ folder! It is required for the database connection.
- If the game cannot find the database, ensure PokerGameEmbd/ is inside the dist/ folder.

## 🛠 Team Contributions

### 🎯 Juchang Kim
- Developed **Main GUI Panel** and implemented **MVC Design Pattern**.
- Created and implemented **all project packages**.
- Managed **branch merging** and resolved **compilation errors**.
- Edited the **demonstration video**.

### 🎯 Billie-Jean Laing
- Designed and developed **Database Access Management**.
- Implemented **Abstract & Interface Classes**.
- Sourced **game images** 🎨.
- Developed **5 integration tests**:
  - `CardIT`
  - `ComputerPlayerIT`
  - `DeckIT`
  - `HandIT`
  - `PlayerIT`
- Designed and modified the **database structure** (`DBManager` and `DBInitialiser`).
- Improved **FileManager** for better data handling.
- Authored the **project report**.

## Acknowledgments
This project was developed as part of **Assignment 2** for COMP603. Special thanks to our team members for their collaboration and hard work.

---

For further details, refer to the project repository: [Poker Game Repository](https://github.com/JuchangKim/PokerApp).

