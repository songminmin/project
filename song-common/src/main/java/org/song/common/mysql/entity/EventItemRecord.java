package org.song.common.mysql.entity;

public class EventItemRecord {

	/**等于*/
	public static final long EVENT_ITEM_COND_EQUAL = 0L;
	/**包含*/
	public static final long EVENT_ITEM_COND_CONTAIN = 1L;

	private Long eventItemId;
	
	private Long eventId;
	
	private String eventItemName;
	
	private Long eventItemCond;
	
	private String eventItemValue;
	
	private String eventItemDesc;
	
	private Boolean selectable;
	
	private Long createTime;
	
	private Long lastModifyTime;
	
	private Boolean isDel;

	public Long getEventItemId() {
		return eventItemId;
	}

	public void setEventItemId(Long eventItemId) {
		this.eventItemId = eventItemId;
	}

	public Long getEventId() {
		return eventId;
	}

	public void setEventId(Long eventId) {
		this.eventId = eventId;
	}

	public String getEventItemName() {
		return eventItemName;
	}

	public void setEventItemName(String eventItemName) {
		this.eventItemName = eventItemName;
	}

	public Long getEventItemCond() {
		return eventItemCond;
	}

	public void setEventItemCond(Long eventItemCond) {
		this.eventItemCond = eventItemCond;
	}

	public String getEventItemValue() {
		return eventItemValue;
	}

	public void setEventItemValue(String eventItemValue) {
		this.eventItemValue = eventItemValue;
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

	public String getEventItemDesc() {
		return eventItemDesc;
	}

	public void setEventItemDesc(String eventItemDesc) {
		this.eventItemDesc = eventItemDesc;
	}

	public Boolean getSelectable() {
		return selectable;
	}

	public void setSelectable(Boolean selectable) {
		this.selectable = selectable;
	}

	public Boolean getIsDel() {
		return isDel;
	}

	public void setIsDel(Boolean isDel) {
		this.isDel = isDel;
	}
	
}
