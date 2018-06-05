package 结构型模式.Bridge;

public class MyBridge extends Bridge {  
    public void method(){  
        getSource().method();  
    }  
}