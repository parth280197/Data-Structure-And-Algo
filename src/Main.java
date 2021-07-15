import ArrayProblems.Utils;
import java.util.Arrays;

import static ArrayProblems.Utils.findxinkindowSize;

public class Main {
    public static void main(String[] args) {
//        int ar1[] = {1, 5, 10, 20, 40, 80};
//        int ar2[] = {6, 7, 20, 80, 100};
//        int ar3[] = {3, 4, 15, 20, 30, 70, 80, 120};

        int ar1[] = {3, 3, 3};
        int ar2[] = {3, 3, 3};
        int ar3[] = {3, 3, 3};
        var res = Utils.CommonElements(ar1,ar2,ar3,ar1.length,ar2.length,ar3.length);

        System.out.println(Arrays.toString(res.toArray()));
    }
}
