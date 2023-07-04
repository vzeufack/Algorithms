package ch1Fundamentals.basicProgrammingModel;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise_1_1_28 {
    public static int indexOf(int[] a, int key){
        int lo = 0;
        int hi = a.length - 1;
        while(lo <= hi){
            int mid = lo + (hi - lo)/2;
            if(key < a[mid])
                hi = mid - 1;
            else if (key > a[mid])
                lo = mid + 1;
            else
                return mid;
        }

        return -1;
    }

    public static void main(String[] args) {
        In in = new In(args[0]);
        int[] whitelist = in.readAllInts();
        Arrays.sort(whitelist);
        int[] cleanWhiteList = removeDuplicates(whitelist);

        while(!StdIn.isEmpty()){
            int key = StdIn.readInt();
            if(indexOf(whitelist, key) == -1)
                StdOut.println(key);
        }
    }

    private static int[] removeDuplicates(int[] sortedList){
        ArrayList<Integer> uniqueElements = new ArrayList<>();
        int i = 0;
        while(i < sortedList.length){
            int current = sortedList[i];
            uniqueElements.add(current);
            i++;

            while(i < sortedList.length && sortedList[i] == current){
                i++;
            }
        }
        return uniqueElements.stream().mapToInt(j -> j).toArray();
    }
}
