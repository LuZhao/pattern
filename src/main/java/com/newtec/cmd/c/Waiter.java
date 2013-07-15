package com.newtec.cmd.c;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 服务员
 * 
 * @author LuZhao
 * 
 */
@SuppressWarnings("deprecation")
public class Waiter {
	private List<Command> orders = new ArrayList<Command>();

	/** 设置订单 */
	public void setOrder(Command command) {
		if (command instanceof BakeChickenWingCommand) {
			System.out.println("服务员：鸡翅没有了，请点别的烧烤");
		} else {
			orders.add(command);
			System.out.println("增加订单：" + command.toString() + "时间：" + new Date().toLocaleString());
		}
	}

	//
	public void cancelOrder(Command command) {
		orders.remove(command);
		System.out.println("取消订单：" + command.toString() + "时间：" + new Date().toLocaleString());
	}

	/** 执行通知 */
	public void notifyAlls() {
		for (Command command : orders) {
			command.excuteCommand();
		}
	}
}
