/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 17 Aug, 2018, 11:55 AM,
        @File-Name : Main.java

 */

import java.lang.Exception;

import com.lib.algo.*;

public class Main
{

    public static void main (String args []) throws Exception
    {

        float arr [] = {3.66f, 5.87f, 13.22f, -26.33f, 1.30f, 44.33f, 56.65f, -14.43f, 1.09f, 2.67f, 7.22f};
        //int arr [] = {23, 11, 12, 5, 1, -2, 34, 55, 1, 2, 56};
        //Double arr [] = {3.66, 5.87, 13.22, -26.33, 1.30, 44.33, 56.65, -14.43, 1.09, 2.67, 7.22};
        arr = MergeSort.for_floatArray(arr);
        for (float i : arr)
        {

            System.out.print(i + " ");

        }
        System.out.print("\n");

    }

}
