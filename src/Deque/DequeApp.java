package Deque;

import java.util.Deque;
import java.util.LinkedList;

public class DequeApp {

    public static void main(String[] args) {

        Deque<String> stack = new LinkedList<>();

        System.out.println(stack);

        stack.offerLast("Audy");
        stack.offerLast("Ari");
        stack.offerLast("Wiyono");

        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());

        Deque<String> queue = new LinkedList<>();
        queue.offerLast("Audy");
        queue.offerLast("Ari");
        queue.offerLast("Wiyono");

        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());

    }
}
