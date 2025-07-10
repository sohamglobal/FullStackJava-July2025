class Addition
{
   public static void main(String[] args)
   {
      double a,b,res;
      a=Double.parseDouble(args[0]);
      b=Double.parseDouble(args[1]);
      res=a+b;
      System.out.print("Sum of "+a+" and "+b+" is "+res);
   }
}