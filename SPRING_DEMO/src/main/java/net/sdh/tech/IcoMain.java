package net.sdh.tech;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class IcoMain {
    public static void main(String[] args) {
        //创建Spring上下文（加载bean.xml）
        ApplicationContext acx = new ClassPathXmlApplicationContext("bean.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("C:/WorkSpace/idea/SPRING_DEMO/src/main/resources/bean.xml");

        //获取HelloWorld实例
        IocTest id = acx.getBean("IocTest", IocTest.class);

        id.setAge("3");
        id.setName("Tom");

        IocTest idNew = acx.getBean("IocTest", IocTest.class);
//        IocTest id=context.getBean(IocTest.class);
        //调用方法
        id.IocTest();
        idNew.IocTest();
    }
}
