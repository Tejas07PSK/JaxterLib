/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 28 Aug, 2018, 7:03 PM,
        @File-Name : MergeSort.java

 */

package com.lib.algo;

import java.io.Serializable;

public class MergeSort implements Serializable
{

    private static final long serialVersionUID = 1L;

    public static byte [] for_byteArray(byte arr [])
    {

        int mid = 0, high = 0, i = 0, j = 0, k = 0;
        byte left_arr [] = null;
        byte right_arr [] = null;
        for (int factor = 1; factor <= arr.length - 1; factor *= 2)
        {

            for (int low = 0; low < arr.length - 1; low += 2*factor)
            {

                mid = (low + factor - 1) < (arr.length - 1) ? (low + factor - 1) : (arr.length - 1);
                high = (low + (2 * factor) - 1) < (arr.length - 1) ? (low + (2 * factor) - 1) : (arr.length - 1);
                //System.out.println("factor : " + factor + " low : " + low + " mid : " + mid + " high : " + high);
                k = low;
                left_arr = new byte [mid - low + 1];
                right_arr = new byte [high - mid];
                for (i = 0; i < left_arr.length; i += 1)
                {

                    left_arr[i] = arr[low + i];

                }
                for (j = 0; j < right_arr.length; j +=1)
                {

                    right_arr[j] = arr[mid + 1 + j];

                }
                i = 0;
                j = 0;
                while ((i < left_arr.length) && (j < right_arr.length))
                {

                    if (left_arr[i] <= right_arr[j])
                    {

                        arr[k] = left_arr[i++];

                    }
                    else
                    {

                        arr[k] = right_arr[j++];

                    }
                    k += 1;

                }
                while(i < left_arr.length)
                {

                    arr[k++] = left_arr[i++];

                }
                while(j < right_arr.length)
                {

                    arr[k++] = right_arr[j++];

                }

            }

        }
        return (arr);

    }

    public static Byte [] for_ByteArray(Byte arr [])
    {

        int mid = 0, high = 0, i = 0, j = 0, k = 0;
        Byte left_arr [] = null;
        Byte right_arr [] = null;
        for (int factor = 1; factor <= arr.length - 1; factor *= 2)
        {

            for (int low = 0; low < arr.length - 1; low += 2*factor)
            {

                mid = (low + factor - 1) < (arr.length - 1) ? (low + factor - 1) : (arr.length - 1);
                high = (low + (2 * factor) - 1) < (arr.length - 1) ? (low + (2 * factor) - 1) : (arr.length - 1);
                //System.out.println("factor : " + factor + " low : " + low + " mid : " + mid + " high : " + high);
                k = low;
                left_arr = new Byte [mid - low + 1];
                right_arr = new Byte [high - mid];
                for (i = 0; i < left_arr.length; i += 1)
                {

                    left_arr[i] = arr[low + i];

                }
                for (j = 0; j < right_arr.length; j +=1)
                {

                    right_arr[j] = arr[mid + 1 + j];

                }
                i = 0;
                j = 0;
                while ((i < left_arr.length) && (j < right_arr.length))
                {

                    if (left_arr[i] <= right_arr[j])
                    {

                        arr[k] = left_arr[i++];

                    }
                    else
                    {

                        arr[k] = right_arr[j++];

                    }
                    k += 1;

                }
                while(i < left_arr.length)
                {

                    arr[k++] = left_arr[i++];

                }
                while(j < right_arr.length)
                {

                    arr[k++] = right_arr[j++];

                }

            }

        }
        return (arr);

    }

    public static short [] for_shortArray(short arr [])
    {

        int mid = 0, high = 0, i = 0, j = 0, k = 0;
        short left_arr [] = null;
        short right_arr [] = null;
        for (int factor = 1; factor <= arr.length - 1; factor *= 2)
        {

            for (int low = 0; low < arr.length - 1; low += 2*factor)
            {

                mid = (low + factor - 1) < (arr.length - 1) ? (low + factor - 1) : (arr.length - 1);
                high = (low + (2 * factor) - 1) < (arr.length - 1) ? (low + (2 * factor) - 1) : (arr.length - 1);
                //System.out.println("factor : " + factor + " low : " + low + " mid : " + mid + " high : " + high);
                k = low;
                left_arr = new short [mid - low + 1];
                right_arr = new short [high - mid];
                for (i = 0; i < left_arr.length; i += 1)
                {

                    left_arr[i] = arr[low + i];

                }
                for (j = 0; j < right_arr.length; j +=1)
                {

                    right_arr[j] = arr[mid + 1 + j];

                }
                i = 0;
                j = 0;
                while ((i < left_arr.length) && (j < right_arr.length))
                {

                    if (left_arr[i] <= right_arr[j])
                    {

                        arr[k] = left_arr[i++];

                    }
                    else
                    {

                        arr[k] = right_arr[j++];

                    }
                    k += 1;

                }
                while(i < left_arr.length)
                {

                    arr[k++] = left_arr[i++];

                }
                while(j < right_arr.length)
                {

                    arr[k++] = right_arr[j++];

                }

            }

        }
        return (arr);

    }

    public static Short [] for_ShortArray(Short arr [])
    {

        int mid = 0, high = 0, i = 0, j = 0, k = 0;
        Short left_arr [] = null;
        Short right_arr [] = null;
        for (int factor = 1; factor <= arr.length - 1; factor *= 2)
        {

            for (int low = 0; low < arr.length - 1; low += 2*factor)
            {

                mid = (low + factor - 1) < (arr.length - 1) ? (low + factor - 1) : (arr.length - 1);
                high = (low + (2 * factor) - 1) < (arr.length - 1) ? (low + (2 * factor) - 1) : (arr.length - 1);
                //System.out.println("factor : " + factor + " low : " + low + " mid : " + mid + " high : " + high);
                k = low;
                left_arr = new Short [mid - low + 1];
                right_arr = new Short [high - mid];
                for (i = 0; i < left_arr.length; i += 1)
                {

                    left_arr[i] = arr[low + i];

                }
                for (j = 0; j < right_arr.length; j +=1)
                {

                    right_arr[j] = arr[mid + 1 + j];

                }
                i = 0;
                j = 0;
                while ((i < left_arr.length) && (j < right_arr.length))
                {

                    if (left_arr[i] <= right_arr[j])
                    {

                        arr[k] = left_arr[i++];

                    }
                    else
                    {

                        arr[k] = right_arr[j++];

                    }
                    k += 1;

                }
                while(i < left_arr.length)
                {

                    arr[k++] = left_arr[i++];

                }
                while(j < right_arr.length)
                {

                    arr[k++] = right_arr[j++];

                }

            }

        }
        return (arr);

    }

    public static int [] for_intArray(int arr [])
    {

        int mid = 0, high = 0, i = 0, j = 0, k = 0;
        int left_arr [] = null;
        int right_arr [] = null;
        for (int factor = 1; factor <= arr.length - 1; factor *= 2)
        {

            for (int low = 0; low < arr.length - 1; low += 2*factor)
            {

                mid = (low + factor - 1) < (arr.length - 1) ? (low + factor - 1) : (arr.length - 1);
                high = (low + (2 * factor) - 1) < (arr.length - 1) ? (low + (2 * factor) - 1) : (arr.length - 1);
                k = low;
                //System.out.println("factor : " + factor + " low : " + low + " mid : " + mid + " high : " + high);
                left_arr = new int [mid - low + 1];
                right_arr = new int [high - mid];
                for (i = 0; i < left_arr.length; i += 1)
                {

                    left_arr[i] = arr[low + i];

                }
                for (j = 0; j < right_arr.length; j +=1)
                {

                    right_arr[j] = arr[mid + 1 + j];

                }
                i = 0;
                j = 0;
                while ((i < left_arr.length) && (j < right_arr.length))
                {

                    if (left_arr[i] <= right_arr[j])
                    {

                        arr[k] = left_arr[i++];

                    }
                    else
                    {

                        arr[k] = right_arr[j++];

                    }
                    k += 1;

                }
                while(i < left_arr.length)
                {

                    arr[k++] = left_arr[i++];

                }
                while(j < right_arr.length)
                {

                    arr[k++] = right_arr[j++];

                }

            }

        }
        return (arr);

    }

    public static Integer [] for_IntegerArray(Integer arr [])
    {

        int mid = 0, high = 0, i = 0, j = 0, k = 0;
        Integer left_arr [] = null;
        Integer right_arr [] = null;
        for (int factor = 1; factor <= arr.length - 1; factor *= 2)
        {

            for (int low = 0; low < arr.length - 1; low += 2*factor)
            {

                mid = (low + factor - 1) < (arr.length - 1) ? (low + factor - 1) : (arr.length - 1);
                high = (low + (2 * factor) - 1) < (arr.length - 1) ? (low + (2 * factor) - 1) : (arr.length - 1);
                //System.out.println("factor : " + factor + " low : " + low + " mid : " + mid + " high : " + high);
                k = low;
                left_arr = new Integer [mid - low + 1];
                right_arr = new Integer [high - mid];
                for (i = 0; i < left_arr.length; i += 1)
                {

                    left_arr[i] = arr[low + i];

                }
                for (j = 0; j < right_arr.length; j +=1)
                {

                    right_arr[j] = arr[mid + 1 + j];

                }
                i = 0;
                j = 0;
                while ((i < left_arr.length) && (j < right_arr.length))
                {

                    if (left_arr[i] <= right_arr[j])
                    {

                        arr[k] = left_arr[i++];

                    }
                    else
                    {

                        arr[k] = right_arr[j++];

                    }
                    k += 1;

                }
                while(i < left_arr.length)
                {

                    arr[k++] = left_arr[i++];

                }
                while(j < right_arr.length)
                {

                    arr[k++] = right_arr[j++];

                }

            }

        }
        return (arr);

    }

    public static long [] for_longArray(long arr [])
    {

        int mid = 0, high = 0, i = 0, j = 0, k = 0;
        long left_arr [] = null;
        long right_arr [] = null;
        for (int factor = 1; factor <= arr.length - 1; factor *= 2)
        {

            for (int low = 0; low < arr.length - 1; low += 2*factor)
            {

                mid = (low + factor - 1) < (arr.length - 1) ? (low + factor - 1) : (arr.length - 1);
                high = (low + (2 * factor) - 1) < (arr.length - 1) ? (low + (2 * factor) - 1) : (arr.length - 1);
                //System.out.println("factor : " + factor + " low : " + low + " mid : " + mid + " high : " + high);
                k = low;
                left_arr = new long [mid - low + 1];
                right_arr = new long [high - mid];
                for (i = 0; i < left_arr.length; i += 1)
                {

                    left_arr[i] = arr[low + i];

                }
                for (j = 0; j < right_arr.length; j +=1)
                {

                    right_arr[j] = arr[mid + 1 + j];

                }
                i = 0;
                j = 0;
                while ((i < left_arr.length) && (j < right_arr.length))
                {

                    if (left_arr[i] <= right_arr[j])
                    {

                        arr[k] = left_arr[i++];

                    }
                    else
                    {

                        arr[k] = right_arr[j++];

                    }
                    k += 1;

                }
                while(i < left_arr.length)
                {

                    arr[k++] = left_arr[i++];

                }
                while(j < right_arr.length)
                {

                    arr[k++] = right_arr[j++];

                }

            }

        }
        return (arr);

    }

    public static Long [] for_LongArray(Long arr [])
    {

        int mid = 0, high = 0, i = 0, j = 0, k = 0;
        Long left_arr [] = null;
        Long right_arr [] = null;
        for (int factor = 1; factor <= arr.length - 1; factor *= 2)
        {

            for (int low = 0; low < arr.length - 1; low += 2*factor)
            {

                mid = (low + factor - 1) < (arr.length - 1) ? (low + factor - 1) : (arr.length - 1);
                high = (low + (2 * factor) - 1) < (arr.length - 1) ? (low + (2 * factor) - 1) : (arr.length - 1);
                //System.out.println("factor : " + factor + " low : " + low + " mid : " + mid + " high : " + high);
                k = low;
                left_arr = new Long [mid - low + 1];
                right_arr = new Long [high - mid];
                for (i = 0; i < left_arr.length; i += 1)
                {

                    left_arr[i] = arr[low + i];

                }
                for (j = 0; j < right_arr.length; j +=1)
                {

                    right_arr[j] = arr[mid + 1 + j];

                }
                i = 0;
                j = 0;
                while ((i < left_arr.length) && (j < right_arr.length))
                {

                    if (left_arr[i] <= right_arr[j])
                    {

                        arr[k] = left_arr[i++];

                    }
                    else
                    {

                        arr[k] = right_arr[j++];

                    }
                    k += 1;

                }
                while(i < left_arr.length)
                {

                    arr[k++] = left_arr[i++];

                }
                while(j < right_arr.length)
                {

                    arr[k++] = right_arr[j++];

                }

            }

        }
        return (arr);

    }

    public static float [] for_floatArray(float arr [])
    {

        int mid = 0, high = 0, i = 0, j = 0, k = 0;
        float left_arr [] = null;
        float right_arr [] = null;
        for (int factor = 1; factor <= arr.length - 1; factor *= 2)
        {

            for (int low = 0; low < arr.length - 1; low += 2*factor)
            {

                mid = (low + factor - 1) < (arr.length - 1) ? (low + factor - 1) : (arr.length - 1);
                high = (low + (2 * factor) - 1) < (arr.length - 1) ? (low + (2 * factor) - 1) : (arr.length - 1);
                //System.out.println("factor : " + factor + " low : " + low + " mid : " + mid + " high : " + high);
                k = low;
                left_arr = new float [mid - low + 1];
                right_arr = new float [high - mid];
                for (i = 0; i < left_arr.length; i += 1)
                {

                    left_arr[i] = arr[low + i];

                }
                for (j = 0; j < right_arr.length; j +=1)
                {

                    right_arr[j] = arr[mid + 1 + j];

                }
                i = 0;
                j = 0;
                while ((i < left_arr.length) && (j < right_arr.length))
                {

                    if (left_arr[i] <= right_arr[j])
                    {

                        arr[k] = left_arr[i++];

                    }
                    else
                    {

                        arr[k] = right_arr[j++];

                    }
                    k += 1;

                }
                while(i < left_arr.length)
                {

                    arr[k++] = left_arr[i++];

                }
                while(j < right_arr.length)
                {

                    arr[k++] = right_arr[j++];

                }

            }

        }
        return (arr);

    }

    public static Float [] for_FloatArray(Float arr [])
    {

        int mid = 0, high = 0, i = 0, j = 0, k = 0;
        Float left_arr [] = null;
        Float right_arr [] = null;
        for (int factor = 1; factor <= arr.length - 1; factor *= 2)
        {

            for (int low = 0; low < arr.length - 1; low += 2*factor)
            {

                mid = (low + factor - 1) < (arr.length - 1) ? (low + factor - 1) : (arr.length - 1);
                high = (low + (2 * factor) - 1) < (arr.length - 1) ? (low + (2 * factor) - 1) : (arr.length - 1);
                //System.out.println("factor : " + factor + " low : " + low + " mid : " + mid + " high : " + high);
                k = low;
                left_arr = new Float [mid - low + 1];
                right_arr = new Float [high - mid];
                for (i = 0; i < left_arr.length; i += 1)
                {

                    left_arr[i] = arr[low + i];

                }
                for (j = 0; j < right_arr.length; j +=1)
                {

                    right_arr[j] = arr[mid + 1 + j];

                }
                i = 0;
                j = 0;
                while ((i < left_arr.length) && (j < right_arr.length))
                {

                    if (left_arr[i] <= right_arr[j])
                    {

                        arr[k] = left_arr[i++];

                    }
                    else
                    {

                        arr[k] = right_arr[j++];

                    }
                    k += 1;

                }
                while(i < left_arr.length)
                {

                    arr[k++] = left_arr[i++];

                }
                while(j < right_arr.length)
                {

                    arr[k++] = right_arr[j++];

                }

            }

        }
        return (arr);

    }

    public static double [] for_doubleArray(double arr [])
    {

        int mid = 0, high = 0, i = 0, j = 0, k = 0;
        double left_arr [] = null;
        double right_arr [] = null;
        for (int factor = 1; factor <= arr.length - 1; factor *= 2)
        {

            for (int low = 0; low < arr.length - 1; low += 2*factor)
            {

                mid = (low + factor - 1) < (arr.length - 1) ? (low + factor - 1) : (arr.length - 1);
                high = (low + (2 * factor) - 1) < (arr.length - 1) ? (low + (2 * factor) - 1) : (arr.length - 1);
                //System.out.println("factor : " + factor + " low : " + low + " mid : " + mid + " high : " + high);
                k = low;
                left_arr = new double [mid - low + 1];
                right_arr = new double [high - mid];
                for (i = 0; i < left_arr.length; i += 1)
                {

                    left_arr[i] = arr[low + i];

                }
                for (j = 0; j < right_arr.length; j +=1)
                {

                    right_arr[j] = arr[mid + 1 + j];

                }
                i = 0;
                j = 0;
                while ((i < left_arr.length) && (j < right_arr.length))
                {

                    if (left_arr[i] <= right_arr[j])
                    {

                        arr[k] = left_arr[i++];

                    }
                    else
                    {

                        arr[k] = right_arr[j++];

                    }
                    k += 1;

                }
                while(i < left_arr.length)
                {

                    arr[k++] = left_arr[i++];

                }
                while(j < right_arr.length)
                {

                    arr[k++] = right_arr[j++];

                }

            }

        }
        return (arr);

    }

    public static Double [] for_DoubleArray(Double arr [])
    {

        int mid = 0, high = 0, i = 0, j = 0, k = 0;
        Double left_arr [] = null;
        Double right_arr [] = null;
        for (int factor = 1; factor <= arr.length - 1; factor *= 2)
        {

            for (int low = 0; low < arr.length - 1; low += 2*factor)
            {

                mid = (low + factor - 1) < (arr.length - 1) ? (low + factor - 1) : (arr.length - 1);
                high = (low + (2 * factor) - 1) < (arr.length - 1) ? (low + (2 * factor) - 1) : (arr.length - 1);
                //System.out.println("factor : " + factor + " low : " + low + " mid : " + mid + " high : " + high);
                k = low;
                left_arr = new Double [mid - low + 1];
                right_arr = new Double [high - mid];
                for (i = 0; i < left_arr.length; i += 1)
                {

                    left_arr[i] = arr[low + i];

                }
                for (j = 0; j < right_arr.length; j +=1)
                {

                    right_arr[j] = arr[mid + 1 + j];

                }
                i = 0;
                j = 0;
                while ((i < left_arr.length) && (j < right_arr.length))
                {

                    if (left_arr[i] <= right_arr[j])
                    {

                        arr[k] = left_arr[i++];

                    }
                    else
                    {

                        arr[k] = right_arr[j++];

                    }
                    k += 1;

                }
                while(i < left_arr.length)
                {

                    arr[k++] = left_arr[i++];

                }
                while(j < right_arr.length)
                {

                    arr[k++] = right_arr[j++];

                }

            }

        }
        return (arr);

    }

}
