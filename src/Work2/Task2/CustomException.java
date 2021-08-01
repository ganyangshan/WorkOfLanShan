package Work2.Task2;

/**
 * **自定义**一个异常，定义一个Int变量，编写一个方法增加此变量或减少此变量，当此变量超出Integer表示范围时抛出。
 */
public class CustomException extends Exception{
    int num;
    CustomException(int a){
        num = a;
    }
    @Override
    public String toString(){
        return "变量"+num+"超出范围";
    }
}
class Int{
    private int num;

    public void setNum(int n) throws CustomException {
//这里取Integer的高效率范围-128到127
        if(num<-128||num>127){
            throw new CustomException(n);
        }
        else {
            num = n;
        }

    }
    public void show (){
        System.out.println("Int此时为"+num);
    }
}

class Domain{
    public static void main(String[] args) {
        int i = 0;
        Int in = new Int();
        while (true){
            try {
                in.setNum(i);
                i++;
                in.show();
            } catch (CustomException e) {
                e.printStackTrace();
                break;
            }
            //在setNum中有异常抛出，故在该处要处理
        }
    }
   }

//定义一个异常类当radius小于0时抛出。。。。通过构造方法获取错误的radius
//class CircleException extends Exception{ //自定义的异常类
//    double radius;
//    CircleException(double r){
//        radius = r;
//    }
//    public String toString(){
//        return "半径r="+radius+"不是一个正数";
//    }
//}
//class Circle{    //定义Circle类
//定义Circle类有set方法获取半径，还有一个show方法
//    private double radius;
//    //方法头确定抛出某种异常
//    public void setRadius(double r) throws CircleException{
//        if(r<0) //满足抛出异常的条件则抛出异常
//            throw new CircleException(r);
//        else
//            radius=r;
//    }
//    public void show(){
//        System.out.println("圆面积="+3.14*radius*radius);
//    }
//}
//public class Demo{
//    public static void main(String[] args){
//        Circle cir=new Circle();
//        try{
//            cir.setRadius(-2.0);
//        }catch(CircleException e){
//            System.out.println("自定义异常:"+e.toString()+"");
//        }
//        cir.show();
//    }
//}
