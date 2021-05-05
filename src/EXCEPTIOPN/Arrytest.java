package EXCEPTIOPN;

public class Arrytest {

    Object[] arry =new Object[6];

    int index =0;
    public void push(int x) throws MyException {

        arry[index] = x;
        index ++;
        if(index >arry.length-1){
            /*MyException e =new MyException("数组下标越界");
            throw e;*/
            throw new MyException("数组下标越界");
        }
    }
}
