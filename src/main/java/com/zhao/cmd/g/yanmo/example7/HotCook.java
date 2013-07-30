package com.zhao.cmd.g.yanmo.example7;


/**
 * 热菜厨师
 * 
 * @author LuZhao
 * 
 */
public  class HotCook implements CookApi,Runnable {

	/** 厨师姓名 */
	private String name;

	public HotCook(String name) {
		this.name = name;
	}

	@Override
	public void cook(int tableNum, String name) {
		int cookTime = (int) (20 * Math.random());
		System.out.println(this.name + "厨师正在为" + tableNum + "号桌做：" + name);
		try {
			Thread.sleep(cookTime);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(this.name+"厨师为"+tableNum+"号桌做好了："+name+",共计耗时="+cookTime+"秒");
	}
	
	@Override
	public void run(){
		while(true){
			Command command = CommandQueue.getOneCommand();
			if (command!= null) {
				command.setCookApi(this);
				command.execute();
			}
			try {
				Thread.sleep(1000L);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
























