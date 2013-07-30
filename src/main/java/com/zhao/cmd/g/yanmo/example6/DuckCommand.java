package com.zhao.cmd.g.yanmo.example6;

/**
 * 北京烤鸭
 * @author LuZhao
 *
 */
public class DuckCommand implements Command{

	private CookApi cookApi;
	private int tableNum;
	public DuckCommand(int tableNum) {
		this.tableNum = tableNum;
	}
	
	public void setCookApi(CookApi cookApi) {
		this.cookApi = cookApi;
	}
	@Override
	public int getTableNum() {
		return this.tableNum;
	}
	@Override
	public void execute() {
		cookApi.cook(tableNum,"北京烤鸭");
	}

}
