
public class additioninLinkedList {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }

    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        //step 2
        newNode.next=head;
        head=newNode;
    }

    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }

    public void print(){  //O(n)
        Node temp=head;

        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("Null");
    }

    //insertion of LinkedList

    public void add(int idx, int data){

        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        Node temp=head;

        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }

        //i=idx-1  temp ->>prev
        newNode.next=temp.next;
        temp.next=newNode;
    }

    //removing LinkedList Element
    public int removeFirst(){
        if(size==0){
            System.out.println("LL is Empty");
            return Integer.MAX_VALUE;
        }
        else if(size==1){
            int val=head.data;

            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;

    }

    //removing last
    public int removeLast(){
        if(size==0){
            System.out.println("KL is Empty");
            return Integer.MAX_VALUE;

        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        //prev node: i=size-2
        Node prev=head;
        for(int i=0; i<size-2; i++){
            prev=prev.next;
        }
        int val=prev.next.data; //tail.data

        prev.next=null;
        tail=prev;
        size--;
        return val;
    }



    public static void main(String[]args){
        additioninLinkedList list1=new additioninLinkedList();
        list1.print();
        list1.addFirst(1);
        list1.print();

        list1.addFirst(2);
        list1.print();

        list1.addLast(6);
        list1.print();

        list1.add(2,5);
        list1.print();

        //System.out.println("Size of LinkedList: "+list1.size);
        list1.removeFirst();
        list1.print();

        list1.removeLast();
        list1.print();
        System.out.println("Size of LinkedList: "+list1.size);
    }

}
