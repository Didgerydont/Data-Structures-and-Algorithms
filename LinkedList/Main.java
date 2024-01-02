package LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(1);

        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        System.out.println("\nLinked List:");
        myLinkedList.printList();

        // Use Append method

        System.out.println("\n***********");
        System.out.println("Append int 2 to the list and re-run");

        System.out.println("Appending int 2...");
        myLinkedList.append(2);

        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        System.out.println("\nLinked List:");
        myLinkedList.printList();


        // removeLast
        System.out.println("\n***********");
        System.out.println("Use removeLast method to remove the last node");
        System.out.println("Append numbers 3, 4 and 5 to list as an example");

        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.append(5);

        System.out.println("\nLinked List:");
        myLinkedList.printList();

        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        System.out.println("\nremoveLast()");
        myLinkedList.removeLast();
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        System.out.println("\nremoveLast()");
        myLinkedList.removeLast();
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        System.out.println("\nremoveLast()");
        myLinkedList.removeLast();
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        System.out.println("\nLinked List:");
        myLinkedList.printList();

        // prepend
        System.out.println("\n***********");
        System.out.println("Use prepend method on the list");
        System.out.println("Prepend 22 to the start of the list. ");

        myLinkedList.prepend(22);
        System.out.println("\nLinked List:");
        myLinkedList.printList();
    }

}

