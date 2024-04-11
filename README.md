
# Project Title: Stock List Application with Java

## Description
This Java application provides a user-friendly system for managing your stock inventory. Keep track of your products, their quantities, and easily add, list, and sort them to maintain a well-organized and up-to-date stock list.

## Features
**Menu-Driven Interface:** A clear menu offers options for adding new products, listing existing products, sorting the list, and exiting the application.

**Product Management:**
- Add products with names and initial unit quantities.
- Update existing products by searching for them by name and adjusting their unit numbers.
- Sort the product list alphabetically by name.
  
**Data Persistence:**
- Reads stock data from a JSON file (stock_list.json) upon application startup.
- Saves the updated stock list back to the JSON file when the user exits the application.
  
**Error Handling:**
- Validates user input for product names and unit numbers.
- Handles potential exceptions during file operations (loading and saving).

## How to Use
**1- Prerequisites:**
- Java Development Kit (JDK) installed on your system.
- A text editor or IDE for working with Java code.

**2- Running the Application:**
- Compile the Java source code (StockListApplication.java) into a class file using a Java compiler.
- Run the application from the command line using java StockListApplication.

**3- User Interaction:**
- Select options from the menu using the corresponding numbers (1-4) and follow the prompts for product information.
- Add new products, view the current stock list, sort the list for better organization, or exit the application.

## Example Usage
Menu:
1. Add
2. List
3. Sort
4. Exit

Enter your choice: 1

Enter product name: Computer Monitor

Enter unit number: 10

Product added successfully.

Menu:
1. Add
2. List
3. Sort
4. Exit

Enter your choice: 2

1- Computer Monitor (10 units)

2- Keyboard (5 units)

Menu:
1. Add
2. List
3. Sort
4. Exit

Enter your choice: 3

Products sorted successfully.

Menu:
1. Add
2. List
3. Sort
4. Exit

Enter your choice: 4

Exiting...

## Contributing
Feel free to contribute to this project by:

- Implementing features like product deletion or quantity adjustments.
- Adding support for different product categories or custom attributes.
- Enhancing the user interface with visual elements (if using a GUI framework).
- Expanding error handling for specific scenarios.

To contribute, fork the repository on GitHub and create a pull request with your proposed changes.
