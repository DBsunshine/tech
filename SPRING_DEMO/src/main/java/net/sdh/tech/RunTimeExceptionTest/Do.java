package net.sdh.tech.RunTimeExceptionTest;

import net.huadong.idev.hdmessagecode.HdMessageCode;
import net.huadong.tech.base.bean.HdRunTimeException;
import net.huadong.tech.util.HdUtils;

public class Do {
    public static void main(String[] args) {
        Integer a = 0;
//        RunTimeMessage runTimeMessage = messageTest(a);
//        System.out.println(runTimeMessage.getMessage());
        HdMessageCode hdMessageCode = genMsg(a);
        System.out.println(hdMessageCode.getMessage());
    }

    public static RunTimeMessage messageTest(Integer a){
        if (a==0){
            throw new RunTimeTest("抛异常");
        }
//        else {
//            System.out.println("1111");
//        }
        return Success.genMsg();
    }

    public static HdMessageCode genMsg(Integer billSplit) {
        if (billSplit > 0) {
        } else {
            throw new HdRunTimeException("没有对应的提单信息！");
        }
        return HdUtils.genMsg();
    }
}
