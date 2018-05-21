/**
 * @author xiejun1
 *
 */
package 创建型模式.factory.method.statics;

import 创建型模式.factory.method.MailSender;
import 创建型模式.factory.method.Sender;
import 创建型模式.factory.method.SmsSender;

public class SendFactory {  
    
    public static Sender produceMail(){  
        return new MailSender();  
    }  
      
    public static Sender produceSms(){  
        return new SmsSender();  
    }  
}  