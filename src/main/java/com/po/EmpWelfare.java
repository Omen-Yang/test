package com.po;

import java.io.Serializable;

@SuppressWarnings("serial")
public class EmpWelfare implements Serializable {
public Integer ewid;
public Integer eid;
public Integer wid;
public EmpWelfare() {
	super();
	// TODO Auto-generated constructor stub
}
public EmpWelfare(Integer eid, Integer wid) {
	super();
	this.eid = eid;
	this.wid = wid;
}
@Override
public String toString() {
	return "empwelfare [ewid=" + ewid + ", eid=" + eid + ", wid=" + wid + "]";
}
public Integer getEwid() {
	return ewid;
}
public void setEwid(Integer ewid) {
	this.ewid = ewid;
}
public Integer getEid() {
	return eid;
}
public void setEid(Integer eid) {
	this.eid = eid;
}
public Integer getWid() {
	return wid;
}
public void setWid(Integer wid) {
	this.wid = wid;
}


}
