package com.zhao.cmd.g.yanmo.example3;

/**
 * 技嘉主板，开机命令的真正实现者在Command中从当Receiver
 * 
 * @author LuZhao
 * 
 */
public class GigaMainBoard implements MainBoarApi {

	/**
	 * 真正开机命令的实现
	 */
	@Override
	public void open() {
		System.out.println("技嘉主板现在正在开机，请等候");
		System.out.println("接通电源...");
		System.out.println("设备检查...");
		System.out.println("装载系统...");
		System.out.println("机器正常运转起来......");
		System.out.println("机器已经正常打开，请操作");
	}          

	@Override
	public void reset() {
		System.out.println("技嘉主板现在正在重启机器，请稍候...");
		System.out.println("机器正常打开，请操作...");
	}

}
