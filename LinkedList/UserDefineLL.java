

public class UserDefineLL {

    public static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }        
    }
    public static class linkedlist {

        Node head = null;
        Node tail = null;
        int size = 0;
        //insert element
        void insertAtEnd(int val){
            Node temp = new Node(val);
           if(head==null){
            head = temp;
            

           }else{
            tail.next = temp;
        }
        tail = temp;
        size++;
        }
        void display(){
            Node temp = head;
            while(temp!=null) {
                System.out.print(temp.data+" -> ");
                temp = temp.next;
            }
            System.out.println();
        }
        // int size(){
        //     Node temp = head;
        //     int count = 0;
        //     while (temp!=null) {
        //         count++;
        //         temp = temp.next;
        //     }
        //     return count;
        // }
        void insertAtHead(int val){
            Node temp = new Node(val);
            if(head==null){
                //head = tail = temp;//this line same work
                insertAtEnd(val);// this line same work
            }else{
                temp.next = head;
                head = temp;
                size++;
            }
        }
        void insertAt(int idx, int val){
            Node t = new  Node(val);
            Node temp = head;
            
        if(idx == size){
            insertAtEnd(val);
            return;
         }
          else if(idx==0){
                insertAtHead(val);
                return;
            }
            else if(idx < 0 || idx > size){
                    System.out.println("Wrong  Index ");
                    return;
                }
            
        
            for(int i=0;i<=idx-1;i++){
                temp =temp.next;
                
            }
            t.next = temp.next;
            temp.next = t;
            size++;

        }
        int getAt(int idx){
            if(idx < 0 || idx > size){
                System.out.println("Wrong  Index ");
                return -1;
            }
            Node temp = head;
            for(int i=1;i<=idx;i++){
                temp = temp.next;
            }
            return temp.data;
        }

        void deletAt(int idx){
        if (idx==0){
            head = head.next;
            size--;
            return;
        } 
                
          
            Node temp = head;
            for(int i=1;i<=idx-1;i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            tail = temp;
            size--;
        }

        
    }

    public static void main(String[] args) {
        
        linkedlist ll = new linkedlist();
        ll.insertAtHead(21);
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.insertAtEnd(6);
        //ll.display();
        System.out.println();
        System.out.println("size of linkedlist is = "+ll.size);
        
        ll.insertAtEnd(12);
        //ll.display();
        ll.insertAtHead(34);
        //ll.display();
        ll.insertAt(3, 23);
       // ll.display();
        ll.insertAt(7 ,  11);
        //ll.display();  
        ll.insertAt(3, 100);
        ll.display();
        //System.out.println(ll.getAt(7));
        //System.out.println(ll.size);
        ll.deletAt(0);
        ll.display();
        System.err.println(ll.size);
        System.out.println(ll.tail.data);
     
    }

    
    
}
