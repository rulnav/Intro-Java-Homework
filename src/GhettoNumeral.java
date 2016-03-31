/**
 * Created by Dean on 20.3.2016 г..
 */
import java.util.Scanner;
public class GhettoNumeral {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        String s = user_input.next();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='0') System.out.print("Gee");
            else if(s.charAt(i)=='1') System.out.print("Bro");
            else if(s.charAt(i)=='2') System.out.print("Zuz");
            else if(s.charAt(i)=='3') System.out.print("Ma");
            else if(s.charAt(i)=='4') System.out.print("Duh");
            else if(s.charAt(i)=='5') System.out.print("Yo");
            else if(s.charAt(i)=='6') System.out.print("Dis");
            else if(s.charAt(i)=='7') System.out.print("Hood");
            else if(s.charAt(i)=='8') System.out.print("Jam");
            else if(s.charAt(i)=='9') System.out.print("Mack");
        }

    }
}
