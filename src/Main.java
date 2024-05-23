import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner  scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        int numberOne = scanner.nextInt();
        System.out.println("Enter the second number");
        int numberTwo = scanner.nextInt();
        int result= numberOne + numberTwo ;
        double resultDiv = (double) numberOne / numberTwo ;
        System.out.println("The sum is = "+ result);
        System.out.println("The division is = "+ resultDiv);
        }
    }

