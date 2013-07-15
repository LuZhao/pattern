package com.newtec.cmd.c;

public class BakeChickenWingCommand extends Command {

	public BakeChickenWingCommand(Barbecuer barbecuer) {
		super(barbecuer);
	}

	@Override
	public void excuteCommand() {
		barbecuer.BakeChickenWing();
	}

	@Override
	public String toString() {
		return "BakeChickenWingCommand [barbecuer=" + barbecuer + "]";
	}
}
