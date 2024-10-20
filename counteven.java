public class counteven {
    public static void main(String[] args) {
        int[] arr ={4,2,1,6,9,12};
        int countEven = 0;
        int countOdd = 0;

        System.out.println("Counting the even numbers in the array");
        for (int i : arr) {
            if((i % 2)==0){
                countEven++;
            }
            else{
                countOdd++;
            }
        }
        System.out.println("EVEN "+countEven);
        System.out.println("ODD "+countOdd);
    }
}
