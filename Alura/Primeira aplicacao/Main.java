import java.util.Scanner;

public class Main {

    private final static String welcomeMessage = "Please inform your name: ";

    public static void main(String[] args) {
    var scanner = new Scanner(System.in);
    System.out.println(welcomeMessage);
    var name = scanner.next();;
    System.out.println("Please inform your age");
    var age = scanner.nextInt();

    //System.out.printf("Hello" + name + "your age is" + age)
    System.out.printf("Hello %s your age is %s\n", name, age);
    }

}