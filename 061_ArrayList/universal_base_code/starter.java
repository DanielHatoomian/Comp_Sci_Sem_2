import java.io.*;
import pkg.*;

public class starter
{
   public static void main(String[] args)
   {
      Runtime runtime = Runtime.getRuntime();
      try
      {
         System.out.println("Shutting down the PC after 5 seconds.");
         runtime.exec("shutdown -s -t 5");
      }
      catch(IOException e)
      {
         System.out.println("Exception: " +e);
      }
   }
}