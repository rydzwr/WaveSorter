package com.rydzwr.wave_sorter_pc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest
{
    @Test
    void sampleTest()
    {
       WaveSorter waveSorter = new WaveSorter();

        int arr[] = {10, 90, 49, 2, 1, 5, 23};
        int n = arr.length;

        waveSorter.waveSort(arr);

        for (int i : arr)
            System.out.print(i + " ");

    }
}
