/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 17 Aug, 2018, 11:55 AM,
        @File-Name : Main.java

 */

import java.lang.Exception;

import com.lib.ds.*;

public class Main
{

    public static void main (String args []) throws Exception
    {

        QueueAsLinkedList <Integer> obj = new QueueAsLinkedList <Integer> ();
        obj.enQueue(45);
        obj.enQueue(34);
        obj.enQueue(33);
        obj.insert(66, 1);
        obj.insert(45, 3);
        obj.insert(12,2);
        obj.printElementsInQueue();
        System.out.println(obj.deQueue());
        obj.printElementsInQueue();
        System.out.println(obj.remove(2));
        obj.printElementsInQueue();


    }

}
