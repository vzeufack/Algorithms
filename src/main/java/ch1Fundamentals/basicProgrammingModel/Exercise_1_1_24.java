package ch1Fundamentals.basicProgrammingModel;

import edu.princeton.cs.algs4.In;

public class Exercise_1_1_24 {
    public static void main(String[] args) {
        In in = new In();
        int a = in.readInt();
        int b = in.readInt();
        System.out.printf("%d\n", gcd(a,b));
    }

    public static int gcd(int p, int q){
        System.out.printf("GCD(%d, %d)\n= ", p, q);
        if(q == 0)
            return p;

        return gcd(q, p%q);
    }
}
