//Kunj Sikchi,kunjsikchi2002@gmail.com
import java.util.Scanner;
public class Odd_Even 
{
    public static void main(String[] args) 
    {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your number:");
        n = s.nextInt();
        if(n % 2 == 0)
        {
            System.out.println("The given number "+n+" is Even ");
        }
        else
        {
            System.out.println("The given number "+n+" is Odd ");
	}
    }
}