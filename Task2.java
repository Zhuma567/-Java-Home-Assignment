public class Task2 {
    public static void main(String[] args) {
        int[] a = {10, 25, 8, 30, 15, 30};
        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int n : a) {
            if (n > max) {
                second = max;
                max = n;
            } else if (n > second && n < max) {
                second = n;
            }
        }
        System.out.println("Largest: " + max);

        if (second == Integer.MIN_VALUE)
            System.out.println("No second largest distinct number.");
        else
            System.out.println("Second largest: " + second);
    }
}