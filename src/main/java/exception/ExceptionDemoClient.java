package exception;

public class ExceptionDemoClient {
    public static void main(String[] args){
        ExceptionService exceptionService = new ExceptionService();
       // exceptionService.greet(null);
        CustomExceptionService customExceptionService = new CustomExceptionService();
       // customExceptionService.checkException2(); -unhandled exception
    }
}
