public class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
    }
}

class LinkedList{
    Node head;
    public LinkedList(){
        this.head = head;
    }
    public void insert(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        else{
            Node curr = head;
            while(curr.next!=null){
                curr=curr.next;
            }
            curr.next=newNode;
        }
    }
    public void delete(int data){
        if(head==null){
            return;
        }
        if(head.data == data){
            head=head.next;
            return;
        }
        Node prev = null;
        Node curr = head;
        while(curr!=null){
            if(curr.data == data){
                prev.next = curr.next;
                return;
            }
            prev=curr;
            curr=curr.next;
        }
    }
    public boolean search(int data){
        Node curr = head;
        while(curr!=null){
            if(curr.data == data){
                return true;
            }
            curr=curr.next;
        }
        return  false;
    }
    public int size(){
        int count = 0;
        Node curr = head;
        while(curr!=null){
            count++;
            curr = curr.next;
        }
        return count;
    }
    public void print() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

}
