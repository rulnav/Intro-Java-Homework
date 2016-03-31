/**
 * Created by Dean on 20.3.2016 г..
 */
import java.util.Scanner;
public class CharacterTriangle {
    public static void main(String[] args) {
        Scanner user_input = new Scanner( System.in );
        System.out.print("Enter number: ");
        int num = user_input.nextInt( );


        for(int i=1;i<=num;i++) {
            for (char c = 'a'; c != 'a' + i; c++) {
                System.out.print(c + " ");
            }
            System.out.print("\n");
        }
        for(int i=num;i>0;i--) {
            for (char c = 'a'; c != 'a' + i -1; c++) {
                System.out.print(c + " ");
            }
            System.out.print("\n");
        }

    }
}
