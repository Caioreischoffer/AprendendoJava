import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        var scanner = new Scanner(System.in);
        System.out.println("Inform a number from 1 to 7");
        var option = scanner.nextInt();
        var message = switch (option){
            case 1,7 -> {
                var day = option == 1? "Sunday" : "Saturday";
                yield String.format("Today is a weekend uhuuul \\o/", day);
            }
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            default -> "That option is Invalid";
        };
        System.out.println(message);
    }
}