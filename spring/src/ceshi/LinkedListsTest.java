package ceshi;

public class LinkedListsTest {
    public static void main(String[] args) {

        LinkedListMeCreate<Comparable> list = new LinkedListMeCreate<Comparable>();

        int num = 10;
        for (int i = 0; i < num; i++) {
            list.add(i);
        }
        System.out.print("一共增加了" + list.size() + "个元素:\r\n");
        for (int i = 0; i < num; i++) {
            System.out.print(list.get(i) + " ");
        }

        list.set(1, "11");
        System.out.println("\r\n\r\n更改元素值后遍历输出:");
        for (int i = 0; i < num; i++) {
            System.out.print(list.get(i) + " ");
        }

        System.out.println("\r\n\r\n移除最后一个元素:");
        list.remove(num - 1);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        System.out.println("\r\n移除后Size为:" + list.size());

        System.out.println("\r\n插入一个新元素:");
        list.insert(num - 2, "999");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println("\r\n插入一个元素后Size为:" + list.size());

        System.out.println("\r\n反转:");
        list.back();
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println("\r\n反转后Size为：" + list.size());

        LinkedListMeCreate list1 = new LinkedListMeCreate();
        for (int i = 0; i < num; i++) {
            list1.addfor(i);
        }

        System.out.println("\r\n遍历循环链表:");
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i) + " ");
        }

        System.out.println("\r\n循环链表新增元素:");
        list1.insert(0, "23");
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i) + " ");
        }

    }

}
