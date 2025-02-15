import java.util.Scanner;
import java.lang.Math;

public class RectangleInfo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double temporaryInput;
        double shapeWidth=0;
        double shapeHeight=0;
        String trash = "";
        int inputCount = 1;
        //reusing the basic structure of the code from FuelCosts, downscaling for fewer inputs.
        do {
            do {
                if (inputCount == 1) {
                    System.out.println("Please provide the width (>0):");
                }
                else if (inputCount == 2)
                {
                    System.out.println("Please provide the height (>0):");
                }

                if (in.hasNextDouble()) {
                    temporaryInput = in.nextDouble();
                    in.nextLine();
                    trash = "";//empty the trash.
                    //checking for negatives
                    if (inputCount == 1) {
                        if (temporaryInput < 0) {
                            System.out.println("You can't have negative width!");
                        }
                        else
                        {
                            shapeWidth = temporaryInput;
                            inputCount++;
                        }
                    }
                    else if (inputCount == 2) {
                        if (temporaryInput < 0) {
                            System.out.println("You can't have negative height!");
                        }
                        else
                        {
                            shapeHeight = temporaryInput;
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
        while(inputCount < 3);
        System.out.println("The perimeter of the rectangle is: "+ ((shapeWidth*2)+(shapeHeight*2)));
        System.out.println("The diagonal measure of the rectangle is: "+ Math.sqrt((shapeWidth*shapeWidth)+(shapeHeight*shapeHeight)));

    }
}
