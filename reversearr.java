public class reversearr {
    public static void main(String[] args) {
        int[] arr = { 10, 2, 0, 3, 0, 5, 50 };
        rotatearr(arr,3);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void reversearr(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void rotatearr(int[] arr, int k) {
        int n =arr.length;
        k = k % n;
        reversearr(arr, 0, n-1); //{50, 5, 0, 3, 0, 2, 10}
        reversearr(arr, 0, k-1); //{5, 50, 0, 3, 0, 2, 10}
        reversearr(arr, k, n-1); // {5, 50, 10, 2, 0, 3, 0}
    }
}
