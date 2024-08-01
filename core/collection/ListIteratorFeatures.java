package core.collection;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorFeatures {
    public static void main(String[] args) {
        // Create a list and add elements
        List<String> list = new ArrayList<>();
        list.add("Praneeth");
        list.add("Dhoni");
        list.add("Chandra");
        list.add("Mylife");

        // Obtain a ListIterator
        ListIterator<String> listIterator = list.listIterator();

        // hasNext() and next()
        System.out.println("Forward traversal:");
        while (listIterator.hasNext()) {
            System.out.println("Next element: " + listIterator.next());
        }

        // hasPrevious() and previous()
        System.out.println("\nBackward traversal:");
        while (listIterator.hasPrevious()) {
            System.out.println("Previous element: " + listIterator.previous());
        }

        // nextIndex() and previousIndex()
        System.out.println("\nNext and Previous indices:");
        while (listIterator.hasNext()) {
            System.out.println("Next index: " + listIterator.nextIndex());
            System.out.println("Element: " + listIterator.next());
        }

        while (listIterator.hasPrevious()) {
            System.out.println("Previous index: " + listIterator.previousIndex());
            System.out.println("Element: " + listIterator.previous());
        }

        // add(E e)
        System.out.println("\nAdding elements:");
        listIterator = list.listIterator(); // reset iterator to the start
        listIterator.next(); // move to the first element
        listIterator.add("Passion");
        System.out.println("List after adding 'Passion': " + list);

        // set(E e)
        System.out.println("\nSetting elements:");
        listIterator.next(); // move to the second element
        listIterator.set("Goals");
        System.out.println("List after setting second element to 'Goals': " + list);

        // remove()
        System.out.println("\nRemoving elements:");
//        listIterator.next(); // move to the third element
        listIterator.remove(); // remove the third element
        System.out.println("List after removing the third element: " + list);

        // Correct usage of remove
        listIterator = list.listIterator(); // reset iterator to the start
        while (listIterator.hasNext()) {
            String element = listIterator.next();
            if ("F".equals(element)) {
                listIterator.remove(); // remove element "F"
            }
        }
        System.out.println("List after removing 'F': " + list);
    }
}
