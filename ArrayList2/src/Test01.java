import java.util.ArrayList;

public class Test01 {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(66);
        arr.add(12);
        arr.add(87);
        arr.add(66);
        arr.add(56);
        arr.add(89);
        arr.add(66);

        // (Q1) Count the occurrences of the number 66
        int counter = 0;

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == 66) {
                counter++;
            }
        }
        System.out.println("Number 66 appears: " + counter + " times.");
        // (Q2) Search for the number 89 and print it if found.

        if (arr.contains(89)) {
            System.out.println("Number 89 found at index: " + arr.indexOf(89));
        } else {
            System.out.println("Number 89 not found");
        }
        System.out.println(arr);
        // (Q3) Delete the number 87 and print ‘87 deleted’ if found.
        if (arr.contains(87))   {
            System.out.println("Number 87 found and deleted.");
            arr.remove(arr.indexOf(87));
        } else {
            System.out.println("Number 87 not found.");
        }
        // Let's check if the number 87 doesn't appear anymore:
        System.out.println(arr);
    }
}
