import java.util.Arrays;

public class maxnmin {
    public static void main(String[] args) {
        int[] arr = { 1,5,2,4,9,4,6,7,15,16};
        int max = arr[0];
        int min = arr[0];
        int max2 =arr[0];
        int sencondHighest = 3;
        int n= arr.length;
        for (int i = 0; i < arr.length; i++) {
            max = (arr[i] > max ? arr[i] : max);
            min = (arr[i] < min ? arr[i] : min);
        }
        Arrays.sort(arr);
        max2=arr[n-sencondHighest];
        System.out.println("Maximum of the array is " + max);
        System.out.println( sencondHighest+"nd Maximum of the array is " + max2);
        System.out.println("Minimum of the array is " + min);
    }
}
