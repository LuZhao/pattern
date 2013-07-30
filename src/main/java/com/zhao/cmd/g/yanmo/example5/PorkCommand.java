package com.zhao.cmd.g.yanmo.example5;

/**
 * 蒜泥白肉
 * 
 * @author LuZhao
 * 
 */
public class PorkCommand implements Command {

	private CookApi cookApi;

	public void setCookApi(CookApi cookApi) {
		this.cookApi = cookApi;
	}

	@Override
	public void execute() {
		cookApi.cook("蒜泥白肉");
	}

}
