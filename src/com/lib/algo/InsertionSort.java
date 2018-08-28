/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 28 Aug, 2018, 12:12 PM,
        @File-Name : InsertionSort.java

 */

package com.lib.algo;

import java.io.Serializable;

public class InsertionSort implements Serializable
{

    private static final long serialVersionUID = 1L;

    public static byte [] for_byteArray(byte arr [])
    {

        int hole_index = 0;
        for (int i = 1; i <= (arr.length - 1); i += 1)
        {

            hole_index = i;
            while ((hole_index > 0) && (arr[hole_index - 1] > arr[hole_index]))
            {

                arr[hole_index] = (byte)(arr[hole_index] ^ arr[hole_index - 1]);
                arr[hole_index - 1] = (byte)(arr[hole_index] ^ arr[hole_index - 1]);
                arr[hole_index] = (byte)(arr[hole_index] ^ arr[hole_index - 1]);
                hole_index -= 1;

            }

        }
        return (arr);

    }

    public static Byte [] for_ByteArray(Byte arr [])
    {

        int hole_index = 0;
        for (int i = 1; i <= (arr.length - 1); i += 1)
        {

            hole_index = i;
            while ((hole_index > 0) && (arr[hole_index - 1] > arr[hole_index]))
            {

                arr[hole_index] = (byte)(arr[hole_index] ^ arr[hole_index - 1]);
                arr[hole_index - 1] = (byte)(arr[hole_index] ^ arr[hole_index - 1]);
                arr[hole_index] = (byte)(arr[hole_index] ^ arr[hole_index - 1]);
                hole_index -= 1;

            }

        }
        return (arr);

    }

    public static short [] for_shortArray(short arr [])
    {

        int hole_index = 0;
        for (int i = 1; i <= (arr.length - 1); i += 1)
        {

            hole_index = i;
            while ((hole_index > 0) && (arr[hole_index - 1] > arr[hole_index]))
            {

                arr[hole_index] = (short)(arr[hole_index] ^ arr[hole_index - 1]);
                arr[hole_index - 1] = (short)(arr[hole_index] ^ arr[hole_index - 1]);
                arr[hole_index] = (short)(arr[hole_index] ^ arr[hole_index - 1]);
                hole_index -= 1;

            }

        }
        return (arr);

    }

    public static Short [] for_ShortArray(Short arr [])
    {

        int hole_index = 0;
        for (int i = 1; i <= (arr.length - 1); i += 1)
        {

            hole_index = i;
            while ((hole_index > 0) && (arr[hole_index - 1] > arr[hole_index]))
            {

                arr[hole_index] = (short)(arr[hole_index] ^ arr[hole_index - 1]);
                arr[hole_index - 1] = (short)(arr[hole_index] ^ arr[hole_index - 1]);
                arr[hole_index] = (short)(arr[hole_index] ^ arr[hole_index - 1]);
                hole_index -= 1;

            }

        }
        return (arr);

    }

    public static int [] for_intArray(int arr [])
    {

        int hole_index = 0;
        for (int i = 1; i <= (arr.length - 1); i += 1)
        {

            hole_index = i;
            while ((hole_index > 0) && (arr[hole_index - 1] > arr[hole_index]))
            {

                arr[hole_index] = arr[hole_index] ^ arr[hole_index - 1];
                arr[hole_index - 1] = arr[hole_index] ^ arr[hole_index - 1];
                arr[hole_index] = arr[hole_index] ^ arr[hole_index - 1];
                hole_index -= 1;

            }

        }
        return (arr);

    }

    public static Integer [] for_IntegerArray(Integer arr [])
    {

        int hole_index = 0;
        for (int i = 1; i <= (arr.length - 1); i += 1)
        {

            hole_index = i;
            while ((hole_index > 0) && (arr[hole_index - 1] > arr[hole_index]))
            {

                arr[hole_index] = arr[hole_index] ^ arr[hole_index - 1];
                arr[hole_index - 1] = arr[hole_index] ^ arr[hole_index - 1];
                arr[hole_index] = arr[hole_index] ^ arr[hole_index - 1];
                hole_index -= 1;

            }

        }
        return (arr);

    }

    public static long [] for_longArray(long arr [])
    {

        int hole_index = 0;
        for (int i = 1; i <= (arr.length - 1); i += 1)
        {

            hole_index = i;
            while ((hole_index > 0) && (arr[hole_index - 1] > arr[hole_index]))
            {

                arr[hole_index] = arr[hole_index] ^ arr[hole_index - 1];
                arr[hole_index - 1] = arr[hole_index] ^ arr[hole_index - 1];
                arr[hole_index] = arr[hole_index] ^ arr[hole_index - 1];
                hole_index -= 1;

            }

        }
        return (arr);

    }

    public static Long [] for_LongArray(Long arr [])
    {

        int hole_index = 0;
        for (int i = 1; i <= (arr.length - 1); i += 1)
        {

            hole_index = i;
            while ((hole_index > 0) && (arr[hole_index - 1] > arr[hole_index]))
            {

                arr[hole_index] = arr[hole_index] ^ arr[hole_index - 1];
                arr[hole_index - 1] = arr[hole_index] ^ arr[hole_index - 1];
                arr[hole_index] = arr[hole_index] ^ arr[hole_index - 1];
                hole_index -= 1;

            }

        }
        return (arr);

    }

    public static float [] for_floatArray(float arr [])
    {

        int hole_index = 0;
        float temp = 0.0f;
        for (int i = 1; i <= (arr.length - 1); i += 1)
        {

            hole_index = i;
            while ((hole_index > 0) && (arr[hole_index - 1] > arr[hole_index]))
            {

                temp =  arr[hole_index];
                arr[hole_index] = arr[hole_index - 1];
                arr[hole_index - 1] = temp;
                hole_index -= 1;

            }

        }
        return (arr);

    }

    public static Float [] for_FloatArray(Float arr [])
    {

        int hole_index = 0;
        float temp = 0.0f;
        for (int i = 1; i <= (arr.length - 1); i += 1)
        {

            hole_index = i;
            while ((hole_index > 0) && (arr[hole_index - 1] > arr[hole_index]))
            {

                temp = arr[hole_index];
                arr[hole_index] = arr[hole_index - 1];
                arr[hole_index - 1] = temp;
                hole_index -= 1;

            }

        }
        return (arr);

    }

    public static double [] for_doubleArray(double arr [])
    {

        int hole_index = 0;
        double temp = 0.0;
        for (int i = 1; i <= (arr.length - 1); i += 1)
        {

            hole_index = i;
            while ((hole_index > 0) && (arr[hole_index - 1] > arr[hole_index]))
            {

                temp =  arr[hole_index];
                arr[hole_index] = arr[hole_index - 1];
                arr[hole_index - 1] = temp;
                hole_index -= 1;

            }

        }
        return (arr);

    }

    public static Double [] for_DoubleArray(Double arr [])
    {

        int hole_index = 0;
        double temp = 0.0;
        for (int i = 1; i <= (arr.length - 1); i += 1)
        {

            hole_index = i;
            while ((hole_index > 0) && (arr[hole_index - 1] > arr[hole_index]))
            {

                temp = arr[hole_index];
                arr[hole_index] = arr[hole_index - 1];
                arr[hole_index - 1] = temp;
                hole_index -= 1;

            }

        }
        return (arr);

    }

}
