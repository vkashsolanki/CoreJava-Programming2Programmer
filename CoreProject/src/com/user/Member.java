package com.user;

import java.sql.Date;

public class Member {

	Integer memberId;
	String memberName;
	Date joiningOfdate;
	
	public Member() {
		
	}

	public Integer getMemberId() {
		return memberId;
	}

	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public Date getJoiningOfdate() {
		return joiningOfdate;
	}

	public void setJoiningOfdate(Date joiningOfdate) {
		this.joiningOfdate = joiningOfdate;
	}

	public Member(Integer memberId, String memberName, Date joiningOfdate) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
		this.joiningOfdate = joiningOfdate;
	}
	
	
}
