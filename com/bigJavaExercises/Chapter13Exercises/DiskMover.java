package com.bigJavaExercises.Chapter13Exercises;

import java.util.ArrayList;
import java.util.Random;

public class DiskMover {
    private int diskAmount;
    private Random random;
    public ArrayList<String> strings;
    private String zura = "[";

    public DiskMover(int aDiskAmount) {
        diskAmount = aDiskAmount;
        random = new Random();
        strings = new ArrayList<>();
        for (int i = 0; i < diskAmount; i++) {
            strings.add("");
        }
    }
    public String createDisc(int amount) {
        String zura = "[";
        for (int i = 0; i < amount; i++) {
            zura = zura + "=";
        }
        zura = zura + "]";
        String zaza = zura;
        zura = "";
        return zaza;
    }
    public String createDisks() {
        String xoze = "";
        for (int i = 0; i < diskAmount; i++) {
            int zaza = random.nextInt(8);
            if (zaza == 0)
                continue;
            String zura = createDisc(zaza);

            strings.set(i,zura);
        }
        for (int i = 0; i < strings.size(); i++) {
            xoze = xoze + i + ": " +  strings.get(i) + "\n";
        }
        String list = xoze;
        xoze = "";
        return list;
    }
    public String getDisks() {
        String xoze = "";
        for (int i = 0; i < strings.size(); i++) {
            xoze = xoze + i + ": " +  strings.get(i) + "\n";
        }
        String list = xoze;
        xoze = "";
        return list;
    }
    public void change(int swap1, int swap2) {
        String temporary = "";
        temporary = strings.get(swap1);
        strings.set(swap1, strings.get(swap2));
        strings.set(swap2, temporary);
    }
}

