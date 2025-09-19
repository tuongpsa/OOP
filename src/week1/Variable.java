package week1;

import java.util.Scanner;

public class Variable {
    public static void main(String [] args ) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter  Name: ");
        String Name = input.nextLine();
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        System.out.println("Your First Name: " + Name);
        System.out.println("Your age is : " + age);
        input.close();
    }

}
