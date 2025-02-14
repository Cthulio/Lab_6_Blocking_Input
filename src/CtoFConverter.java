import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double temperatureToConvert = 0.0;
        String trash = "";
        do
        {
            System.out.println("Please provide a temperature in Celsius:");
            if(in.hasNextDouble()) {
                temperatureToConvert = in.nextDouble();
                in.nextLine();
                trash = "";//empty the trash.
            }
            else
            {
                trash = in.nextLine();
                System.out.println(trash +" is not a valid temperature!");
            }
        }
        while(!trash.isEmpty());//I find this more effective than storing a "done" value, we would only need to clear it on valid input, and it's a bit funny.
        System.out.println("Your temperature in Fahrenheit is: " +((temperatureToConvert*1.8)+32));
    }
}
