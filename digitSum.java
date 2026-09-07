import java.util.Scanner;
public class digitSum 
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int num;
        System.out.print("Enter the number");
        num = in.nextInt();
        int sum=0;
        while(num>0)
        {
            int rem = num%10;
            sum=sum+rem;
            num=num/10;
        }
        System.out.println("The sum is:" +sum);
    }
}

