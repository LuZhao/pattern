package com.zhao.cmd.g.yanmo.example3;

public class App {
	public static void main(String[] args) throws Exception {
		//===============正常状态======================
		GigaMainBoard gigaMainBoard = new GigaMainBoard();
		OpenCommand openCommand = new OpenCommand(gigaMainBoard);
		ResetCommand resetCommand = new ResetCommand(gigaMainBoard);
		Box box = new Box();
		box.setOpenCommand(openCommand);
		box.setResetCommand(resetCommand);
		System.out.println("-->正常配置");
		System.out.println("--|-->开机");
		box.openButtonPressed();
		System.out.println("--|-->重启");
		box.resetButtonPressed();
		//===============错误状态======================
		/**
		 * 开机按钮：运行的是重启命令
		 * 重启按钮：运行的是开始命令
		 */
		openCommand = new OpenCommand(gigaMainBoard);
		resetCommand = new ResetCommand(gigaMainBoard);
		box = new Box();
		box.setOpenCommand(resetCommand);
		box.setResetCommand(openCommand);
		System.out.println("-->错误配置");
		System.out.println("--|-->开机");
		box.openButtonPressed();
		System.out.println("--|-->重启");
		box.resetButtonPressed();
	}
}
