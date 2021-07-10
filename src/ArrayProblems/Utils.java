package ArrayProblems;

public class Utils {
    // https://www.geeksforgeeks.org/check-if-a-key-is-present-in-every-segment-of-size-k-in-an-array/
    public static boolean findxinkindowSize(int N, int[] arr, int x, int k) {
        if(N == 0) {
            return false;
        }

        int i = 0, j = 0;
        boolean found = false;

        while (i <= arr.length - 1) {
            while (j < k && i + j < N) {
                if(arr[i + j] == x && !found) {
                    found = true;
                    break;
                }
                j++;
            }

            if(!found) {
                return false;
            }

            found = false;
            i += k;
            j = 0;
        }
        return true;
    }
}
