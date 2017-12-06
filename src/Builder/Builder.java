
/**
 * @author xiejun1
 *������ģʽ���ܶ๦�ܼ��ɵ�һ������������Դ�����Ƚϸ��ӵĶ����������빤��ģʽ��������ǣ�����ģʽ��ע���Ǵ���������Ʒ����������ģʽ���ע�������϶��󣬶�����֡�
 *��ˣ���ѡ�񹤳�ģʽ���ǽ�����ģʽ����ʵ���������
 */
package Builder;

import java.util.ArrayList;
import java.util.List;

import factory.method.MailSender;
import factory.method.Sender;
import factory.method.SmsSender;

public class Builder {  
    
    private List<Sender> list = new ArrayList<Sender>();  
      
    public void produceMailSender(int count){  
        for(int i=0; i<count; i++){  
            list.add(new MailSender());  
        }  
    }  
      
    public void produceSmsSender(int count){  
        for(int i=0; i<count; i++){  
            list.add(new SmsSender());  
        }  
    }  
} 