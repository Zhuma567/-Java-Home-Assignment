import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {10, 20, 30, 40, 50};
        System.out.print("Enter index to remove: ");
        int index = sc.nextInt();




        if (index >= 0 && index < a.length) {
            for (int i = index; i < a.length - 1; i++)
                a[i] = a[i + 1];

            System.out.print("Updated: ");
            for (int i = 0; i < a.length - 1; i++)
                System.out.print(a[i] + " ");
        } else {
            System.out.println("Invalid index!");
        }
        sc.close();
    }
}