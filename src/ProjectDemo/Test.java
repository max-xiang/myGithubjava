package ProjectDemo;

public class Test {
    public static void main(String[] args) {
        Arrmi ar=new Arrmi(4);

        Tank tank =new Tank();

        Flighter fj = new Flighter();

        GaoShePao gsp =new GaoShePao();

        YunShuJi ysj =new YunShuJi();

        Tank tank2 =new Tank();

        try {
            ar.addweapons(tank);
            ar.addweapons(fj);
            ar.addweapons(gsp);
            ar.addweapons(ysj);
            ar.addweapons(tank2);
        } catch (IligException e) {
            /*e.printStackTrace();*/
            System.out.println(e.getMessage());
        }
        ar.attackAll();
        ar.moveAll();


    }
}
