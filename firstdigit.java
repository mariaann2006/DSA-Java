import java.util.Scanner;

public class firstdigit
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);

        int num;

        System.out.print("Enter the number : ");
        num = in.nextInt();

        while(num >= 10)
        {
            num = num / 10;
        }

        System.out.println("The first digit is : " + num);
    }
}