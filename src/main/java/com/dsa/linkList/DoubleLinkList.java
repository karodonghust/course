package com.dsa.linkList;

public class DoubleLinkList<T> {

    private Node head;
    private Node tail;
    private Node foot;
    private int length;

    private class Node{
        private T data;
        private Node next;
        private Node prev;

        public Node(T data){
            this.data = data;
        }
    }

    public void DoubleLinkList(){
        this.head  = new Node(null);
        this.tail = head;
        this.length = 0;
    }

    public void DouubleLinkList(T data){
        this.head  = new Node(data);
        this.tail = head;
        this.length = 1;
    }

    public  boolean isEmpty(){
        return length == 0;
    }

    public void add(T data){
        if(isEmpty()){
            head.data = data;
            length++;
        } else {
            foot = new Node(data);
            foot.prev = tail;
            tail.next = foot;
            tail = foot;
            length++;
        }
    }

    public void addAfter(T data, T insertData){
        foot = head;
        while (foot != null){
            if(foot.data.equals(data)){
                Node temp = new Node(insertData);
                temp.prev = foot;
                temp.next = foot.next;
                foot.next.prev = temp;
                foot.next = temp;
                if(temp.next == null){
                    tail = temp;
                }
                length++;
                break;
            }
            foot = foot.next;
        }
    }

    public void remove(T data){
        foot = head;
        while (foot != null){
            if(foot.data.equals(data)){
                foot.prev.next = foot.next;
                if(foot.next == null){
                    tail = foot.prev;
                } else {
                    foot.next.prev = foot.prev;
                }
                foot.next = null;
                foot.prev = null;
                break;
            }
            foot = foot.next;
        }
    }


}
