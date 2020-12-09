package com.po;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Dep implements Serializable {
	public Integer depid;
	public String depname;
	public Dep() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dep(Integer depid, String depname) {
		super();
		this.depid = depid;
		this.depname = depname;
	}
	@Override
	public String toString() {
		return "dep [depid=" + depid + ", depname=" + depname + "]";
	}
	public Integer getDepid() {
		return depid;
	}
	public void setDepid(Integer depid) {
		this.depid = depid;
	}
	public String getDepname() {
		return depname;
	}
	public void setDepname(String depname) {
		this.depname = depname;
	}
	
}
