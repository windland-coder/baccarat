package com.hin.interpreter;

/**
 * 终结符表达式(Terminal Expression)角色
 * @author Administrator
 *
 */
public class Plus implements Expression {  
	  
    @Override  
    public int interpret(Context context) {  
        return context.getNum1()+context.getNum2();  
    }  
}
