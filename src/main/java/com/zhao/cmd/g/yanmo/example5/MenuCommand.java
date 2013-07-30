package com.zhao.cmd.g.yanmo.example5;

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

	@Override
	public void execute() {
		// 执行菜单其实就是循环执行菜单里面的每个菜
		for (Command command : commands) {
			command.execute();
		}
	}

}
