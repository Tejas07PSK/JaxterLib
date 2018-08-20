/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 19 Aug, 2018, 3:56 AM,
        @File-Name : StackAsLinkedList.java

 */

package com.lib.ds;

import com.lib.ds.LinkedList;
import java.io.Serializable;

public class StackAsLinkedList <E> extends LinkedList <E> implements Serializable
{

    private static final long serialVersionUID = 1L;

    public StackAsLinkedList()
    {

        super();

    }

    public synchronized boolean push(E val)
    {

        return(super.insertNode(val));

    }

    public synchronized boolean insert(E val, long index)
    {

        return(super.insertNode(val, index));

    }

    public synchronized E pop()
    {

        return (super.remove());

    }

    public synchronized E remove(long index)
    {

        return (super.remove(index));

    }

    public synchronized long getLengthOfStack()
    {

        return (super.length());

    }

    public synchronized boolean replace(E val, long index)
    {

        return (super.replace(val, index));

    }

    public synchronized E top()
    {

        return (super.get());

    }

    public synchronized E get(long index)
    {

        return (super.get(index));

    }

    public synchronized void reverseStackInPlace()
    {

        super.reverseListInPlace();

    }

    public synchronized void concatStacks(StackAsLinkedList <E> stk)
    {

        super.concat(stk);

    }

    public synchronized void printElementsInStack()
    {

        super.printList();

    }

    public synchronized boolean isEmpty()
    {

        return (super.isEmpty());

    }

}
