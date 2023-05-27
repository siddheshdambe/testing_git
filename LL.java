
//Working of Complete Linked List
public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size=0;
    }


    //    Working of a node (assigning value to node and pointing to next node
    private class Node{
        private int val;
        private Node next;

        public Node(int val){
            this.val=val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }


    //Inserting node to an empty list
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail==null){
            tail = head;                //Both the starting node and end node are the same node
        }
    //Increasing size of linked list
        size+=1;
    }

    // Inserting to end of list
    public void insertLast(int val){
        if(tail==null){                 //if list is empty
            insertFirst(val);           //call insert first node method
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size+=1;

    }

    //Insert node in between at given position
    public void insert(int val, int index){
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index>=size){
            insertLast(val);
            return;
        }

        Node temp = head;
        for(int i = 1;i<index;i++){
            temp = temp.next;
        }
        Node node = new Node(val,temp.next);
        temp.next=node;
        size++;

    }


    // Delete First Element of Linked List

    public void deleteFirst(){
//        int val = head.val;
        head = head.next;
        if (head.next == null){
            tail = head;
        }
        size--;
//        return val;
    }




    //Get any particular node
    public Node get(int index){
        Node node = head;
        for(int i=0;i<index;i++){
            node = node.next;
        }
        return node;

    }
    //Delete Last Element
    public void deleteLast(){
        if(size<=1){
            deleteFirst();
        }

        Node secondLast = get(size-2);
//        int val = tail.val;
        tail = secondLast;
        tail.next=null;
//        return val;
    }


    //Delete any given index
    public void delete(int index){
        if(index==size-1){
            deleteLast();
        }
        if(index==0){
            deleteFirst();
        }
        Node element = get(index-1);
//        int val = element.next.val;
        element.next=element.next.next;
//        return val;
    }

    //Find a value

    public Node getValue(int value){
        Node node = head;
        while(node!=null){
            if(node.val == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }



    //Displaying Linked List
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val + "---->");
            temp = temp.next;
        }
        System.out.println("END");
    }


}
