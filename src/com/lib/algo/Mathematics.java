/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 20 Oct, 2018, 11:05 PM,
        @File-Name : Mathematics.java

 */

package com.lib.algo;

import java.io.Serializable;
import java.lang.Math;

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

}
