package com.zhao.cmd.g.yanmo.example3;

/**
 * 主板接口
 * 
 * @author LuZhao
 * 
 */
public interface MainBoarApi {
	/** 主板具有能开机的功能 */
	public void open();
	/** 主板具有重启的功能 */
	public void reset();
}
