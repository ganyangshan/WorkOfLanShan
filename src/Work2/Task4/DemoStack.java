package Work2.Task4;

/**
 * 实现一个简单的栈，将十进制转为二进制、八进制、十六进制打印输出
 *
 * + 栈的主要方法：
 *   - push();//入栈
 *   - pop();//出栈并返回栈顶值
 *   - empty();//判断栈是否为空
 *   - peek();//获取栈顶的值
 *   - search(elem);//判断元素elem是否在栈中
 */
public class DemoStack {
    int hight = -1;
    int max;
    int [] nums ;
    public DemoStack(int max){
        nums=new int[max];
        this.max = max;
    }
    public boolean push(int temp) {
        if (hight==max){//达到最大高度
            System.out.println(false);
            return false;
        }
        hight++;
        nums[hight] = temp;

        return true;
    }

    public int pop(){
        int temp = nums[hight];
        hight--;
        return temp;
    }
    public int peek(){
        return nums[hight];
    }
    public void tenTo2(int k) {//十进制转二进制
        DemoStack demoStack = new DemoStack(max*4);//1,2,4,8,,至多要之前的四倍高度
        while(k != 0) {
            demoStack.push(k % 2);//余数压栈，相当于倒序
            k /= 2;
        }
        for(int i=0; demoStack.hight!=-1; i++) {
            System.out.print(demoStack.pop());
        }
        System.out.println();
    }
    public void tenTo8(int k) {//十进制转八进制
        DemoStack demoStack2 = new DemoStack(max);
        while(k != 0) {
            demoStack2.push(k % 8);//余数压栈，相当于倒序
            k /= 8;
        }
        for(int i=0; demoStack2.hight!=-1; i++) {
            System.out.print(demoStack2.pop());
        }
        System.out.println();
    }
    public void tenTo16(int k) {//十进制转八进制
        DemoStack demoStack3 = new DemoStack(max);
        while(k != 0) {
            demoStack3.push(k % 16);//余数压栈，相当于倒序
            k /= 16;
        }
        for(int i=0; demoStack3.hight!=-1; i++) {
            System.out.print(demoStack3.pop());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DemoStack demoStack  = new DemoStack(20);
        demoStack.push(18);
        demoStack.push(66);
        demoStack.push(34);
        demoStack.push(39);
        demoStack.push(21);
        System.out.println(demoStack.peek());
        System.out.println(demoStack.pop());
        System.out.println(demoStack.peek());
        demoStack.tenTo2(55);
        System.out.println("++++++++++++++++++");
        demoStack.tenTo8(55);
        System.out.println("++++++++++++++++");
        demoStack.tenTo16(55);
    }


}
