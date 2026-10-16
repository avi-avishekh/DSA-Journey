package LinkedList;
public class add_linkedList {
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

        public void addFirst(int data){

            //step 1-
            Node newNode=new Node(data);

            if(head==null){
                head=tail=newNode;
                return;
            }
            //step 2-
            newNode.next=head;

            //step 3
            head=newNode;

        }

        //add in last
        public void addLast(int data){
            Node newNode= new Node(data);

            if(head==null){
                head=tail=newNode;
                return;
            }
            tail.next=newNode;
            tail=newNode;
        }

        public void print(){
            if(head==null){
                System.out.println("Linked List is Empty..");
                return;
            }
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.println("Null");
        }
    


    
    public static void main(String[] args) {
        add_linkedList list = new add_linkedList();

        list.addFirst(10);
        list.print();

        list.addLast(20);
        list.print();

        list.addLast(30);
        list.print();

        list.addFirst(5);
        list.print();

        list.addLast(35);
        list.print();

        
    }
}


