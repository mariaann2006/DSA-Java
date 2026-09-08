import java.util.Scanner;
public class occur
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int num,rem,count=0;
        System.out.print("Enter the number: ");
        num = in.nextInt();
        System.out.print("Enter the digit to check occurence :");
        int digit=in.nextInt();
        while(num>0)
        {
            for(int i=0;i<=num;i++)
            {
                rem = num%10;
                if(rem == digit)
                    count++;
                num=num/10;
            }
        }
         System.out.println("The digit" +digit +"has occured" + count + "times");
    }
}
