/**    
* @Title: Observer1.java  
* @Package 行为型模式.Observer  
* @Description: TODO(用一句话描述该文件做什么)  
* @author xiejun1@douyu.tv     
* @date 2018年5月16日 上午11:46:08  
* @version V1.0    
*/  

package 行为型模式.Observer;

/**  
* @author xiejun1  
*    
*/
public class Observer2 implements Observer {

	/** (非 Javadoc)  
	*   
	*     
	* @see 行为型模式.Observer.Observer#update()  
	*/
	@Override
	public void update() {
		// TODO Auto-generated method stub
		 System.out.println("Observer2 has received!");  
	}

}
