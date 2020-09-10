package day18;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(sevenQuantity(134377777));
    }

    public static int sevenQuantity(int n) {
      if (n / 10 == 0) {
          return 0;
      }
      return ((n % 10 == 7) ? 1 : 0) + sevenQuantity(n / 10);
    }
}
