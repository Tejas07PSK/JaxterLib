/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 17 Aug, 2018, 11:55 AM,
        @File-Name : Main.java

 */

import java.lang.Exception;

import com.lib.ds.LinkedList;
import com.lib.ds.ListAsArray;

public class Main
{

    public static void main (String args []) throws Exception
    {

        Object [] arr = {2, 3, 4};
        ListAsArray <Integer> lst = new ListAsArray <Integer> (arr);
        ListAsArray <Integer> lst2 = new ListAsArray <Integer> ();
        lst2.insert(33);
        lst2.insert(11);
        lst.printLsitItems();
        lst2.printLsitItems();
        lst2.concat(lst);
        lst2.printLsitItems();

    }

}
