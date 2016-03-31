/**
 * Created by Dean on 20.3.2016 г..
 */
import java.util.Scanner;

public class GetAverage {
    public static double MyMethod(double a, double b, double c)
    {
        return ((a+b+c)/3.0);
    }
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        System.out.println("Write numbers: ");
        float a = user_input.nextFloat();

        float b = user_input.nextFloat();

        float c = user_input.nextFloat();

        System.out.printf("%.2f",MyMethod(a,b,c));
    }


}