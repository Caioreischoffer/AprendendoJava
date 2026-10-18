/*Ex6: Write a code where the user enters a number and the multiplication
table from 1 to 10 of that numbewr are shown. 

Ex7: Write a code where the user enters his height
and weight and the claculated IMC(IMC = weight/(Height*Height)) will be
returned according to the conditions below:

- If <= 18,5 "Under wheight"
- If between 25,0 and 29,9 " Ideal Weight"
- If between 30,0 and 34,9 "Obesity level 1"
- If between 35,0 and 39,9 "Obesity level 2(Severe)
- If >= 40,0 "Obesity level 3(Morbid)

Ex8: Write a code where the user enters a prime number, a second number
heigher than the first number and choose between even or odd, with that
the code should all the numbers evens or odds( according with the
inicial choice) in the interval of the chosen numbers, include the
numbers informed but in decreasing order.

Ex9: Write a code where the user writes an inicial number, after he
will inform X numbers, the execution will continue untill the
informed number divided by the first number has rest different from 0
, numbers less than the first number should be ignored.*/

import java.util.Scanner;
/* Ex9: Write a code where the user writes an inicial number, after he
will inform X numbers, the execution will continue untill the
informed number divided by the first number has rest different from 0
, numbers less than the first number should be ignored. */
public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        var firstNumber = scanner.nextInt();

        var keepGoing = true;

        while (keepGoing) {
            System.out.println("Enter another number: ");
            var number = scanner.nextInt();

            if (number < firstNumber) {
                System.out.println("Ignored: smaller than the first number.");
            } else if (number % firstNumber != 0) {
                System.out.println("Remainder is not 0. Stopping.");
                keepGoing = false;
            } else {
                System.out.println(number + " is divisible by " + firstNumber + ". Continue!");
            }
        }
    }
}