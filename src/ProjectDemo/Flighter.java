package ProjectDemo;

public class Flighter extends Weapom implements Move,Shootble{

    @Override
    public void move() {
        System.out.println("战斗机开始起飞！！");
    }

    @Override
    public void shoot() {
        System.out.println("战斗机开始射击！！");
    }
}
