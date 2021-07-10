public class MergeSort {
    public static void Sort(int[] array) {
        if(array.length < 2) {
            return;
        }
        int m = array.length / 2;

        int[] left = new int[m];
        int[] right = new int[array.length - m];

        for(int i = 0; i < m; i++) {
            left[i] = array[i];
        }
        for(int j = m; j < array.length; j++) {
            right[j - m] = array[j];
        }

        Sort(left);
        Sort(right);

        Merge(left,right,array);
    }

    private static void Merge(int[] left, int[] right, int[] result) {
        int l = 0, r = 0, k = 0;
        while (l < left.length && r < right.length) {
            if(left[l] < right[r]) {
                result[k] = left[l];
                l++;
            } else {
                result[k] = right[r];
                r++;
            }
            k++;
        }

        while(l < left.length) {
            result[k] = left[l];
            l++;
            k++;
        }

        while(r < right.length) {
            result[k] = right[r];
            r++;
            k++;
        }
    }

    public static void printArray(int[] arr)
    {
        int n = arr.length;
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
