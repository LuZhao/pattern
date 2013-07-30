package com.zhao.cmd.g.yanmo.example5;

/**
 * 凉菜厨师
 * 
 * @author LuZhao
 * 
 */
public class CoolCook implements CookApi {
	@Override
	public void cook(String name) {
		System.out.println("凉菜：" + name + "已经做好，本厨师正在装盘");
	}
}
