import java.util.Scanner;

/**
 * Write a description of class MyProgram here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyProgram
{
    Scanner reader = new Scanner(System.in);
    
    public void runMyProgram()
    {
        // Write your code here
        double value;
        double ans;
        
        System.out.println("Converter"); 
        String choice="c";
                                
        String input="y";
        while(input.equals("y"))
        {
             
             choice = displayMenu();
             double temp = getInputValue();
            if (choice.equals("c")) 
            {   
                //System.out.println(choice);
                ans = farenheitToCelsius(temp);
                printResult(" Conversion from C to F is ", ans);
            }
            else
            {
                //System.out.println(choice);
                ans = celsiusToFarenheit(temp);
                printResult(" Conversion from F to C is ", ans);
            }
            //printResult(" Conversion from F to C is ", ans);
            
            System.out.println("Do you want to continue ? Enter y or n : ");
            reader.nextLine(); // to absorb previous <enter>
             input = reader.nextLine();
            
        }
        
        System.out.println("Thank you for using the temperature converter");    
        
        
    }

    // These are method definitions

    /* This method(function) asks for user to input a number and
     * returns the value input
     * This is a typical "input" function
     */
    public double getInputValue()
    {
        System.out.println("Enter value" );
        int number = reader.nextInt();
        return number;
    }

    
    /* This method (function) converts Farenheit to Centigrade
     * This is a typical "processing" function
     */
    public double farenheitToCelsius(double fahrenheit)
    {
        double celsius = (fahrenheit - 32) * 5/9;
        return celsius;
    }

    
    /* This method (function) converts Centigrade to Farenheit
     * This is a typical "processing" function
     */
    public double celsiusToFarenheit(double celsius)
    {
        double farenheit = celsius * 9/5.0 + 32;
        return farenheit;
    }

    
    /* This method (procedure) takes an int and displays it
     * for the user
     * This is a typical "output" procedure
     * @param mess is the message you want to send with this result
     * @param res is the result
     */
    public void printResult(String mess, double res)
    {
        System.out.println( mess + res);
    }
        
    /* This method is a common "output" procedure
     * It has no parameters
     */
    public String displayMenu()
    {
        System.out.println("Enter C - farenheit to Celsius, F - Celsius to Farenheit");
        String choice = reader.nextLine();
        return choice;
    }

    public static void main(String[] args)
    { 
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
