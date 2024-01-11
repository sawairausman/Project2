package Project2;


import java.util.ArrayList;
import java.util.Collections;

//How can you remove all duplicates from ArrayList?
public class Task10 {
    public static void main(String[] args) {
//        int [] array = {5,3,6,8,2,3,1};
//        secondLargest(array);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(2);
        list.add(2);
        list.add(5);
        System.out.println(list);

        //Collections.sort(list);

        ArrayList<Integer> newlist = new ArrayList<>();
        for (Integer i : list) {
            if (!newlist.contains(i)) {
                newlist.add(i);
            }
        }


        System.out.println(newlist);
    }
}
