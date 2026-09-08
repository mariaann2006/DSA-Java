import java.util.Scanner;
public class largestdigit
{
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        int num;
        System.out.print("Enter the number : ");
        num = in.nextInt();
        int large=0;
        int rem;
        int n;
        while(num>0)
        {
            rem = num%10;
            if(rem>large)
                large=rem;
            num=num/10;

        }
        System.out.println("The largest digit in the number is :" +large);
    }
}