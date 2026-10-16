/* Exercises from DIO x Itau Bootcamp (Fundaments of the Java programming language)

Ex1: Write a code that receives the name and year of birth of someone and print "Hello someone you are X years old".

Ex2:Write a code that receives the measure of a squares side and print the area of that square.
    Formula: Area = Side x Side
Ex3: Write a code that receives the height and base of a rectangle and print its area.
    Formula: = Base x Height
Ex4: Write a code that receives name, age of 2 people and print the age difference between them

*/
// Exercise 3: Write a code that receives the height and base of a rectangle and print its area.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the Base of this rectangle? ");
        var rectangleBase = scanner.nextInt();
        System.out.println("What is the height of this rectangle? ");
        var rectangleHeight = scanner.nextInt();

        var rectangleArea = (rectangleBase * rectangleHeight);
        System.out.printf("The area of this rectangle is: %s \n", rectangleArea);
    }
}