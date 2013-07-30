package com.zhao.cmd.g.yanmo.example5;

/**
 * 绿豆排骨煲
 * 
 * @author LuZhao
 * 
 */
public class ChopCommand implements Command {

	public CookApi cookApi;

	public void setCookApi(CookApi cookApi) {
		this.cookApi = cookApi;
	}

	@Override
	public void execute() {
		cookApi.cook("绿豆排骨煲");
	}

}
