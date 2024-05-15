package quiz2restu;

public class Main {
    public static void main(String[] args){
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.addFirst(45);
        dll.addFirst(10);
        dll.addFirst(10);
        dll.addFirst(15);
        dll.addFirst(150);
        dll.print();
        dll.deleteFirst();
        dll.print();
        dll.printFromTail();

        //lanjutkan dengan memanggil method addLast, deleteLast, printFromTail
        dll.addLast(80);
        dll.addLast(70);
        dll.printFromTail();
        dll.print();

        //lanjutkan dengan memanggil method merge, split
        DoubleLinkedList dll2 = new DoubleLinkedList();
        dll2.addFirst(100);
        dll2.addFirst(200);
        System.out.println("List 1 sebelum merge:");
        dll.print();
        System.out.println("List 2 sebelum merge:");
        dll2.print();

        merge(dll, dll2);
        System.out.println("List setelah merge:");
        dll.print();
        
    }
    //No. 3 Kode Ganjil
    public static void merge(DoubleLinkedList dll1,
            DoubleLinkedList dll2){
        if(dll1.head == null){
            dll1.head = dll2.head;
            dll1.tail = dll2.tail;
        }else if(dll2.head != null){
            dll1.tail.n = dll2.head;
            dll2.tail.p = dll1.tail;
            dll1.tail = dll2.tail;
        }
        dll2.head = dll2.tail = null;
    }    
    //No. 3 Kode Genap
    public static void split(DoubleLinkedList dll){
        //ex: 2,3,4,34,2,3,45,4 (original list)
        //list 1-> 2,3,4,34
        //list 2-> 2,3,45,4
    }
}
