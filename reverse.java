import java.util.Scanner;
public class reverse
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int num;
        int rev=0;
        System.out.print("Enter the number:");
        num=in.nextInt();
        while(num>0)
        {
            int rem = num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        System.out.println("The reverse of the number is:" +rev);
    }
}
