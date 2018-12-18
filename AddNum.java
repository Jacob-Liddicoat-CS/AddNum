import java.io.*;

public class AddNum
{
   //Global Variables
   static int[] num = new int[2];
   static String[] input = new String[2];

   String parsingMethod (String[] string)
   {
     return ; //Must be a String Variable returning into
   }

   public static void main(String args[]) //Exception not caught yet
   throws ArrayIndexOutOfBoundsException, NumberFormatException
   {
     try
     {
       input[0] = args[0];
       //If Error thrown, next line will not execute
       System.out.println("Congrats ... I am using your ARGS[0].")
     }
     catch (ArrayIndexOutOfBoundsException e)
     {
       input[0] ="2";
       System.out.println("You did not enter a first argument. \nI did it for you")
     }
     try
     {
       //Thows ArrayIndexOutOfBoundsException if no second ARGS entered
       input[1] = args[1];
       System.out.println("Congrats ... I am using your ARGS[1].")
     }
     catch (ArrayIndexOutOfBoundsException e)
     {
       input[1] ="5";
       System.out.println("You did not enter a second argument. \nI did it for you")
     }
     try
     {
       //Need to change this line
       num[0] = parsingMethod(input[0]); //Memory of ARGS[0]
     }
     catch (NumberFormatException e) {
       System.out.println("You must enter digits \n" +
                          "Please restart program with arguments. Thank-you");
     // Feedback is not specific, a general parsing would work better
     System.exit(1);
   }
   System.out.println("Parsing an Integer with Try-Catch.");
   System.out.println("From String " + input[0] + " to Integer " + num[0]);
   System.out.println("Done.");
   System.exit(0);
 }
}
