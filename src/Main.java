/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 17 Aug, 2018, 11:55 AM,
        @File-Name : Main.java

 */

import java.lang.Exception;

import com.lib.ds.LinkedList;
import com.lib.ds.ListAsArray;
import com.lib.ds.StackAsArray;

public class Main
{

    public static void main (String args []) throws Exception
    {

        Object [] arr = {2, 3, 4};
        StackAsArray <Integer> sar = new StackAsArray <Integer> (arr);
        sar.printElementsInStack();
        StackAsArray <Integer> sar2 = new StackAsArray <Integer> ();
        sar.printElementsInStack();
        sar2.printElementsInStack();
        System.out.println(sar2.isEmpty());

    }

}
