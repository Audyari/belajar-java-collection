package ProblemSolving.TTT.AbstractCollection;

import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.LinkedList;

public class bikinQueueManual<T> extends AbstractQueue<T> {
    private LinkedList<T> queue;

    public bikinQueueManual() {
        queue = new LinkedList<>();
    }

    @Override
    public Iterator<T> iterator() {
        return queue.iterator();
    }

    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public boolean offer(T element) {
        return queue.offer(element);
    }

    @Override
    public T poll() {
        return queue.poll();
    }

    @Override
    public T peek() {
        return queue.peek();
    }
}