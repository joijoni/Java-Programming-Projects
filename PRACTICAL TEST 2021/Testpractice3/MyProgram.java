import java.util.Scanner;

/**
 * Write a description of class MyProgram here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyProgram
{
    // global variable
    Scanner reader = new Scanner(System.in);

    public void runMyProgram()
    {
        //Write your code here 
        System.out.println(" 0.Quit ");
        System.out.println(" 1.Area of circle ");
        System.out.println(" 2. Area of a rectangle " );
        
        System.out.println(" enter the number of your choice ");
        int choice=reader.nextInt();
        while (choice !=0)
        {
            if (choice==1)
            {
            System.out.println(" enter the radius of the circle" );
            double radius=reader.nextDouble();
            double areaofcircle=22/7 * radius *radius;
            System.out.println(" area of the circle "+ areaofcircle );
            }
            else
            {
            System.out.println(" enter the lenght of the rectangle ");
            int length=reader.nextInt();
            System.out.println("enter the width of the rectangle ");
            int width=reader.nextInt();
            int areaofrectangle=length * width;
            System.out.println(" area of the rectangle " + areaofrectangle);
            }
        System.out.println(" enter the number of your choice ");
         choice=reader.nextInt();
        }
         System.out.println(" Thank you" );
            
            
            
        
    }
    

    
    
    public static void main(String[] args)
    { 
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
