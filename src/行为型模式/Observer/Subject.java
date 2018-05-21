/**    
* @Title: Subject.java  
* @Package 行为型模式.Observer  
* @Description: TODO(用一句话描述该文件做什么)  
* @author xiejun1@douyu.tv     
* @date 2018年5月16日 上午11:48:01  
* @version V1.0    
*/  

package 行为型模式.Observer;

/**  
* @author xiejun1  
*    
*/
public interface Subject {

    /*增加观察者*/  
    public void add(Observer observer);  
      
    /*删除观察者*/  
    public void del(Observer observer);  
      
    /*通知所有的观察者*/  
    public void notifyObservers();  
      
    /*自身的操作*/  
    public void operation();  

}
