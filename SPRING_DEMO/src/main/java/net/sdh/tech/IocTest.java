package net.sdh.tech;

public class IocTest {
    private String name;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String ade) {
        this.age = ade;
    }

    public String getAge() {
        return age;
    }

    /**
    IOC测试
     */
    public  void IocTest() {
        System.out.println("IOC测试NAME" + this.name + "AGE" + this.age);
    }
}
