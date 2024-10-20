public class factorail {
    public static void main(String[] args) {
        System.out.println(recursion(4));
    }

    public static int recursion(int n) {
        int fact = 1;
        if (n == 0 || n == 1) {
            return 1;
        }
        else{
            return (n * recursion(n-1));
        }

        
    }
}
