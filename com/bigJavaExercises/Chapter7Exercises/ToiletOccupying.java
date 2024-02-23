package com.bigJavaExercises.Chapter7Exercises;

public class ToiletOccupying {


    private int toilets;
    private int men;
    private boolean[] occupied;
    private boolean occupation = false;
    private String toString = "";

    public ToiletOccupying(int toilets, int amountOfMen) {
        this.toilets = toilets;
        men = amountOfMen;
        occupied = new boolean[toilets];
        for (int i = 0; i < toilets; i++) {
            occupied[i] = false;
            toString = toString + " _ ";
        }
    }

 /*   public String getOccupied() {
        String toString = "";
        for (int j = 0; j < toilets; j++) {
            for (int i = 0; i < men; i++) {
                toilets = toilets / 2;
                occupied[toilets] = true;
                occupation = true;
                toString = toString + " X ";
            }
        }
        return toString;
    }
*/

    public void printStalls(boolean[] b) {
        for (boolean s : b) {
            System.out.print((s ? "X" : "_") + " ");
        }
        System.out.print("\n");
    }

    public boolean giveFlag(boolean[] b) {
        for (boolean s : b) {
            if (!s) return false;
        }
        return true;
    }

    public int getLongest(boolean[] b) {
        int length = 0, temp = 0;
        int len = b.length;
        for (int i = 0; i < len; i++) {
            if (b[i] == false) {
                temp++;
            } else {
                temp = 0;
            }
            if (length < temp)
                length = temp;
        }
        return length;
    }

    public int checkIndex(boolean[] b) {
        int length = 0, temp = 0, ind = 0;
        int len = b.length;
        for (int i = 0; i < len; i++) {
            if (b[i] == false) {
                temp++;
            } else {
                temp = 0;
            }
            if (length < temp) {
                ind = i - length;
                length = temp;
            }
        }
        return ind;
    }

    public void findStalls(boolean[] b) {
        int loc = checkIndex(b);
        int len = getLongest(b);
        int ind = loc + len / 2;
        b[ind] = true;

    }
}


// _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _