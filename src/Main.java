public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    public void run(){
        SingleLinkedList list = new SingleLinkedList();
        list.addFirst(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);

        System.out.println(list.size());

    }
}