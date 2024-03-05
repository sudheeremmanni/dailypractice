package fordemo;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class SelectionSort {

    public static void main(String[] args) {

        int array[] = {80, 26, 12, 23, 11};

        for (int i = 0; i < array.length; i++) {

            for (int j = i + 1; j < array.length; j++) {

                if (array[j] < array[i]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;


                }

            }
            System.out.println(array[i]);

        }

    }}


