//Extending Theard class
class a extends Thread
{
    public void r()
    {
        System.out.println("Hello I'm Thread");
    }
}
public class Main
{
    public static void main(String args[])
    {
        a g=new a();
        g.r();
        g.start();
    }
}
    
