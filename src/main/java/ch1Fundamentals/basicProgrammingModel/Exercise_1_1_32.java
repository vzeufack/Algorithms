package ch1Fundamentals.basicProgrammingModel;

import edu.princeton.cs.algs4.StdDraw;

import java.util.Random;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise_1_1_32 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double lo = Double.parseDouble(args[1]);
        double hi = Double.parseDouble(args[2]);

        Random random = new Random();
        List<Double> numbers = random.doubles(500, lo, hi)
                                     .boxed()
                                     .collect(Collectors.toList());

        double[] buckets = new double[n];
        for(double num: numbers){
            if(num >= lo && num <= hi){
                int idx = (int)Math.floor(((num-lo)/(hi-lo)) * n);
                buckets[idx] += 1.0/n;
            }
        }

        for(int i = 0; i < n; i++){
            double x = 1.0*i/n;
            double y = buckets[i]/2.0;
            double rw = 0.5/n;
            double rh = buckets[i]/2.0;
            StdDraw.filledRectangle(x, y, rw, rh);
        }
    }
}
