package oop.ulohy;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello world");

        int compare = compareTwoNumbers(1, 1);

        System.out.println(compare);

    }

    public static int compareTwoNumbers(int firstNumber, int secondNumber)
    {
        return Integer.compare(firstNumber, secondNumber);
    }
}
