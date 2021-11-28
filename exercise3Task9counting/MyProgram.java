
/**
 * Addition of two variables and storing the result in answer.
 * Secondly we make the user input values by making it more flexible
 * @author (Josy) 
 * @version (arithemthic1 09/10/2021)
 */
import java.util.Scanner;
public class MyProgram
{
    public void runMyProgram()
    {
        //declare the variable
        Scanner input=new Scanner(System.in);
        int total=0;
        int avg;
        int count=0;
        int target;
        System.out.println( " Enter target ");
        target=input.nextInt();
           while (count<target)
               {
                System.out.println( " Enter num ");
               int num=input.nextInt();
                total=total+num;
                   count++;
                }
        avg=total/10;
        
        System.out.println(" average of 10 numbers is " + avg);
            
       System.out.println(" Thank you "); 

    }
    
    public static void main(String[] args)
    { 
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
