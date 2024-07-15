package Introduction;

public class MyUncaughtExceptionHandler implements java.lang.Thread.UncaughtExceptionHandler{
    @Override
    public void uncaughtException(java.lang.Thread t, Throwable e) {
        System.err.print("Exception in thread my thread ");
        e.printStackTrace(System.err);
    }
}
