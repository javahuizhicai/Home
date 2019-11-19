package ceshi;

public class LinkedListMeCreate <E>{
    private Node root = new Node();
    private Node next;
    private Node last;
    private int size;

    public int size() {
        return size;
    }

    public void add(E e) {
        next = new Node(e);
        if (size == 0) {
            root.setNext(next);
            last = next;
            size++;
        } else {
            last.setNext(next);
            last = next;
            size++;
        }
    }

    public Object get(int index) {
        checkIndex(index);
        Node node = root.getNext();
        for (int i = 0; i < index; i++) {
            node = node.getNext();
        }
        return node.getData();

    }

    public void set(int index, E e) {
        checkIndex(index);
        Node node = root.getNext();
        for (int i = 0; i < index; i++) {
            node = node.getNext();
        }
        node.setData(e);

    }

    /**
     * remove节点
     */
    public void remove(int index) {
        checkIndex(index);
        Node node = root.getNext();
        if (index != 0) {
            for (int i = 0; i < index; i++) {
                node = node.getNext();
            }
            Node node1 = root.getNext();
            for (int i = 0; i < index - 1; i++) {
                node1 = node1.getNext();
            }

            if (index != size - 1) {
                Node node2 = node.getNext();
                node1.setNext(null);
                node1.setNext(node2);
            } else {
                node1.setNext(null);
            }
            node.setData(null);
            node.setNext(null);
        } else {
            Node node4 = root.getNext();
            Node node5 = node4.getNext();
            root.setNext(null);
            root.setNext(node5);
            node4.setNext(null);
        }
        size--;
    }


    public void insert(int index, E e) {
        checkIndex(index);

        Node node = root.getNext();
        for (int i = 0; i < index; i++) {
            node = node.getNext();
        }
        Node node1 = new Node(e);
        if (index == 0) {
            root.setNext(null);
            root.setNext(node1);
            node1.setNext(node);

        } else {
            Node node2 = root.getNext();
            for (int i = 0; i < index - 1; i++) {
                node2 = node2.getNext();
            }
            node2.setNext(null);
            node2.setNext(node1);
            node1.setNext(node);
        }
        size++;
    }


    public void back() {
        int num = size - 1;
        Node node = root.getNext();
        for (int i = 0; i < num; i++) {
            node = node.getNext();
        }
        last = node;
        if (num > 0) {
            for (int j = 0; j < num; j++) {
                Node node1 = root.getNext();
                for (int i = 0; i < num - j - 1; i++) {
                    node1 = node1.getNext();
                }

                node1.setNext(null);
                last.setNext(node1);
                last = node1;
            }
            num--;
        }
        root.setNext(null);
        root.setNext(node);

    }


    public void addfor(E e) {
        next = new Node(e);
        if (size == 0) {
            root.setNext(next);
            last = next;
            size++;
        } else {
            last.setNext(next);
            last = next;
            last.setNext(null);
            last.setNext(root.getNext());
            size++;
        }
    }

    /**
     * 添加双向链表
     */
    public void duladd(E e) {
        next = new Node(e);
        if (size == 0) {
            root.setNext(next);
            last = next;
            size++;
        } else {
            last.setNext(next);
            next.setBefor(last);
            last = next;
            size++;
        }
    }


    private void checkIndex(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
        }
    }

    private String outOfBoundsMsg(int index) {
        return "Index: " + index + ", Size: " + size;
    }

}
