package new_package;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> numbers = new ArrayList<>();

        System.out.println("Welcome to the calculator!");
        System.out.println("Enter numbers one by one. Type 'done' when finished:");

        while (true) {
            String input = sc.next();
            if (input.equalsIgnoreCase("done")) break;

            try {
                double number = Double.parseDouble(input);
                numbers.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number or 'done'.");
            }
        }

        if (numbers.size() < 2) {
            System.out.println("Please enter at least two numbers.");
            return;
        }

        System.out.println("Choose an operation:");
        System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
        int operation = sc.nextInt();

        double result = numbers.get(0);

        switch (operation) {
            case 1:
                for (int i = 1; i < numbers.size(); i++) {
                    result += numbers.get(i);
                }
                break;
            case 2:
                for (int i = 1; i < numbers.size(); i++) {
                    result -= numbers.get(i);
                }
                break;
            case 3:
                for (int i = 1; i < numbers.size(); i++) {
                    result *= numbers.get(i);
                }
                break;
            case 4:
                for (int i = 1; i < numbers.size(); i++) {
                    if (numbers.get(i) == 0) {
                        System.out.println("Error: Division by zero.");
                        return;
                    }
                    result /= numbers.get(i);
                }
                break;
            default:
                System.out.println("Invalid operation choice.");
                return;
        }

        System.out.println("Result: " + result);
        sc.close();
    }
}
