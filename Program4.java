package array_Programmes;

public class Practice {
    public static void main(String[] args) {
        int[] nums = {1,2,8,9,12,46,76,82,15,20,30};

        int[] result = new int[10];

        for (int i = 1; i <= 9; i++) {
            int count = 0;
            for (int n : nums) {
                if (n % i == 0) {
                    count++;
                }
            }
            result[i] = count;
        }

        for (int i = 1; i <= 9; i++) {
            System.out.println(i + ": " + result[i]);
        }
    }
}
