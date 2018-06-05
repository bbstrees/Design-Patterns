/**    
* @Title: MySubject.java  
* @Package 行为型模式.Observer  
* @Description: TODO(用一句话描述该文件做什么)  
* @author xiejun1    
* @date 2018年5月16日 上午11:50:41  
* @version V1.0    
*/

package 行为型模式.Observer;

public class MySubject extends AbstractSubject {

	/**
	 * (非 Javadoc)
	 * 
	 * 
	 * @see 行为型模式.Observer.Subject#operation()
	 */
	@Override
	public void operation() {
		System.out.println("update self!");
		notifyObservers();

	}

}
