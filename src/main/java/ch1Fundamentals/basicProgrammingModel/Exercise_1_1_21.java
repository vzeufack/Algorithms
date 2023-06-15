package ch1Fundamentals.basicProgrammingModel;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Exercise_1_1_21 {
    public static void main(String[] args) {
        /*name1 10 5
        name2 37 4
        name3 100 -6
        name4 -5 2
        name5 10000000 7*/

        String[] lines = StdIn.readAllLines();

        for(String line: lines){
            String[] elements = line.split(" ");
            int a = Integer.parseInt(elements[1]);
            int b = Integer.parseInt(elements[2]);
            StdOut.printf("%-10s %-10d %-10d %-7.3f\n", elements[0], a, b, a/(double)b);
        }
    }
}
