package com.lovo.j163mybatis.bean;

public class CatBean extends PetBean {
	
	private int fishNum;
	
	private int mouseNum;

	public int getFishNum() {
		return fishNum;
	}

	public void setFishNum(int fishNum) {
		this.fishNum = fishNum;
	}

	public int getMouseNum() {
		return mouseNum;
	}

	public void setMouseNum(int mouseNum) {
		this.mouseNum = mouseNum;
	}

	@Override
	public String toString() {
		return "CatBean [fishNum=" + fishNum + ", mouseNum=" + mouseNum + "]";
	}
}
