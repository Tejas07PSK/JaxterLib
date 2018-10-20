/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 17 Aug, 2018, 11:55 AM,
        @File-Name : Main.java

 */

import java.lang.Exception;

import com.lib.algo.*;
import com.lib.ds.LinkedList;
import com.lib.ds.StackAsLinkedList;
import com.lib.algo.Mathematics;
import java.util.List;

public class Main
{

    public static void main (String args []) throws Exception
    {

        List <Long> lt = Mathematics.segmentedPrimeSieve((new long [] {0, 1000}), (new long [] {1, 1}));
        for (long num : lt)
        {

            System.out.println(num);

        }

    }

}
