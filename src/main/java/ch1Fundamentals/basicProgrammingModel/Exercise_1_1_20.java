package ch1Fundamentals.basicProgrammingModel;

public class Exercise_1_1_20 {
    public static double logarithmOfFactorial(int n){
        if(n == 0 || n == 1)
            return 0;

        return Math.log(n) + logarithmOfFactorial(n-1);
    }
}
