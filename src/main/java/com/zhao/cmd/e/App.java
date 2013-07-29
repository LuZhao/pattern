package com.zhao.cmd.e;

public class App {
	public static void main(String[] args) {
		
		Light light = new Light();
		LightOnCommand lightOnCommand = new LightOnCommand(light);
		LightOffCommand lightOffCommand = new LightOffCommand(light);
		
		Switch switch1 = new Switch(lightOnCommand, lightOffCommand);
		
		switch1.flipUp();
		switch1.flipDown();
		
		//==============================================================
		Fan fan = new Fan();
		FanOnCommand fanOnCommand = new FanOnCommand(fan);
		FanOffCommand fanOffCommand = new FanOffCommand(fan);
		Switch switch2 = new Switch(fanOnCommand, fanOffCommand);
		switch2.flipUp();
		switch2.flipDown();
	}
}
