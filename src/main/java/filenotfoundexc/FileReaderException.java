package filenotfoundexc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
//import java.util.Date;


public class FileReaderException {
    public static void main(String[] args) throws InterruptedException, IOException {
        boolean var = true;
        Calendar calendar = Calendar.getInstance();
        long currentTime ;
        calendar.getTime();
        calendar.add(Calendar.MINUTE, 1);
        long countOf15Mins = calendar.getTimeInMillis();

       // FileInputStream fileInputStream = null;

        while(true){
            try {
                FileInputStream fileInputStream = new FileInputStream("D:\\demo\\pom1.xml");
               if(fileInputStream.available() == 1){
                   var = false;
                }

        } catch (FileNotFoundException e) {
                System.out.println("Error Occured"+e.getMessage());
                Calendar calendar1 = Calendar.getInstance();
                currentTime = calendar1.getTimeInMillis();
               if( currentTime<= countOf15Mins) {
                   Thread.sleep(countOf15Mins);
                   continue;
               }else{
                   var = false;
                   CustomFileNotFoundException customFileNotFoundException = new CustomFileNotFoundException("","");
                   System.out.println("Error Occured"+e);
                   throw new CustomFileNotFoundException(customFileNotFoundException.getCode(), customFileNotFoundException.getMessage());
               }

                } catch (IOException e) {
                System.out.println("Error Occured"+e.getMessage());
                throw new RuntimeException(e);
            }

        }
}}
