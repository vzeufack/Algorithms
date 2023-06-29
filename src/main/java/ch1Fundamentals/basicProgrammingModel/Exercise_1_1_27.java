package ch1Fundamentals.basicProgrammingModel;

public class Exercise_1_1_27 {
    public static void main(String[] args) {
        System.out.printf("%f\n", binomial(-50, -5, 0.25));
        System.out.printf("%f\n", enhancedBinomial(-50, -5, 0.25));
    }
    //binomial(100, 50, 0.25) would generate ~2^101 recursive calls
    public static double binomial(int n, int k, double p){
        if(n == 0 && k == 0)
            return 1.0;

        if(n < 0 || k < 0)
            return 0.0;

        return (1-p) * binomial(n-1, k, p) + p * binomial(n-1, k-1, p);
    }

    public static double enhancedBinomial(int n, int k, double p){
        if(n == 0 && k == 0)
            return 1.0;

        if(n < 0 || k < 0)
            return 0.0;

        double[][] binomials = new double[k+1][n+1];
        for(int j = 1; j < binomials[0].length; j++){
            binomials[0][j] = Math.pow(1-p, j);
        }

        for(int i = 1; i < binomials.length; i++){
            binomials[i][0] = 0;
        }

        binomials[0][0] = 1;

        for(int i = 1; i < binomials.length; i++) {
            for (int j = 1; j < binomials[i].length; j++) {
                binomials[i][j] = (1 - p) * binomials[i][j - 1] + p * binomials[i - 1][j - 1];
            }
        }

        return binomials[k][n];
    }

    private static void print(double[][] binomials){
        for(int i = 0; i < binomials.length; i++){
            for(int j = 0; j < binomials[i].length; j++){
                System.out.printf("%f ", binomials[i][j]);
            }
            System.out.println();
        }
    }
}
