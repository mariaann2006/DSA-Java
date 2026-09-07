import java.util.Scanner;
public class count
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int num;
        System.out.print("Enter the number :");
        num=in.nextInt();
        int count=0;
        while(num>0)
        {
            int rem=num%10;
            count=count+1;
            num=num/10;

        }
        System.out.println("The number of digits in this number is:" +count);
    }
}