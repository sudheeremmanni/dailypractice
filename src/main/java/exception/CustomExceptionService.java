package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.security.KeyStore;
import java.security.KeyStoreException;

public class CustomExceptionService {
    public String checkException(){
        try {
            throw new Exception("Throw CheckException");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("From CheckException method finally block");
        }


    }


        public String checkException2() throws Exception { // whoever calls this method they need to
                                                            //handle the exception

                throw new Exception("Throw CheckException");



        }
    public String checkException3(){
        try {
            /*KeyStore.getInstance("");
            Thread.sleep(1000);*/
            FileInputStream fileInputStream = new FileInputStream("/abc");
        /*} catch (KeyStoreException e) {
            System.out.println("Error occured in checkException3"+e);
            throw new RuntimeException(e);
        }catch (InterruptedException e){
            throw new RuntimeException(e);*/
        }catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }

        return null;

    }
    public String unCheckedException(){
        throw new RuntimeException("Throw unchecked Exception");

    }
}
