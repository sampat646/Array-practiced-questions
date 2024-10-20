public class palindrome {
    public static void main(String[] args) {
        if (isPalndrome(1661)) {
            System.out.println("Yep");
        }
        else{
            System.out.println("nope");
        }

    }

    public static boolean isPalndrome(int n) {
        int dupi = n;
        int rev = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            n = n / 10;
            rev = (rev * 10) + lastDigit;
        }

        return (dupi == rev);
    }
}
