package com.po;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Welfare implements Serializable {
public Integer wid;
public String wname;
public Integer getWid() {
	return wid;
}
public void setWid(Integer wid) {
	this.wid = wid;
}
public String getWname() {
	return wname;
}
public void setWname(String wname) {
	this.wname = wname;
}
public Welfare() {
	super();
	// TODO Auto-generated constructor stub
}
public Welfare(Integer wid, String wname) {
	super();
	this.wid = wid;
	this.wname = wname;
}
@Override
public String toString() {
	return "welfare [wid=" + wid + ", wname=" + wname + "]";
}

}
