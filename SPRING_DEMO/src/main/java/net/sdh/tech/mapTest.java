package net.sdh.tech;

import java.util.HashMap;

public class mapTest {
    public static void main(String[] args) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("apple","苹果");
        int index = (Math.abs("apple".hashCode())%16);
        System.out.println("hashcode是:"+"apple".hashCode());
        System.out.println("index是:"+index);
        System.out.println(map.size());
        Object mid = map.put("apple","梨子");

        int index2 = (Math.abs("apple".hashCode())%16);
        System.out.println("hashcode是:"+"apple".hashCode());
        System.out.println("index2是:"+index2);
        System.out.println(map.get("apple"));
        System.out.println("mid"+mid);
        System.out.println(map.size());

        System.out.println(0.3-0.2);

    }
}
