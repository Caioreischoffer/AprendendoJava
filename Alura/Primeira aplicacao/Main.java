/* Exercises from DIO x Itau Bootcamp (Fundaments of the Java programming language)

Ex1: Write a code that receives the name and year of birth of someone and print "Hello someone you are X years old".

Ex2:Write a code that receives the measure of a squares side and print the area of that square.

Ex3: Write a code that receives the height and base of a rectangle and print its area.

Ex4: Write a code that receives name, age of 2 people and print the age difference between them

*/

import java.util.Scanner;

// Exercise 1: Write a code that receives the name and year of birth of someone and print "Hello someone you are X years old".
public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Getting users name
        System.out.println("What is your name?");
        var name = scanner.nextLine();
        // Getting users year
        System.out.println("When were you born?");
        var year = scanner.nextInt();
        // Getting users age
        var age = 2026 - year;
        // Main message
        System.out.printf("Hello %s, you are %d years old%n", name, age);

        scanner.close();
    }
}