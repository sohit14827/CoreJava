public class DeleteTheMiddleNode {

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;

        }
    }


    public static class linkedList{
        Node head = null;
        Node tail = null;

        void insertElement(int data){
            Node temp = new Node(data);
            if(head == null){
                head = tail = temp;
            }else{
                temp.next = head;
                head = temp;
            }

        }void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" -> ");
                temp = temp.next;
                }
                System.out.println();

        }

        void deleteMiddle(){
            if(head.next==null){
                return;
            }
            Node  slow = head;
            Node  fast = head;
            while(fast.next.next!=null && fast.next.next.next!=null){
                slow = slow.next;
                fast = fast.next.next;
            }
            slow.next = slow.next.next;
            return;
        }


    }

    public static void main(String[] args) {
        linkedList ll = new  linkedList();
        ll.insertElement(20);
        ll.insertElement(30);
         ll.insertElement(40);
        ll.insertElement(50);
        ll.insertElement(60);
        ll.display();

        ll.deleteMiddle();
        ll.display();
    }
    
}
