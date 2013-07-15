package com.zhao.cmd.b;

/**
 * 服务员
 * 
 * @author LuZhao
 * 
 */
public class Waiter {
	private Command command;

	/** 设置订单 */
	public void setOrder(Command command) {
		this.command = command;
	}

	/** 执行通知 */
	public void notifys() {
		command.excuteCommand();
	}
}
