public class Anagram {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }


        int[] letterCount = new int[26];


        for (int i = 0; i < s.length(); i++) {
            letterCount[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            letterCount[t.charAt(i) - 'a']--;
        }


        for (int count : letterCount) {
            if (count != 0) {
                return false;
            }
        }


        return true;

    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        if (isAnagram(str1, str2)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}