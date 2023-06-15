package ch1Fundamentals.basicProgrammingModel;

import edu.princeton.cs.algs4.StdOut;

import java.security.SecureRandom;
import java.util.Arrays;

public class Exercise_1_1_22 {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int[] array = random.ints(20, 0, 100).toArray();
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(indexOf(array, 16));
    }
    public static int indexOf(int[] a, int key){
        return indexOf(a, key, 0, a.length - 1, 1);
    }

    public static int indexOf(int[] a, int key, int lo, int hi, int depth){
        StdOut.printf("%" + depth + "s %d %d\n", "", lo, hi);

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
