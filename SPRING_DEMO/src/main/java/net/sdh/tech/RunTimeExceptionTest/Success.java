package net.sdh.tech.RunTimeExceptionTest;

public class Success {
    public static RunTimeMessage genMsg(){
        RunTimeMessage rm = new RunTimeMessage();
        rm.setCode("1");
        rm.setMessage("成功！");
        return rm;
    }
}
