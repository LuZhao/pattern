package com.newtec.cmd.b;

/**
 * 烧烤店事先就照好了烤肉厨师、服务员、和烤肉菜单。就等客户上门？
 * 
 * @author LuZhao
 * 
 */
public class App {
	public static void main(String[] args) {
		
		/** 开店前的准备 */
		Barbecuer boy = new Barbecuer();
		Command BakeMuttonCommand1 = new BakeMuttonCommand(boy);
		Command BakeMuttonCommand2 = new BakeMuttonCommand(boy);
		Command BakeChickenWingCommand = new BakeChickenWingCommand(boy);
		Waiter girl = new Waiter();

		/** 服务员根据用户需求通知厨房开始制作 */
		girl.setOrder(BakeMuttonCommand1);
		girl.notifys();

		girl.setOrder(BakeMuttonCommand2);
		girl.notifys();

		girl.setOrder(BakeChickenWingCommand);
		girl.notifys();

	}
}
