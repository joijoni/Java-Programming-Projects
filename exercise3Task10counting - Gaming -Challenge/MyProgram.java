import java.util.Scanner;

/**
 * Write a description of class MyProgram here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyProgram
{
    public void runMyProgram()
    {
        Scanner reader=new Scanner(System.in);
        int num1;
        int num2;
        int count=0;
        int target=5;
        //System.out.println(" Enter  number");
        //int target=reader.nextInt();
        int total;
          String next="y";
        while (next.equals("y"))
           {
              num1=new java.util.Random().nextInt(10);
              System.out.println(num1);
              num2=new java.util.Random().nextInt(10);
              System.out.println(num2);
             
              System.out.println(" Is num2 greater than num1?y or n?  ");
              next=reader.nextLine();
                      if  ( num2>num1 )
                      {
        
                              if ( next.equals("y") )
                                {
                                System.out.println(" well guessed! ");
                                total=num2 +10;
                                System.out.println(" total is = " + total );
                                }
                                
                                if(next.equals("n"))
                                {
                                System.out.println(" Sorry wrong guess! " );
                                    total=num2-10; 
                                  System.out.println(" total = " + total); 
                                
                                }
                        }         
                   
                         else 
                         {
                                 if ( next.equals("y") )
                                {
                                      //if (num2< num1)
                                       System.out.println(" Sorry wrong guess! " );
                                        total=num2-10; 
                                          System.out.println(" total = " + total);    
                                    
                                }
                                
                                if ( next.equals("n") )
                                {
                                   
                                     System.out.println(" well guess! " );
                                        total=num2+10;
                                        System.out.println(" total is = " + total );
                                }  
                            }
                     
                    System.out.println(" Do you want to continue? Enter y or n: "); 
                 next=reader.nextLine();
                 //count++;
               //System.out.println(" Do you want to continue? y or n? "   ); 
               //next = reader.nextLine();
            }
       // }
        System.out.println("Thank you ");
    }
public static void main(String[] args)
    { 
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
