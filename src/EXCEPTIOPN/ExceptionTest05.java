package EXCEPTIOPN;


/*
* 对象异常有两个重要的方法：
*   获取异常的简单描述信息：
*     exception.getMessage()
*   打印异常追踪的堆栈信息：
*     exception.printStackTrace();
*
* */

public class ExceptionTest05 {


    public static void main(String[] args) {

        NullPointerException e =new NullPointerException("空指针异常");
        String msg=e.getMessage();

    }
}
