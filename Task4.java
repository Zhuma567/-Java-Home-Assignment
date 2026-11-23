public class Task4 {
    public static void main(String[] args) {
        int[] a = {4, 7, 2, 4, 9, 7, 1, 2, 8, 4};
        boolean found = false;
        System.out.print("Duplicate numbers: ");
        for (int i = 0; i < a.length; i++) {
            boolean duplicate = false;
            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    duplicate = true;
                    break;





                }
            }

            if (!duplicate) {
                for (int j = i + 1; j < a.length; j++) {
                    if (a[i] == a[j]) {
                        System.out.print(a[i] + " ");
                        found = true;
                        break;
                    }
                }
            }
        }

        if (!found)
            System.out.println("No duplicates found.");
    }
}