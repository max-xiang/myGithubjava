package EXCEPTIOPN;

public class ExceptionTest02 {
    /*
    * java中的异常以什么样的方式存在
    * 以类的方式存在 可以new对象
    * 每一个异常都可以new一个对象
    *
    * */
    public static void main(String[] args) {

        ArithmeticException ae =new ArithmeticException("除数为零了");
        /*异常对象也会调用toString()方法*/
        System.out.println(ae);
    }
}
