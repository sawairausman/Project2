package Project2;
//Count the Number of Words in a String: Write a function to count the
//number of words in a given string. Words are separated by spaces or
//punctuation. For example, the input "Hello, world!" should return 2.
public class Task7 {

    public static int numofWords(String str) {
        int count = 0;

        String[] newstr = str.split(" ");

        for (int i = 0; i < newstr.length; i++) {
            count++;

        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(numofWords("Hello, world! How are you"));
    }
}
