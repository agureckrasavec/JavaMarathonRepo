package day18;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
        System.out.println(sum(numbers, 10));
    }

    public static int sum(int arr[], int n) {
        if (n < 0) {
            return 0;
        } else {
            return arr[n] + sum(arr, n-1);
        }
    }
}
