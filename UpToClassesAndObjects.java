package Java_Practice;

/*
Here's a Java programming question that covers various concepts:

**Question:**

Write a Java program to implement a simple "Banking System" where users can create accounts, deposit money, withdraw money, check balance, and display
account details. Use the following data types and concepts:

* Classes and objects
* Arrays (for storing account information)
* Loops (for handling multiple transactions)
* Conditional statements (for validating user input and determining interest rate)
* Strings (for displaying account details)

**Constraints:**

* Use Java 8 syntax.
* Your program should be a console-based application, not a graphical UI application.

**Requirements:**

1. Create a `BankAccount` class that has the following attributes:
        * `accountNumber`
        * `accountHolderName`
        * `balance`
2. Create an array of `BankAccount` objects to store all account information.
3. Implement methods for:
        * Creating a new bank account
        * Depositing money into an existing account
        * Withdrawing money from an existing account
        * Checking the balance of an existing account
        * Displaying account details (including account number, holder name, and balance)
4. Use loops to handle multiple transactions for each user.
5. Use conditional statements to validate user input (e.g., ensure that the amount deposited or withdrawn is positive).
6. Calculate interest rate based on the balance (10% interest rate for balances above $1000).

**Additional tips:**

* Use meaningful variable names and comments to explain your code.
* Handle exceptions for invalid user input (e.g., negative amounts, invalid account numbers).
* Consider using a `Scanner` object to get user input.

Good luck!
 */

import java.util.Scanner;

public class UpToClassesAndObjects {
    public static void main(String[] args) {
        String[] accountHolderNames = new String[5];
        accountHolderNames[0] = "Sourav Routray";
        accountHolderNames[1] = "Gourav Routray";
        accountHolderNames[2] = "Usharani Routray";
        accountHolderNames[3] = "Prasanna Routray";
        accountHolderNames[4] = "Pravat Routray";

        int[] accountNumbers = {12340000, 23450000, 34560000, 45670000, 56780000};

        float[] balances = {20000.12f, 70000.23f, 50000.34f, 40000.45f, 25000.56f};

        BankAccount[] bas = new BankAccount[5];
        for (int index = 0; index < bas.length; index++) {
            bas[index] = new BankAccount(accountNumbers[index], accountHolderNames[index]); // Assigned by Constructor
            bas[index].setBalance(balances[index]); // Assigned by Setter
        }

        System.out.println("~~~MENU~~~\n1 - Create a new bank account (Not Working Currently)\n2 - Depositing money into an existing account (Not Working Currently)\n3 - Withdrawing money from an existing account (Not Working Currently)\n4 - Checking the balance of an existing account (Not Working Currently)\n5 - Displaying account details (including account number, holder name, and balance)");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Choice :  ");
        int choice = sc.nextInt();
        if (choice == 5) {
            for (BankAccount ba : bas) {
                System.out.println("Account Number :  " + ba.accountNumber + ", Holder Name :  " + ba.accountHolderName + ", Balance :  " + ba.balance); // Derived by Getter
            }
        } else {
            System.out.println("INVALID CHOICE!!! Try Again :(");
        }
    }
}

class BankAccount {
    int accountNumber;
    String accountHolderName;
    float balance;

    public BankAccount(int a, String b) {
        this.accountNumber = a;
        this.accountHolderName = b;
    }

    public void setBalance(float c) {
        this.balance = c;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public float getBalance() {
        return balance;
    }
}
