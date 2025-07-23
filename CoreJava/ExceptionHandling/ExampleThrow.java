import java.util.*;

class ExampleThrow
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int age;
        System.out.print("Enter age (18-75) : ");
        try
        {
        age=sc.nextInt();
        if(age<18 || age>75)
        {
            throw new Exception();
        }

        System.out.println("your age is "+age+" so you are allowed to enter");
        }
        catch(Exception e)
        {
            System.out.println("Invalid age..not allowed");
        }
    }
}