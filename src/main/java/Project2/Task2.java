package Project2;

public class Task2 {
    public static void main(String[] args) {

        //Find out how many alpha characters are present in a string?


            String str = new String("dfjsl#$RY%%3riejlmahs512");
            System.out.println(str.replaceAll("[^A-Za-z0-9]","").length());


    }
}
