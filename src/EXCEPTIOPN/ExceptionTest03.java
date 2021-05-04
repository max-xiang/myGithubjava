package EXCEPTIOPN;

public class ExceptionTest03 {

    public static void main(String[] args) {
        /**
         * main()方法中调用doSome()方法
         * 因为doSome()方法后面有 throws ClassNotFoundException
         * 我们在调用doSome()方法的时候必须对这种异常进行处理
         * 这种异常是编译时异常，必须进行处理
         * 不进行处理编译器报错。
         */
        //doSome();
    }
    public static void doSome()throws ClassNotFoundException{

    }
}
