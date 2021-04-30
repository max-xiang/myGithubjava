package EXCEPTIOPN;

public class ExceptionTest01 {
    /*引例
    * 1、什么是异常？异常的作用是什么？
    *   程序在运行的过程中，发生了不正常的事情，java提供了异常管理机制能够进行异常提醒，程序员
    * 看到异常后进行相应的处理.
    *
    *
    * */

    public static void main(String[] args) {


       /* int a =10;
        int b =0;
        int c =a/b; 程序执行到此处的时候会发生一个异常，这个时候会自动new一个异常出来 new ArithmeticException(by zero);
        System.out.println("a/b="+c);

        Exception in thread "main" java.lang.ArithmeticException: / by zero
        at EXCEPTIOPN.ExceptionTest01.main(ExceptionTest01.java:14)
*/
        int a =10;
        int b =0;
        if(b==0){
            System.out.println("除数不能位零");
            return;
        }
        int c =a/b;
        System.out.println("a/b="+c);

    }
}
