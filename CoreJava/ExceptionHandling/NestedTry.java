import java.util.*;

class NestedTry
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,res,rem;

        System.out.println("Enter 2 numbers : ");
        try
        {
            a=sc.nextInt();
            b=sc.nextInt();

            try
            {
                res=a/b;
                rem=a%b;
                System.out.println("Division is "+res);
                System.out.println("Remainder is "+rem);
            }
            catch(ArithmeticException e)
            {
                System.out.println("cant divide by zero");
            }
        }
        catch(InputMismatchException e)
        {
            System.out.println("Invalid input...");
        }


    }
}