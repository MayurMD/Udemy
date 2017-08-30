import com.sun.tools.javac.util.ArrayUtils;

import java.util.Arrays;
import java.util.Scanner;
import org.apache.commons.lang3.*;



public class Array_demo {

    private int[] arr;

    public int[] getIntegers(int[] local) {
        //System.out.println("please enter a list of integers to populate array arr");
        Scanner keyboard = new Scanner(System.in);
        System.out.println(Arrays.toString(local));
        int i = 0;
        while (i < 5) {
            System.out.println("Please enter a integer");
            local[i] = keyboard.nextInt();
            i++;
        }
        return local;

    }

    public void printArray(int[] local) {
        System.out.println(Arrays.toString(local));
    }

    public int []  sortArray(int[] local) {

        System.out.println("sorting the array using builtin algo in java ");
        java.util.Arrays.sort(local);
        System.out.println("reversing the array using builitin library of Array utils ");
        org.apache.commons.lang3.ArrayUtils.reverse(local);
        //System.out.println(Arrays.toString(local));
        return local;

/*
        int i,max,j=local.length-1;
        while (j>0)
        {
        i=0;
        while (i < j) {
            //System.out.println(Arrays.toString(local));
            max = local[i];
            if (max < local[i + 1]) {
                max = local[i + 1];
                local[i + 1] = local[i];
                local[i] = max;
            }
            i++;


        }
        System.out.println("Place the smallest element at the end");
        System.out.println(Arrays.toString(local));
        j--;

    }
*/
}


    public static void main(String[] args) {
    Array_demo obj=new Array_demo();
    obj.arr=new int[5];
    int[] input=obj.getIntegers(obj.arr);
    obj.printArray(input);
    int [] result=obj.sortArray(input);
    obj.printArray(result);




    }



}
