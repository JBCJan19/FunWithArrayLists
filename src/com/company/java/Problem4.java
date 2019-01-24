package com.company.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Problem4 {
  public static void main(String[] args) {

//    Using the array list above, prompt the user for one new color,
// and add that color to the array list.

    ArrayList<String> colors = new ArrayList<String>();

    colors.add("Green");
    colors.add("Red");
    colors.add("Orange");

    Scanner input = new Scanner(System.in);

    System.out.print("Enter a color: ");
    String userColor = input.next();
    colors.add(userColor);

    for (String clr: colors) {
      System.out.println(clr);
    }

  }
}
