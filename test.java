class test {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2 };
        for (int i = 0; i < arr.length; i++) {
             if (i == 0 || arr[i] != arr[i - 1]) {
                System.out.println(arr[i]);
            }
            System.out.println(arr[i]);

        }
    }
}