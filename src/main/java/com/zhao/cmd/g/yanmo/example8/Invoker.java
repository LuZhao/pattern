package com.zhao.cmd.g.yanmo.example8;

public class Invoker {

	private Command command;
	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void startPrint(){
		this.command.execute();
	}
}
