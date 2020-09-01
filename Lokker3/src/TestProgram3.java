import java.util.Scanner;

public class TestProgram3 {

    public static void main(String[] args)  {
        // 'do while' (kører det en gang inden tjekker betingelse) i stedet for 'while' (læs godt opgaven!)
        // 'while' loop kører uendeligt - når man ikke ved hvor mange gange (fx i menuer / dialoger), imens 'for' loop er bestemt.
        // int count = 0;
        //do
        //{
        //   count  += 10;
        //}
        //while(count < 100)

        int number = 0;
        while (number<100){
            number = number + 10;
            if (number==100) {
                System.out.print(number);
            } else {
                System.out.print(number + " ,");
            }
        }
        System.out.println("\n-----\n");
        // nested loop
        for (int i=1; i<6;i++) {
            for(int j=1; j<6; j++){
                if(j==5){
                    System.out.print((i*j));
                } else {
                    System.out.print((i*j)+" ,");
                }
            }
            System.out.println();
        }
        System.out.println("\n-----\n");
        Scanner input = new Scanner(System.in);
        System.out.println("Guess a number (1-10): ");
        while (true){
            int guess = input.nextInt();
            int secret = 6;
            if (guess == secret){
                break;
            } else {
                System.out.println("Wrong number. Try again! ");
                continue;
            }
        }
        System.out.println("Congrats! You've guessed the secret number!");
    }
}
