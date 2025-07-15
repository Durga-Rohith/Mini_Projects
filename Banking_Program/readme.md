
---

# 🏦 Java CLI Banking Application

A simple and interactive command-line banking system built using Java. This mini project allows users to simulate a basic banking experience by checking their balance, depositing funds, withdrawing money, and exiting the program. A great learning project for Java beginners to understand control flow, input handling, and method usage.

---

## 🚀 Features

* 💰 Check current account balance
* ➕ Deposit money
* ➖ Withdraw money (with insufficient funds check)
* 🧠 Input validation for all monetary operations
* 🔄 Simple menu-driven loop with graceful exit

---

## 📦 How to Run

### Requirements:

* Java Development Kit (JDK) 8 or above
* Any Java IDE (e.g., IntelliJ, Eclipse, NetBeans) or terminal/command line

### Running from the terminal:

```bash
# Compile the file
javac Banking_Application.java

# Run the compiled class
java Banking_Application
```

---

## 📸 Sample Output

```plaintext
***************
BANKING PROGRAM
***************
1.Show Balance
2.Deposit
3.Withdraw
4.Exit
***************
Enter your choice (1-4.)
> 1
###############
$0.00

> 2
Enter the amount of deposit
> 1000
> 1
###############
$1000.00

> 3
Enter the withdraw amount
> 200
> 1
###############
$800.00

> 4
***************************
Thank you! Have a nice day!
***************************
```

---

## 📁 Project Structure

```
Banking_Application.java   # Main program file with menu logic and methods
```

---

## 🧠 Key Concepts Covered

* Method creation and calling
* Input validation using if-else conditions
* Switch-case with enhanced Java syntax (Java 14+)
* Persistent loop for menu-driven applications
* Scanner class for console input handling

---

## ✅ Possible Enhancements

* Add user login with PIN-based authentication
* Store transaction history
* Add interest calculator or monthly statement generator
* Create a GUI version using JavaFX or Swing

---

## 🤝 Contributing

Contributions are welcome! If you find a bug or want to suggest an enhancement:

1. Fork the repo
2. Create a new branch
3. Submit a pull request

---

## 🙋‍♂️ Author
Made with ❤️ by [Durga-Rohith]
