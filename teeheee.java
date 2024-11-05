import java.util.Scanner;

public class FunnyCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Gimme a number, yo: ");
        double num1 = scanner.nextDouble();

        System.out.print("And another one: ");
        double num2 = scanner.nextDouble();

        System.out.println("Wanna add 'em, subtract 'em, multiply 'em, or divide 'em? (1/2/3/4)");
        int choice = scanner.nextInt();

        double result;

        switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.println("Boom! The answer is " + result + ". That's *chef's kiss* good.");
                break;
            case 2:
                result = num1 - num2;
                System.out.println("Subtractin' like a ninja! Result: " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("Multiplyin' madness! Result: " + result + ". Wowza!");
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("Whoa there, cowboy! Can't divide by zero. That's a no-no.");
                } else {
                    result = num1 / num2;
                    System.out.println("Dividin' and conquerin'! Result: " + result + ". Haha!");
                }
                break;
            default:
                System.out.println("Huh? What was that? Try again, silly.");
        }
    }
}