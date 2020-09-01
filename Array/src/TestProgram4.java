import java.util.Arrays;

public class TestProgram4 {

 public static void main(String[] args){

     int[]a = {11,22,33,44,55,66,77,88,99};
     // Examples of other types of Arrays:
     // double[]b = new double[9];
     // String[]c = new String[9];
     // boolean[]d = new boolean[9];
     // int[]a,b; (possible: both a and b are Arrays of Integers)
     int sum=0;

     for (int i=0; i<a.length;i++) {
         sum = sum + a[i];
     }
     System.out.println("Sum: " + sum);
     System.out.println("Average: " + (sum/a.length));

     int helper = a[0];
     a[0] = a[(a.length-1)];
     a[a.length-1]=helper;

     // Let's check if both first and last values were inverted:
     System.out.println(Arrays.toString(a));

     // Let ‘b’=‘a’ explain what that means.
     // int[]a,b; (also possible: both a and b are Arrays of Integers)
     int[]b;
     b=a;
     // b becomes a copy of a. Let's check:
     System.out.println(Arrays.toString(b));

 }
}
