package com.zhao.cmd.g.yanmo.example3;

/**
 * 机箱对象，本身有按钮，持有按钮对应的命令对象
 * 
 * @author LuZhao
 * 
 */
public class Box {
	/**
	 * 开机命令对象
	 */
	private Command openCommand;
	/**
	 * 重启命令对象
	 */
	private Command resetCommand;
	/**
	 * 设置开机命令对象
	 * 
	 * @param command
	 *            开机命令对象
	 */
	public void setOpenCommand(Command openCommand) {
		this.openCommand = openCommand;
	}
	
	public void setResetCommand(Command resetCommand){
		this.resetCommand = resetCommand;
	}
	/**
	 * 提供给客户使用，接受并相应用户请求，相当于按钮被按下触发的方法
	 */
	public void openButtonPressed() {
		// 按下按钮，执行命令
		openCommand.execute();
	}
	
	public void resetButtonPressed() {
		resetCommand.execute();
	}
	

}
