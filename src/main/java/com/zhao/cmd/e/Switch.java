package com.zhao.cmd.e;

/**
 * 开关
 * 
 * @author LuZhao
 * 
 */
public class Switch {
	private Command upCommand;
	private Command downCommand;

	public Switch(Command upCommand, Command downCommand) {
		this.upCommand = upCommand;
		this.downCommand = downCommand;
	}

	/** 开 */
	public void flipUp() {
		upCommand.execute();
	}

	/** 关 */
	public void flipDown() {
		downCommand.execute();
	}
}
