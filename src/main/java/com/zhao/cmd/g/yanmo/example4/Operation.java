package com.zhao.cmd.g.yanmo.example4;

/**
 * 运算类，真正实现加减法运算
 */
public class Operation implements OperationApi {
	/**
	 * 记录运算的结果
	 */
	private int result;

	@Override
	public int getResult() {
		return result;
	}

	@Override
	public void setResult(int result) {
		this.result = result;
	}

	@Override
	public void add(int num) {
		result += num;
	}

	@Override
	public void substrauct(int num) {
		result -= num;
	}

}
