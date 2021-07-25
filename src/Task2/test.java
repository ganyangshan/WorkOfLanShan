package Task2;

public class test {
    public static void main(String[] args) {
        Node node1 = new Node(1, "rose");
        Node node2 = new Node(2, "liv");
        Node node3 = new Node(3, "Ld");
        Node node4 = new Node(4, "sd");
        System.out.println("添加测试");
        myList linkedList = new myList();
        linkedList.addNode(node1);
        linkedList.addNode(node3);
        linkedList.addNode(node4);
        linkedList.addNode(node2);
        linkedList.showNode();
        System.out.println("删除测试");
        linkedList.delNode(node2);
        linkedList.showNode();
        System.out.println("修改测试");
        linkedList.updateNode(new Node(3,"ai"));
        linkedList.showNode();
        System.out.println("**************************************");


    }
}
