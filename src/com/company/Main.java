package com.company;

import java.util.*;

public class Main {

    public static void main(String args[]) {
        String a, res, b, c;
        char choice, ch;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.print(" Enter your Selection\n\n");
            System.out.print("1. Business\n");
            System.out.print("2. Residence\n");

            System.out.print("5. Exit\n\n");
            System.out.print("Enter Your Choice : ");
            choice = scan.next().charAt(0);
            switch (choice) {
                case '1':
                    System.out.print("Enter your Business Name : ");
                    scan.nextLine();//clears previous scanner input, preventing the scanner from accepting empty space.
                    a = scan.nextLine();

                    System.out.print("Enter your Contact Name : ");

                    b = scan.next();
                    scan.nextLine();//clears previous scanner input, preventing the scanner from accepting empty space.
                    System.out.print("Enter your Business Phone : ");
                    c = scan.nextLine();
                    scan.nextLine();//clears scanner input.
                    res = "Business: " + a + "\n" + b + "\n " + c;
                    System.out.print("Result = " + res);
                    break;
                case '2':
                    System.out.print("Enter Your Name : ");
                    a = scan.next();
                    System.out.print("Enter Your Phone Number: ");
                    b = scan.next();
                    res = a + b;
                    System.out.print("Result = " + res);
                    break;

                case '5':
                    System.exit(0);
                    break;
                default:
                    System.out.print("Wrong Choice!!!");
                    break;
            }
            System.out.print("\n---------------------------------------\n");
        } while (choice != 5);
    }
}