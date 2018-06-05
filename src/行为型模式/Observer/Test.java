/**    
* @Title: 观察者模式测试类 
* @Package 行为型模式.Observer  
* @Description: 观察者模式测试类
* @author xiejun1    
* @date 2018年5月16日 上午11:33:15  
* @version V1.0    
*/

/**  
* @author xiejun1  
*    
*/
package 行为型模式.Observer;

public class Test {  
	 
	   public static void main(String[] args) {  
		   
	       Subject sub = new MySubject();  
	       
	       sub.add(new Observer1());  
	       sub.add(new Observer2());  
	         
	       sub.operation();  
	   }  
	  
	}  
