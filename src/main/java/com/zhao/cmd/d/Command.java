package com.zhao.cmd.d;

/**
 * 命令接口生命执行的操作
 * 
 * @author LuZhao
 * 
 */
public abstract class Command {
	protected Receiver receiver;

	public Command(Receiver receiver) {
		this.receiver = receiver;
	}

	public abstract void execute();
}
