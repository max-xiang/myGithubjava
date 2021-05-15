package CollectionTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Collectiontest01 {

    public static void main(String[] args) {

        Collection list =new ArrayList();

        list.add( 123 );
        list.add( "String " );
        list.add( new Students() );
        Iterator it =list.iterator();

        while (it.hasNext()){
            Object obj=it.next();
            it.remove();
            System.out.println(obj);
        }
        System.out.println(list.size());

//        System.out.println( list.size());
//        list.clear();
//        System.out.println( list.size());
//        boolean contains=list.contains( 123 );//结果是false 因为上面使用了clear清空了当前元素不被集合包含
//        System.out.println(contains);

    }


}
class Students{

}
