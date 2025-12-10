package array_Programmes;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        for (int i = 1; i <= 2 * a - 1; i += 2) {
            System.out.print(i + " ");
        }
    }
}
