package quiz2restu;

public class DoubleLinkedList {
    Node head, tail;
    int size;
    
    DoubleLinkedList(){
        head = tail = null;
        size=0;
    }
    boolean isEmpty(){
        return size==0;
    }
    void addFirst(int data){
        Node nu = new Node(data);
        if(isEmpty()){
            head = tail = nu;
        }else{
            nu.n = head;
            head.p = nu;
            head = nu;
        }
        size++;
    } 
    void deleteFirst(){
        head = head.n;
        head.p = null;
        size--;
    }
    void print(){
        Node tmp = head;
        while(tmp!=null){
            System.out.print(""+tmp.data+"\t");
            tmp = tmp.n;
        }
        System.out.println("");
    } 
    //Soal No 1 Kode Ganjil
    void addLast(int data){
        if (isEmpty()){
            head = new Node(null, data, null); 
        } else{ 
            Node newNode = new Node(null, data, head); 
            head.p = newNode; 
            head = newNode; 
        }
        size++;
    }
    //Soal No 1 Kode Genap
    void deleteLast(){
       
    }
    //Soal No 2 Kode Ganjil dan Genap
    void printFromTail(){
        if (!isEmpty()){
            Node tmp = tail;
            while (tmp !=null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.p;
            }
            System.out.println("\nberhasil diisi");
        } else {
            System.out.println("Linked Lists Kosong");
        }
    }
    
}
