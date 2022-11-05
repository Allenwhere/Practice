package OA;

import java.util.Arrays;

public class RodCutting {
    public static void cut(int[] rods) {
        Arrays.sort(rods);
        process(rods,rods.length);
    }
    private static void process(int[] rods, int size) {
        if(size == 0) return;
        System.out.println(size);
        int discard = 1;
        int start = rods.length - size;
        int shortest = rods[start];
        for(int i = start+1;i<rods.length;i++) {
            if(rods[i] == shortest) {
                discard++;
            } else {
                rods[i] = rods[i] - shortest;
            }
        }
        process(rods, size-discard);
    }
}
