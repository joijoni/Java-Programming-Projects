
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
        Scanner reader=new Scanner(System.in);
          int first;
          int second;
          int answer;
          System.out.println("Enter first");
          
        first = reader.nextInt();
        System.out.println("enter second");//give the variable values
        second=reader.nextInt();
         answer = first + second ;      
        
        System.out.println(" answer = " +  answer);
    }
    
    public static void main(String[] args)
    { 
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
