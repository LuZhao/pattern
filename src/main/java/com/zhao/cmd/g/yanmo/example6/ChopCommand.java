package com.zhao.cmd.g.yanmo.example6;

/**
 * 绿豆排骨煲
 * 
 * @author LuZhao
 * 
 */
public class ChopCommand implements Command {

	private CookApi cookApi;
	private int tableNum;
	public ChopCommand(int tableNum) {
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
		cookApi.cook(tableNum,"绿豆排骨煲");
	}


}
