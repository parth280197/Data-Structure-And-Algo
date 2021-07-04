public class Main {
    public static void main(String[] args) {
        int[] unSortedArray = {5,1,1,2,0,0};
        int[] sortedArray = SelectionSort.StableSort(unSortedArray);
        SelectionSort.printArray(sortedArray);
    }
}
