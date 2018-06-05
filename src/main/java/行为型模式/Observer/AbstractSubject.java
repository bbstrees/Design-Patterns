/**    
* @Title: AbstractSubject.java  
* @Package 行为型模式.Observer  
* @Description: TODO(用一句话描述该文件做什么)  
* @author xiejun1    
* @date 2018年5月16日 上午11:48:59  
* @version V1.0    
*/

package 行为型模式.Observer;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author xiejun1
 * 
 */
public abstract class AbstractSubject implements Subject {

	private Vector<Observer> vector = new Vector<Observer>();

	@Override
	public void add(Observer observer) {
		vector.add(observer);
	}

	@Override
	public void del(Observer observer) {
		vector.remove(observer);
	}

	@Override
	public void notifyObservers() {
		Enumeration<Observer> enumo = vector.elements();
		while (enumo.hasMoreElements()) {
			enumo.nextElement().update();
		}
	}

}
