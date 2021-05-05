package EXCEPTIOPN;

/*
* 自定义异常
* ①继承Exception或者继承RunTimeException
* ②写两个构造方法 一个无参构造，一个有参构造，构造数为String类型
* */
public class MyException extends Exception {
    public MyException(){

    }
    public MyException(String s){
        super(s);
    }
}
