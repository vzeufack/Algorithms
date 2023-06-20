package ch1Fundamentals.basicProgrammingModel;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class Exercise_1_1_22 {
    public static void main(String[] args) {
        In in = new In(args[0]);
        int[] whitelist = in.readAllInts();
        Arrays.sort(whitelist);

        if(args[1].equals("+")) {
            while (!StdIn.isEmpty()) {
                int key = StdIn.readInt();
                if (indexOf(whitelist, key) == -1)
                    StdOut.println(key);
            }
        }
        else{
            StdOut.println(Arrays.toString(whitelist));
        }
    }
    public static int indexOf(int[] a, int key){
        return indexOf(a, key, 0, a.length - 1, 1);
    }

    public static int indexOf(int[] a, int key, int lo, int hi, int depth){
        if(lo > hi)
            return -1;

        int mid = lo + (hi - lo)/2;
        if(key < a[mid])
            return indexOf(a, key, lo, mid-1, depth+2);
        else if(key > a[mid])
            return indexOf(a, key, mid+1, hi, depth+2);
        else
            return mid;
    }
}
