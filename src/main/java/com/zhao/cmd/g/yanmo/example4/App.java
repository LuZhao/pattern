package com.zhao.cmd.g.yanmo.example4;

public class App {
	public static void main(String[] args) {
		OperationApi operation = new Operation();
		AddCommand addCommand = new AddCommand(operation, 5);
		SubstrauctCommand substrauctCommand = new SubstrauctCommand(operation, 3);
		
		Calculator calculator = new Calculator();
		calculator.setAddCommand(addCommand);
		calculator.setSubstractCommand(substrauctCommand);
		
		//+ ^ -
		calculator.addPressed();
		System.out.println("一次加法运算后的结果为：" + operation.getResult());
		calculator.substractPressed();
		System.out.println("一次减法运算后的结果为：" + operation.getResult());
		
		//撤销
		calculator.undoPressed();
		System.out.println("撤销一次后的结果为："+operation.getResult());
		calculator.undoPressed();
		System.out.println("再撤销一次后的结果为："+operation.getResult());
		
		
		//恢复
		calculator.redoPressed();
		System.out.println("恢复操作一次后的结果为："+operation.getResult());
		calculator.redoPressed();
		System.out.println("再恢复操作一次后的结果为："+operation.getResult());
	}
}
