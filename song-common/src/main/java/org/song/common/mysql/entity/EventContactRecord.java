package org.song.common.mysql.entity;

/**
 * MYSQL
 * 规则管理员表octopus_event_contact
 * @author songmm-b
 *
 */
public class EventContactRecord {

	private Long eventContactId;
	
	private Long eventId;
	
	private Long contactId;
	
	private Long createTime;
	
	private Long lastModifyTime;
	
	public EventContactRecord(Long adminId) {
		super();
		this.contactId = adminId;
	}

	public EventContactRecord() {
		super();
	}

	public Long getEventContactId() {
		return eventContactId;
	}

	public void setEventContactId(Long eventContactId) {
		this.eventContactId = eventContactId;
	}

	public Long getEventId() {
		return eventId;
	}

	public void setEventId(Long eventId) {
		this.eventId = eventId;
	}

	public Long getContactId() {
		return contactId;
	}

	public void setContactId(Long contactId) {
		this.contactId = contactId;
	}

	public Long getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}

	public Long getLastModifyTime() {
		return lastModifyTime;
	}

	public void setLastModifyTime(Long lastModifyTime) {
		this.lastModifyTime = lastModifyTime;
	}

}
