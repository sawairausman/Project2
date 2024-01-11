package Project2;

public class Task4 {

    //Check if a String is Palindrome: Determine whether a given string is a
    //palindrome, which means it reads the same forwards and backward. For
    //example, "madam" is a palindrome.

    public static void isPalindrome(String s) {
        String rev = "";
        String a = s.replaceAll(" ", "").toLowerCase();
        if (s.isEmpty()) {
            System.out.println("invalid string");
        }
        if (a.length() >= 2) {

            for (int i = a.length() - 1; i >= 0; i--) {
                rev += a.charAt(i);

            }
            if (rev.equals(a)) {
                System.out.println("the string is palindrome ");
            } else {
                System.out.println("the string is not palindrome");
            }
        }
    }
}
