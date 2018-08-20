/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 17 Aug, 2018, 11:54 PM,
        @File-Name : LinkedList.java

 */

package com.lib.ds;

import java.io.Serializable;

public class LinkedList <E> implements Serializable
{

    private static final long serialVersionUID = 1L;

    private class Node
    {

        private E data;
        private Node ptr;

        Node()
        {

            this.ptr = null;

        }

        Node(E data)
        {

            this();
            this.data = data;

        }

    }

    private Node start;
    private Node end;
    private long length;

    public LinkedList()
    {

        this.start = null;
        this.end = null;
        this.length = 0;

    }

    public synchronized boolean isEmpty()
    {

        if (this.length == 0)
        {

            return (true);

        }
        else
        {

            return (false);

        }

    }

    public synchronized long length()
    {

        return (this.length);

    }

    public synchronized boolean insertNode(E val)
    {

        if (val == null)
        {

            System.out.println("Cannot insert null-value, error!!");
            return (false);

        }
        else
        {

            Node n = new Node(val);
            if (this.start == null)
            {

                this.start = n;
                this.end = this.start;

            }
            else
            {

                (this.end).ptr = n;
                this.end = n;

            }
            this.length += 1;
            return (true);

        }

    }

    public synchronized boolean insertNode(E val, long index)
    {

        if (val == null)
        {

            System.out.println("Cannot insert null-value, error!!");
            return (false);

        }
        else if (this.start == null | index > this.length)
        {

            Node n = new Node(val);
            if (this.start == null)
            {

                this.start = n;
                this.end = this.start;

            }
            else
            {

                (this.end).ptr = n;
                this.end = n;

            }
            this.length += 1;
            return (true);

        }
        else if (index == 1)
        {

            Node n = new Node(val);
            n.ptr = this.start;
            this.start = n;
            this.length += 1;
            return (true);

        }
        else
        {

            Node tmp = this.start;
            long count = 1;
            while (count < (index - 1))
            {

                count += 1;
                tmp = tmp.ptr;

            }
            Node n = new Node(val);
            n.ptr = tmp.ptr;
            tmp.ptr = n;
            this.length += 1;
            return (true);

        }

    }

    public synchronized E remove()
    {

        if (this.start == null)
        {

            System.out.println("Nothing to remove, list is empty!!");
            return (null);

        }
        else
        {

            Node tmp = this.start;
            Node prev = null;
            while (tmp != this.end)
            {

                prev = tmp;
                tmp = tmp.ptr;

            }
            prev.ptr = null;
            this.end = prev;
            this.length -= 1;
            return (tmp.data);

        }

    }

    public synchronized E remove(long index)
    {

        if (this.start == null)
        {

            System.out.println("Nothing to remove, list is empty!!");
            return (null);

        }
        else if (index > this.length)
        {

            System.out.println("Invalid index, out of bounds " + index);
            return (null);

        }
        else if (index == 1)
        {

            Node temp = this.start;
            this.start = (temp.ptr);
            temp.ptr = null;
            this.end = ((this.length == 1) ? this.start : this.end);
            this.length -= 1;
            return (temp.data);

        }
        else
        {

            Node tmp = this.start;
            long count = 1;
            while (count < (index - 1))
            {

                count += 1;
                tmp = tmp.ptr;

            }
            Node n = tmp.ptr;
            tmp.ptr = (tmp.ptr).ptr;
            this.length -= 1;
            return (n.data);

        }

    }

    public synchronized boolean replace(E val, long index)
    {

        if (this.start == null)
        {

            System.out.println("Nothing to replace, list is empty!!");
            return (false);

        }
        else if (index > this.length)
        {

            System.out.println("Invalid index, out of bounds " + index);
            return (false);

        }
        else if (index == 1)
        {

            (this.start).data = val;
            return (true);

        }
        else
        {

            Node tmp = this.start;
            long count = 1;
            while (count < index)
            {

                count += 1;
                tmp = tmp.ptr;

            }
            tmp.data = val;
            return (true);

        }

    }

    public synchronized E get()
    {

        if (this.start == null)
        {

            System.out.println("Nothing to retrieve, list is empty!!");
            return (null);

        }
        else
        {

            return ((this.end).data);

        }

    }

    public synchronized E get(long index)
    {

        if (this.start == null)
        {

            System.out.println("Nothing to retrieve, list is empty!!");
            return (null);

        }
        else if (index > this.length)
        {

            System.out.println("Invalid index, out of bounds " + index);
            return (null);

        }
        else if (index == 1)
        {

            return ((this.start).data);

        }
        else
        {

            Node tmp = this.start;
            long count = 1;
            while (count < index)
            {

                count += 1;
                tmp = tmp.ptr;

            }
            return (tmp.data);

        }

    }

    public synchronized void reverseListInPlace()
    {

        Node curr = this.start;
        Node prev = null;
        Node tmp = null;
        while (curr != null)
        {
            tmp = curr.ptr;
            curr.ptr = prev;
            prev = curr;
            curr = tmp;
        }
        tmp = this.start;
        this.start = this.end;
        this.end = tmp;

    }

    public synchronized LinkedList<E> reverseList()
    {

        LinkedList <E> new_lst = new LinkedList <E> ();
        Node ref = this.start;
        for (long i = 1; i <= this.length; i += 1)
        {

            System.out.println(((i == 1) ? new_lst.insertNode(ref.data) : new_lst.insertNode(ref.data, 1)));
            ref = ref.ptr;

        }
        return (new_lst);

    }

    public synchronized void printList()
    {

        Node tmp = this.start;
        while (tmp != null)
        {

            System.out.print(tmp.data + " ");
            tmp = tmp.ptr;

        }
        System.out.print("\n");

    }

    public synchronized void concat(LinkedList <E> ll)
    {

        Node tmp = ll.start;
        while(tmp !=  null)
        {

            this.insertNode(tmp.data);
            tmp = tmp.ptr;

        }

    }

}
