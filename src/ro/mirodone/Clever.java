package ro.mirodone;

import java.util.Arrays;

public class Clever {

     boolean betterThanAverage(final int[] classPoints, final int yourPoints) {
         return Arrays.stream(classPoints).average().orElse(0) < yourPoints;
    }
}
