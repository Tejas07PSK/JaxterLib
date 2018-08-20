/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 21 Aug, 2018, 12:44 AM,
        @File-Name : QueueAsLinkedList.java

 */

package com.lib.ds;

import java.io.Serializable;
import com.lib.ds.ListAsArray;

public class QueueAsLinkedList <E> extends LinkedList <E> implements Serializable
{

    private static final long serialVersionUID = 1L;

    public QueueAsLinkedList()
    {

        super();

    }

    public synchronized boolean enQueue(E val)
    {

        return(super.insertNode(val));

    }

    public synchronized boolean insert(E val, long index)
    {

        return(super.insertNode(val, index));

    }

    public synchronized E deQueue()
    {

        return (super.remove(0));

    }

    public synchronized E remove(int index)
    {

        return (super.remove(index));

    }

    public synchronized long getLengthOfQueue()
    {

        return (super.length());

    }

    public synchronized boolean replace(E val, long index)
    {

        return (super.replace(val, index));

    }

    public synchronized E rear()
    {

        return (super.get());

    }

    public synchronized E front()
    {

        return (super.get(0));

    }

    public synchronized E get(long index)
    {

        return (super.get(index));

    }

    public synchronized void reverseQueueInPlace()
    {

        super.reverseListInPlace();

    }

    public synchronized void concatQueue(QueueAsLinkedList <E> stk)
    {

        super.concat(stk);

    }

    public synchronized void printElementsInQueue()
    {

        super.printList();

    }

    public synchronized boolean isEmpty()
    {

        return (super.isEmpty());

    }

}