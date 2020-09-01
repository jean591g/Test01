import java.util.Scanner;

public class MyMain {

    public static void main(String[] args) {

        // vi instantierer et nyt objekt 's' af klassen Scanner med at bruge keywordet 'new'
        Scanner s = new Scanner(System.in);
        // int number = s.nextInt();
        // String text = s.nextLine();
        int age = 0;

        try {
            System.out.println("\nHow old are you?");
            age = s.nextInt();

            System.out.println("Your age is " + age + ".");

            // hvis andet end en Integer bliver tastet ind, får vi en fejl af typen:
            // Exception in thread "main" java.util.InputMismatchException
            // Vi kan bruge en try catch metode for undgå program crash
        } catch (Exception e) {
            System.err.println("Error. You didn't enter an integer.");
        }
    }
}
