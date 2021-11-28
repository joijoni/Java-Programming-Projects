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
          double lenght1=6.5;
        System.out.println(" enter the value of the width of the rectangle " );
        double width1=reader.nextDouble();
        double area= lenght1 * width1;
        System.out.println(" area of triangle width1 & lenght1 is "+  area);
        
        double lenght2=0;
        double width2=5;
         int count=0;
         int target=4;
         
         while (count<target)
         { 
             lenght2=lenght2+3;
           double area2=lenght2*width2;
           System.out.println(" area of rectangle2 is " + area2);
           if (area2>=20)
           {
            System.out.println("Large Rectangle");
            }
           else 
            {
                System.out.println(" Small Rectangle");
            }
            count=count+1;
        }
        System.out.println("Thanky you");
    }
    
    public static void main(String[] args)
    { 
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
