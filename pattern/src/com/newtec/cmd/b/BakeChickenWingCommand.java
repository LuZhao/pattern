package com.newtec.cmd.b;

public class BakeChickenWingCommand extends Command {

	public BakeChickenWingCommand(Barbecuer barbecuer) {
		super(barbecuer);
	}

	@Override
	public void excuteCommand() {
		barbecuer.BakeChickenWing();
	}
}
