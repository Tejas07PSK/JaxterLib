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

        Double arr [] = {3.66, 5.87, 13.22, -26.33, 1.30, 44.33, 56.65, -14.43, 1.09, 2.67, 7.22};
        arr = SelectionSort.for_DoubleArray(arr);
        for (Double i : arr)
        {

            System.out.print(i + " ");

        }
        System.out.print("\n");

    }

}
