public class reverse {
    public static void main(String[] args) {
        String str = "sampat";
        char[] strTOarr = str.toCharArray();
        System.out.println(strTOarr.length);
        for (int i = strTOarr.length - 1; i >= 0; i--) {
            System.out.print(strTOarr[i]);
        }

    }
}
