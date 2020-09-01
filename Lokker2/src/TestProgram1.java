import java.util.*;

public class TestProgram1 {

    public static void main(String[] args) {

        Random r = new Random();
        int counter = 0;

        while (true) {
            int dice = r.nextInt(7);
            if (dice == 0) {
                continue;
            }
            counter++;
            System.out.println(dice);
            if (dice == 6)    {
                break;
            }
        }
        System.out.println("You got 6 in " + counter + " stroke(s)!");
    }
}
