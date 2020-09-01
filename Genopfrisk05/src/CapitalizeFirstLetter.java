import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CapitalizeFirstLetter {

    public static void main(String[] args) throws IOException {

        System.out.println("Please write several words:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Actually use the Reader
        String name = br.readLine();

        System.out.println( "Is String uppercase?: " + isStringUpperCase(name) );

        if (name.length() > 3) {
            // Don't mistake String object with a Character object
            String s1 = name.substring(0, 1).toUpperCase();
            String nameCapitalized = s1 + name.substring(1);
            System.out.println(nameCapitalized);
        }
        if (name.length() <= 3) {
            String s2 = name.toLowerCase();
            System.out.println(s2);
        }
    }

    private static boolean isStringUpperCase (String name){

        //convert String to char array
        char[] charArray = name.toCharArray();

        for (int i = 0; i < charArray.length; i++) {

            //if the character is a letter
            if (Character.isLetter(charArray[i])) {

                //if any character is not in upper case, return false
                if (!Character.isUpperCase(charArray[i]))
                    return false;
            }
        }
        return true;
    }


}

