public class CircularSingleLinkedList {

    public CircularSingleLinkedList(){
        this.head = null;
        this.tail.next = head;
    }


    public class Node {
        int data;
        Node next;

        public Node (int data){
            this.data = data;
        }

    }

    Node head;
    Node tail;

    public void addFirst(int data){
        Node newNode = new Node(data);
        tail.next = newNode;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        Node currentNode = head;
        while (currentNode.next != tail){
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
        tail = newNode;
        tail.next = head;
    }

    public void addAtIndex(int data, int index){
        //så nåede jeg ikke videre :(

    }



}
