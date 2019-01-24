package com.company.java;

import java.util.ArrayList;

public class Problem2 {
  public static void main(String[] args) {

    ArrayList<String> colors = new ArrayList<String>();

    colors.add("Green");
    colors.add("Red");
    colors.add("Orange");

    for (String color: colors) {
      System.out.println(color);
    }

  }
}
