/*
 * ��������ģʽ��һ��������ǣ���Ĵ������������࣬Ҳ����˵�������Ҫ��չ���򣬱���Թ���������޸ģ���Υ���˱հ�ԭ��
 * ���ԣ�����ƽǶȿ��ǣ���һ�������⣬��ν�������õ����󹤳�ģʽ��������������࣬����һ����Ҫ�����µĹ��ܣ�ֱ�������µĹ�����Ϳ����ˣ�
 * ����Ҫ�޸�֮ǰ�Ĵ���
 */
package 创建型模式.abstracts.factory;


public class SendSmsFactory implements Provider{  
	  
    @Override  
    public Sender produce() {  
        return new SmsSender();  
    }  
}  