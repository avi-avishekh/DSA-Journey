package LinkedList;
import java.util.LinkedList;

public class basicLinkedlist {
    
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;

    //Methods
    // add()
    // remove()
    // print()

    // search()

    public static void main(String[] args) {
        LinkedList ll=new LinkedList();

        ll.add(2);
        ll.add(20);
        ll.add(30);

        System.out.println(ll);
    }
}
