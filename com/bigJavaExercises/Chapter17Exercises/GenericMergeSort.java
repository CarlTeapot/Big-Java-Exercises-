package com.bigJavaExercises.Chapter17Exercises;

public class GenericMergeSort<T extends Comparable<T>> {

    public void mergeSort(T[] array, int start, int end)
    {
        // base case
        if (start < end)
        {
            // find the middle point
            int middle = (start + end) / 2;

            mergeSort(array, start, middle); // sort first half
            mergeSort(array, middle + 1, end);  // sort second half

            // merge the sorted halves
            merge(array, start, middle, end);
        }
    }

    // merges two subarrays of array[].
    void merge(T[] array, int start, int middle, int end)
    {
        T[] leftArray  = (T[]) new Comparable[middle - start + 1];
        T[] rightArray = (T[]) new Comparable[end - middle];

        // fill in left array
        for (int i = 0; i < leftArray.length; ++i)
            leftArray[i] = array[start + i];

        // fill in right array
        for (int i = 0; i < rightArray.length; ++i)
            rightArray[i] = array[middle + 1 + i];

        /* Merge the temp arrays */

        // initial indexes of first and second subarrays
        int leftIndex = 0, rightIndex = 0;

        // the index we will start at when adding the subarrays back into the main array
        int currentIndex = start;

        // compare each index of the subarrays adding the lowest value to the currentIndex
        while (leftIndex < leftArray.length && rightIndex < rightArray.length)
        {
            if (leftArray[leftIndex].compareTo(rightArray[rightIndex]) <= 0)
            {
                array[currentIndex] = leftArray[leftIndex];
                leftIndex++;
            }
            else
            {
                array[currentIndex] = rightArray[rightIndex];
                rightIndex++;
            }
            currentIndex++;
        }

        // copy remaining elements of leftArray[] if any
        while (leftIndex < leftArray.length) array[currentIndex++] = leftArray[leftIndex++];

        // copy remaining elements of rightArray[] if any
        while (rightIndex < rightArray.length) array[currentIndex++] = rightArray[rightIndex++];
    }
    public static void main(String[] args)
    {
        // example using Strings
        String[]                 arrayOfStrings = {"Andree", "Leana", "Faviola", "Loyce", "Quincy", "Milo", "Jamila", "Toccara", "Nelda", "Blair", "Ernestine", "Chara", "Kareen", "Monty", "Rene", "Cami", "Winifred", "Tara", "Demetrice", "Azucena"};
        GenericMergeSort<String> stringSorter   = new GenericMergeSort<>();
        stringSorter.mergeSort(arrayOfStrings, 0, arrayOfStrings.length - 1);
        System.out.println(java.util.Arrays.toString(arrayOfStrings));

        // example using Doubles
        Double[]                 arrayOfDoubles = {0.35, 0.02, 0.36, 0.82, 0.27, 0.49, 0.41, 0.17, 0.30, 0.89, 0.37, 0.66, 0.82, 0.17, 0.20, 0.96, 0.18, 0.25, 0.37, 0.52};
        GenericMergeSort<Double> doubleSorter   = new GenericMergeSort<>();
        doubleSorter.mergeSort(arrayOfDoubles, 0, arrayOfDoubles.length - 1);
        System.out.println(java.util.Arrays.toString(arrayOfDoubles));
    }

}


