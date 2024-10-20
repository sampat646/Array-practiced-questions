import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class mergesortarr {
    public static void main(String[] args) {
        // Creating two ArrayLists
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        
        // Adding elements to arr1
        arr1.add(10);
        arr1.add(1);
        arr1.add(0);
        arr1.add(100);
        arr1.add(15);
        
        // Adding elements to arr2
        arr2.add(50);
        arr2.add(5);
        arr2.add(15);
        arr2.add(1);
        arr2.add(10);

        // Converting ArrayLists to arrays
        Integer[] arr1Array = arr1.toArray(new Integer[0]);
        Integer[] arr2Array = arr2.toArray(new Integer[0]);

        // Merging the arrays
        int[] mergeArr = new int[arr1.size() + arr2.size()];
        System.arraycopy(arr1Array, 0, mergeArr, 0, arr1Array.length);
        System.arraycopy(arr2Array, 0, mergeArr, arr1Array.length, arr2Array.length);

        // Sorting the merged array
        Arrays.sort(mergeArr);

        // Using a HashSet to remove duplicates
        HashSet<Integer> set = new HashSet<>();
        for (int num : mergeArr) {
            if (!set.contains(num)) {
                set.add(num);
                System.out.print(num + " ");
            }
        }
    }
}
