/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 27 Aug, 2018, 12:48 PM,
        @File-Name : Sorting.java

 */

package com.lib.algo;

import java.io.Serializable;

public class SelectionSort implements Serializable
{

    private static final long serialVersionUID = 1L;

    public static byte [] for_byteArray(byte arr [])
    {

        int min_idx = 0;
        for (int i = 0; i<= (arr.length - 2); i += 1)
        {

            min_idx = i;
            for (int j = i; j <= (arr.length - 1); j += 1)
            {

                if (arr[min_idx] >= arr[j])
                {

                    min_idx = j;

                }

            }
            arr[i] = (byte)(arr[i] ^ arr[min_idx]);
            arr[min_idx] = (byte)(arr[i] ^ arr[min_idx]);
            arr[i] = (byte)(arr[i] ^ arr[min_idx]);

        }
        return (arr);

    }

    public static Byte [] for_ByteArray(Byte arr [])
    {

        int min_idx = 0;
        for (int i = 0; i<= (arr.length - 2); i += 1)
        {

            min_idx = i;
            for (int j = i; j <= (arr.length - 1); j += 1)
            {

                if (arr[min_idx] >= arr[j])
                {

                    min_idx = j;

                }

            }
            arr[i] = (byte)(arr[i] ^ arr[min_idx]);
            arr[min_idx] = (byte)(arr[i] ^ arr[min_idx]);
            arr[i] = (byte)(arr[i] ^ arr[min_idx]);

        }
        return (arr);

    }

    public static short [] for_shortArray(short arr [])
    {

        int min_idx = 0;
        for (int i = 0; i<= (arr.length - 2); i += 1)
        {

            min_idx = i;
            for (int j = i; j <= (arr.length - 1); j += 1)
            {

                if (arr[min_idx] >= arr[j])
                {

                    min_idx = j;

                }

            }
            arr[i] = (short)(arr[i] ^ arr[min_idx]);
            arr[min_idx] = (short)(arr[i] ^ arr[min_idx]);
            arr[i] = (short)(arr[i] ^ arr[min_idx]);

        }
        return (arr);

    }

    public static Short [] for_ShortArray(Short arr [])
    {

        int min_idx = 0;
        for (int i = 0; i<= (arr.length - 2); i += 1)
        {

            min_idx = i;
            for (int j = i; j <= (arr.length - 1); j += 1)
            {

                if (arr[min_idx] >= arr[j])
                {

                    min_idx = j;

                }

            }
            arr[i] = (short)(arr[i] ^ arr[min_idx]);
            arr[min_idx] = (short)(arr[i] ^ arr[min_idx]);
            arr[i] = (short)(arr[i] ^ arr[min_idx]);

        }
        return (arr);

    }

    public static int [] for_intArray(int arr [])
    {

        int min_idx = 0;
        for (int i = 0; i<= (arr.length - 2); i += 1)
        {

            min_idx = i;
            for (int j = i; j <= (arr.length - 1); j += 1)
            {

                if (arr[min_idx] >= arr[j])
                {

                    min_idx = j;

                }

            }
            arr[i] = arr[i] ^ arr[min_idx];
            arr[min_idx] = arr[i] ^ arr[min_idx];
            arr[i] = arr[i] ^ arr[min_idx];

        }
        return (arr);

    }

    public static Integer [] for_IntegerArray(Integer arr [])
    {

        int min_idx = 0;
        for (int i = 0; i<= (arr.length - 2); i += 1)
        {

            min_idx = i;
            for (int j = i; j <= (arr.length - 1); j += 1)
            {

                if (arr[min_idx] >= arr[j])
                {

                    min_idx = j;

                }

            }
            arr[i] = arr[i] ^ arr[min_idx];
            arr[min_idx] = arr[i] ^ arr[min_idx];
            arr[i] = arr[i] ^ arr[min_idx];

        }
        return (arr);

    }

    public static long [] for_longArray(long arr [])
    {

        int min_idx = 0;
        for (int i = 0; i<= (arr.length - 2); i += 1)
        {

            min_idx = i;
            for (int j = i; j <= (arr.length - 1); j += 1)
            {

                if (arr[min_idx] >= arr[j])
                {

                    min_idx = j;

                }

            }
            arr[i] = arr[i] ^ arr[min_idx];
            arr[min_idx] = arr[i] ^ arr[min_idx];
            arr[i] = arr[i] ^ arr[min_idx];

        }
        return (arr);

    }

    public static Long [] for_LongArray(Long arr [])
    {

        int min_idx = 0;
        for (int i = 0; i<= (arr.length - 2); i += 1)
        {

            min_idx = i;
            for (int j = i; j <= (arr.length - 1); j += 1)
            {

                if (arr[min_idx] >= arr[j])
                {

                    min_idx = j;

                }

            }
            arr[i] = arr[i] ^ arr[min_idx];
            arr[min_idx] = arr[i] ^ arr[min_idx];
            arr[i] = arr[i] ^ arr[min_idx];

        }
        return (arr);

    }

    public static float [] for_floatArray(float arr [])
    {

        int min_idx = 0;
        float temp = 0.0f;
        for (int i = 0; i<= (arr.length - 2); i += 1)
        {

            min_idx = i;
            for (int j = i; j <= (arr.length - 1); j += 1)
            {

                if (arr[min_idx] >= arr[j])
                {

                    min_idx = j;

                }

            }
            temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;

        }
        return (arr);

    }

    public static Float [] for_FloatArray(Float arr [])
    {

        int min_idx = 0;
        float temp = 0.0f;
        for (int i = 0; i<= (arr.length - 2); i += 1)
        {

            min_idx = i;
            for (int j = i; j <= (arr.length - 1); j += 1)
            {

                if (arr[min_idx] >= arr[j])
                {

                    min_idx = j;

                }

            }
            temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;

        }
        return (arr);

    }

    public static double [] for_doubleArray(double arr [])
    {

        int min_idx = 0;
        double temp = 0.0;
        for (int i = 0; i<= (arr.length - 2); i += 1)
        {

            min_idx = i;
            for (int j = i; j <= (arr.length - 1); j += 1)
            {

                if (arr[min_idx] >= arr[j])
                {

                    min_idx = j;

                }

            }
            temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;

        }
        return (arr);

    }

    public static Double [] for_DoubleArray(Double arr [])
    {

        int min_idx = 0;
        double temp = 0.0;
        for (int i = 0; i<= (arr.length - 2); i += 1)
        {

            min_idx = i;
            for (int j = i; j <= (arr.length - 1); j += 1)
            {

                if (arr[min_idx] >= arr[j])
                {

                    min_idx = j;

                }

            }
            temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;

        }
        return (arr);

    }

}
