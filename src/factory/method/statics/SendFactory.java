/**
 * @author xiejun1
 *
 */
package factory.method.statics;

import factory.method.MailSender;
import factory.method.Sender;
import factory.method.SmsSender;

public class SendFactory {  
    
    public static Sender produceMail(){  
        return new MailSender();  
    }  
      
    public static Sender produceSms(){  
        return new SmsSender();  
    }  
}  