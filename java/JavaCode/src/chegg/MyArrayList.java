package chegg;

import java.util.*;

import java.util.Comparator;

/**
 * * This class implements multiple sort algorithms to be used with ints, chars, and Stings.
 * <p>
 * * Bubble sort, Selection sort, and Insertion sorts are implemented here
 */

public class MyArrayList implements Comparable<MyArrayList> {

  protected int[] IntList;
  protected char[] CharList;
  protected String[] StringList;

  // constructor will build all 3 arrays here

  public MyArrayList() {
    this.IntList = new int[10];
    this.CharList = new char[10];
    this.StringList = new String[5];

    // fill all 3 arrays with data

    for (int i = 0; i < IntList.length; i++) {
      IntList[i] = (int) (Math.random() * 52);
    }
    // Populate char array

    for (int i = 0; i < CharList.length; i++) {
      Random random = new Random();
      CharList[i] = (char) (random.nextInt(26) + 'a');
    }

    // Populate String array
    StringList[0] = "joe";
    StringList[1] = "mark";
    StringList[2] = "abbey";
    StringList[3] = "tony";
    StringList[4] = "kevin";
  }

  public int compareTo(MyArrayList other) {
    // your code here
    for(int i=0; i<other.IntList.length; i++) {
      if (this.IntList[i] < other.IntList[i]) {
        System.out.println("compareTo() is returning -1, array[0] < other[0]");
        return -1;
      } else if (this.IntList[i] > other.IntList[0]) {
        System.out.println("compareTo() is returning 1, array[0] > other[0]");
        return 1;
      }
    }
    System.out.println("compareTo() is returning 0, array[0] == other[0] ");
    return 0;
  }

  public void intBubbleSort() {
    // Implement your sort, call a helper swap method
    boolean isNotSorted = true;
    int length = this.IntList.length;
    for(int i=0; i<length && isNotSorted; i++){
      isNotSorted = false;
      for(int j=0; j<length-i-1; j++){
        if(this.IntList[j] > this.IntList[j+1]) {
          swapInts(this.IntList, j);
          isNotSorted = true;
        }
      }
    }
  }

  public void CharBubbleSort() {
    // Implement your sort, call a helper swap method
    boolean isNotSorted = true;
    int length = this.CharList.length;
    for(int i=0; i<length && isNotSorted; i++){
      isNotSorted = false;
      for(int j=0; j<length-i-1; j++){
        if(this.CharList[j] > this.CharList[j+1]) {
          swapChars(this.CharList, j);
          isNotSorted = true;
        }
      }
    }
  }

  public void stringBubbleSort() {
    // Implement your sort, call a helper swap method
    boolean isNotSorted = true;
    int length = this.StringList.length;
    for(int i=0; i<length && isNotSorted; i++){
      isNotSorted = false;
      for(int j=0; j<length-i-1; j++){
        if(this.StringList[j].compareTo(this.StringList[j+1]) > 0) {
          swapStrings(this.StringList, j);
          isNotSorted = true;
        }
      }
    }
  }

  public void swapInts(int[] intList, int j) {
    // code for swapping ints, It is swapping elements at the 'j' and the next element at 'j+1' position
    int temp = intList[j];
    intList[j] = intList[j+1];
    intList[j+1] = temp;
  }

  public void swapChars(char[] charList, int j) {
    // code for swapping chars
    char temp = charList[j];
    charList[j] = charList[j+1];
    charList[j+1] = temp;
  }

  public void swapStrings(String[] stringList, int j) {
    // code for swapping Strings
    String temp = stringList[j];
    stringList[j] = stringList[j+1];
    stringList[j+1] = temp;
  }

  //selection sort for ints

  public void selectionSort() {

    // Implement your sort, call swapSelection(int[] intList, int i, int nextMin)

  }

  //selection sort for Strings

  public void stringSelectionSort() {

    // Implement your sort, call swapSelectionStrings(String[] StringList, int i)

    // and findSmallest(IntList, i, IntList.length) from your method

  }

  public void swapSelection(int[] intList, int i, int nextMin) {

    // Your code here to swap int values

  }

  public void swapSelectionStrings(String[] StringList, int i) {

    // Your code here to swap values

  }

  public int findSmallest(int[] arr, int begin, int end) {

    //returns the index of the smallest element

    int minIndex = begin; //hint

    for (int i = begin; i < end; i++) {

      if (arr[begin - 1] < arr[begin]) {

        minIndex = begin;

      } else

        minIndex = begin - 1;

    }

    return minIndex;

  }

  //Insertion Sort

  public void insertionSort() {

    for (int i = 0; i < IntList.length - 1; i++) {

      //note -1 above since we����re dealing with neighbors (a, a+1)

      int current = IntList[i];

      //int hole = i;

      while (i > 0 && IntList[i - 1] > current) { //while ����out of place����

        //slide data to the left moving the ����hole���� left

        // more code goes here

      }

    }

  }

}
