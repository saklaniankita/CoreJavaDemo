package com.example;


import java.util.TreeSet;

public class MinMaxMetrics {
      private long minVlaue;
      private long maxValue;
      TreeSet<Long> set;
    // Add all necessary member variables

    /**
     * Initializes all member variables
     */
    public MinMaxMetrics() {
       minVlaue = Long.MIN_VALUE;
       maxValue = Long.MAX_VALUE;
       set = new TreeSet<Long>();
    }

    /**
     * Adds a new sample to our metrics.
     */
    public synchronized void addSample(long newSample) {
        set.add(newSample);
        maxValue = set.last();
        minVlaue = set.first();
    }

    /**
     * Returns the smallest sample we've seen so far.
     */
    public long getMin() {
        return minVlaue;
    }

    /**
     * Returns the biggest sample we've seen so far.
     */
    public long getMax() {
        return maxValue;
    }
}