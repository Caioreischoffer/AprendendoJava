import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    var scanner = new Scanner(System.in);

    System.out.println("Please inform your age");
    var age = scanner.nextInt();
    System.out.println("Are you Emancipated?");
    var isEmancipated = scanner.nextBoolean();
    var canDrive = age >= 18 || (isEmancipated && age>= 16);
    System.out.printf("Can you drive? (%s)\n", canDrive);
    }

}