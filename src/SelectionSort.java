public class SelectionSort {
    public static int[] Sort(int[] array) {

        //find min element in array
        /* swap min element to start of array and maintain two parts in array left sorted and right
        unsorted */

        for(int i = 0; i <= array.length - 1; i++) {
            int minIndex = i;
            for(int j = i + 1 ; j <= array.length - 1; j++) {
                if(array[i] > array[j]) {
                    minIndex = j;
                }
            }

            int tmp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = tmp;
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
