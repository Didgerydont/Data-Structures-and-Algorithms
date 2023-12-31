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


        // removeFirst
        System.out.println("\n***********");
        System.out.println("removefirst used to remove the newly added value 22 from the first position");

        myLinkedList.removeFirst();
        System.out.println("\nLinked List after first entry is removed:");
        myLinkedList.printList();

        // get
        System.out.println("\n***********");
        System.out.println("get used to return a Node at a given index");

        System.out.println("\nLinked List as it stands currently:");
        myLinkedList.printList();
        System.out.println("\nFind Node at Index 2 : " + myLinkedList.get(1).value + "\n");
        myLinkedList.printList();

        // set
        System.out.println("\n***********");
        System.out.println("set used to edit the Node at a given index. It takes two arguments, the first is index, the second is value");

        System.out.println("\nLinked List as it stands currently:");
        myLinkedList.printList();
        System.out.println("Set the Node at Index 1 with value 4 :");
        myLinkedList.set(1, 4);
        System.out.println("Print list with new value updated using set method");
        myLinkedList.printList();

        // insert
        System.out.println("\n***********");
        System.out.println("Insert used to insert a Node at a given index. It takes two arguments, the first is index, the second is value");

        System.out.println("\nLinked List as it stands currently:");
        myLinkedList.printList();
        System.out.println("Insert the Node at Index 1 with value 666 :");
        myLinkedList.insert(1, 666);
        System.out.println("Print list with new value added using insert method");
        myLinkedList.printList();

        // remove
        System.out.println("\n***********");
        System.out.println("Remove used to removed a Node at a given index. It takes one argument, the index of the node to be removed");

        System.out.println("\nLinked List as it stands currently:");
        myLinkedList.printList();
        System.out.println("Remove the Node at Index 1 with value 666 :");
        myLinkedList.remove(1);
        System.out.println("Print list after index 1 has been deleted using remove method");
        myLinkedList.printList();


        // Reverse
        System.out.println("\n***********");
        System.out.println("Reverse used to reverse the order of the given linked list");

        System.out.println("\nLinked List as it stands currently:");
        myLinkedList.printList();
        System.out.println("Reverse the list:");
        myLinkedList.reverse();
        System.out.println("Print the reversed list");
        myLinkedList.printList();
    }

}

