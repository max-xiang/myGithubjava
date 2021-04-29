package RandomTest;
import java.util.Random;

public class RandomTest01 {
    /*写一个程序生成不重复的随机数字把把他存储在一个数组中*/
    public static void main(String[] args) {
        Random random =new Random();
        int[] arry =new int[5];
        int index=0;
        while (index<arry.length){
            int num = random.nextInt(10);
            if(!(cons(arry,num))){
                arry[index]=num;
                index++;
            }

        }

        for (int i = 0; i <arry.length ; i++) {
            System.out.println(arry[i]);
        }


    }


    public static boolean cons(int[] arry,int num){
        for (int i = 0; i <arry.length ; i++) {
            if( arry[i]==num){
                return true;
            }
        }
        return false;
    }
}
