package com.newtec.cmd.a;

/**
 * 客户端调用 
 * 烧烤摊
 * 
 * @author LuZhao
 * 
 */
public class App {
	public static void main(String[] args) {
		Barbecuer boy = new Barbecuer();
		boy.BakeMutton();
		boy.BakeMutton();
		boy.BakeMutton();
		boy.BakeChickenWing();
		boy.BakeMutton();
		boy.BakeMutton();
		boy.BakeChickenWing();
	}
}
