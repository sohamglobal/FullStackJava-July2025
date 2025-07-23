class SquareCalculator
{
   public static void main(String args[])
   {
      int n,sq;
      try
      {
         n=Integer.parseInt(args[0]);
      }
      catch(ArrayIndexOutOfBoundsException e)
      {
         System.out.println("No value received...assigning zero");
         n=0;
      }
      catch(NumberFormatException e)
      {
         System.out.println("Invalid value received...considered zero");
         n=0;
      }
      sq=n*n;
      System.out.print("Square is "+sq);
   }
}

/*
Float.parseFloat()
Double.parseDouble()
String.valueOf()
*/