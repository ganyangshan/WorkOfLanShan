package Task2;

public class myList {
    private Node head=new Node(0, "尼克杨");
    public Node getHead() {
        return head;
    }
    //根据id添加节点
//    public void addNode(Node node){
//        Node temp = head.next;
//        boolean flag = true;
//        while (temp.next!=null){
//            if(node.id<= temp.id){//temp的id是从0开始增加的
//                temp.pre.next = node;
//                node.pre = temp.pre;
//                node.next = temp;
//                temp.pre = node;
//                flag = false;
//                break;
//            }
//            temp = temp.next;
//        }
//        if (flag){//没满足以上条件，这添加在最后
//            temp.next = node;
//            node.pre=temp;
//        }
//    }
    public void addNode(Node node) {
        Node temp=head;
        boolean flag=false; //用于标识链表中是否已经存在新节点的顺序
        while(true) {
            if(temp.next==null) {
                break;
            }else if(temp.next.id>node.id) { //说明找到了添加新节点的位置
                break;
            }else if(temp.next.id==node.id) { //说明新节点的顺序已经存在在链表中
                flag=true;
            }
            temp=temp.next;
        }
        if(flag) {
            System.out.println("节点存在，添加失败");
        }else {
            node.next=temp.next;
            if(temp.next!=null) {   //如果temp的下一个节点不为空，则temp的下一个节点的前一个节点为新节点
                temp.next.pre=node;//
            }
            temp.next=node;
            node.pre=temp;
        }

    }
    public void delNode(Node node){
        Node temp = head.next;
        boolean flag=false;
        while (temp.next!=null){
            if(temp.id==node.id){
                flag=true;
                break;
            }
            temp = temp.next;
        }
        if(flag){
            temp.pre.next=temp.next;
            if(temp.next!=null){
                temp.next.pre = temp.pre;
            }
            System.out.println("删除成功！");
        }
        else {
            System.out.println("没找到要删除数据！");
        }
    }
    //修改
    public void updateNode(Node node){
        Node temp = head;
        boolean flag = false;
        while (temp.next!=null){
            if(temp.id==node.id){
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if(flag) {
            temp.name=node.name;
            temp.name=node.name;
        }else {
            System.out.printf("没有找到编号为%d的节点",node.id);
        }
    }
    //查找所有节点
    public void showNode() {
        if(head.next==null) {
            System.out.println("链表为空！");
            return;
        }
        Node temp=head.next;
        while(true) {
            if(temp.next==null) {
                System.out.println(temp);
                break;
            }
            System.out.println(temp);
            temp=temp.next;
        }
    }
}
class Node{
    public int id;
    public String name;
    public Node next;
    public Node pre;
    public Node(int id,String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Node{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

