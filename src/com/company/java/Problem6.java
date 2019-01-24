package com.company.java;

import java.util.ArrayList;
import java.util.Scanner;
//Create an application which will prompt the user to enter the name of their
// favorite Movie. Add the Movie to an array list.  Use a loop to continue
// adding movies to the array until the user presses q or Q.
public class Problem6 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    ArrayList<String> movies = new ArrayList<String>();

    String movie = "";
    while (!movie.equalsIgnoreCase("q")){
      System.out.print("Enter your favorite movie: ");
      movie = input.next();
      if(!movie.equalsIgnoreCase("q")){
        movies.add(movie);
      }
      System.out.print("Type q or Q to quit. Enter more movies? ");
      movie = input.next();

    }

    for (String aMovie: movies) {
      System.out.println(aMovie);
    }
  }
}
