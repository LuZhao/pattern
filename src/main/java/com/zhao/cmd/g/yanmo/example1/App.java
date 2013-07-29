package com.zhao.cmd.g.yanmo.example1;

public class App {
	public static void main(String[] args) {
		// 创建接受者
		Receiver receiver = new Receiver();
		// 创建命令对象，设定它的接收者
		Command command = new ConcreteCommand(receiver);
		// 创建Invoker，把命令设置进去
		Invoker invoker = new Invoker();
		invoker.setCommand(command);
		
		invoker.executeCommand();
	}
}