import java.util.*;
class c
{
    public static void main(String args[])
    {
        for(int i=0;i<=200;i++)
        {
            System.out.println("Good MAORNING");
            try{
                Thread.sleep(5000);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
            System.out.println("Good Afternoon");
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException v)
            {
                System.out.println(v);
            }
            System.out.println("Good Evening");
        }
    }
}

            
        
            
            
    