public class SingleLinkedList {
    public SingleLinkedList(){
        this.head = null;
    }

    public class Node {

        int data;
        Node next;


        public Node(int data){
            this.data = data;
        }
    }
    Node head;




    public void addFirst(int value){
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int value){
        Node newNode = new Node(value);
        Node currentNode = head;
        while (currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }


    public void addAtIndex(int index, int value){
        Node newNode = new Node (value);
        Node currentNode = head;
        for (int i = 0; i < index -1 ; i++) { // -1 sørger for at jeg får fat i noden FØR mit index.
            currentNode = currentNode.next;
        }

        newNode.next = currentNode.next;
        currentNode.next = newNode;
    }


    public void removeFirst(){
        head = head.next;
    }

    public void removeLast(){
        Node currentNode = head;
        while (currentNode.next.next != null) { // jeg skal ikke have fat i den sidste, men i den før den sidste. Det kan give en nullPointer hvis der kun er en node
            currentNode = currentNode.next;
        }
        currentNode.next = null;

    }

    public void removeAtIndex(int index){
        Node currentNode = head;
        for (int i = 0 ; i < index - 1 ; i++){
            currentNode = currentNode.next;
        }
        currentNode.next = currentNode.next.next;
    }

    public void getAtIndex(int index) {
        Node currentNode = head;
        for (int i = 0 ; i < index ; i ++) {
            currentNode = currentNode.next;
        }

        System.out.println("The node at index " + index + " has the value " + currentNode.data);
// den skal returnere elementet, ikke soute.
    }

    public boolean isEmpty(){
        return head == null;
    }

    public int size() {
        Node currentNode = head;
        int i = 1;
        while (currentNode.next != null){
            currentNode = currentNode.next;
            i++;
        }
        return i;

        //mangler at tjekke for hvis head er null.
    }


    public void printLinkedList(){
        Node currentNode = head;

        while (currentNode != null){
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }

}
