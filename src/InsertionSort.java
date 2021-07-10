public class InsertionSort {
    public static int[] Sort(int[] array) {
        for(int i = 1; i <= array.length - 1; i++) {
            int j = i - 1;
            int key = array[i];
            while (j >= 0 && array[j] > key) {
                array[j+1] = array[j];
                j--;
            }
            printArray(array);
            System.out.println(key);
            array[j + 1] = key;
        }

        return array;
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
