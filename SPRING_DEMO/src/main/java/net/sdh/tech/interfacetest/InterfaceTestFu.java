package net.sdh.tech.interfacetest;

public interface InterfaceTestFu {
    void show();
    default void show2(){
        System.out.println("普通方法！");
    }
    static void show3(){
        System.out.println("静态方法！");
    }
}
