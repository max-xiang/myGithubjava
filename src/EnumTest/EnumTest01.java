package EnumTest;

public class EnumTest01 {
    public static void main(String[] args) {
        EnumDemo R =device(10,0);
        System.out.println(R==EnumDemo.SECCESS?"计算成功":"计算失败");
    }

    /*public static boolean device(int a,int b){
        try{
            int c =a/b;
            return true;
        }catch (Exception e){
            return false;
        }
    }*/
    /*方法的返回值是枚举类型的名字*/
    public static EnumDemo device(int a,int b){
        try{
            int c =a/b;
            return EnumDemo.SECCESS;
        }catch (Exception e){
            return EnumDemo.FAIL;
        }
    }
}
/*枚举类型可以一步一步列举出来
* 枚举编译之后也生成class文件
* 枚举也是引用数据类型
* 枚举的每个值可以看成一个常量
* */

/*
* 枚举类型怎么定义
* enum 枚举名{
*   枚举值1，枚举值2
* }
* */
enum EnumDemo{

    SECCESS,FAIL


}
