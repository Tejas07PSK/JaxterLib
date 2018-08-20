/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 21 Aug, 2018, 12:27 AM,
        @File-Name : QueueAsArray.java

 */

package com.lib.ds;

import java.io.Serializable;
import com.lib.ds.ListAsArray;

public class QueueAsArray <E> extends ListAsArray <E> implements Serializable
{

    private static final long serialVersionUID = 1L;

    public QueueAsArray()
    {

        super();

    }

    public QueueAsArray(Object [] cpy)
    {

        super(cpy);

    }

    public synchronized boolean enQueue(E item)
    {

        return(super.insert(item));

    }

    public synchronized boolean insert(E item, int index)
    {

        return(super.insert(item, index));

    }

    public synchronized E deQueue()
    {

        return (super.remove(0));

    }

    public synchronized E remove(int index)
    {

        return (super.remove(index));

    }

    public synchronized int getSizeOfQueue()
    {

        return (super.getSizeOfList());

    }

    public synchronized boolean replace(E val, int index)
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

    public synchronized E get(int index)
    {

        return (super.get(index));

    }

    public synchronized QueueAsArray <E> reverseQueueCopy()
    {

        return (new QueueAsArray <E> (super.reverseListCopy()));

    }

    public synchronized void reverseQueueInPlace()
    {

        super.reverseListInPlace();

    }

    public synchronized void concatQueue(QueueAsArray <E> stk)
    {

        super.concat(stk);

    }

    public synchronized void printElementsInQueue()
    {

        super.printLsitItems();

    }

    public synchronized boolean isEmpty()
    {

        return (super.isEmpty());

    }

}
