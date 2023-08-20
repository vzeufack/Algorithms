package ch1Fundamentals.basicProgrammingModel;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

public class Exercise_1_1_31 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double p = Double.parseDouble(args[1]);

        double x0 = 0.5;
        double y0 = 0.5;
        double r = 0.25;
        double theta = (2*Math.PI)/n;
        StdDraw.circle(x0, y0, r);
        double[][] points = new double[n][2];

        for (int i = 0; i < n; i++){
            double x = r * Math.cos(theta*i) + x0;
            double y = r * Math.sin(theta*i) + y0;
            points[i][0] = x;
            points[i][1] = y;
            StdDraw.circle(x, y, 0.05);
        }

        for (int i = 0; i < points.length-1; i++){
            for(int j = i + 1; j < points.length; j++){
               if(StdRandom.bernoulli(p))
                   StdDraw.line(points[i][0], points[i][1], points[j][0], points[j][1]);
            }
        }
    }
}
