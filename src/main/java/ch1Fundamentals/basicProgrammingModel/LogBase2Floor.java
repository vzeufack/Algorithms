package ch1Fundamentals.basicProgrammingModel;

public class LogBase2Floor {
    public static void main (String[] args){
        System.out.printf("%d %d %d %d\n", getFloorOfLogBase2Of(1), getFloorOfLogBase2Of(2), getFloorOfLogBase2Of(50), getFloorOfLogBase2Of(100));
    }

    public static int getFloorOfLogBase2Of(int n){
      int result = 0;
		int twoPowerResult = 1;
		
		while(twoPowerResult <= n){
			result++;
			twoPowerResult = 2 * twoPowerResult;
		}
		
        return result - 1;
    }
}
