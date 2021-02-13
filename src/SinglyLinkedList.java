public class SinglyLinkedList {
    Node head;
    public SinglyLinkedList(){
        head = null;
    }

    public void insertAtBeginning(Node newnode){
        newnode.next = head;
        head = newnode;
    }

    public void deleteFromBeginning(){

        head = head.next;
    }

    public void insertAtPosition(int pos, Node newnode){
        Node temp = head;
        for(int i=0; i<pos-1; i++){
            temp = temp.next;
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }

    public void deleteAtPosition(int pos){
        if(head==null){
            System.out.println("No Element Found");
        }
        else {
            Node current = head;
            Node prev = null;
            for (int i = 0; i <= pos - 1; i++) {
                prev = current;
                current = current.next;
                if(current==null){
                    head = null;
                }
                else{
                    prev.next = current.next;
                }
            }
        }
    }

    public void insert(Node newnode){
        if(head == null){
            head = newnode;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}

class SinglyLinkedListMain{

    public static void main(String[] args){
        SinglyLinkedList obj = new SinglyLinkedList();
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        obj.insert(n1);
        obj.insert(n2);
        obj.insert(n3);
        obj.insertAtPosition(0, n1);
        obj.display();

    }
}
