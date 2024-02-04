public class DoublyLinkedList {
    public DoublyLinkedList(){
        head = null;
    }
    public class Node {
        private int value;
        Node next;
        Node prev;

        public Node (int value){
            this.value = value;
        }
    }


    Node head;



    public void addFirst(int value){
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;

    }


    public void addlast(int value){
        Node newNode = new Node(value);
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
        newNode.prev = currentNode;
    }


    public void addAtIndex(int index, int value){
        Node newNode = new Node(value);
        Node currentNode = head;

        for (int i = 0 ; i < index - 1 ; i ++){ // -1 sørger for at jeg får fat i noden FØR mit index.
            currentNode = currentNode.next;
        }

        newNode.next = currentNode.next;
        currentNode.next = newNode;
        newNode.prev = currentNode;
        newNode.next.prev = newNode;
    }

    public void addAtIndex2(int index, int value){
        Node newNode = new Node(value);
        Node currentNode = head;

        for (int i = 0 ; i < index; i ++){ // gør det samme, men tager fat i den node der er sat som index. Hvad er smartest?
            currentNode = currentNode.next;
        }

        currentNode.prev.next = newNode;
        newNode.prev = currentNode.prev;
        newNode.next = currentNode;
        currentNode.prev = newNode;

    }


    public void removeFirst(){
        head = head.next;
        head.prev = null; // peger den tidligere heads next ikke stadig på den nye head?  Skal det fjernes eller er det ligegyldigt?
    }

    public void removeLast(){
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
            // her tager jeg rent faktisk fat i den sidste der skal slettes, i modsætning til single linked list
            // jeg kunne godt bruge next.next som i single linked list, men det her er vidst mere korrekt
        }
        currentNode.prev.next = null;
        currentNode.prev = null;
    }



    public void removeAtIndex(int index){
        Node currentNode = head;
        for (int i = 0 ; i < index ; i++) {
            currentNode = currentNode.next;
        }

        currentNode.next.prev = currentNode.prev;
        currentNode.prev.next = currentNode.next;
    }


    public Node get(int index){
        Node currentNode = head;
        for (int i = 0 ; i < index ; i++) {
            currentNode = currentNode.next;
        }
        return currentNode;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public int size(){
        int size = 1;
        for(Node currentNode = head ; currentNode.next != null ; currentNode = currentNode.next){
            size ++;
        }
        return size;

    }







}