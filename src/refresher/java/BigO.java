package refresher.java;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class BigO {
    //log uses binary search to halve the search

    //constant = O(1) = Array
    //logarithmic = O(log n)
    //linear = 0(n)
    //quadratic = O(n^2)
    //exponential = O(2^n)

    public static void main(String[] args) {
        //Array practice
//        int[] nums = {10, 20,30};
//        System.out.println(nums.length);
//        System.out.println(Arrays.toString(nums));

        //array list practice
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.add(50);
//        list.remove(2);
//        list.indexOf(50);
//        System.out.println(list);

        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addFirst(5);
        list.removeLast();
        System.out.println(list.contains(20));
        System.out.println(list.indexOf(10));
        System.out.println(list.size());
        var array = list.toArray();
        System.out.println(Arrays.toString(array));

    }
//    public void log(int[] numbers, String[] names){
        //O(1)
//        System.out.println(numbers[0]);
//        System.out.println(numbers[0]);

//        for (int i =0; i< numbers.length; i++){
//            System.out.println(numbers[i]);
//        }


//        //O(n)
//        for (int number : numbers){ //0(n)
//            System.out.println(number);
//        }
//        for (String name : names){ //0(m)
//            System.out.println(name);
//        }

        // O(n^3)
//        for (int first : numbers){ //O(n)
//            for (int second: numbers){ //O(n)
//                for (int third: numbers) {
//                    System.out.println(first + ", " + second + ", " + third);
//                }
//            }
//        }
//    }
}
