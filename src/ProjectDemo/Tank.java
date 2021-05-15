package ProjectDemo;

public class Tank extends Weapom implements Move,Shootble{
    @Override
    public void move() {
        System.out.println("坦克开始移动！！");
    }

    @Override
    public void shoot() {
        System.out.println("坦克开始开炮！");
    }
}
