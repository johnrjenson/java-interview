package com.rightpoint.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Histogram {
  public static void main(String[] args) {
    // This will generate 100 random numbers between 1 and 10
    List<Integer> randomNumbers = new ArrayList<Integer>();
    for(int i=0; i< 100; i++) {
      randomNumbers.add((int)(Math.random()*10)+1);
    }

    Map<Integer, Long> histogram = null;

    /*
      TODO Count how often each number appears in the list and put it in a map.
      ie. {1=12, 2=17, 3=8, 4=6, 5=14, 6=11, 7=7, 8=7, 9=6, 10=12}
     */

    System.out.println(histogram);
  }
}
