public class Main {
    public static void main(String[] args) {
        int[] unSortedArray = {9,5,1,4,2,10,89};
        int[] sortedArray = SelectionSort.Sort(unSortedArray);
        SelectionSort.printArray(sortedArray);
    }
}
