/**    
* @Title: Plus.java  
* @Package 行为型模式.Interpreter  
* @Description: TODO(用一句话描述该文件做什么)  
* @author xiejun1    
* @date 2018年5月21日 上午11:41:39  
* @version V1.0    
*/  

package 行为型模式.Interpreter;

/**  
* @author xiejun1  
*    
*/
public class Plus implements Expression {

	@Override
	public int interpret(Context context) {
		return context.getNum1()+context.getNum2();
	}
}
