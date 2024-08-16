public class Palindrome {

        public static boolean isPalindrome(String s) {
            int i = 0;
            int j = s.length() - 1;
            s = s.toLowerCase();
            while (i < j) {
                if (!(s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || s.charAt(i) >= '0' && s.charAt(i) <= '9' )) {
                    i++;

                } else if (!( s.charAt(j) >= 'a' && s.charAt(j) <= 'z' || s.charAt(j) >= '0' && s.charAt(j) <= '9' )) {
                    j--;

                }
                else if ((s.charAt(i)) != (s.charAt(j))) {
                    return false;
                }
                else {
                    i++;
                    j--;
                }
            }
            return true;

        }

    public static void main(String[] args)
    {
        String str = "Abdul";
        boolean A = isPalindrome(str);
        System.out.println(A);
    }
}



