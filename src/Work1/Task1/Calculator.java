package Work1.Task1;

import java.util.Scanner;

//面向对象实现一个计算器
//使用面向对象思想**实现基本的**加、减、乘、除**法（可以自行增加更多的运算符），同时处理有括号的情况
//提示：计算器是一个对象、运算符也是一个对象
public class Calculator {
    double num1;
    double num2;
    double anwser;
    char op;//运算符
    Calculator(){
        Input();
        this.anwser = Jadge(this.op);
        System.out.println("运算结果是："+anwser);
    }
    void Input() {
        System.out.println("输入数字1");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextDouble();
        System.out.println("输入运算符（+    -    x    /)");
        op = sc.next().charAt(0);//取第一个字符
        System.out.println("输入数字2");
        num2 = sc.nextDouble();
    }

    public Double Jadge(char op) {
        switch (op) {
            case '+':
                return new Addition().domain1(num1, num2);
            case '-':
                return new Subtraction().domain4(num1, num2);
            case '*':
                return new Multiplication().domain3(num1, num2);
            case '/':
                return new Division().domain2(num1, num2);
        }
        return null;
    }

}
