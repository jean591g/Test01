import java.util.*;
public class TestProgram {

    public static void main (String[] args)
    {
        // skaber / instantierer en ny ArrayList arr:
        ArrayList<Integer> arr = new ArrayList<>();

        // tilføjer værdier til ArrayListen arr:
        arr.add(5);
        arr.add(66);
        arr.add(12);
        arr.add(87);
        arr.add(66);
        arr.add(56);
        arr.add(89);
        arr.add(66);

        int i;
        int sum=0;
        // Hvor mange gange findes der 66 i ArrayListen?
        for (i=0;i < arr.size(); i++)   {
            if (arr.get(i)==66)    {
            //sum = sum + i;
            sum++;
            }
        }
        System.out.println("66 findes " + sum + " gange i ArrayListen.");

        // Led efter nummer 89 og print den hvis den findes:
        boolean found = arr.contains(89);
        if (found)  {
            System.out.println("89 blev fundet.");
        } else {
            System.out.println("89 blev ikke fundet.");
        }

        // Slet nummer 87, og print "87 deleted", hvis den findes:
        for (i=0; i < arr.size(); i++) {
            if (arr.get(i) == 87) {
                System.out.println((arr.get(i)) + " deleted.");
                arr.remove(arr.get(i));
            }
        }
        System.out.println(arr);
    }
}
