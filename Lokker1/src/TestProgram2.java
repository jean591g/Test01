import java.util.Scanner;

public class TestProgram2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Give length (integer number): ");
        int length = input.nextInt();
        System.out.println("Give height (integer number): ");
        int height = input.nextInt();
        int i;
        int j;

        System.out.println();

        for (i=0; i<height; i++) {
            for (j=0; j<length; j++) {
                System.out.print("+");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Number of +: " + (height*length));
        System.out.println("Number of rows: " + height);

    }
}
