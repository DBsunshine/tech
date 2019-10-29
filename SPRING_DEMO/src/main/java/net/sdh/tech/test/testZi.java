package net.sdh.tech.test;

public class testZi extends AbstractTest {
    public testZi() {
//        super();
        super(12,13);
        super.num=12;
    }

    public void test(){
        super.test2();
        System.out.println("抽象类被继承");
    }
}
