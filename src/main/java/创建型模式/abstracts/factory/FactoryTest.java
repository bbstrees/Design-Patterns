package 创建型模式.abstracts.factory;

public class FactoryTest {  
	  
    public static void main(String[] args) {  
        Provider provider = new SendMailFactory();  
        Sender sender = provider.produce();  
        sender.Send();  
    }  
}  
