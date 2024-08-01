package core.collection;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;

public class LinkedListFeatures {

	public static void main(String[] args) {

		/***
		 * LinekdList as List
		 */
		List<String> linkedList = new LinkedList<>();

		linkedList.add("Praneeth");
		linkedList.add("Dhoni");
		linkedList.add("Germany");
		linkedList.add("India");
		ListIterator<String> listItr = linkedList.listIterator();

		while (listItr.hasNext()) {
			String s = listItr.next();
			System.out.println(s);
		}

		listItr = linkedList.listIterator();
		listItr.next();
		listItr.remove();
		System.out.println("List " + linkedList);

		/**
		 * LinkedList as Queue
		 */
		Queue<String> queuelinkedList = new LinkedList<String>();

		queuelinkedList.add("George");
		queuelinkedList.add("Stev");
		queuelinkedList.add("Markus");
//		add/ offer
//		remove/poll
//		peek() /get
		queuelinkedList.offer("Chirs");
		queuelinkedList.offer("Michel");

		System.out.println("LinkedList with implements Queue" + queuelinkedList);
		System.out.println(queuelinkedList.peek());
		System.out.println("LinkedList with implements Queue after Peek " + queuelinkedList);
		System.out.println(queuelinkedList.poll());
		System.out.println("LinkedList with implements Queue after Poll " + queuelinkedList);
		System.out.println(queuelinkedList.remove());
		System.out.println("LinkedList with implements Queue after remove " + queuelinkedList);

		
		/**
		 * Linkedlist as Dequeue
		 */
		Deque<String> dequeueLinkedList = new LinkedList<>();
		
		dequeueLinkedList.add("Germany");
		dequeueLinkedList.push("India");
		System.out.println("LinkedList with implements DeQueue after Add & Push "+dequeueLinkedList);
		System.out.println("Elements method picks the first element on top: " + dequeueLinkedList.element());
		System.out.println("LinkedList with offer method to add "+dequeueLinkedList.offer("America"));
		System.out.println(dequeueLinkedList.pop());
		System.out.println(dequeueLinkedList);
		System.out.println(dequeueLinkedList.poll());
		System.out.println(dequeueLinkedList);
	}

}
