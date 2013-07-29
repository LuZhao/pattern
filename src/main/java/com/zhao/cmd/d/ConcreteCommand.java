package com.zhao.cmd.d;

/**
 * 具体的命令实现类
 * 
 * @author LuZhao
 * 
 */
public class ConcreteCommand extends Command {
	/** 命令对象可以有自己的状态 */
	private String state;

	public ConcreteCommand(Receiver receiver) {
		super(receiver);
	}

	@Override
	public void execute() {
		// 通常会转调接受者对象的相应方法，让接受者来真正执行功能
		receiver.action();
	}

}
