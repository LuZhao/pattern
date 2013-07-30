package com.zhao.cmd.g.yanmo.example5;

/**
 * 服务员
 */
public class Waiter {
	private MenuCommand menuCommand = new MenuCommand();
	
	public void  orderDish(Command command){
		CookApi hotCook = new HotCook();
		CookApi coolCook = new CoolCook();
		if(command instanceof DuckCommand){
			((DuckCommand)command).setCookApi(hotCook);
		}else if (command instanceof ChopCommand)
		{
			((ChopCommand)command).setCookApi(hotCook);
		}else if(command instanceof PorkCommand){
			((PorkCommand)command).setCookApi(coolCook);
		}
		menuCommand.addCommand(command);
	}
	public void orderOver(){
		menuCommand.execute();
	}

}
