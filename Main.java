class Node{
        int data;
        Node next;

        Node(int data1){
            this.data=data1;
            this.next=null;
        }

    }

public class Main {
    public static Node ArrToLL(int[] arr){
        Node y= new Node(arr[0]);
        Node mover=y;

        for(int i=0;i<arr.length;i++){
            Node temp=new Node( arr[i]);
            mover.next=temp;
            mover=temp;
        }
        System.out.println(y);
        return y;
    }
    public static void main(String[] args) {
        int[] arr={289,8,54,74,4};
        ArrToLL(arr);
        System.out.println();
    }
}