package net.sdh.tech.RunTimeExceptionTest;

public class RunTimeTest extends RuntimeException {
    private String code = "-1";
    private String message;

    public RunTimeTest(String message){
        this.message = message;
    }

    public RunTimeTest() {
    }

    public RunTimeMessage genMsg(){
        RunTimeMessage rm = new RunTimeMessage();
        rm.setCode(this.code);
        rm.setMessage(this.message);
        return rm;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
