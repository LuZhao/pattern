package com.zhao.cmd.g.yanmo.example3;

/**
 * 重启命令
 * 
 * @author LuZhao
 * 
 */
public class ResetCommand implements Command {
	/**
	 * 持有真正实现命令的接收者——主板对象
	 */
	private MainBoarApi mainBoarApi;

	public ResetCommand(MainBoarApi mainBoarApi) {
		this.mainBoarApi = mainBoarApi;
	}

	@Override
	public void execute() {
		mainBoarApi.reset();
	}
}
