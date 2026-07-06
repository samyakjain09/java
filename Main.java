class Node{
    int data;
    Node next;

    Node(int data1){
        this.data=data1;
        this.next=null;
    }
}
public class Main {
    public static Node arrToString(int[] arr,Node head){
        Node mover=head;
        for(int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i]);
            mover.next=temp;
            mover=temp;
        }

        return head;
    }
    public static int printLL(Node y){
        int count=0;
        while(y!=null){
            System.out.println(y.data);
            count++;
            y=y.next;
        }
        return count;
    }
    public static Boolean Search(Node head,int target){
        Node temp=head;
        while(temp!=null){
            if(temp.data==target){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
    public static Node DeleteHead(Node head){
        if(head==null)return head;
        Node temp=head.next;

        return temp;
    }

    public static Node DeleteTail(Node head){
        Node temp=head;
        if(temp==null || temp.next==null)return temp;
        while(temp!=null){
            if(temp.next.next==null){
                temp.next=null;
            }
            temp=temp.next;
        }

        return head;
    }
    public static void main(String[] args){
        int[] arr={257,865,6986,54,48};
        Node head=new Node(arr[0]);
        Node y=arrToString(arr,head);
        DeleteHead(head);
        printLL(DeleteTail(head));
    }
}
