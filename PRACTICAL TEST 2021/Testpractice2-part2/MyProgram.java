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
        
           lenght1=6.5;
        System.out.println(" enter the value of the width of the rectangle " );
         width1=reader.nextDouble();
          double result    = rectangleArea(lenght1,width1);
        System.out.println(" The area of a rectangle with width " + width1 + " and length " + lenght1 + " is " + result  );
        System.out.println("Thank you");
        
        double lenthOfBigrectangle=7;
        double widthofBigrectangle=4;
        double resultofbigrectangle=rectangleArea(lenthOfBigrectangle,widthofBigrectangle);
        
        double lenghtofSmallrectangle=5;
        double widthofSmallrectangle=2;
        double resultofSmallrectangle=rectangleArea(lenghtofSmallrectangle,widthofSmallrectangle);
        
         double arearofShadedrectangle=resultofbigrectangle - resultofSmallrectangle; 
         
        System.out.println("enter value for the radius" );
        double radius=reader.nextDouble();
        double areaofcirc =circleArea(radius);
        System.out.println(" the area of the circle is " + areaofcirc);
        System.out.println("Thank you");
        
        double rad=10;
        while (rad<35)
        {
        
        double areaofci =circleArea(rad);
        System.out.println(" the area of the circle is " + areaofci);
        rad=rad+5;
        }
        System.out.println("Thank you");
        //Question task2,no.8
        double [] circles={18.4,  0.5,  3.5,  9, 10 };
        //Question Task2.no.9
        double [] radies={ 18.4,  0.5,  3.5,  9, 10 };
         target=5;
        for(double radies;radies < 5;radies++)
        {
       double areaofc=circleArea(radies);
        System.out.println(" the area of circle with radies is "+ areaofc[radies]);
        radies=radies+1;
        }
        
        
    }
    public double circleArea(double r)
    {
        double areaofcircle= Math.PI * r*r;
        return areaofcircle;
    }
    /**public double radius()
    {
        System.out.println("enter value for the radius" );
        double radius=reader.nextDouble();
        return radius;
    
    }*/
    
     public double rectangleArea(double x,double y)
    {
        double area= x*y;
        return area;
    }
    
    
    
    public static void main(String[] args)
    { 
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
