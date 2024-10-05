
# Virtual ATM Console Application

This project is a simple **ATM simulation** built in **Java**. It allows users to manage their bank account by checking the balance, depositing funds, and withdrawing money, all via a console interface. It also includes some fun user-friendly features like progress bars and exit animations for a better experience.

---

## Features
- **Check Balance**: View the current balance of the account.
- **Deposit Funds**: Add money to your account balance.
- **Withdraw Funds**: Withdraw money from your account, ensuring no overdrafts.
- **Exit Option**: Safely exit the ATM with a fun logout animation.


---

## Technologies Used
- **Java**: Core programming language used for the entire project.
- **Scanner Class**: Used for reading user input.
- **Thread.sleep()**: Used to simulate loading progress and exit animations.

---

## How to Run
1. **Clone the project** or download the source code files.
   
2. **Compile and Run** the program using a Java IDE like IntelliJ IDEA or Eclipse, or use the command line:
   ```bash
   javac ATMApp.java
   java ATMApp
   ```

3. Follow the on-screen instructions to interact with the ATM:
   - **Option 1**: Check balance
   - **Option 2**: Deposit money
   - **Option 3**: Withdraw money
   - **Option 4**: Exit the program

---

## Program Structure

1. **BankAccount Class**
   - Holds and manages the account balance.
   - Provides methods to check balance, deposit money, and withdraw money.
   - Includes error handling for invalid operations (e.g., insufficient funds for withdrawal).

2. **ATM Class**
   - Manages the ATM's operations and user interface.
   - Displays menu options and accepts user inputs.
   - Contains helper functions for progress bars during deposit/withdraw and animations during exit.

3. **ATMApp Class (Main Class)**
   - Initializes the `BankAccount` with a starting balance.
   - Starts the ATM simulation and loops until the user chooses to exit.

---

## Sample Output

### Welcome Screen
```
╔════════════════════════════════════════════╗
   Welcome to your Virtual ATM
   Please select an option:
   1. 💰 Check Balance
   2. 📥 Deposit
   3. 📤 Withdraw
   4. 🚪 Exit
╚════════════════════════════════════════════╝
```

### Deposit Success
```
   Enter the amount to deposit: ₹5000
Depositing ₹5000...
███████████

╔════════════════════════════════════╗
   Success! ₹5000 has been added to your account.
╚════════════════════════════════════╝
```

### Withdraw Error (Insufficient Balance)
```
   Enter the amount to withdraw: ₹20000
╔════════════════════════════════════╗
   Insufficient balance! You only have ₹15000 available.
╚════════════════════════════════════╝
```

### Exit Animation
```
╔══════════════════════════════════════════╗
   Thank you for using our ATM. Have a great day!
   🌟 Logging you out...
✨ ✨ ✨
╚══════════════════════════════════════════╝
```

---

## Customization
- **Initial Balance**: You can change the starting balance in the `ATMApp` class when creating the `BankAccount` object. 
  ```java
  BankAccount userAccount = new BankAccount(10000.0); // Change this value
  ```

- **UI Elements**: You can modify the menu, progress bars, and exit animations in the `ATM` class for a different user experience.

---

## Improvements to Consider
- **User Authentication**: Implement a PIN-based authentication system before granting access to ATM functionalities.
- **Transaction History**: Add a feature to store and display the transaction history (deposits, withdrawals).
- **Currency Formatting**: Use proper currency formatting for a more professional output (e.g., formatting balance amounts with commas).

---

Feel free to explore, customize, and extend the features of this simple ATM simulation project!
