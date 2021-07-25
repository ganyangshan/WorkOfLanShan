package Task3;

public class DoMain {
    public static void main(String[] args) throws InterruptedException {
        Clock p1=new Clock();
        while(true){
            p1.Begin();
            p1.Show();
            Thread.sleep(1000);
        }
    }
}
