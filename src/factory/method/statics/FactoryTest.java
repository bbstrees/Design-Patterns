package factory.method.statics;

import factory.method.Sender;

public class FactoryTest {  
	  
    public static void main(String[] args) {      
        Sender sender = SendFactory.produceMail();
        System.out.println("Statics Factory Method.");
        sender.Send();  
    }  
}  
