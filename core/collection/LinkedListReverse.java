package core.collection;

public class LinkedListReverse {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void append(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = new Node(data);
            return;
        }
        Node last = head;
        while(last.next!=null){
            last = last.next;
        }
        last.next = newNode;
    }

    public void reverse(){
        Node  prev = null;
        Node current = head;
        Node next = null;

        while(current !=null){
            next = current.next;
            current.next = prev;
            prev  = current;
            current = next;
        }
        head = prev;

    }

    public void printList(){
    Node current = head;
        while(current!=null){
            System.out.println(current.data+" ");
            current =current.next;
        }

    }

    public static void main(String[] args) {
        LinkedListReverse data = new LinkedListReverse();
        data.append(1);
        data.append(11);
        data.append(21);
        data.append(31);

        data.printList();
        data.reverse();
        data.printList();

    }

}
