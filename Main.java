// Name: Dhaerya More 
// PRN: 23070126033
// Batch: AIML A2

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();
        
            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();
        
            System.out.println("Addition: " + calc.add(num1, num2));
            System.out.println("Subtraction: " + calc.subtract(num1, num2));
            System.out.println("Multiplication: " + calc.multiply(num1, num2));
            System.out.println("Division: " + calc.divide(num1, num2));

            System.out.print("Enter a number for square and cube: ");
            int squareInput = scanner.nextInt();
            System.out.println("Square: " + calc.square(squareInput));
            System.out.println("Cube: " + calc.cube(squareInput));
        
            System.out.print("Enter a number for square root: ");
            int rootInput = scanner.nextInt();
            System.out.println("Square Root: " + calc.squareRoot(rootInput));
        
        
    }
}
