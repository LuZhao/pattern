package com.zhao.cmd.g.yanmo.example5;

/**
 * 热菜厨师
 * 
 * @author LuZhao
 * 
 */
public class HotCook implements CookApi {

	@Override
	public void cook(String name) {
		System.out.println("本厨师正在做：" + name);
	}

}
