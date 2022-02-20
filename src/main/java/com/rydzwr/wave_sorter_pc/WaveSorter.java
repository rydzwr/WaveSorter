package com.rydzwr.wave_sorter_pc;

import java.util.Arrays;
import java.util.Collections;

import static java.util.Collections.swap;

public class WaveSorter
{
    public void waveSort(int[] arr)
    {
        int n = arr.length;

        for (int i = 0; i < n; i += 2)
        {
            if (i > 0 && arr[i - 1] > arr[i])
            {
                int temp = arr[i - 1];
                arr[i - 1] = arr[i];
                arr[i] = temp;
            }

            if (i < n - 1 && arr[i] < arr[ i+ 1])
            {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
    }
}
