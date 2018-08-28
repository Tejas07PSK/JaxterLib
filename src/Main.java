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

        //Float arr [] = {3.66f, 5.87f, 13.22f, -26.33f, 1.30f, 44.33f, 56.65f, -14.43f, 1.09f, 2.67f, 7.22f};
        //Integer arr [] = {23, 11, 12, 5, 1, -2, 34, 55, 1, 2, 56, 77, 34};
        double arr [] = {5.0, 4.0, 3.0, 2.0, 1.0};
        arr = InsertionSort.for_doubleArray(arr);
        for (double i : arr)
        {

            System.out.print(i + " ");

        }
        System.out.print("\n");

    }

}
