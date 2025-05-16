import java.util.Scanner;

class Solution {
    public static String mergeStringAlternately(String word1, String word2) {
        StringBuilder merged = new StringBuilder();
        int i = 0, j = 0;
        int n1 = word1.length(), n2 = word2.length();

        while (i < n1 || j < n2) {
            if (i < n1) {
                merged.append(word1.charAt(i));
                i++;
            }
            if (j < n2) {
                merged.append(word2.charAt(j));
                j++;
            }
        }

        return merged.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();
        System.out.println(mergeStringAlternately(word1, word2));
    }
}
