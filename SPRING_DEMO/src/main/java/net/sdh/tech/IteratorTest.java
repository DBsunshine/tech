package net.sdh.tech;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorTest {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("123");
        coll.add("321");
        coll.add("231");
        //多态式声明
        Iterator<String> it = coll.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
