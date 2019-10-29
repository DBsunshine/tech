package net.sdh.tech.test;

public abstract class AbstractTest {
    int num;
    int money;


    public abstract void test();

    public void test2(){
        System.out.println("父类非抽象被调用"+num);
    }

    public AbstractTest() {
        System.out.println("父类无参构造方法" + num);
        System.out.println("父类构造方法");
    }

    public AbstractTest(int num, int money) {
        System.out.println("父类有参构造方法" + num);
        this.num = num;
        this.money = money;
    }


    public int getNum() {
        return num;
    }

    public int getMoney() {
        return money;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setMoney(int money) {
        this.money = money;
    }


}
