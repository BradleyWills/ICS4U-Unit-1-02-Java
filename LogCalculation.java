// java.util.Scanner found at https://www.programiz.com/java-programming/basic-input-output
import java.util.Scanner;

/**
* The LogCalculation program implements an application that calculates how many 
* maple logs should be placed on a truck if you know the lengths of the logs.
*
* @author  Bradley Wills
* @version 1.0
* @since   2020-02-15 
*/

public class LogCalculation {
  // Create variables 
  static double weight;
  static double logLength;
  static int logNumber;
  
  /**
   * Calculates and outputs the amount of logs the truck can carry given the inputed log length.
   */
   
  public static void main(String[] args) {
    // Create scanner also found at https://www.programiz.com/java-programming/basic-input-output
    Scanner userInput = new Scanner(System.in);
    // Ask for input
    System.out.println("Are the logs 0.25, 0.5, or 1 metre?");
    System.out.print("Please enter 0.25, 0.5, or 1: ");
    // Assign user input as logLength
    logLength = userInput.nextDouble();
    // Checks if input is valid
    if (logLength == 0.25 || logLength == 0.5 || logLength == 1) {
      // Calculate the weight per log
      weight =  logLength * 20;
      // Calculate the amount of logs the truck can hold
      logNumber =  1100 / (int) weight;
      // Tells the user how many logs the truck can carry and restates the length of the log
      System.out.println("The truck can carry " + logNumber + " " + logLength + " meter logs.");
    } else {
      // Informs user their input is invalid
      System.out.println("Invalid Input");
    }
  }
}