package com.zhao.cmd.g.yanmo.example2;

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
		System.err.println("技嘉主板现在正在开机，请等候");
		System.err.println("接通电源......");
		System.err.println("设备检查......");
		System.err.println("装载系统......");
		System.err.println("机器正常运转起来......");
		System.err.println("机器已经正常打开，请操作");
	}

}
