public class FindtheNumberCycleLinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    void findTheNumber(Node head){
    Node slow = head;
    Node fast = head;
    while (fast!=null) {
        slow = slow.next;
        fast = fast.next.next;
        if(slow == fast)
            break;
        

        Node temp = head;
    while(temp!=slow){
        temp = temp.next;
        slow = slow.next;
        System.out.println(" Cycle Linkdlist Position index :"+slow.data);
        return ;
    } 
}
   }
    
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = c;

         FindtheNumberCycleLinkedList ll = new FindtheNumberCycleLinkedList();
         ll.findTheNumber(a);



    }
}
