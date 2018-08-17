/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 17 Aug, 2018, 5:05 AM,
        @File-Name : ListAsArray.java

 */

package com.lib.ds;
import java.io.Serializable;

public class ListAsArray <E> implements Serializable
{

    private static final long serialVersionUID = 1L;

    private int max_size;
    private int end;
    private Object [] list;

    public ListAsArray()
    {

        this.max_size = 100;
        this.list = new Object [this.max_size];
        this.end = -1;

    }

    public ListAsArray(Object arr[])
    {

        this.list = arr;
        this.end = arr.length - 1;
        this.max_size = arr.length;

    }

    public boolean insert(E item)
    {

        if (this.end == (this.max_size - 1))
        {

            this.max_size *= 2;
            this.list = copyIntoNewBigArray(this.list, this.max_size, this.end);

        }
        if (item == null)
        {

            System.out.println("Null value not inserted");
            return (false);

        }
        else
        {

            this.end += 1;
            this.list[this.end] = item;
            return (true);

        }

    }

    private Object [] copyIntoNewBigArray(Object [] list, int length, int end_ptr)
    {

        Object temp_list [] = new Object [length];
        for (int i = 0; i <= end_ptr; i += 1)
        {

            temp_list[i] = list[i];

        }
        return (temp_list);

    }

    public boolean insert(E item, int index)
    {

        if (index >= this.max_size)
        {

            System.out.println("Out of Bounds Error, index is greater than max_size of array!!");
            return (false);

        }
        else if ((index > this.end) && (this.end < (this.max_size -1)))
        {

            this.end += 1;
            this.list[this.end] = item;
            return (true);

        }
        else if ((index < this.end) && (this.end == (this.max_size -1)))
        {

            this.max_size *= 2;
            this.list = copyIntoNewBigArray(this.list, this.max_size, this.end);

        }
        Object temp = null;
        for(int i = index; i <= (this.end + 1); i += 1)
        {

            temp = item;
            item = (E)this.list[i];
            this.list[i] = temp;

        }
        this.end += 1;
        return (true);

    }

    public boolean isEmpty()
    {

        if (this.end == -1)
        {

            return (true);

        }
        else
        {

            return (false);

        }

    }

    public E remove()
    {
        if (isEmpty())
        {

            System.out.println("Nothing to remove, as list is empty!!");
            return (null);

        }
        Object tmp = this.list[this.end];
        this.list[this.end] = null;
        this.end -= 1;
        return ((E)tmp);

    }

    public E remove(int index)
    {

        if (isEmpty())
        {

            System.out.println("Nothing to remove, as list is empty!!");
            return (null);

        }
        else if (index >= this.max_size)
        {

            System.out.println("Out of Bounds Error, index is greater than max_size of array!!");
            return (null);

        }
        else if (index > this.end)
        {

            return (remove());

        }
        Object tmp = this.list[index];
        for (int i = (index + 1) ; i <= this.end; i += 1)
        {

            this.list[i - 1] = this.list[i];

        }
        this.list[this.end] = null;
        this.end -= 1;
        return ((E)tmp);

    }

    public int getSizeOfList()
    {

        return (this.end + 1);

    }

    public boolean replace(E item, int index)
    {

        if (isEmpty())
        {

            System.out.println("Nothing to replace, as list is empty!!");
            return (false);

        }
        else if (index >= this.max_size)
        {

            System.out.println("Out of Bounds Error, index is greater than max_size of array!!");
            return (false);

        }
        else if (index > this.end)
        {

            this.list[this.end] = item;
            return (true);

        }
        this.list[index] = item;
        return (true);

    }

    public E get()
    {

        if (isEmpty())
        {

            System.out.println("Nothing to retrieve, list is empty!!");
            return (null);

        }
        return ((E)this.list[this.end]);

    }

    public E get(int index)
    {

        if (isEmpty())
        {

            System.out.println("Nothing to retrieve, list is empty!!");
            return (null);

        }
        else if (index >= this.max_size)
        {

            System.out.println("Out of Bounds Error, index is greater than max_size of array!!");
            return (null);

        }
        else if (index > this.end)
        {

            return ((E)this.list[this.end]);

        }
        return ((E)this.list[index]);

    }

}
