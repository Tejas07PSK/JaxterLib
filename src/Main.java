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

        LinkedList <Integer> ll = new LinkedList <Integer> ();
        ll.insertNode(88, 5);
        ll.insertNode(77);
        ll.insertNode(11);
        ll.insertNode(22);
        ll.insertNode(66);
        ll.printList();
        System.out.println(ll.length());
        ll.reverseListInPlace();
        ll.printList();
        System.out.println(ll.length());
        (ll.reverseList()).printList();

    }

}
