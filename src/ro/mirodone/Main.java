package ro.mirodone;

public class Main {

    public static void main(String[] args) {

        BetterThanAverage b = new BetterThanAverage();
      //  System.out.println(b.betterThanAverage(new int[] {2, 3}, 5));
        System.out.println(b.betterThanAverage(new int[] {4, 5}, 5));
      //  System.out.println(b.betterThanAverage(new int[] {100, 90}, 11));


        int myPoints = 5;
        Clever clever = new Clever();
        System.out.println(clever.betterThanAverage(new int[] {4, 5}, myPoints));

    }
}
