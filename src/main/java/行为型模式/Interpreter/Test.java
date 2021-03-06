/**    
* @Title: Test.java  
* @Package 行为型模式.Interpreter  
* @Description: 解释器模式 -- 解释器模式用来做各种各样的解释器，如正则表达式等的解释器等等！  用的较少吧？
* @author xiejun1    
* @date 2018年5月21日 上午11:40:41  
* @version V1.0    
*/  

package 行为型模式.Interpreter;

/**  
* @author xiejun1  
*    
*/
public class Test {

	public static void main(String[] args) {

		// 计算9+2-8的值
		int result = new Minus().interpret((new Context(new Plus()
				.interpret(new Context(9, 2)), 8)));
		System.out.println(result);
	}
}