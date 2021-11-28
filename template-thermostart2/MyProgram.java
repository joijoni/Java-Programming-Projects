
/**
 * This program alters and adjust the temperature of a room.
 * By allowing users input values.
 * 
 * @author (Josy) 
 * @version (a thermostart number1 09/10/2021)
 */
import java.util.Scanner;
public class MyProgram
{
    public void runMyProgram()
    {
        //We are importing the java scanner to allow it take imput from users
        Scanner input= new Scanner(System.in);
        int maxtemp =30;
        double newtemp ; 
        System.out.println("enter newtemp");
        newtemp= input.nextDouble();
               
        if (newtemp > maxtemp)
        {
        System.out.println("House is hot " + " off the heater");
        }
        else
        {
        System.out.println(" on  the heater ");
        }
        System.out.println("Thank you");
    }
    
    public static void main(String[] args)
    { 
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
