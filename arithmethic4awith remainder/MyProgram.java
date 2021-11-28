
/**
 * Converting number of days to weeks with the remainder.
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
        int days ;
        int wks;
          
        System.out.println("Enter first");
          
        days = reader.nextInt();
        //System.out.println("enter second");//give the variable values
        wks= days /7 ;
        days= days % 7;      
        
        System.out.println(wks + " wks and " + days + " days " );
    }
    
    public static void main(String[] args)
    { 
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
