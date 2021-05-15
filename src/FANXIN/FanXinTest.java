package FANXIN;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FanXinTest {

    public static void main(String[] args) {
        List<Animal> list = new ArrayList<Animal>();
        Animal a =new Animal();
        Animal c =new Cat();
        Animal d =new Dog();

        //list.add(a);
        list.add(c);
        list.add(d);
        Iterator<Animal> it =list.iterator();
        while (it.hasNext()){
            Animal an=it.next();
            an.Move();
            if (an instanceof Cat){
                Cat cat=(Cat)an;
                cat.CatchMose();
            }
            if (an instanceof Dog){
                Dog dog=(Dog)an;
                dog.WatchDoor();
            }

        }
    }
}



class Animal{
    public void Move (){
        System.out.println("动物在移动！");
    }
}

class Cat extends Animal{

    public void CatchMose(){
        System.out.println("猫在抓老鼠！");
    }
}

class Dog extends Animal{

    public void WatchDoor(){
        System.out.println("狗狗在看家门！");
    }
}
