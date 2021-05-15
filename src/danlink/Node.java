package danlink;

/*创建单链表结构使用递归*/

public class Node {
    Object obj;
    Node next;

    public Node() {
    }
    /*创建有参构造*/
    public Node(Object obj, Node next) {
        this.obj = obj;
        this.next = next;
    }


}
