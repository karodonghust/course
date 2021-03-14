package com.dsa.linkList;


public class SingleLinkList<T> {

    private int foot;
    private int count;
    private Node root;
    private int size;

    private class Node {
        private T data;
        private Node next;

        public Node(T data) {
            this.data = data;
        }

        private void addTail(T data) {
            if (this.next == null) {
                this.next = new Node(data);
            } else {
                this.next.addTail(data);
            }
        }

        private void addHead(T data) {
            Node node = new Node(data);
            node.next = SingleLinkList.this.root;
            SingleLinkList.this.root = node;
        }

        public void remove(Node previous, int index) {
            if (SingleLinkList.this.foot++ == index) {
                previous.next = this.next;
                this.next = null;
                SingleLinkList.this.count--;
                return;
            } else {
                this.next.remove(this, index);
            }
        }

        public void remove(Node previous, T data) {
            if (this.data.equals(data)) {
                previous.next = this.next;
                this.next = null;
                SingleLinkList.this.count--;
                return;
            } else {
                if (this.next != null) {
                    this.next.remove(this, data);
                } else {
                    return;
                }
            }
        }

        public void replace(T oldData, T newData) {
            if (this.data.equals(oldData)) {
                this.data = newData;
            } else {
                this.next.replace(oldData, newData);
            }
        }

        public void replace(int index, T newData) {
            if (SingleLinkList.this.foot++ == index) {
                this.data = newData;
            } else {
                this.next.replace(index, newData);
            }
        }

        public T get(int index) {
            if (SingleLinkList.this.foot++ == index) {
                return this.data;
            } else {
                return this.next.get(index);
            }
        }

        public boolean contains(T data) {
            if (this.data.equals(data)) {
                return true;
            } else {
                if (this.next == null) {
                    return false;
                } else {
                    return this.next.contains(data);
                }
            }
        }

    }

    public SingleLinkList(int size) {
        this.size = size;
    }

    public boolean isEmpty() {
        if (count == 0 || this.root == null) {
            return true;
        } else {
            return false;
        }
    }

    public int size() {
        return this.count;
    }

    public void add(T data) {
        if (this.isEmpty()) {
            this.root = new Node(data);
        } else {
            this.remove(data);
            if (this.size == this.count) {
                this.remove(this.count - 1);
                this.root.addHead(data);
            } else {
                this.root.addHead(data);
            }
        }
        this.count++;
    }

    public void remove(int index) {
        if (this.isEmpty()) {
            return;
        }
        if (index < 0 || this.count <= index) {
            return;
        }
        if (index == 0) {
            Node temp = this.root;
            this.root = this.root.next;
            temp.next = null;
            this.count--;
            return;
        } else {
            this.foot = 0;
            this.root.remove(this.root, index);
        }
    }

    public void remove(T data) {
        if (this.isEmpty()) {
            return;
        }
        if (this.root.data.equals(data)) {
            Node temp = this.root;
            this.root = this.root.next;
            temp.next = null;
            this.count--;
            return;
        } else {
            this.root.remove(this.root, data);
        }
    }

    public void replace(int index, T newData) {
        if (this.isEmpty()) {
            return;
        }
        if (index < 0 || this.count <= index) {
            return;
        }
        this.foot = 0;
        this.root.replace(index, newData);
    }

    public void replace(T oldData, T newData) {
        if (this.isEmpty()) {
            return;
        }
        this.root.replace(oldData, newData);
    }

    public T get(int index) {
        if (this.isEmpty()) {
            return null;
        }
        this.foot = 0;
        return this.root.get(index);
    }

    public boolean contains(T data) {
        if (this.isEmpty()) {
            return false;
        }
        return this.root.contains(data);
    }

    public Object[] toArray() {
        if (this.isEmpty()) {
            return null;
        }
        int count = this.count;
        Object[] retVal = new Object[count];
        for (int i = 0; i < count; i++) {
            retVal[i] = this.get(i);
        }

        return retVal;
    }


}
