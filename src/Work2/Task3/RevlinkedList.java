package Work2.Task3;

/**
 * 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
 */
public class RevlinkedList {
    public static void main(String[] args) {
        Node node1 = new Node(2);
        Node node2 = new Node(3);
        Node node3 = new Node(4);
        Node node4 = new Node(5);
        RevlinkedList revlinkedList = new RevlinkedList();
        revlinkedList.AddNode(node1);
        revlinkedList.AddNode(node2);
        revlinkedList.AddNode(node3);
        revlinkedList.AddNode(node4);
        Node temp = revlinkedList.Reverse();;
        while (temp!=null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
    Node head = new Node(1);
    public void AddNode(Node node) {
        Node temp = head;
        while (true) {
            if (temp.next == null) {
                break;
            }
                temp = temp.next;
            }//找到要插入的位置
            temp.next = node;
        }

    public Node Reverse(){
        //相当于依次取后面的节点插入到头结点后
       if (head.next==null||head.next==null){
           return head;
       }
       Node reverse = new Node(0);//定义一个反转后的头节点
       Node cur = head.next;
       Node next = null;
       while (cur!=null){
           next = cur.next;
           cur.next = reverse.next;
           //把cue插入到reserve和cue之间
           reverse.next = cur;
           cur = next;//后移cue
       }
       return reverse.next;

}
}
class Node{
    public int value;
    public Node next;
    public Node(int value){
        this.value = value;
    }
}