//creating thread using lamda expresion
public class Main4
{
    public static void main(String args[])
    {
        Runnable r=()->System.out.println("Iam new  from java8 version");
        Thread t=new Thread(r);
        t.start();
        System.out.println(t.isAlive());
    }
}