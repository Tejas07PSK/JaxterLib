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

        QueueAsArray <Integer> obj = new QueueAsArray <Integer> ();
        obj.enQueue(45);
        obj.enQueue(34);
        obj.enQueue(33);
        obj.insert(66, 0);
        obj.insert(45, 4);
        obj.insert(12,2);
        obj.printElementsInQueue();
        System.out.println(obj.deQueue());
        obj.printElementsInQueue();
        System.out.println(obj.remove(2));
        obj.printElementsInQueue();


    }

}
