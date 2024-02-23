package com.bigJavaExercises.Chapter14Exercises;
import com.bigJavaExercises.Chapter16Exercises.Coin;

public class CoinSelectionSorter {
    private Coin[] coins;

    public CoinSelectionSorter(Coin[] theCoins) {
        coins = theCoins;
    }

    /**
     * Sorts the array managed by this selection sorter.
     */
    public void sort() {
        for (int i = coins.length - 1; i >= 0; i--) {
            int maximumPosition = maximumPosition(i);
            swap(i, maximumPosition);
        }
    }

    /**
     * Finds the smallest element in a tail range of the array.
     *
     * @param from the first position in a to compare
     * @return the position of the smallest element in the
     * range a[from] . . . a[a.length - 1]
     */
    private int maximumPosition(int from) {
        int maxPos = from;
        for (int i = from - 1; i >= 0; i--)
            if (coins[i].getValue() < coins[maxPos].getValue())
                maxPos = i;
        return maxPos;
    }

    /**
     * Swaps two entries of the array.
     *
     * @param i the first position to swap
     * @param j the second position to swap
     */
    private void swap(int i, int j) {
        Coin temp = coins[i];
        coins[i] = coins[j];
        coins[j] = temp;
    }
}