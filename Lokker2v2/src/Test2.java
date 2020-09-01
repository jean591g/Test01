import java.util.*;

public class Test2 {

    public static void main(String[] args) {

        Random r = new Random();
        int dice = 1;
        int count = 0;

        while (true) {

            dice = r.nextInt(7);

            if (dice == 0) {
                continue;
            }
            count++;
            System.out.println(dice);

            if (dice == 6) {
                break;
            }
        }
        if (count > 1) {
            System.out.println("You got 6 in " + count + " dice rolls!");
        } else {
            System.out.println("You got 6 in 1 dice roll, you lucky bastard!");
        }
    }
}
