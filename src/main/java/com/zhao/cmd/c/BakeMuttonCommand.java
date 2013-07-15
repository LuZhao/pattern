package com.zhao.cmd.c;

/**
 * 烤羊肉串命令
 * 
 * @author LuZhao
 * 
 */
public class BakeMuttonCommand extends Command{

	public BakeMuttonCommand(Barbecuer barbecuer) {
		super(barbecuer);
	}
	@Override
	public void excuteCommand() {
		barbecuer.BakeMutton();
	}
	@Override
	public String toString() {
		return "BakeMuttonCommand [barbecuer=" + barbecuer + "]";
	}
}
