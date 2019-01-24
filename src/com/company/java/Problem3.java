package com.company.java;

import java.util.ArrayList;

public class Problem3 {
  public static void main(String[] args) {

//    Using the array list created above, print out the value at index 1.
    ArrayList<String> colors = new ArrayList<String>();

    colors.add("Green");
    colors.add("Red");
    colors.add("Orange");

    System.out.println("The value at index 1: " + colors.get(1));
  }
}
