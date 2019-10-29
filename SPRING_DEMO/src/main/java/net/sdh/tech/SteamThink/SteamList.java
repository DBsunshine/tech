package net.sdh.tech.SteamThink;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SteamList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张三");
        list.add("王二一");
        list.add("张四五");
        list.add("张六");
        list.add("张七八");
        list.add("张万");
        list.stream()
                .filter(name->name.startsWith("张"))
                .filter(name->name.length()==3)
                .forEach(name-> System.out.println(name));
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(3);
        list1.add(0);
        list1.add(67);
        list1.add(65);
        list1.add(90);
        list1.add(55);
        list1.add(33);
        List<Integer> collect = list1.stream().sorted().collect(Collectors.toList());
        System.out.println(collect);
    }

}
