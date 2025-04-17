# Assignement_7_033_PIJL

# Java Calculator Assignment

**Name:** Dhaerya More 

**PRN:** 23070126033  

**Batch:** AIML A2

## Overview

This Java project implements a simple **console-based calculator** that performs:
- Arithmetic operations (Addition, Subtraction, Multiplication, Division)
- Square and Cube of a number
- Square Root calculation

The program also demonstrates **exception handling** and user input validation using `try-catch` blocks.

---

## Files in the Project

| File Name       | Description |
|-----------------|-------------|
| `Main.java`     | Contains the main method, takes input from user, and calls functions from `Calculator.java`. |
| `Calculator.java` | Contains all the mathematical operation functions like `add()`, `subtract()`, `multiply()`, etc. |

---

## Features & Methods

### `Calculator.java` Methods

| Method Name        | Description |
|--------------------|-------------|
| `add(int a, int b)`       | Returns the sum of `a` and `b` |
| `subtract(int a, int b)`  | Returns the difference of `a` and `b` |
| `multiply(int a, int b)`  | Returns the product of `a` and `b` |
| `divide(int a, int b)`    | Returns `a / b`. Throws error on division by zero |
| `square(int a)`           | Returns the square of `a` |
| `cube(int a)`             | Returns the cube of `a` |
| `squareRoot(int a)`       | Returns square root of `a`. Throws error on negative input |

---

## Exception Handling

Handled using multiple `catch` blocks in `Main.java`:

- `ArithmeticException` – for invalid operations like divide by zero or sqrt of negative
- `InputMismatchException` – for invalid user input
- Generic `Exception` – catches all other exceptions

---