/*
import java.util.Scanner;

public class ProperCase {

    public static void main(String[] args){

        properCaseChange();
    }

    public static void properCaseChange(){

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter words in different typecases separated by spaces.");
        String sentence = input.nextLine();

        // • Ord, som udelukkende er skrevet med store bogstaver, skal ikke ændres.
        // • Ord på mere end 3 bogstaver skal skrives med småt, dog med stort begyndelsesbogstav.
        // • Ord på max. 3 bogstaver skal skrives med småt.

        capitalize(sentence);
        System.out.println(sentence);

    }
    public static String capitalize(String sentence) {
        if(sentence == null || sentence.isEmpty()) {
            return sentence;
        }

        return sentence.substring(0, 1).toUpperCase() + sentence.substring(1);
    }

public class StringCheckIfUpperCaseExample {

    public static void checkIfUpperCase

    {

        String str = "STRING123, TEST";

        System.out.println("Is String uppercase?: " + isStringUpperCase(str));

    }

    private static boolean isStringUpperCase(String str) {

        //convert String to char array
        char[] charArray = str.toCharArray();

        for (int i = 0; i < charArray.length; i++) {

            //if the character is a letter
            if (Character.isLetter(charArray[i])) {

                //if any character is not in upper case, return false
                if (!Character.isUpperCase(charArray[i]))
                    return false;

                // Alternative with lower case:
                // if( Character.isLowerCase( charArray[i] ))

            }
        }

        return true;

        }
    }
}

*/
