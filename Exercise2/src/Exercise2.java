
import java.util.Scanner;

public class Exercise2
{
   public static void main( String[] args )
   {
	   Scanner input = new Scanner(System.in);
      
	   int count1;
	   int number;
	   int count2;
	 
      for ( count1 = 1; count1 <= 5; count1++ )
      {  
    	  System.out.printf("Input 5 integer : ");
    	  number = input.nextInt();
          
    	  for (count2 = 0; count2 <= number; count2++)
        	  System.out.printf("*");
    	  
    	  System.out.printf("\n");
      }
      
      System.out.printf("\n");
      

   } 
} 

