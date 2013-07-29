package com.zhao.cmd.g.yanmo.example1;

/**
 * 调用者对象
 * 
 * @author LuZhao
 * 
 */
public class Invoker {
	/** 持有命令对象 */
	private Command command;

	/**
	 * 设置调用者持有的命令对象
	 * 
	 * @param command
	 */
	public void setCommand(Command command) {
		this.command = command;
	}

	/** 要求命令执行请求 */
	public void executeCommand() {
		/** 调用命令对象的指向方法 */
		command.execute();
	}
}
