package com.zhao.cmd.g.yanmo.example4;

import java.util.ArrayList;
import java.util.List;

/**
 * 计算器类，计算器上有加法按钮、减法按钮，还有撤销和恢复的按钮
 */
public class Calculator {
	/**
	 * 命令的操作的历史记录，在撤销时候用
	 */
	private List<Command> undoCmds = new ArrayList<Command>();
	/**
	 * 命令被撤销的历史记录，在恢复时候用
	 */
	private List<Command> redoCmds = new ArrayList<Command>();
	private Command addCommand;
	private Command substractCommand;

	public void setAddCommand(Command addCommand) {
		this.addCommand = addCommand;
	}

	public void setSubstractCommand(Command substractCommand) {
		this.substractCommand = substractCommand;
	}

	/** 加法按钮 */
	public void addPressed() {
		this.addCommand.execute();
		// 把操作记录到历史记录里面
		undoCmds.add(this.addCommand);
	}

	/** 减法按钮 */
	public void substractPressed() {
		this.substractCommand.execute();
		undoCmds.add(this.substractCommand);
	}

	/** 撤销 */
	public void undoPressed() {
		if (this.undoCmds.size() > 0) {
			Command cmd = this.undoCmds.get(this.undoCmds.size() - 1);
			cmd.undo();
			// 如果还有恢复的功能，那就把这个命令记录到恢复的历史记录里面
			this.redoCmds.add(cmd);
			// 然后把最后一个命令删除掉，
			this.undoCmds.remove(cmd);
		}else{
			System.err.println("很抱歉，没有可撤销的命令");
		}
	}

	/** 恢复 */
	public void redoPressed() {
		if(this.redoCmds.size()>0){
			Command command = this.redoCmds.get(this.redoCmds.size() - 1);
			command.execute();
			this.undoCmds.add(command);
			this.redoCmds.remove(command);
		}else{
			System.out.println("很抱歉，没有可恢复的命令");
		}
	}
}
















