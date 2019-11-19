package ceshi;

public class Node {
    private Object data; // 数据域
    private Node next; // 下一个节点
    private Node befor; // 上一个节点

    public Node() {

    }

    public Node(Object data) {
        super();
        this.data = data;
    }

    public Node getBefor() {
        return befor;
    }

    public void setBefor(Node befor) {
        this.befor = befor;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
