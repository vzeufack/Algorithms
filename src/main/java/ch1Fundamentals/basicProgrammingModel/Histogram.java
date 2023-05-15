package ch1Fundamentals.basicProgrammingModel;

public class Histogram {
    public static void main(String[] args) {
        int[] testCase1 = {0, 4, 4, 4};
        int[] result = histogram(testCase1, 10);
        for(int i: result){
            System.out.print(i + " ");
        }
    }
    public static int[] histogram(int[] a, int m){
        int[] result = new int[m];

        for(int i = 0; i < a.length; i++) {
            if (a[i] < m) {
                result[a[i]]++;
            }
        }

        return result;
    }
}
