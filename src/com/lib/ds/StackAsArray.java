/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 19 Aug, 2018, 2:09 AM,
        @File-Name : StackAsArray.java

 */

package com.lib.ds;

import java.io.Serializable;
import com.lib.ds.ListAsArray;

public class StackAsArray <E> extends ListAsArray <E> implements Serializable
{

    private static final long serialVersionUID = 1L;

    public StackAsArray()
    {

        super();

    }

    public StackAsArray(Object [] cpy)
    {

        super(cpy);

    }

    public synchronized boolean push(E item)
    {

        return(super.insert(item));

    }

    public synchronized boolean insert(E item, int index)
    {

        return(super.insert(item, index));

    }

    public synchronized E pop()
    {

        return (super.remove());

    }

    public synchronized E remove(int index)
    {

        return (super.remove(index));

    }

    public synchronized int getSizeOfStack()
    {

        return (super.getSizeOfList());

    }

    public synchronized boolean replace(E val, int index)
    {

        return (super.replace(val, index));

    }

    public synchronized E top()
    {

        return (super.get());

    }

    public synchronized E get(int index)
    {

        return (super.get(index));

    }

    public synchronized StackAsArray <E> reverseStackCopy()
    {

        return (new StackAsArray <E> (super.reverseListCopy()));

    }

    public synchronized void reverseStackInPlace()
    {

        super.reverseListInPlace();

    }

    public synchronized void concatStacks(StackAsArray <E> stk)
    {

        super.concat(stk);

    }

    public synchronized void printElementsInStack()
    {

        super.printLsitItems();

    }

    public synchronized boolean isEmpty()
    {

        return (super.isEmpty());

    }

}
