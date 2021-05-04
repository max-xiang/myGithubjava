package EXCEPTIOPN;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest04 {


    public static void main(String[] args)throws FileNotFoundException {

        m1();
    }

    private static void m1() throws FileNotFoundException{
        m2();
    }

    private static void m2() throws FileNotFoundException{
        m3();//已经在m3中使用了throws FileNotFoundException为什么还是出现异常
        //因为m3声明使用了throws FileNotFoundException
    }

    private static void m3() throws FileNotFoundException {

        /*
        * FileInputStream这个异常从源代码中可以看出使用了throws关键字
        * 从它的继承关系可以看出这是一个编译时异常
        * 处理这中异常有两种方式
        * */

        new FileInputStream("D:\\file.txt");
    }


}
