/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 20 Oct, 2018, 11:05 PM,
        @File-Name : Mathematics.java

 */

package com.lib.algo;

import java.io.Serializable;
import java.lang.Math;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mathematics implements Serializable
{

    private static final long serialVersionUID = 1L;

    public synchronized static boolean isPrime(final long n)
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

    public synchronized static List <Long> primeSieve(final long n)
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

    public synchronized static List <Long> segmentedPrimeSieve(final long start_end [], final long incl_excl [])
    {

        if ((start_end == null) || (start_end.length != 2) || (start_end[0] > start_end[1]))
        {

            return (Arrays.asList((new Long [] {0L})));

        }
        if ((incl_excl == null) || (incl_excl.length != 2) || ((incl_excl[0] > 1) || (incl_excl[0] < 0)) || ((incl_excl[1] > 1) || (incl_excl[1] < 0)))
        {

            return (Arrays.asList((new Long [] {0L})));

        }
        long limit = (long)(Math.floor(Math.sqrt(start_end[1])) + 1.0);
        List <Long> primes = primeSieve(limit);
        limit += 1;
        long ori_prm_sz = primes.size(), getPrm = 0;
        long low = limit, high = (2 * limit), i = 0, j = 0, lolim = 0;
        boolean mark [] = new boolean [(int)(limit + 1)];
        while (low < start_end[1])
        {

            refreshBoolArr(mark);
            if (high > start_end[1])
            {

                high = start_end[1];

            }
            for (i = 0; i < ori_prm_sz; i += 1)
            {

                getPrm = primes.get((int)i);
                lolim = (int)(Math.floor(low / getPrm) * getPrm);
                if (lolim < low)
                {

                    lolim += getPrm;

                }
                for (j = lolim; j <= high; j += getPrm)
                {

                    mark[(int)(j - low)] = false;

                }

            }
            for (i = low; i <= high; i += 1)
            {

                if (mark[(int)(i - low)])
                {

                    primes.add(i);

                }

            }
            low = low + limit + 1;
            high = low + limit;


        }
        /*while (primes.get(0) < start_end[0])
        {

            primes.remove(0);

        }
        if (incl_excl[0] == 0)
        {

            primes.remove(0);

        }
        if (incl_excl[1] == 0)
        {

            primes.remove(primes.size() - 1);

        }*/
        return (primes);

    }

    private synchronized static void refreshBoolArr(boolean arr [])
    {

        int i = 0, len = arr.length;
        while (i < len)
        {

            arr[i] = true;
            i += 1;

        }

    }

}
