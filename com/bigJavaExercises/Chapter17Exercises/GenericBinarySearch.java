package com.bigJavaExercises.Chapter17Exercises;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class GenericBinarySearch {

        private int midPoint(int iMin, int iMax){
            return iMin + (iMax - iMin)/2;
        }

        public <T> int search(List<T> list, T Key, int iMin, int iMax, Comparator<T> comparator){
            if(list == null || list.size() == 0){
                return -1;
            }
            int iMid = midPoint(iMin, iMax);
            if(iMid > iMax || iMid < iMin){
                return -1;
            }
            if(comparator.compare(list.get(iMid), Key) > 0){
                return search(list, Key, iMin, iMid-1, comparator);
            }else if(comparator.compare(list.get(iMid), Key) < 0){
                return search(list, Key, iMid+1, iMax, comparator);
            }else{
                return iMid;
            }
        }

        public static void main(String[] args) {
            GenericBinarySearch bs = new GenericBinarySearch();
            ArrayList<Integer> list = new ArrayList<Integer>();
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(5);

            int key = 2;
            int iMin = 0;
            int iMax = list.size()-1;

            //Java 8 - Lambda expressions
            // new Comparator( public T int compare(T o1, T o2) {
            //      return o1.compareTo(o2);
            // }) ---> same expression is replaced by
            // (T o1, T o2) -> o1.compareTo(o2) or (o1,o2) -> o1.compareTo(o2)
            int index = bs.search(list, key, iMin, iMax, (o1,o2) -> o1.compareTo(o2));
            System.out.println(index);
        }
    }

