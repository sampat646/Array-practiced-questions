public class rotation {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 6, 7 };
        int k = 3;
        rotate(arr, k);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void rotate(int[] arr, int k) {
        reverse(arr, 0, k);
    }

    public static void reverse(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;

    }
}
