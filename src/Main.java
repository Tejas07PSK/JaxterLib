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

        Float arr [] = {3.66f, 5.87f, 13.22f, -26.33f, 1.30f, 44.33f, 56.65f, -14.43f, 1.09f, 2.67f, 7.22f};
        //long arr [] = {23L, 11L, 12L, 5L, 1L, -2L, 34L, 55L, 1L, 2L, 56L, 77L, 34L};
        arr = BubbleSort.for_FloatArray(arr);
        for (float i : arr)
        {

            System.out.print(i + " ");

        }
        System.out.print("\n");

    }

}
