/**
 * Created by Dean on 20.3.2016 г..
 */
import java.util.Scanner;
public class SumNum {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        System.out.println("Enter number N: ");
        int N = user_input.nextInt();
        int sum=0;
        for(int i=0;i<=N;i++){
            sum+=i;
        }
        System.out.println("N! is: "+sum);
    }
}
