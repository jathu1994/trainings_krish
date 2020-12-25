package com.jatha.designpatterns.prototype.deep;

public class RBT {

	private String RBTId;
	private String RBTName;

	public String getRBTName() {
		return RBTName;
	}

	public void setRBTName(String rBTName) {
		RBTName = rBTName;
	}

	public String getRBTId() {
		return RBTId;
	}

	public void setRBTId(String rBTId) {
		RBTId = rBTId;
	}

	@Override
	public String toString() {
		return "RBT [RBTId=" + RBTId + ", RBTName=" + RBTName + "]";
	}

}
