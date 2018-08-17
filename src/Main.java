/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 17 Aug, 2018, 11:55 AM,
        @File-Name : Main.java

 */

import java.lang.Exception;
import com.lib.ds.ListAsArray;

public class Main
{

    public static void main (String args []) throws Exception
    {

        Object arr [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ListAsArray <Integer> lst = new ListAsArray <Integer> (arr);
        lst.insert(11);
        printListItems(lst);
        System.out.println(lst.get(17));
        printListItems(lst);

    }

    private static void printListItems(ListAsArray <Integer> l)
    {

        for (int i = 0; i < l.getSizeOfList(); i++)
        {

            System.out.print(l.get(i) + "  ");

        }
        System.out.print("\n");
        System.out.println(l.getSizeOfList());

    }
}
