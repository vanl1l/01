package yy01Set;

import org.junit.Test;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
    @Test
    public void test1(){

        TreeSet set = new TreeSet();
        set.add("cc");
        set.add("a");
        set.add("b");
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}