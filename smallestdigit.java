import java.util.Scanner;
public class smallestdigit
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int num,rem;
        System.out.print("Enter the number : ");
        num=in.nextInt();
        int small=9;
        while(num>0)
        {
            rem = num%10;
            if(rem<small)
                small = rem;
            num = num/10;
        }
        System.out.println("The smallest digit is : " +small);
    }
}