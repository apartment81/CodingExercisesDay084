package ro.mirodone;

public class BetterThanAverage {

    public  boolean betterThanAverage(int[] classPoints, int yourPoints) {

        int sum =0;
        double average;


        for (int classPoint : classPoints) {
            sum += classPoint;
        }

        average = (double) sum/classPoints.length;

        return !(average > yourPoints);

    }

}
