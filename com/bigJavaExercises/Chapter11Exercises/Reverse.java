package com.bigJavaExercises.Chapter11Exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Reverse {
        public static void main(String[] args) throws FileNotFoundException {

            Scanner input = new Scanner (new File("C:\\Users\\Mate\\Desktop\\input.txt")) ;

            ArrayList<String> Lines = new ArrayList <String>();

            while (input.hasNextLine()) {
                Lines.add(input.nextLine());
            }
            input.close();

            PrintWriter output = new PrintWriter(new File("text_Output"));

            //copy data from lines arraylists to new text file
            for (int i =0; i < Lines.size();i++) {
                //copy first element into char array
                char[]strLine = Lines.get(i).toString().toCharArray();

                //copy each char to string array in new text file
                for(int j=strLine.length-1;j>=0;j--)
                {
                    //copy index char in file
                    output.print(strLine[j]);

                }
                output.println();
            }
        output.close();
            input.close();
        }
}

