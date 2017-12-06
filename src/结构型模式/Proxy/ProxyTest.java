/**
 * 在装饰器模式和代理模式之间还是有很多差别的。
 * 装饰器模式关注于在一个对象上动态的添加方法，然而代理模式关注于控制对对象的访问。换句话 说，用代理模式，代理类（proxy class）可以对它的客户隐藏一个对象的具体信息。
 * 因此，当使用代理模式的时候，我们常常在一个代理类中创建一个对象的实例。并且，当我们使用装饰器模 式的时候，我们通常的做法是将原始对象作为一个参数传给装饰者的构造器。
 * 
 * 用另外一句话来总结这些差别：使用代理模式，代理和真实对象之间的的关系通常在编译时就已经确定了，而装饰者能够在运行时递归地被构造。
 * 
 * 代理模式中类的关系不需要客户端去配置，客户只需要使用代理类就ok了。但是装饰者模式中，类之间的关系需要客户指定。需要看自己是开发者还是客户 
 */

package 结构型模式.Proxy;

public class ProxyTest {  
	  
    public static void main(String[] args) {  
        Sourceable source = new Proxy();  
        source.method();  
    }  
  
}  