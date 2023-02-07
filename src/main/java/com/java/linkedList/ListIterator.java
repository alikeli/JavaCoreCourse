package com.java.linkedList;

import java.util.ArrayList;
import java.util.List;

public class ListIterator {
    public static void main(String[] args) {

        String s = "Madam";
        List<Character> list = new ArrayList<>();
        for (char ch : s.toCharArray()) {
            list.add(ch);

        }
        System.out.println(list);

        java.util.ListIterator<Character> iterator = list.listIterator();
        java.util.ListIterator<Character> reverseIterator = list.listIterator(list.size());
        boolean isPalindrome = true;
        while (iterator.hasNext() && reverseIterator.hasPrevious()) {
            if (iterator != reverseIterator) {
                isPalindrome =  false;
                break;
            }

        }
        if (isPalindrome = true) {
            System.out.println(s + " is Palindrome");
        } else {
            System.out.println( s + " not Palindrome");
        }








    }
}
