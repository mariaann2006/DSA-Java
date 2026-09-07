import java.util.Scanner;
public class palindrome
{
    public static void main(String args[])
    {
        Scanner in = new Scanner (System.in);
        int num=0;
        int rev=0;
        int rem;
        int n;
        System.out.print("Enter the number:");
        num=in.nextInt();
        n = num;
        while(n>0)
        {
            rem = n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(num==rev)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not palindrome");
        }
        }
    }
    

