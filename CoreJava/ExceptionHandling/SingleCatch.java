class SingleCatch
{
   public static void main(String args[])
   {
      int n,sq;
      try
      {
         n=Integer.parseInt(args[0]);
      }
      catch(Exception e)
      {
         System.out.println("No or Invalid value received...assigning zero");
         n=0;
      }
      
      sq=n*n;
      System.out.print("Square is "+sq);
   }
}

