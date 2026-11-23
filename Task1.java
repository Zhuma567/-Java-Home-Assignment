public class Task1 {
    public static void main(String[] args) {
        int[] a = {5, -3, 8, -1, 0, 12, -7, 4, 9, -2};
        int count = 0;
        for (int n : a)
            System.out.print(n + " ");
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                a[i] = 0;
                count++;
            }
        }
        System.out.print("\nModified: ");
        for (int n : a)
            System.out.print(n + " ");

        System.out.println("\nReplacements: " + count);
    }
}