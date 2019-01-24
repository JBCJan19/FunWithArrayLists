package com.company.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Problem5 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    ArrayList<String> colors = new ArrayList<String>();

    String userInput = "";

    while (!userInput.equalsIgnoreCase("no")){
      System.out.println("Enter a color: ");
      userInput = input.next();
      colors.add(userInput);
      System.out.println("Add more colors: ");
      userInput = input.next();
    }

    Collections.sort(colors);
    for (String color: colors) {
      System.out.println(color);
    }
  }
}
