public class Searching_element {
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

    public static void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public void print(){
        if(head==null){
            System.out.println("LinkedList is Empty");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("Null");
    }
    public int itrSearch(int key){
        Node temp=head;
        int i=0;

        while(temp!=null){ //o(n)
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }

        //key not found 
        return -1;
    }
    public int helper(Node head, int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }

        int idx=helper(head.next, key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key){
        return helper(head, key);
    }
    public static void main(String[] args) {
        Searching_element LList=new Searching_element();
        LList.addFirst(1);
        LList.print();
        LList.addFirst(2);
        LList.print();
        LList.addFirst(3);
        LList.print();
        LList.addFirst(4);
        LList.print();
        LList.addFirst(5);
        LList.print();
        LList.addFirst(6);
        LList.print();

        // System.out.println(LList.itrSearch(5));
        // System.out.println(LList.itrSearch(6));
        // System.out.println(LList.itrSearch(10));

        System.out.println(LList.recSearch(5));
        System.out.println(LList.recSearch(3));
        System.out.println(LList.recSearch(10));
    }
}
