import static ArrayProblems.Utils.findxinkindowSize;

public class Main {
    public static void main(String[] args) {
        int arr[] = new int[] { 3, 5, 2, 4,  9,  3, 1, 7, 3, 11, 12, 3 };
        int x = 3, k = 3;
        int n = arr.length;
        if (findxinkindowSize(n, arr, x, k))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
