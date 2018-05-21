/**    
* @Title: Context.java  
* @Package 行为型模式.Interpreter  
* @Description: TODO(用一句话描述该文件做什么)  
* @author xiejun1@douyu.tv     
* @date 2018年5月21日 上午11:40:10  
* @version V1.0    
*/  

package 行为型模式.Interpreter;

/**  
* @author xiejun1  
*    
*/
public class Context {
	
	private int num1;
	private int num2;
	
	public Context(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	
}