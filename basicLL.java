
public class basicLL {


    public static void displayr(Node head){
        if(head==null){
            return;
        }
        System.out.print(head.data+" ");
        display(head.next);
    }

    public static void displayrev(Node head){
        if(head==null){
            return;
        }
        displayrev(head.next);
        System.out.print(head.data+" ");
    }

    public static  void display(Node head) {
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp = temp.next;    
        }
        
    }

    public static class Node{
        int data;//value
        Node next;//addres of next node

        Node(int data){
            this.data = data;

        }

    }
    public static void main(String[] args) {
        Node a = new Node(9);
        Node b = new Node(4);
        Node c = new Node(7);
        Node d = new Node(3);

        

        // System.out.println(ll);
        //  System.out.println(a.next);
        //  System.out.println(a);
        //  System.out.println(b);
        //  System.out.println(c);
        //  System.out.println(d);

        a.next = b;
        b.next = c;
        c.next = d;
        
        display(a);
        System.out.println();
        displayr(a);
        System.out.println();
        displayrev(a);
        // d.next = c;
        // System.out.println(b.data);//4
        // System.out.println(c.data);//7
        // System.out.println(d.data);//3
        // System.out.println(a.data);//9
        // System.err.println("+++++++++++++++++++++++++++++++++++");
        // System.out.println(a.data);
        // System.out.println(a.next.data);
        // System.out.println(a.next.next.data);
        // System.out.println(a.next.next.next.data);
        // System.out.println("+++++++++++++++++++++++++++");

        // Node temp = a;
        // for(int i=1;i<=4;i++){
        //     System.out.print(temp.data+" ");
            
        // }
        // Node tem = a;
        // while (tem!=null) {// printing the list
        //     System.err.println(tem.data);
        //     tem = tem.next;    
        // }


    }
    
}
