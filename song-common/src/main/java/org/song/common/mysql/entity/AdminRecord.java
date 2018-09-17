package org.song.common.mysql.entity;

public class AdminRecord {
	
	private Long adminId;

	public Long getAdminId() {
		return adminId;
	}

	public void setAdminId(Long adminId) {
		this.adminId = adminId;
	}

	public AdminRecord(Long adminId) {
		super();
		this.adminId = adminId;
	}
	
	
}