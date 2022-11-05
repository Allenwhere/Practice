package OA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FindFactors {
    // n: the number whose factors we're going to find
    // p: return the pth element of ascending order of factors
    public static int findTheFactor(int n, int p) {
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 1;i <= n;i++) {
            if(n%i == 0) {
                res.add(i);
            }
        }
        if(p-1>res.size()) return 0;
        Collections.sort(res);
        return res.get(p-1);


    }
}
