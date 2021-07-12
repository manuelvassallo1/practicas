package LinkedListTypes.DoublyLinkedList;

public class DoublyLinkedList {

	//Initially, heade and tail is set to null
	Node head, tail = null;

	//add a node to the list
	public void addNode(int item) {
		//Create a new node
		Node newNode = new Node(item);

		//if list is empty, head and tail points to newNode
		if (head == null) {
			head = tail = newNode;
			//head's previous will be null
			head.previous = null;
			//tail's next will be null
		} else {
			//add newNode to the end of list. tail->next set to newNode
			tail.next = newNode;
			//newNode->previous set to tail
			newNode.previous = tail;
			//newNode becomes new tail
			tail = newNode;
			//tail's next point to null
		}
		tail.next = null;
	}

	//print all the nodes of doubly linked list
	public void printNodes() {
		//Node current will point to head
		Node current = head;
		if (head == null) {
			System.out.println("Doubly linked list is empty");
			return;
		}
		System.out.println("Nodes of doubly linked list: ");
		while (current != null) {
			//Print each node and then go to next.
			System.out.println("Nodo actual: " + current.item
					+ ", Nodo previo: " + (current.previous == null ? "No tiene, es el nodo Head" : current.previous.item)
					+ ", Nodo siguiente: " + (current.next == null ? "No tiene, es el nodo Tail" : current.next.item));

			current = current.next;
		}
	}
}

