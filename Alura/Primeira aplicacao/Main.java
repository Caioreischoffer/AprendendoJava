/* Exercises from DIO x Itau Bootcamp (Fundaments of the Java programming language)

Ex1: Write a code that receives the name and year of birth of someone and print "Hello someone you are X years old".

Ex2:Write a code that receives the measure of a squares side and print the area of that square.
    Formula: Area = Side x Side
Ex3: Write a code that receives the height and base of a rectangle and print its area.
    Formula: = Base x Height
Ex4: Write a code that receives name, age of 2 people and print the age difference between them

*/
// Exercise 4: Write a code that receives names and age of 2 people and print the age difference between them

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Person1's name and age
        System.out.println("What is your name? ");
        var name1 = scanner.nextLine();
        System.out.println("What is your age? ");
        var age1 = scanner.nextInt();
        scanner.nextLine(); // ← consume leftover newline

        // Person2's name and age
        System.out.println("What is your friend's name? ");
        var name2 = scanner.nextLine();
        System.out.println("What is your friend's age? ");
        var age2 = scanner.nextInt();
        scanner.nextLine(); // ← consume leftover newline

        // Age difference between them
        int difference = Math.abs(age1 - age2);
        System.out.printf("%s and %s have an age difference of %d year(s)%n", name1, name2, difference);

        scanner.close();
    }
}   