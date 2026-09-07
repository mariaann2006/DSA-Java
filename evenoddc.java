import java.util.Scanner;
public class evenoddc
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int num=0;
        int even=0;
        int odd=0;
        System.out.print("Enter the number :");
        num=in.nextInt();
        while(num>0)
        {
            int rem=num%10;
            if(rem%2==0)
                even++;
            else
                odd++;
            num=num/10;
        }
        System.out.println("The number of even digits is : "+even);
        System.out.println("The number of odd digits is : "+odd);
    }
}