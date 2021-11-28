
/**
 * Exercise2d,subtracting fist from second of two variables and storing the result in answer.
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
          System.out.println("Enter second");
          
        second = reader.nextInt();
        System.out.println("enter first");//give the variable values
        first=reader.nextInt();
         answer = second - first ;      
        
        System.out.println(answer);
    }
    
    public static void main(String[] args)
    { 
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
