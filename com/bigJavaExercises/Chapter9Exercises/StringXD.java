package com.bigJavaExercises.Chapter9Exercises;

public class StringXD implements Comparable {

    private String input;
    private int holder;

    public StringXD(String aninput){
        input= aninput;
        holder=0;
    }

    public String getComparer(){
        return input;
    }

    public String getString(){
        return input;
    }

    public int compareTo(Object other){
        String temp= (String) other;
        if (input.compareTo(temp)<0){
            holder=-1;
        }
        else if (input.compareTo(temp)== 0) {
            holder= 0;
        }
        else{
            holder= 1;
        }
        return holder;
    }
}
