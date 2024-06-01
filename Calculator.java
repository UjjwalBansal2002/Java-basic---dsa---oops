
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the operation you want to perform: ");
            char operator = input.next().trim().charAt(0);

            if (operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%') {
                System.out.print("Enter the first Number: ");
                int n1 = input.nextInt();
                System.out.print("Enter the second Number: ");
                int n2 = input.nextInt();

                if (operator == '+') {
                    System.out.println("Answer: "+(n1 + n2));
                }
                if (operator == '-') {
                    System.out.println("Answer: "+(n1 - n2));
                }
                if (operator == '*') {
                    System.out.println("Answer: "+(n1 * n2));
                }
                if (operator == '/') {
                    if (n2 != 0) {
                        System.out.println("Answer: "+(n1 / n2));
                    }
                }
                if (operator == '%') {
                    System.out.println("Answer: "+(n1 % n2));
                }
            }
            input.close();
        }
    }
}
