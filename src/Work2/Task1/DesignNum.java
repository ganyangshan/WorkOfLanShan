package Work2.Task1;

public class DesignNum {

    private static int num = 1;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        DesignNum.num = num;
    }

    public void Fun(int n) {
        //多个线程通过调用同一个方法，来达到多个线程执行一个任务的目的
        while (num < 121) {
            //注意synchronized的位置
            synchronized (this) {
                notifyAll();
                if (num % 3 == n) {
                    System.out.println(Thread.currentThread().getName() + ":" + num);
                    num++;
                }

                try {
                    wait();//调用wait后释放锁，并该线程进入等待池，当调用notify时该锁进入锁池，进行线程的争夺
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
