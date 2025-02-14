import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double temporaryInput;
        double galsOfGas = 0;
        double priceOfGas = 0;
        double fuelEfficiency = 0;
        String trash = "";
        int inputCount = 1;
        do {
            do {
                if (inputCount == 1) {
                    System.out.println("Please provide the gallons of gas available (US Gal) (>= 0.0):");
                }
                else if (inputCount == 2)
                {
                    System.out.println("Please provide the price of gas (USD) (>= 0.0):");
                }
                else if (inputCount == 3)
                {
                    System.out.println("Please provide your fuel efficiency (MPG) (>= 0.0):");
                }

                if (in.hasNextDouble()) {
                    temporaryInput = in.nextDouble();
                    in.nextLine();
                    trash = "";//empty the trash.
                    //checking for negatives
                    if (inputCount == 1) {
                        if (temporaryInput < 0) {
                            System.out.println("You can't have negative gas!");
                        }
                        else
                        {
                            galsOfGas = temporaryInput;
                            inputCount++;
                        }
                    }
                    else if (inputCount == 2) {
                        if (temporaryInput < 0) {
                            System.out.println("You can't sell gas here!");
                        }
                        else
                        {
                            priceOfGas = temporaryInput;
                            inputCount++;
                        }
                    }
                    else if (inputCount == 3) {
                        if (temporaryInput < 0)
                        {
                            System.out.println("Your car doesn't produce gas!");//if it does, show me how!
                        }
                        else
                        {
                            fuelEfficiency = temporaryInput;
                            inputCount++;
                        }
                    }
                } else
                {
                    trash = in.nextLine();
                    System.out.println(trash + " is not a number. Please insert a number!");
                }
            }
            while (!trash.isEmpty());
        }
        while(inputCount <= 3);
        System.out.println("The number of gallons of gas in the tank is: " + galsOfGas);
        System.out.println("The fuel efficiency in miles per gallon is: " + fuelEfficiency);
        System.out.println("The price of gas per gallon is: $" + priceOfGas);
        System.out.println("");//blank line
        System.out.println("The cost to drive 100 miles in this car is: $" + (100/fuelEfficiency)*priceOfGas);
        System.out.println("This car can go "+(galsOfGas*fuelEfficiency)+" mile(s) with a full tank of gas!");

    }
}
