import java.util.Scanner;
import java.lang.Math;
import java.util.Random;  // at the top before the main

public class HighorLow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int guessNum = 0;
        int temporaryInput = 0;
        String trash = "";

        //using the variables from the example
        Random generator = new Random();
        int val = generator.nextInt(10) + 1;
        //reusing the basic structure of the code from previous models in this assignment, downscaling for fewer inputs.
        do {

            do {
                System.out.println("Guess my number, 1-10!");
                if (in.hasNextInt()) {
                        temporaryInput = in.nextInt();
                        in.nextLine();
                        trash = "";//empty the trash.
                        //checking for negatives
                        if (temporaryInput <= 0 || temporaryInput > 10) {
                            System.out.println("The number is between 1-10!");//if it does, show me how!
                        } else {
                            guessNum = temporaryInput;
                        }

                } else {
                    trash = in.nextLine();
                    System.out.println(trash + " is not a number. Please insert a number!");
                }
            }
            while (!trash.isEmpty());
        }
        while(temporaryInput <= 0 || temporaryInput > 10);

        if(guessNum < val)
        {
            System.out.println("Your guess of "+guessNum+" was low, the number was "+val+".");
        }
        else if(guessNum > val)
        {
            System.out.println("Your guess of "+guessNum+" was high, the number was "+val+".");
        }
        else
        {
            System.out.println("Congrats, you got it! The number was "+val+"!");
        }

    }

}
