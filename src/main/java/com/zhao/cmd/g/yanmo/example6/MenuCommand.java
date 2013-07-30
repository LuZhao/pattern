package com.zhao.cmd.g.yanmo.example6;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 宏命令对象
 * 
 * @author LuZhao
 * 
 */
public class MenuCommand implements Command {
	/**
	 * 用来记录组合本菜单的多道菜品，也就是多个命令对象
	 */
	private Collection<Command> commands = new ArrayList<Command>();

	/**
	 * 点菜，把菜品加入到菜单中
	 * 
	 * @param command
	 *            客户点的菜
	 */
	public void addCommand(Command command) {
		commands.add(command);
	}
	/**
	 * 获取菜单中的多个命令对象
	 * @return 菜单中的多个命令对象
	 */
	public Collection<Command> getCommands(){
		return this.commands;
	}

	@Override
	public void execute() {
		//执行菜单就是把菜单传递给后厨
		CommandQueue.addMenu(this);
	}
	@Override
	public void setCookApi(CookApi cookApi) {
		// no do anything
	}
	@Override
	public int getTableNum() {
		// no do anything
		return 0;
	}

}
