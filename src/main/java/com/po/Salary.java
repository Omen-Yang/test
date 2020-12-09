package com.po;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Salary implements Serializable {
public Integer sid;
public Integer eid;
public Float emoney;
public Salary() {
	super();
	// TODO Auto-generated constructor stub
}
public Salary(Integer eid, float emoney) {
	super();
	this.eid = eid;
	this.emoney = emoney;
}
public Integer getSid() {
	return sid;
}
public void setSid(Integer sid) {
	this.sid = sid;
}
public Integer getEid() {
	return eid;
}
public void setEid(Integer eid) {
	this.eid = eid;
}
public Float getEmoney() {
	return emoney;
}
public void setEmoney(float emoney) {
	this.emoney = emoney;
}
@Override
public String toString() {
	return "salary [sid=" + sid + ", eid=" + eid + ", emoney=" + emoney + "]";
}

}
