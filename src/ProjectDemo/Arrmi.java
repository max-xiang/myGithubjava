package ProjectDemo;

/*类在强制转换过程中，如果是类转接口的，那么类和接口之间不需要存在继承关系*/
public class Arrmi {

    /*定义一个武器数组*/

    private Weapom[] weapoms;
    /*创造一个武器构造方法初始化武器数组容量*/
    public Arrmi(int count) {
        weapoms =new Weapom[count];
    }

    /*public Weapom[] getWeapoms() {
        return weapoms;
    }*/

    /*添加武器的方法
    * 调用一次添加一次*/
    /*将武器添加到数组里面去*/
    /*Weapom weapom 这个地方是多态转换不同的武器数组*/
    public void addweapons(Weapom weapom) throws IligException {
        for (int i =0 ;i<weapoms.length;i++){
           if(null==weapoms[i]) {
               weapoms[i] = weapom;
               return;
           }
        }
//        执行到这个地方的话就是武器这个数组满了
        throw new IligException( "武器仓库已经满了，装不下了" );
    }

    /*用于调用攻击的方法*/
    public void attackAll() {
        /*遍历数组*/
        for (int i = 0; i <weapoms.length ; i++) {
            if(weapoms[i] instanceof Shootble){
                Shootble Shootable =(Shootble)weapoms[i];
                Shootable.shoot();
            }

        }

    }
    /*用于调用移动的方法*/
    public void moveAll() {
        /*遍历数组*/
        for (int i = 0; i <weapoms.length ; i++) {
            if(weapoms[i] instanceof Move){
                Move moveable =(Move) weapoms[i];
                moveable.move();
            }

        }

    }






}
