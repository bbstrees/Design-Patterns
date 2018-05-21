/**
 * @author xiejun1
 *
 */
package 创建型模式.singleton;

public class Singleton {  
	  
    /* ˽�й��췽������ֹ��ʵ���� */  
    private Singleton() {  
    }  
  
    /* �˴�ʹ��һ���ڲ�����ά������
     * 
     * ��̬�ڲ������ⲿ�౻����ʱ����أ�JVM�ڲ��Ļ����ܹ���֤��һ���౻���ص�ʱ�������ļ��ع������̻߳���ġ�
     * ���������ǵ�һ�ε���getInstance��ʱ��JVM�ܹ������Ǳ�֤instanceֻ������һ��
     *  */  
    private static class SingletonFactory {  
        private static Singleton instance = new Singleton();  
    }  
  
    /* ��ȡʵ�� */  
    public static Singleton getInstance() {  
        return SingletonFactory.instance;  
    }  
  
    /* ����ö����������л������Ա�֤���������л�ǰ�󱣳�һ�� */  
    public Object readResolve() {  
        return getInstance();  
    }  
}  