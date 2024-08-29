public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] letterCount = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            letterCount[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            letterCount[ransomNote.charAt(i) - 'a']--;
            if (letterCount[ransomNote.charAt(i) - 'a'] < 0){
                return false;
            }

        }
        return true;

    }
    public static void main(String[] args) {
        String ransomNote = "aa";
        String Magazine = "aab";

        if (canConstruct(ransomNote, Magazine)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}


