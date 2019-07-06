package com.lovo.j163mybatis.bean;

public class DuckBean extends PetBean {
	
	private int fishNum;

	public int getFishNum() {
		return fishNum;
	}

	public void setFishNum(int fishNum) {
		this.fishNum = fishNum;
	}

	@Override
	public String toString() {
		return "DuckBean [fishNum=" + fishNum + "]";
	}

}
