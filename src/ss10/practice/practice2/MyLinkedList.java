package ss10.practice.practice2;

import javax.xml.soap.Node;

public class MyLinkedList {
    private int numNodes;
    private Node head;//Node và E là kiểu DL

    public MyLinkedList(Object data) {
        head = new Node(data);
        numNodes++;
    }
    private class Node {
        private Node next;
        private Object data;
        public Node(Object data){
            this.data = data;
        }

        public Object getData() {
            return data;
        }
    }
    public void add(int index, Object data){
        Node temp = head;
        Node holder;
        for (int i = 0; i < index -1 && temp.next!=null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }
    public void addFirst(Object data){
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }

}
