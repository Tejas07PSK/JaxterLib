/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 27 Aug, 2018, 9:23 PM,
        @File-Name : BubbleSort.java

 */

package com.lib.algo;

import java.io.Serializable;

public class BubbleSort implements Serializable
{

    private static final long serialVersionUID = 1L;

    public static byte [] for_byteArray(byte arr [])
    {
        boolean flag;
        for (int i = 1; i<= (arr.length - 1); i += 1)
        {

            flag = false;
            for (int j = 0; j <= (arr.length - i - 1); j += 1)
            {

                if (arr[j] >= arr[j + 1])
                {

                    if (arr[j] == arr[j + 1])
                    {

                        continue;

                    }

                    arr[j] = (byte)(arr[j] ^ arr[j + 1]);
                    arr[j + 1] = (byte)(arr[j] ^ arr[j + 1]);
                    arr[j] = (byte)(arr[j] ^ arr[j + 1]);
                    flag = true;

                }

            }
            if (!flag)
            {

                break;

            }

        }
        return (arr);

    }

    public static Byte [] for_ByteArray(Byte arr [])
    {

        boolean flag;
        for (int i = 1; i<= (arr.length - 1); i += 1)
        {

            flag = false;
            for (int j = 0; j <= (arr.length - i - 1); j += 1)
            {

                if (arr[j] >= arr[j + 1])
                {

                    if (arr[j].equals(arr[j + 1]))
                    {

                        continue;

                    }

                    arr[j] = (byte)(arr[j] ^ arr[j + 1]);
                    arr[j + 1] = (byte)(arr[j] ^ arr[j + 1]);
                    arr[j] = (byte)(arr[j] ^ arr[j + 1]);
                    flag = true;

                }

            }
            if (!flag)
            {

                break;

            }

        }
        return (arr);

    }

    public static short [] for_shortArray(short arr [])
    {
        boolean flag;
        for (int i = 1; i<= (arr.length - 1); i += 1)
        {

            flag = false;
            for (int j = 0; j <= (arr.length - i - 1); j += 1)
            {

                if (arr[j] >= arr[j + 1])
                {

                    if (arr[j] == arr[j + 1])
                    {

                        continue;

                    }

                    arr[j] = (short)(arr[j] ^ arr[j + 1]);
                    arr[j + 1] = (short)(arr[j] ^ arr[j + 1]);
                    arr[j] = (short)(arr[j] ^ arr[j + 1]);
                    flag = true;

                }

            }
            if (!flag)
            {

                break;

            }

        }
        return (arr);

    }

    public static Short [] for_ShortArray(Short arr [])
    {

        boolean flag;
        for (int i = 1; i<= (arr.length - 1); i += 1)
        {

            flag = false;
            for (int j = 0; j <= (arr.length - i - 1); j += 1)
            {

                if (arr[j] >= arr[j + 1])
                {

                    if (arr[j].equals(arr[j + 1]))
                    {

                        continue;

                    }

                    arr[j] = (short)(arr[j] ^ arr[j + 1]);
                    arr[j + 1] = (short)(arr[j] ^ arr[j + 1]);
                    arr[j] = (short)(arr[j] ^ arr[j + 1]);
                    flag = true;

                }

            }
            if (!flag)
            {

                break;

            }

        }
        return (arr);

    }

    public static int [] for_intArray(int arr [])
    {
        boolean flag;
        for (int i = 1; i<= (arr.length - 1); i += 1)
        {

            flag = false;
            for (int j = 0; j <= (arr.length - i - 1); j += 1)
            {

                if (arr[j] >= arr[j + 1])
                {

                    if (arr[j] == arr[j + 1])
                    {

                        continue;

                    }

                    arr[j] = arr[j] ^ arr[j + 1];
                    arr[j + 1] = arr[j] ^ arr[j + 1];
                    arr[j] = arr[j] ^ arr[j + 1];
                    flag = true;

                }

            }
            if (!flag)
            {

                break;

            }

        }
        return (arr);

    }

    public static Integer [] for_IntegerArray(Integer arr [])
    {

        boolean flag;
        for (int i = 1; i<= (arr.length - 1); i += 1)
        {

            flag = false;
            for (int j = 0; j <= (arr.length - i - 1); j += 1)
            {

                if (arr[j] >= arr[j + 1])
                {

                    if (arr[j].equals(arr[j + 1]))
                    {

                        continue;

                    }

                    arr[j] = arr[j] ^ arr[j + 1];
                    arr[j + 1] = arr[j] ^ arr[j + 1];
                    arr[j] = arr[j] ^ arr[j + 1];
                    flag = true;

                }

            }
            if (!flag)
            {

                break;

            }

        }
        return (arr);

    }

    public static long [] for_longArray(long arr [])
    {
        boolean flag;
        for (int i = 1; i<= (arr.length - 1); i += 1)
        {

            flag = false;
            for (int j = 0; j <= (arr.length - i - 1); j += 1)
            {

                if (arr[j] >= arr[j + 1])
                {

                    if (arr[j] == arr[j + 1])
                    {

                        continue;

                    }

                    arr[j] = arr[j] ^ arr[j + 1];
                    arr[j + 1] = arr[j] ^ arr[j + 1];
                    arr[j] = arr[j] ^ arr[j + 1];
                    flag = true;

                }

            }
            if (!flag)
            {

                break;

            }

        }
        return (arr);

    }

    public static Long [] for_LongArray(Long arr [])
    {

        boolean flag;
        for (int i = 1; i<= (arr.length - 1); i += 1)
        {

            flag = false;
            for (int j = 0; j <= (arr.length - i - 1); j += 1)
            {

                if (arr[j] >= arr[j + 1])
                {

                    if (arr[j].equals(arr[j + 1]))
                    {

                        continue;

                    }

                    arr[j] = arr[j] ^ arr[j + 1];
                    arr[j + 1] = arr[j] ^ arr[j + 1];
                    arr[j] = arr[j] ^ arr[j + 1];
                    flag = true;

                }

            }
            if (!flag)
            {

                break;

            }

        }
        return (arr);

    }

    public static float [] for_floatArray(float arr [])
    {
        boolean flag;
        float temp = 0.0f;
        for (int i = 1; i<= (arr.length - 1); i += 1)
        {

            flag = false;
            for (int j = 0; j <= (arr.length - i - 1); j += 1)
            {

                if (arr[j] >= arr[j + 1])
                {

                    if (arr[j] == arr[j + 1])
                    {

                        continue;

                    }

                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;

                }

            }
            if (!flag)
            {

                break;

            }

        }
        return (arr);

    }

    public static Float [] for_FloatArray(Float arr [])
    {

        boolean flag;
        float temp = 0.0f;
        for (int i = 1; i<= (arr.length - 1); i += 1)
        {

            flag = false;
            for (int j = 0; j <= (arr.length - i - 1); j += 1)
            {

                if (arr[j] >= arr[j + 1])
                {

                    if (arr[j].equals(arr[j + 1]))
                    {

                        continue;

                    }

                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;

                }

            }
            if (!flag)
            {

                break;

            }

        }
        return (arr);

    }

    public static double [] for_doubleArray(double arr [])
    {
        boolean flag;
        double temp = 0.0;
        for (int i = 1; i<= (arr.length - 1); i += 1)
        {

            flag = false;
            for (int j = 0; j <= (arr.length - i - 1); j += 1)
            {

                if (arr[j] >= arr[j + 1])
                {

                    if (arr[j] == arr[j + 1])
                    {

                        continue;

                    }

                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;

                }

            }
            if (!flag)
            {

                break;

            }

        }
        return (arr);

    }

    public static Double [] for_DoubleArray(Double arr [])
    {

        boolean flag;
        double temp = 0.0;
        for (int i = 1; i<= (arr.length - 1); i += 1)
        {

            flag = false;
            for (int j = 0; j <= (arr.length - i - 1); j += 1)
            {

                if (arr[j] >= arr[j + 1])
                {

                    if (arr[j].equals(arr[j + 1]))
                    {

                        continue;

                    }

                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;

                }

            }
            if (!flag)
            {

                break;

            }

        }
        return (arr);

    }

}
