package ch1Fundamentals.basicProgrammingModel;

public class Exercise_1_1_30 {
    //creates an n-by-n boolean array a[][] such that a[i][j] is true if i and j
    //are relatively prime
    public static boolean[][] createCoprimeArray(int n){
        boolean[][] result = new boolean[n][n];

        for(int i = 1; i < n; i++){
            result[i][1] = true;
            result[1][i] = true;
        }

        for(int i = 2; i < n; i++){
            for(int j = i; j < n; j++){
                boolean current = gcd(i, j) == 1;
                result[i][j] = current;
                result[j][i] = current;
            }
        }

        return result;
    }

    private static int gcd(int p, int q){
        if(q == 0)
            return p;
        return gcd(q, p%q);
    }
}
