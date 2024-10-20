import java.util.Arrays;

public class twosum {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 5, 8, 6 };
        int left = 0;
        int right = arr.length - 1;
        int target = 7;
        BubbleSort(arr);
        System.out.println("after sorting ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        Twosum(arr, target, left, right);

    }

    public static void Twosum(int[] arr, int target, int left, int right) {
        boolean found = false;
        while (left <= right) {
            if (arr[left] + arr[right] == target) {
                System.out.println(arr[left] + " " + arr[right]);
                found = true;
                left++;
                right--;

            } else if (arr[left] + arr[right] > target) {
                left++;
            } else {
                right--;
            }

        }
        if (!found) {
            System.out.println("NO paris");
        }
    }

    public static void BubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }

        }

    }

}
