package com.bigJavaExercises.Chapter5Exercises;

import java.util.Scanner;

public class LengthConverterTester {
    public static void main(String[] args) {
        LengthConverter converter = new LengthConverter();
        System.out.println(converter.fromMeters());
    }
}

class LengthConverter {
    Scanner scanner = new Scanner(System.in);

    private String from;
    private String to;
    private double value;
    private double converted;

    public LengthConverter() {
        System.out.print("Convert from: ");
        from = scanner.next();
        System.out.print("Convert to: ");
        to = scanner.next();
        System.out.print("Value: ");
        value = scanner.nextDouble();
    }

    public String fromMeters() {
        if (from.equalsIgnoreCase("m")) {
            if (to.equalsIgnoreCase("in")) {
                converted = value * 39.3701;
                return value +" " + from +  " to " + converted + " " + to;
            } else if (to.equalsIgnoreCase("ft")) {
                converted = value * 3.28084;
                return value +" " + from +  " to " + converted + " " + to;
            } else if (to.equalsIgnoreCase("ml")) {
                converted = value * 0.000621371;
                return value +" " + from +  " to " + converted + " " + to;
            } else if (to.equalsIgnoreCase("mm")) {
                converted = value * 1000;
                return value +" " + from +  " to " + converted + " " + to;
            } else if (to.equalsIgnoreCase("cm")) {
                converted = value * 100;
                return value +" " + from +  " to " + converted + " " + to;
            } else if (to.equalsIgnoreCase("dm")) {
                converted = value * 10;
                return value +" " + from +  " to " + converted + " " + to;
            } else if (to.equalsIgnoreCase("m")) {
                converted = value * 1;
                return value +" " + from +  " to " + converted + " " + to;
            } else if (to.equalsIgnoreCase("km")) {
                converted = value * 0.001;
                return value +" " + from +  " to " + converted + " " + to;
            }
            return "Enter the correct initials for the correct length units";
        }
        return "Enter the correct initials for the correct length units";
    }
    public String toMeters() {
        if (to.equalsIgnoreCase("m")) {
            if (from.equalsIgnoreCase("in")) {
                converted = value * 0.0254;
                return value +" " + from +  " to " + converted + " " + to;
            }
            if (from.equalsIgnoreCase("ft")) {
                converted = value * 0.3048;
                return value +" " + from +  " to " + converted + " " + to;
            }
            if (from.equalsIgnoreCase("ml")) {
                converted = value * 1609.34;
                return value +" " + from +  " to " + converted + " " + to;
            }
            if (from.equalsIgnoreCase("mm")) {
                converted = value * 0.001;
                return value +" " + from +  " to " + converted + " " + to;
            }
            if (from.equalsIgnoreCase("cm")) {
                converted = value * 0.01;
                return value +" " + from +  " to " + converted + " " + to;
            }
            if (from.equalsIgnoreCase("dm")) {
                converted = value * 0.14;
                return value +" " + from +  " to " + converted + " " + to;
            }
            if (from.equalsIgnoreCase("km")) {
                converted = value * 1000;
                return value +" " + from +  " to " + converted + " " + to;
            }
            return "Enter the correct initials for the correct length units";
        }
        return "Enter the correct initials for the correct length units";
    }
}