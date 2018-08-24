package again;

import java.util.Random;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {

        Random random = new Random();
        //Scanner sc = new Scanner(System.in);
        int[] array = new int[3];

        System.out.println("pls enter 3 numbers: ");
        for(int i=0; i<3; i++){
            array[i]=random.nextInt(100);
        }

        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);


        }

    }
}
