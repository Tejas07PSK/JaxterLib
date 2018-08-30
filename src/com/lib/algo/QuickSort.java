/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 30 Aug, 2018, 1:00 AM,
        @File-Name : QuickSort.java

 */

package com.lib.algo;

import java.io.Serializable;
import com.lib.ds.StackAsLinkedList;
import java.util.Random;

public class QuickSort implements Serializable
{

    private static final long serialVersionUID = 1L;

    private static final Random r = new Random ();

    public static byte [] for_byteArray(byte arr [])
    {

        StackAsLinkedList <Integer> stk = new StackAsLinkedList <Integer> ();
        int start_index = 0;
        int end_index = 0;
        int iterator = 0;
        int pivot = 0;
        int low = 0;
        int high = 0;
        int random_index = 0;
        stk.push(0);
        stk.push(arr.length - 1);
        while (!(stk.isEmpty()))
        {

            high = stk.pop();
            low = stk.pop();
            if(high <= low)
            {

                continue;

            }
            random_index = low + ((r.nextInt(arr.length)) % (high - low + 1));
            if (arr[random_index] != arr[low])
            {

                arr[low] = (byte)(arr[low] ^ arr[random_index]);
                arr[random_index] = (byte)(arr[low] ^ arr[random_index]);
                arr[low] = (byte)(arr[low] ^ arr[random_index]);

            }
            start_index = low;
            end_index = high;
            iterator = low;
            pivot = arr[low];
            while(iterator <= end_index)
            {

                if(arr[iterator] < pivot)
                {

                    if (arr[iterator] != arr[start_index])
                    {

                        arr[iterator] = (byte)(arr[iterator] ^ arr[start_index]);
                        arr[start_index] = (byte)(arr[iterator] ^ arr[start_index]);
                        arr[iterator] = (byte)(arr[iterator] ^ arr[start_index]);

                    }
                    iterator += 1;
                    start_index += 1;

                }
                else if(arr[iterator] > pivot)
                {

                    if (arr[iterator] != arr[end_index])
                    {

                        arr[iterator] = (byte)(arr[iterator] ^ arr[end_index]);
                        arr[end_index] = (byte)(arr[iterator] ^ arr[end_index]);
                        arr[iterator] = (byte)(arr[iterator] ^ arr[end_index]);

                    }
                    end_index -= 1;

                }
                else
                {

                    iterator += 1;

                }

            }
            if ((start_index - 1) > low)
            {

                stk.push(low);
                stk.push(start_index - 1);

            }
            if ((end_index + 1) < high)
            {

                stk.push(end_index + 1);
                stk.push(high);

            }

        }
        return (arr);

    }

    public static Byte [] for_ByteArray(Byte arr [])
    {

        StackAsLinkedList <Integer> stk = new StackAsLinkedList <Integer> ();
        int start_index = 0;
        int end_index = 0;
        int iterator = 0;
        int pivot = 0;
        int low = 0;
        int high = 0;
        int random_index = 0;
        stk.push(0);
        stk.push(arr.length - 1);
        while (!(stk.isEmpty()))
        {

            high = stk.pop();
            low = stk.pop();
            if(high <= low)
            {

                continue;

            }
            random_index = low + ((r.nextInt(arr.length)) % (high - low + 1));
            if (!(arr[random_index].equals(arr[low])))
            {

                arr[low] = (byte)(arr[low] ^ arr[random_index]);
                arr[random_index] = (byte)(arr[low] ^ arr[random_index]);
                arr[low] = (byte)(arr[low] ^ arr[random_index]);

            }
            start_index = low;
            end_index = high;
            iterator = low;
            pivot = arr[low];
            while(iterator <= end_index)
            {

                if(arr[iterator] < pivot)
                {

                    if (!(arr[iterator].equals(arr[start_index])))
                    {

                        arr[iterator] = (byte)(arr[iterator] ^ arr[start_index]);
                        arr[start_index] = (byte)(arr[iterator] ^ arr[start_index]);
                        arr[iterator] = (byte)(arr[iterator] ^ arr[start_index]);

                    }
                    iterator += 1;
                    start_index += 1;

                }
                else if(arr[iterator] > pivot)
                {

                    if (!(arr[iterator].equals(arr[end_index])))
                    {

                        arr[iterator] = (byte)(arr[iterator] ^ arr[end_index]);
                        arr[end_index] = (byte)(arr[iterator] ^ arr[end_index]);
                        arr[iterator] = (byte)(arr[iterator] ^ arr[end_index]);

                    }
                    end_index -= 1;

                }
                else
                {

                    iterator += 1;

                }

            }
            if ((start_index - 1) > low)
            {

                stk.push(low);
                stk.push(start_index - 1);

            }
            if ((end_index + 1) < high)
            {

                stk.push(end_index + 1);
                stk.push(high);

            }

        }
        return (arr);

    }

    public static short [] for_shortArray(short arr [])
    {

        StackAsLinkedList <Integer> stk = new StackAsLinkedList <Integer> ();
        int start_index = 0;
        int end_index = 0;
        int iterator = 0;
        int pivot = 0;
        int low = 0;
        int high = 0;
        int random_index = 0;
        stk.push(0);
        stk.push(arr.length - 1);
        while (!(stk.isEmpty()))
        {

            high = stk.pop();
            low = stk.pop();
            if(high <= low)
            {

                continue;

            }
            random_index = low + ((r.nextInt(arr.length)) % (high - low + 1));
            if (arr[random_index] != arr[low])
            {

                arr[low] = (short)(arr[low] ^ arr[random_index]);
                arr[random_index] = (short)(arr[low] ^ arr[random_index]);
                arr[low] = (short)(arr[low] ^ arr[random_index]);

            }
            start_index = low;
            end_index = high;
            iterator = low;
            pivot = arr[low];
            while(iterator <= end_index)
            {

                if(arr[iterator] < pivot)
                {

                    if (arr[iterator] != arr[start_index])
                    {

                        arr[iterator] = (short)(arr[iterator] ^ arr[start_index]);
                        arr[start_index] = (short)(arr[iterator] ^ arr[start_index]);
                        arr[iterator] = (short)(arr[iterator] ^ arr[start_index]);

                    }
                    iterator += 1;
                    start_index += 1;

                }
                else if(arr[iterator] > pivot)
                {

                    if (arr[iterator] != arr[end_index])
                    {

                        arr[iterator] = (short)(arr[iterator] ^ arr[end_index]);
                        arr[end_index] = (short)(arr[iterator] ^ arr[end_index]);
                        arr[iterator] = (short)(arr[iterator] ^ arr[end_index]);

                    }
                    end_index -= 1;

                }
                else
                {

                    iterator += 1;

                }

            }
            if ((start_index - 1) > low)
            {

                stk.push(low);
                stk.push(start_index - 1);

            }
            if ((end_index + 1) < high)
            {

                stk.push(end_index + 1);
                stk.push(high);

            }

        }
        return (arr);

    }

    public static Short [] for_ShortArray(Short arr [])
    {

        StackAsLinkedList <Integer> stk = new StackAsLinkedList <Integer> ();
        int start_index = 0;
        int end_index = 0;
        int iterator = 0;
        int pivot = 0;
        int low = 0;
        int high = 0;
        int random_index = 0;
        stk.push(0);
        stk.push(arr.length - 1);
        while (!(stk.isEmpty()))
        {

            high = stk.pop();
            low = stk.pop();
            if(high <= low)
            {

                continue;

            }
            random_index = low + ((r.nextInt(arr.length)) % (high - low + 1));
            if (!(arr[random_index].equals(arr[low])))
            {

                arr[low] = (short)(arr[low] ^ arr[random_index]);
                arr[random_index] = (short)(arr[low] ^ arr[random_index]);
                arr[low] = (short)(arr[low] ^ arr[random_index]);

            }
            start_index = low;
            end_index = high;
            iterator = low;
            pivot = arr[low];
            while(iterator <= end_index)
            {

                if(arr[iterator] < pivot)
                {

                    if (!(arr[iterator].equals(arr[start_index])))
                    {

                        arr[iterator] = (short)(arr[iterator] ^ arr[start_index]);
                        arr[start_index] = (short)(arr[iterator] ^ arr[start_index]);
                        arr[iterator] = (short)(arr[iterator] ^ arr[start_index]);

                    }
                    iterator += 1;
                    start_index += 1;

                }
                else if(arr[iterator] > pivot)
                {

                    if (!(arr[iterator].equals(arr[end_index])))
                    {

                        arr[iterator] = (short)(arr[iterator] ^ arr[end_index]);
                        arr[end_index] = (short)(arr[iterator] ^ arr[end_index]);
                        arr[iterator] = (short)(arr[iterator] ^ arr[end_index]);

                    }
                    end_index -= 1;

                }
                else
                {

                    iterator += 1;

                }

            }
            if ((start_index - 1) > low)
            {

                stk.push(low);
                stk.push(start_index - 1);

            }
            if ((end_index + 1) < high)
            {

                stk.push(end_index + 1);
                stk.push(high);

            }

        }
        return (arr);

    }

    public static int [] for_intArray(int arr [])
    {

        StackAsLinkedList <Integer> stk = new StackAsLinkedList <Integer> ();
        int start_index = 0;
        int end_index = 0;
        int iterator = 0;
        int pivot = 0;
        int low = 0;
        int high = 0;
        int random_index = 0;
        stk.push(0);
        stk.push(arr.length - 1);
        while (!(stk.isEmpty()))
        {

            high = stk.pop();
            low = stk.pop();
            if(high <= low)
            {

                continue;

            }
            random_index = low + ((r.nextInt(arr.length)) % (high - low + 1));
            if (arr[random_index] != arr[low])
            {

                arr[low] = arr[low] ^ arr[random_index];
                arr[random_index] = arr[low] ^ arr[random_index];
                arr[low] = arr[low] ^ arr[random_index];

            }
            start_index = low;
            end_index = high;
            iterator = low;
            pivot = arr[low];
            while(iterator <= end_index)
            {

                if(arr[iterator] < pivot)
                {

                    if (arr[iterator] != arr[start_index])
                    {

                         arr[iterator] = arr[iterator] ^ arr[start_index];
                         arr[start_index] = arr[iterator] ^ arr[start_index];
                         arr[iterator] = arr[iterator] ^ arr[start_index];

                    }
                    iterator += 1;
                    start_index += 1;

                }
                else if(arr[iterator] > pivot)
                {

                    if (arr[iterator] != arr[end_index])
                    {

                        arr[iterator] = arr[iterator] ^ arr[end_index];
                        arr[end_index] = arr[iterator] ^ arr[end_index];
                        arr[iterator] = arr[iterator] ^ arr[end_index];

                    }
                    end_index -= 1;

                }
                else
                {

                    iterator += 1;

                }

            }
            if ((start_index - 1) > low)
            {

                stk.push(low);
                stk.push(start_index - 1);

            }
            if ((end_index + 1) < high)
            {

                stk.push(end_index + 1);
                stk.push(high);

            }

        }
        return (arr);

    }

    public static Integer [] for_IntegerArray(Integer arr [])
    {

        StackAsLinkedList <Integer> stk = new StackAsLinkedList <Integer> ();
        int start_index = 0;
        int end_index = 0;
        int iterator = 0;
        int pivot = 0;
        int low = 0;
        int high = 0;
        int random_index = 0;
        stk.push(0);
        stk.push(arr.length - 1);
        while (!(stk.isEmpty()))
        {

            high = stk.pop();
            low = stk.pop();
            if(high <= low)
            {

                continue;

            }
            random_index = low + ((r.nextInt(arr.length)) % (high - low + 1));
            if (!(arr[random_index].equals(arr[low])))
            {

                arr[low] = arr[low] ^ arr[random_index];
                arr[random_index] = arr[low] ^ arr[random_index];
                arr[low] = arr[low] ^ arr[random_index];

            }
            start_index = low;
            end_index = high;
            iterator = low;
            pivot = arr[low];
            while(iterator <= end_index)
            {

                if(arr[iterator] < pivot)
                {

                    if (!(arr[iterator].equals(arr[start_index])))
                    {

                        arr[iterator] = arr[iterator] ^ arr[start_index];
                        arr[start_index] = arr[iterator] ^ arr[start_index];
                        arr[iterator] = arr[iterator] ^ arr[start_index];

                    }
                    iterator += 1;
                    start_index += 1;

                }
                else if(arr[iterator] > pivot)
                {

                    if (!(arr[iterator].equals(arr[end_index])))
                    {

                        arr[iterator] = arr[iterator] ^ arr[end_index];
                        arr[end_index] = arr[iterator] ^ arr[end_index];
                        arr[iterator] = arr[iterator] ^ arr[end_index];

                    }
                    end_index -= 1;

                }
                else
                {

                    iterator += 1;

                }

            }
            if ((start_index - 1) > low)
            {

                stk.push(low);
                stk.push(start_index - 1);

            }
            if ((end_index + 1) < high)
            {

                stk.push(end_index + 1);
                stk.push(high);

            }

        }
        return (arr);

    }

    public static long [] for_longArray(long arr [])
    {

        StackAsLinkedList <Integer> stk = new StackAsLinkedList <Integer> ();
        int start_index = 0;
        int end_index = 0;
        int iterator = 0;
        long pivot = 0L;
        int low = 0;
        int high = 0;
        int random_index = 0;
        stk.push(0);
        stk.push(arr.length - 1);
        while (!(stk.isEmpty()))
        {

            high = stk.pop();
            low = stk.pop();
            if(high <= low)
            {

                continue;

            }
            random_index = low + ((r.nextInt(arr.length)) % (high - low + 1));
            if (arr[random_index] != arr[low])
            {

                arr[low] = arr[low] ^ arr[random_index];
                arr[random_index] = arr[low] ^ arr[random_index];
                arr[low] = arr[low] ^ arr[random_index];

            }
            start_index = low;
            end_index = high;
            iterator = low;
            pivot = arr[low];
            while(iterator <= end_index)
            {

                if(arr[iterator] < pivot)
                {

                    if (arr[iterator] != arr[start_index])
                    {

                        arr[iterator] = arr[iterator] ^ arr[start_index];
                        arr[start_index] = arr[iterator] ^ arr[start_index];
                        arr[iterator] = arr[iterator] ^ arr[start_index];

                    }
                    iterator += 1;
                    start_index += 1;

                }
                else if(arr[iterator] > pivot)
                {

                    if (arr[iterator] != arr[end_index])
                    {

                        arr[iterator] = arr[iterator] ^ arr[end_index];
                        arr[end_index] = arr[iterator] ^ arr[end_index];
                        arr[iterator] = arr[iterator] ^ arr[end_index];

                    }
                    end_index -= 1;

                }
                else
                {

                    iterator += 1;

                }

            }
            if ((start_index - 1) > low)
            {

                stk.push(low);
                stk.push(start_index - 1);

            }
            if ((end_index + 1) < high)
            {

                stk.push(end_index + 1);
                stk.push(high);

            }

        }
        return (arr);

    }

    public static Long [] for_LongArray(Long arr [])
    {

        StackAsLinkedList <Integer> stk = new StackAsLinkedList <Integer> ();
        int start_index = 0;
        int end_index = 0;
        int iterator = 0;
        Long pivot = 0L;
        int low = 0;
        int high = 0;
        int random_index = 0;
        stk.push(0);
        stk.push(arr.length - 1);
        while (!(stk.isEmpty()))
        {

            high = stk.pop();
            low = stk.pop();
            if(high <= low)
            {

                continue;

            }
            random_index = low + ((r.nextInt(arr.length)) % (high - low + 1));
            if (!(arr[random_index].equals(arr[low])))
            {

                arr[low] = arr[low] ^ arr[random_index];
                arr[random_index] = arr[low] ^ arr[random_index];
                arr[low] = arr[low] ^ arr[random_index];

            }
            start_index = low;
            end_index = high;
            iterator = low;
            pivot = arr[low];
            while(iterator <= end_index)
            {

                if(arr[iterator] < pivot)
                {

                    if (!(arr[iterator].equals(arr[start_index])))
                    {

                        arr[iterator] = arr[iterator] ^ arr[start_index];
                        arr[start_index] = arr[iterator] ^ arr[start_index];
                        arr[iterator] = arr[iterator] ^ arr[start_index];

                    }
                    iterator += 1;
                    start_index += 1;

                }
                else if(arr[iterator] > pivot)
                {

                    if (!(arr[iterator].equals(arr[end_index])))
                    {

                        arr[iterator] = arr[iterator] ^ arr[end_index];
                        arr[end_index] = arr[iterator] ^ arr[end_index];
                        arr[iterator] = arr[iterator] ^ arr[end_index];

                    }
                    end_index -= 1;

                }
                else
                {

                    iterator += 1;

                }

            }
            if ((start_index - 1) > low)
            {

                stk.push(low);
                stk.push(start_index - 1);

            }
            if ((end_index + 1) < high)
            {

                stk.push(end_index + 1);
                stk.push(high);

            }

        }
        return (arr);

    }

    public static float [] for_floatArray(float arr [])
    {

        StackAsLinkedList <Integer> stk = new StackAsLinkedList <Integer> ();
        int start_index = 0;
        int end_index = 0;
        int iterator = 0;
        float pivot = 0.0f;
        float temp = 0.0f;
        int low = 0;
        int high = 0;
        int random_index = 0;
        stk.push(0);
        stk.push(arr.length - 1);
        while (!(stk.isEmpty()))
        {

            high = stk.pop();
            low = stk.pop();
            if(high <= low)
            {

                continue;

            }
            random_index = low + ((r.nextInt(arr.length)) % (high - low + 1));
            if (arr[random_index] != arr[low])
            {

                temp = arr[low];
                arr[low] = arr[random_index];
                arr[random_index] = temp;

            }
            start_index = low;
            end_index = high;
            iterator = low;
            pivot = arr[low];
            while(iterator <= end_index)
            {

                if(arr[iterator] < pivot)
                {

                    if (arr[iterator] != arr[start_index])
                    {

                        temp = arr[iterator];
                        arr[iterator] = arr[start_index];
                        arr[start_index] = temp;

                    }
                    iterator += 1;
                    start_index += 1;

                }
                else if(arr[iterator] > pivot)
                {

                    if (arr[iterator] != arr[end_index])
                    {

                        temp = arr[iterator];
                        arr[iterator] = arr[end_index];
                        arr[end_index] = temp;

                    }
                    end_index -= 1;

                }
                else
                {

                    iterator += 1;

                }

            }
            if ((start_index - 1) > low)
            {

                stk.push(low);
                stk.push(start_index - 1);

            }
            if ((end_index + 1) < high)
            {

                stk.push(end_index + 1);
                stk.push(high);

            }

        }
        return (arr);

    }

    public static Float [] for_FloatArray(Float arr [])
    {

        StackAsLinkedList <Integer> stk = new StackAsLinkedList <Integer> ();
        int start_index = 0;
        int end_index = 0;
        int iterator = 0;
        Float pivot = 0.0f;
        Float temp = 0.0f;
        int low = 0;
        int high = 0;
        int random_index = 0;
        stk.push(0);
        stk.push(arr.length - 1);
        while (!(stk.isEmpty()))
        {

            high = stk.pop();
            low = stk.pop();
            if(high <= low)
            {

                continue;

            }
            random_index = low + ((r.nextInt(arr.length)) % (high - low + 1));
            if (!(arr[random_index].equals(arr[low])))
            {

                temp = arr[low];
                arr[low] = arr[random_index];
                arr[random_index] = temp;

            }
            start_index = low;
            end_index = high;
            iterator = low;
            pivot = arr[low];
            while(iterator <= end_index)
            {

                if(arr[iterator] < pivot)
                {

                    if (!(arr[iterator].equals(arr[start_index])))
                    {

                        temp = arr[iterator];
                        arr[iterator] = arr[start_index];
                        arr[start_index] = temp;

                    }
                    iterator += 1;
                    start_index += 1;

                }
                else if(arr[iterator] > pivot)
                {

                    if (!(arr[iterator].equals(arr[end_index])))
                    {

                        temp = arr[iterator];
                        arr[iterator] = arr[end_index];
                        arr[end_index] = temp;

                    }
                    end_index -= 1;

                }
                else
                {

                    iterator += 1;

                }

            }
            if ((start_index - 1) > low)
            {

                stk.push(low);
                stk.push(start_index - 1);

            }
            if ((end_index + 1) < high)
            {

                stk.push(end_index + 1);
                stk.push(high);

            }

        }
        return (arr);

    }

    public static double [] for_doubleArray(double arr [])
    {

        StackAsLinkedList <Integer> stk = new StackAsLinkedList <Integer> ();
        int start_index = 0;
        int end_index = 0;
        int iterator = 0;
        double pivot = 0.0;
        double temp = 0.0;
        int low = 0;
        int high = 0;
        int random_index = 0;
        stk.push(0);
        stk.push(arr.length - 1);
        while (!(stk.isEmpty()))
        {

            high = stk.pop();
            low = stk.pop();
            if(high <= low)
            {

                continue;

            }
            random_index = low + ((r.nextInt(arr.length)) % (high - low + 1));
            if (arr[random_index] != arr[low])
            {

                temp = arr[low];
                arr[low] = arr[random_index];
                arr[random_index] = temp;

            }
            start_index = low;
            end_index = high;
            iterator = low;
            pivot = arr[low];
            while(iterator <= end_index)
            {

                if(arr[iterator] < pivot)
                {

                    if (arr[iterator] != arr[start_index])
                    {

                        temp = arr[iterator];
                        arr[iterator] = arr[start_index];
                        arr[start_index] = temp;

                    }
                    iterator += 1;
                    start_index += 1;

                }
                else if(arr[iterator] > pivot)
                {

                    if (arr[iterator] != arr[end_index])
                    {

                        temp = arr[iterator];
                        arr[iterator] = arr[end_index];
                        arr[end_index] = temp;

                    }
                    end_index -= 1;

                }
                else
                {

                    iterator += 1;

                }

            }
            if ((start_index - 1) > low)
            {

                stk.push(low);
                stk.push(start_index - 1);

            }
            if ((end_index + 1) < high)
            {

                stk.push(end_index + 1);
                stk.push(high);

            }

        }
        return (arr);

    }

    public static Double [] for_DoubleArray(Double arr [])
    {

        StackAsLinkedList <Integer> stk = new StackAsLinkedList <Integer> ();
        int start_index = 0;
        int end_index = 0;
        int iterator = 0;
        Double pivot = 0.0;
        Double temp = 0.0;
        int low = 0;
        int high = 0;
        int random_index = 0;
        stk.push(0);
        stk.push(arr.length - 1);
        while (!(stk.isEmpty()))
        {

            high = stk.pop();
            low = stk.pop();
            if(high <= low)
            {

                continue;

            }
            random_index = low + ((r.nextInt(arr.length)) % (high - low + 1));
            if (!(arr[random_index].equals(arr[low])))
            {

                temp = arr[low];
                arr[low] = arr[random_index];
                arr[random_index] = temp;

            }
            start_index = low;
            end_index = high;
            iterator = low;
            pivot = arr[low];
            while(iterator <= end_index)
            {

                if(arr[iterator] < pivot)
                {

                    if (!(arr[iterator].equals(arr[start_index])))
                    {

                        temp = arr[iterator];
                        arr[iterator] = arr[start_index];
                        arr[start_index] = temp;

                    }
                    iterator += 1;
                    start_index += 1;

                }
                else if(arr[iterator] > pivot)
                {

                    if (!(arr[iterator].equals(arr[end_index])))
                    {

                        temp = arr[iterator];
                        arr[iterator] = arr[end_index];
                        arr[end_index] = temp;

                    }
                    end_index -= 1;

                }
                else
                {

                    iterator += 1;

                }

            }
            if ((start_index - 1) > low)
            {

                stk.push(low);
                stk.push(start_index - 1);

            }
            if ((end_index + 1) < high)
            {

                stk.push(end_index + 1);
                stk.push(high);

            }

        }
        return (arr);

    }

}
