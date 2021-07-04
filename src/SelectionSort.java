public class SelectionSort {
    public static int[] Sort(int[] array) {

        //find min element in array
        /* swap min element to start of array and maintain two parts in array left sorted and right
        unsorted */

        for(int i = 0; i <= array.length - 1; i++) {
            int minIndex = i;
            for(int j = i + 1 ; j <= array.length - 1; j++) {
                if(array[minIndex] > array[j]) {
                    minIndex = j;
                }
            }

            int tmp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = tmp;
        }

        return array;
    }

    public static int[] StableSort(int[] array) {

        //find min element in array
        //create space for element that we need to insert by moving elements to right

        for(int i = 0; i <= array.length - 1; i++) {
            int minIndex = i;
            for(int j = i + 1 ; j <= array.length - 1; j++) {
                if(array[minIndex] > array[j]) {
                    minIndex = j;
                }
            }

            int key = array[minIndex];
            while (minIndex > i)
            {
                array[minIndex] = array[minIndex - 1];
                minIndex--;
            }

            array[i] = key;
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
