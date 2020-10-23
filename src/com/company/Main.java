package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        double[] mass = new double[]{3, -45, 2, 4, -15, 1, 2, 3, 1, -4.4, 2, 1, 1.0, -3, -8};

        double summOfMembers = 0;
        int acountOfMembers = 0;
        double Result;
        boolean startOfAction = false;

        for (double i : mass) {
            if (i < 0) {
                startOfAction = true;
            }
            if (startOfAction) {
                if (i > 0) {

                    summOfMembers += i;
                    acountOfMembers++;
                }

            }
        }
        Result = summOfMembers / acountOfMembers;
        System.out.println("Среднее арифметическое = " + Result);

    }
}












