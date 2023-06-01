package Labs.Lab9;

import java.util.*;
import java.util.Comparator;

/**
 For some reason this file does not compile in one of my IDE's.
 */

public class MyArrayList implements Comparable<MyArrayList>{

    // instance data
    protected int[] IntList;
    protected char[] CharList;
    protected String[] StringList;

    // constructor will build all 3 arrays here
    public MyArrayList() {
        this.IntList = new int[10];
        this.CharList = new char[10];
        this.StringList = new String[5];

        // fill all 3 arrays with data
        for(int i = 0; i < IntList.length; i++) {
            IntList[i] = (int) (Math.random()*52);
        }

        // Populate char array
        for(int i = 0; i < CharList.length; i++) {

            Random random = new Random();
            CharList[i] = (char)(random.nextInt(26) + 'a');
        }

        // Populate String array
        StringList[0] = "joe";
        StringList[1] = "mark";
        StringList[2] = "abbey";
        StringList[3] = "tony";
        StringList[4] = "kevin";
    }

    public int compareTo(MyArrayList other) {
        if (this.IntList[0] < other.IntList[0]) {
            System.out.println("compareTo() is returning -1, IntList[0] < other.IntList[0]");
            return -1;
        } else if (this.IntList[0] > other.IntList[0]) {
            System.out.println("compareTo() is returning 1, IntList[0] > other.IntList[0]");
            return 1;
        } else {
            System.out.println("compareTo() is returning 0, IntList[0] == other.IntList[0]");
            return 0;
        }
    }

    public void intBubbleSort() {
        for (int i = 0; i < IntList.length - 1; i++) {
            for (int j = 0; j < IntList.length - i - 1; j++) {
                if (IntList[j] > IntList[j + 1]) {
                    swapInts(IntList, j);
                }
            }
        }
    }

    public void CharBubbleSort() {
        for (int i = 0; i < CharList.length - 1; i++) {
            for (int j = 0; j < CharList.length - i - 1; j++) {
                if (CharList[j] > CharList[j + 1]) {
                    swapChars(CharList, j);
                }
            }
        }
    }

    public void stringBubbleSort() {
        for (int i = 0; i < StringList.length - 1; i++) {
            for (int j = 0; j < StringList.length - i - 1; j++) {
                if (StringList[j].compareTo(StringList[j + 1]) > 0) {
                    swapStrings(StringList, j);
                }
            }
        }
    }

    public void swapInts(int[] intList, int j) {
        int temp = intList[j];
        intList[j] = intList[j + 1];
        intList[j + 1] = temp;
    }

    public void swapChars(char[] charList, int j) {
        char temp = charList[j];
        charList[j] = charList[j + 1];
        charList[j + 1] = temp;
    }

    public void swapStrings(String[] stringList, int j) {
        String temp = stringList[j];
        stringList[j] = stringList[j + 1];
        stringList[j + 1] = temp;
    }

    // selection sort for ints
    public void selectionSort() {
        // Implement your sort, call swapSelection(int[] intList, int i, int nextMin)
        for (int i = 0; i < IntList.length - 1; i++) {
            int nextMinIndex = findSmallest(IntList, i, IntList.length);
            swapSelection(IntList, i, nextMinIndex);
        }
    }

    // selection sort for Strings
    public void stringSelectionSort() {
        // Implement your sort, call swapSelectionStrings(String[] StringList, int i)
        // and findSmallest(IntList, i, IntList.length) from your method
        for (int i = 0; i < StringList.length - 1; i++) {
            int nextMinIndex = findSmallest(StringList, i, StringList.length);
            swapSelectionStrings(StringList, i, nextMinIndex);
        }
    }

    public void swapSelection(int[] intList, int i, int nextMinIndex) {
        int temp = intList[i];
        intList[i] = intList[nextMinIndex];
        intList[nextMinIndex] = temp;
    }

    public void swapSelectionStrings(String[] StringList, int i, int nextMinIndex) {
        String temp = StringList[i];
        StringList[i] = StringList[nextMinIndex];
        StringList[nextMinIndex] = temp;
    }

    public int findSmallest(int[] arr, int begin, int end) {
        int minIndex = begin;
        int minValue = arr[begin];
        for (int i = begin + 1; i < end; i++) {
            if (arr[i] < minValue) {
                minIndex = i;
                minValue = arr[i];
            }
        }
        return minIndex;
    }

    public int findSmallest(String[] arr, int begin, int end) {
        int minIndex = begin;
        String minValue = arr[begin];
        for (int i = begin + 1; i < end; i++) {
            if (arr[i].compareTo(minValue) < 0) {
                minIndex = i;
                minValue = arr[i];
            }
        }
        return minIndex;
    }

    // Insertion Sort
    public void insertionSort() {
        for (int i = 1; i < IntList.length; i++) {
            int current = IntList[i];
            int hole = i;

            while (hole > 0 && IntList[hole - 1] > current) {
                IntList[hole] = IntList[hole - 1];
                hole--;
            }

            IntList[hole] = current;
        }
    }
}
