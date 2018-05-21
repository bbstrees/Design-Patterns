package 创建型模式.factory.method.statics;

import 创建型模式.factory.method.Sender;

public class FactoryTest {  
	  
    public static void main(String[] args) {      
        Sender sender = SendFactory.produceMail();
        System.out.println("Statics Factory Method.");
        sender.Send();  
    }  
}  
