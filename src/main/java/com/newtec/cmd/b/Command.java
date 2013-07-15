package com.newtec.cmd.b;

/**
 * 抽象命令
 * 
 * @author LuZhao
 * 
 */
public abstract class Command {
	protected Barbecuer barbecuer;

	public Command(Barbecuer barbecuer) {
		this.barbecuer = barbecuer;
	}

	/** 执行命令 */
	public abstract void excuteCommand();
}
