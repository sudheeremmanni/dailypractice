package fordemo;

public class ForDemo {
    public static void main(String[] args){

        int array[] = {3,4,1,5};

        for(int i=0; i<array.length ;i++){
            for(int j = i+1;j < array.length;j++){
           if(array[i] > array[j]){
               int temp = array[i];
                array[i] = array[j];
                array[j]= temp;



            }

            }
           // int k = array[i];
            System.out.println(array[i]);
        }

    }}
     //   System.out.println(array.length);
      //  for(int count =1; count<100;count = count+10){
        //    System.out.println(count);
       // }


