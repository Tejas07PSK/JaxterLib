/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 20 Oct, 2018, 11:05 PM,
        @File-Name : Mathematics.java

 */

package com.lib.algo;

import java.io.Serializable;
import java.lang.Math;
import java.util.ArrayList;
import java.util.List;

public class Mathematics implements Serializable
{

    private static final long serialVersionUID = 1L;

    public synchronized static boolean isPrime(long n)
    {

        long limit = (long)Math.sqrt(n);
        for (long i = 2; i <= limit; i += 1)
        {

            if ((n % i) == 0)
            {

                return (false);

            }

        }
        return (true);

    }

    public synchronized static List <Long> primeSieve(long n)
    {

        List <Boolean> temp =  new ArrayList <Boolean> ();
        List <Long> lst = new ArrayList <Long> ();
        long i = 0L, limit = (long)Math.sqrt(n);
        for (; i <= n; i += 1)
        {

            if (i < 2)
            {

                temp.add(false);

            }
            else
            {

                temp.add(true);

            }

        }
        for (i = 2; i <= limit; i += 1)
        {

            if (temp.get((int)i))
            {

                for (long j = 2; (j * i) <= n; j += 1)
                {

                    temp.set((int)(i * j), false);

                }

            }

        }
        for (i = 0; i <= n; i += 1)
        {

            if (temp.get((int)i))
            {

                lst.add(i);

            }

        }
        return (lst);

    }

}
