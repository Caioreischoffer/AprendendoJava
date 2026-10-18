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
/*Ex8: Write a code where the user enters a prime number, a second number
heigher than the first number and choose between even or odd, with that
the code should show all the numbers evens or odds( according with the
inicial choice) in the interval of the chosen numbers, include the
numbers informed but in decreasing order.*/

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        // Getting informations
        System.out.println("Enter a prime number: ");
        var primeNumber = scanner.nextInt();

        System.out.println("Enter a number higher than the first one: ");
        var number = scanner.nextInt();

        System.out.println("Choose even or odd: ");
        var answer = scanner.next();

        System.out.println("The numbers between your chosen numbers are: ");

        for (int i = number; i >= primeNumber; i--) {
            if (answer.equalsIgnoreCase("even") && i % 2 == 0) {
                System.out.println(i);
            } else if (answer.equalsIgnoreCase("odd") && i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}