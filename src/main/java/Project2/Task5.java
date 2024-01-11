package Project2;
//Check if Two Strings are Anagrams: Given two strings, determine if they
//are anagrams, meaning they contain the same characters in a different order.
//For example, "listen" and "silent" are anagrams.
public class Task5 {

    public static void checkAnagrams(String a, String b){
        if(a.length()!=b.length()){
            System.out.println("they can't be anagram ");
        }

        for (int i = 0; i < a.length(); i++) {
            boolean foundMatch = false;
            for (int j = 0; j < b.length(); j++) {
                if(a.charAt(i)==b.charAt(j)){
                    foundMatch= true;
                    break;
                }

            }if(!foundMatch){
                System.out.println("String are not anagram");
                break;
            }

        }
        System.out.println("Strings are anagram");
    }

    public static void main(String[] args) {
        checkAnagrams("silent","listen");
    }

}
