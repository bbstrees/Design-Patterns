package 创建型模式.factory.method;

public class SendFactory {  
	  
    public Sender produce(String type) {  
        if ("mail".equals(type)) {  
            return new MailSender();  
        } else if ("sms".equals(type)) {  
            return new SmsSender();  
        } else {  
            System.out.println("��������ȷ������!");  
            return null;  
        }  
    }  
} 