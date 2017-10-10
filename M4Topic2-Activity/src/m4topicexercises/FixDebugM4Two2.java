package m4topicexercises;
// A byte can't hold a value higher than 127
// This program throws an ArithmeticException
// if adding two bytes yields a value that is too high
public class FixDebugM4Two2
{
   public static void main(String[] args)
   {
      byte num1 = 120, num2 = 7, result;
      final byte HIGHBYTE = 127;
      try
      {
         result = (byte)(HIGHBYTE - num1);
         if(num2 > result)
            throw(new ArithmeticException());
         result = (byte)(num1 + num2);
         System.out.println("Result is " + result);
      }
      catch(ArithmeticException error)
      {
         System.out.println("Byte can't hold value higher than " + HIGHBYTE);
      }
   }
}