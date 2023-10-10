package ie.atu;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        add();
        multiply();
        divide();
    }

    public static void add()
    {
        System.out.println("Please enter your first number : ");
        Scanner inputs = new Scanner(System.in);
        int firstNum = inputs.nextInt();

        System.out.println("Please enter your second number : ");
        int secondNum = inputs.nextInt();

        int total = firstNum+secondNum;
        System.out.println("The total is " + total);
    }

    public static void multiply()
    {
        System.out.println("Please enter your first number : ");
        Scanner inputs = new Scanner(System.in);
        int firstNum = inputs.nextInt();

        System.out.println("Please enter your second number : ");
        int secondNum = inputs.nextInt();

        int total = firstNum*secondNum;
        System.out.println("The product is " + total);
    }

    public static void divide()
    {
        System.out.println("Please enter your first number : ");
        Scanner inputs = new Scanner(System.in);
        int firstNum = inputs.nextInt();

        System.out.println("Please enter your second number : ");
        int secondNum = inputs.nextInt();

        int total = firstNum/secondNum;
        System.out.println("The result is " + total);
    }

    public static void delete()
    {

    }

}
