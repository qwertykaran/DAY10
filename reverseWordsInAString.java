import java.util.Scanner;

public class reverseWordsInAString {
    public static String reverseWords(String s) {
        String[] st = s.trim().split(" +");
        StringBuilder sb = new StringBuilder();
        int itr = st.length - 1;
        while (itr >= 0) {
            sb.append(st[itr]);
            sb.append(" ");
            itr--;
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(reverseWords(s));
    }
}
