package ArrayProblems;

import java.util.ArrayList;

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

    // https://practice.geeksforgeeks.org/problems/common-elements1132/1
    public static ArrayList<Integer> CommonElements(int A[], int B[], int C[], int n1, int n2, int n3)
    {
        ArrayList<Integer> res = new ArrayList<Integer>();

        int i = 0, j=0, k=0;
        while(i < n1 && j < n2 && k < n3) {
            if(A[i] == B[j] && B[j] == C[k] && C[k] == A[i]) {
                res.add(A[i]);
                i++;j++;k++;
            } else if(A[i] < B[j]) {
                i++;
            } else if(B[j] < C[k]) {
                j++;
            } else {
                k++;
            }

            if(i>0 && i<n1) while (A[i] == A[i-1]) { i++; if(i>=n1) break; }
            if(j>0 && j<n2) while (B[j] == B[j-1]) { j++; if(j>=n2) break; }
            if(k>0 && k<n3) while (C[k] == C[k-1]) { k++; if(k>=n3) break; }
        }

        return res;
    }
}
