package Work2.Task1;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;



public class DemoThread {
    public static void main(String[] args) {
        DesignNum designNum = new DesignNum();
        DemoThread1 demoThresd1 = new DemoThread1(designNum);
        DemoThread2 demoThread2 = new DemoThread2(designNum);
        DemoThread3 demoThread3 = new DemoThread3(designNum);
        FutureTask<String> task = new FutureTask<String>(demoThread3);
        Thread mythread = new Thread(demoThread2);
        Thread mythread3 = new Thread(task);

        demoThresd1.setName("继承Thread创建的线程1");
        mythread.setName("实现Runnable接口创建的线程2");
        mythread3.setName("实现Callable接口创建的线程3");
        demoThresd1.start();
        mythread.start();
        mythread3.start();

//        demoThresd1.stop();
//        mythread.stop();
//        mythread3.stop();
    }
}
class DemoThread1 extends Thread{
    private DesignNum designNum =null;
    public DemoThread1(DesignNum designNum){
        this.designNum = designNum;
    }
    @Override
    public void run() {
            designNum.Fun(1);
    }
}
class DemoThread2 implements Runnable{
    private DesignNum designNum = null;
    public DemoThread2(DesignNum designNum){
        this.designNum = designNum;
    }
    @Override
    public void run() {
        designNum.Fun(2);
    }
}
class DemoThread3 implements Callable<String>{
    private DesignNum designNum = null;
    public DemoThread3(DesignNum designNum){
        this.designNum = designNum;
    }
    @Override
    public String call() throws Exception {
            designNum.Fun(0);
        return null;
    }
}