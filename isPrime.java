public class isPrime {
    public static void main(String[] args) {
        if (isprime(9)) {
            System.out.println("Yoo!");
        }
        else{
            System.out.println("NOo");
        }
    }

    public static boolean isprime(int n) {
        if (n <= 2) {
            return false;
        } else {
            for (int i = 0; i < Math.sqrt(n); i++) {
                if ((n % 2) == 0) {
                    return false;
                }
            }
        }
        return true;

    }
}
