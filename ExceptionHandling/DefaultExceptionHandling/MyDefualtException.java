package DefaultExceptionHandling;

public class MyDefualtException implements java.lang.Thread.UncaughtExceptionHandler {

    @Override
    public void uncaughtException(java.lang.Thread t, Throwable e) {
        System.err.println("exception in ankit thred "  +t.getName());
        e.printStackTrace(); // use to print the printstack in exception

    }
}
