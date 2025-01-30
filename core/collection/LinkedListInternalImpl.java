package core.collection;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedListInternalImpl<T> implements Iterable<T>{
    Node<T> head,current;
    private static class Node<T>{
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }

    public LinkedListInternalImpl(T data) {
        head = new Node<>(data);
    }

    @Override
    public Iterator<T> iterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements Iterator<T>{
        Node<T> node= head;
        @Override
        public boolean hasNext() {
            return node!=null;
        }

        @Override
        public T next() {
            if(!hasNext())
                throw new NoSuchElementException();
            Node<T> preNode = node;
            node = node.next;
            return preNode.data;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }

        public void add(T data){
            Node current = head;
            while (current.next!=null){
                current = current.next;
                current.next = new Node<>(data);
            }
        }

    }
}
