package ch1Fundamentals.basicProgrammingModel;

import edu.princeton.cs.algs4.StdOut;

public class Exercise_1_1_19 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int N = 90;
        for(int n = 0; n < N; n++){
            StdOut.println(n + " " + enhancedFibonacci(n));
            if(System.currentTimeMillis() - startTime >= 3600000)
                break;
        }
        long endTime = System.currentTimeMillis();
        StdOut.printf("%d ms ~ %d s", endTime - startTime, (endTime - startTime)/1000);
    }

    public static long fibonacci(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static long enhancedFibonacci(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;

        long[] fib = new long[n+1];
        fib[0] = 0;
        fib[1] = 1;

        for(int i = 2; i < fib.length; i++){
            fib[i] = fib[i-1] + fib[i-2];
        }

        return fib[fib.length-1];
    }
}
