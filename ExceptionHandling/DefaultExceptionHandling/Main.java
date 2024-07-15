package DefaultExceptionHandling;

public class Main {
    public static void main (String args [])
    {
        Thread.currentThread().setUncaughtExceptionHandler(new MyDefualtException());

       /* System.out.println("this is default exception handling section"); //it will print only this is default exception handling section
//exception in ankit thred  print only these msg and never print the print stack
        int a= 10/0;
        System.out.println(a);*/

         Thread.currentThread().setName("jjjj");
//it will print exception with the printstacktrace
        System.out.println("this is default ankit exception with printstacktrace");
        int a =10/0;
        System.out.println(a);

    }
}
