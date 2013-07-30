package com.zhao.cmd.g.yanmo.example5;

/**
 * 北京烤鸭
 * @author LuZhao
 *
 */
public class DuckCommand implements Command{

	private CookApi cookApi;
	public void setCookApi(CookApi cookApi) {
		this.cookApi = cookApi;
	}
	@Override
	public void execute() {
		cookApi.cook("北京烤鸭");
	}

}
