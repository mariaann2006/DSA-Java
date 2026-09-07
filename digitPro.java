import java.util.Scanner;
public class digitPro
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int num;
        System.out.print("Enter the number :");
        num = in.nextInt();
        int pro=1;
        while(num>0)
        {
            int rem = num%10;
            pro=pro*rem;
            num=num/10;
        }
        System.out.println("The product is:" +pro);
    }
}

