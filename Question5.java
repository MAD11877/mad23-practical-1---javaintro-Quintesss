import java.util.Scanner;
import java.util.Arrays;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    int[] arr={};
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num = in.nextInt(); //read user input (int)
    for (int i = 0; i<num; i++) {
      arr = Arrays.copyOf(arr, arr.length + 1); //replace original array and add extra slot
      arr[i]=in.nextInt();
    }
    
    //find mode in array
    int maxValue = 0, maxCount = 0, i, j;

      for (i = 0; i < num; ++i) {
         int count = 0;
         for (j = 0; j < num; ++j) {
            if (arr[j] == arr[i])
            ++count;
         }

         if (count > maxCount) {
            maxCount = count;
            maxValue = arr[i];
         }
      }

    System.out.println("Mode: "+maxValue);
  }
}
