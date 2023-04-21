import java.util.Scanner;
import java.io.*;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
     
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num = in.nextInt(); //read user input (int)
    for (int i = num; i>0 ; i--) {
      for (int o = 0; o<i; o++) {
        System.out.print("*");
      }
      System.out.println();
    }
    
  }
}
