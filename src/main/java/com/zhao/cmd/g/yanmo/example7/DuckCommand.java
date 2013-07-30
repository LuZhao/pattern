package com.zhao.cmd.g.yanmo.example7;

import java.io.Serializable;

/**实现序列化
 * 北京烤鸭
 * @author LuZhao
 *
 */
public class DuckCommand implements Command, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5665599178817768004L;
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
