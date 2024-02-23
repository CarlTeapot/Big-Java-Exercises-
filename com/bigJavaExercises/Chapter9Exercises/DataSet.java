package com.bigJavaExercises.Chapter9Exercises;

public class DataSet
{
    private double sum;
    private Object maximum;
    private Object minimum;
    private Comparable comparer;
    private int count;
    private Measurer measurer;
    private Filter filter;
    /**
     Constructs an empty data set with a given measurer.
     */
    public DataSet(Comparable aComparer) {
        comparer = aComparer;
        sum = 0;
        count = 0;
        maximum = null;
        minimum = null;
    }
    public DataSet() {
        Measurer defaultMeasurer = new Measurer() {
            @Override
            public double measure(Object anObject) {
                if (anObject instanceof Measurable) {
                    Measurable m = (Measurable) anObject;
                    return m.getMeasure();
                }
                return 0;
            }
        };
        this.measurer = defaultMeasurer;
    }
    /**
     Adds a data value to the data set.
     @param x a data value
     */
    public void add(Object x)
    {
        if (filter.accept(x))
        {
            sum = sum + comparer.compareTo(x);
            if (count == 0 || comparer.compareTo(maximum) < comparer.compareTo(x))
                maximum = x;

            if (count == 0 || comparer.compareTo(minimum) > comparer.compareTo(x))
                minimum=x;
            count++;
        }
    }
    /**
     Gets the average of the added data.
     @return the average or 0 if no data has been added
     */
    public double getAverage()
    {
        if (count == 0) return 0;
        else return sum / count;
    }
    public Object getMaximum() {
        return  maximum;
    }

    public double getSum() {
        return sum;
    }
    /**
     Gets the largest of the added data.
     @return the maximum or 0 if no data has been added
     */

}