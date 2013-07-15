package com.newtec.cmd.c;

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

	@Override
	public String toString() {
		return "Command [barbecuer=" + barbecuer + "]";
	}
}
