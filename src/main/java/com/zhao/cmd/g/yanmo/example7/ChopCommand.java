package com.zhao.cmd.g.yanmo.example7;

import java.io.Serializable;

/**
 * 绿豆排骨煲
 * 如果不序列化会出现java.io.NotSerializableException
 * @author LuZhao
 * 
 */
public class ChopCommand implements Command,Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3475045183779040522L;
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
