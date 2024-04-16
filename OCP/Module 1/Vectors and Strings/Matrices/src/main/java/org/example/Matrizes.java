package org.example;

public class Matrizes {
    public static double mediaArray(double[] nums) {
        double sum = 0;
        for(double x : nums) sum+=x;
        return sum/ nums.length;
    }

    public static int[] minMax(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int[] result = new int[2];
        for(int x : nums) {
            if(x<=min) min = x;
        }
        for(int x : nums) {
            if(x>=max) max = x;
        }
        result[0] = min;
        result[1] = max;
        return result;
    }
}
