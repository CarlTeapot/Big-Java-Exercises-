package com.bigJavaExercises.Chapter16Exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class SameWordSetTester {
 /*   public static void main(String[] args) throws IOException {
        File file = new File("D:/Books/Carthage.txt");
        SameWordSet set = new SameWordSet(file);
        set.addWords();
        System.out.println(set.getMap());
    }

  */
    public static void main(String[] args) throws FileNotFoundException {

        Map<Integer,HashSet<String>> map= new HashMap<>() ;
        Scanner scan = new Scanner(new File("D:/Books/Carthage.txt"));

        while( scan.hasNext() ) {
            String word= scan.nextLine() ;
            int code= word.hashCode();
            HashSet<String> count= map.get( code ) ;
            if(count == null) {
                count= new HashSet<String>() ;
                map.put(code, count ) ;
            }
            count.add( word );
        }

        int nonCollisionHashCodes= 0 ;
        int singleCollisionHashCodes= 0 ;
        int doubleCollisionHashCodes= 0 ;
        for(Map.Entry<Integer, HashSet<String>> e : map.entrySet() ) {
            if( e.getValue().size() <= 1 ) {
                nonCollisionHashCodes++;
            } else if( e.getValue().size() <= 2 ) {
                singleCollisionHashCodes++;
            } else if( e.getValue().size() <= 3 ) {
                doubleCollisionHashCodes++;
            } else {
                System.out.println(e.getKey() + " : " + e.getValue().size());
            }
        }
        System.out.println("Number of non-collision hashCodes: "+ nonCollisionHashCodes );
        System.out.println("Number of single-collision hashCodes: "+ singleCollisionHashCodes );
        System.out.println("Number of double-collision hashCodes: "+ doubleCollisionHashCodes );
    }
}
