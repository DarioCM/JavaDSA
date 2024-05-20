package org.example;

import java.util.LinkedList;

public class PalindromeStackQueue {

    public static void main(String[] args) {
        System.out.println(checkForPalindrome("abccba"));
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        System.out.println(checkForPalindrome("I did, did I?"));
        System.out.println(checkForPalindrome("hello"));
        System.out.println(checkForPalindrome("Don't nod"));
    }

    public static boolean checkForPalindrome(String string) {

        LinkedList<Character> stack = new LinkedList<>();
        LinkedList<Character> queue = new LinkedList<>();
        string = string.toLowerCase();

        for (var c : string.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                queue.addLast(c);
                stack.push(c);
            }
        }

        //queue.forEach(c -> System.out.println(c));
        //System.out.println("----");
        //stack.forEach(c -> System.out.println(c));

        while (!stack.isEmpty()) {
            if (!stack.pop().equals(queue.removeFirst())) {
                return false;
            }
        }


        return true;
    }
}
