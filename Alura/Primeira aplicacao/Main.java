/* Exercises from DIO x Itau Bootcamp (Fundaments of the Java programming language)

Ex1: Write a code that receives the name and year of birth of someone and print "Hello someone you are X years old".

Ex2:Write a code that receives the measure of a squares side and print the area of that square.
    Formula: Area = Side x Side
Ex3: Write a code that receives the height and base of a rectangle and print its area.
    Formula: = Base x Height
Ex4: Write a code that receives name, age of 2 people and print the age difference between them

*/
// Exercise 2: Write a code that receives the measure of a squares side and print the area of that square.

import java.util.Scanner;

public class Main {

public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    // Getting the measures
    System.out.println("Give me a measure of the square's side: ");
    var squareSide = scanner.nextInt();
    // Getting the square area
    var squareArea = squareSide * 4;
    // Last message
    System.out.printf("The area of the square is: %s \n", squareArea);

    }

}