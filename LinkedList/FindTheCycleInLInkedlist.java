

public class FindTheCycleInLInkedlist {

 boolean FindCycle(Node head){
    if(head==null || head.next == null) return false;
    Node slow = head;
    Node fast = head;

    while(fast!=null){
        slow = slow.next;
        fast = fast.next.next;
        if(fast == slow)
        //System.out.println("Cycle exist");
        return true;
    }

   //System.out.println("Cycle does not exist");
    return false;

 }

    public static class  Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }

    }
    public static void main(String[] args) {
        // Case 1
        Node a = new Node(4);
        Node b = new Node(5);
        Node c = new Node(8);
        Node d = new Node(12);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = b;

        //Casse 2

        Node e = new Node(1);
        Node f = new Node(2);
        e.next = f;
        f.next = e;

        //Case 3
        Node g= new Node(90);
        g.next  = null;
       
        FindTheCycleInLInkedlist Find = new FindTheCycleInLInkedlist();
        System.out.println(Find.FindCycle(a));

        boolean CycleFind = Find.FindCycle(a);

        if(CycleFind){
           System.out.println("cycle is exist ");
        }else{
            System.out.println("cycle does not exist");

        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        System.out.println(Find.FindCycle(e));
        System.out.println("==========");
        System.out.println(Find.FindCycle(g));
        
        
    }
}
