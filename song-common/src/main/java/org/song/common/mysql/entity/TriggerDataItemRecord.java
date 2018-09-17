package org.song.common.mysql.entity;

public class TriggerDataItemRecord {
	
	private Long triggerDataItemId;
	
	private String columnName;
	
	private String jsonName;
	
	private String itemDesc;
	
	private String itemExample;
	
	private Integer dataMarking;
	
	private Boolean orderable;
	
	private Boolean selectable;
	
	private Long triggerId;
	
	private Long createTime;
	
	private Long lastModifyTime;
	
	public TriggerDataItemRecord(String columnName) {
		super();
		this.columnName = columnName;
		this.dataMarking = 0;
		if(columnName.equals("id")){
			this.orderable = true;
		} else {
			this.orderable = false;
		}
		this.selectable = true;
	}

	public Long getTriggerDataItemId() {
		return triggerDataItemId;
	}

	public void setTriggerDataItemId(Long triggerDataItemId) {
		this.triggerDataItemId = triggerDataItemId;
	}

	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public String getJsonName() {
		return jsonName;
	}

	public void setJsonName(String jsonName) {
		this.jsonName = jsonName;
	}

	public String getItemDesc() {
		return itemDesc;
	}

	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}

	public String getItemExample() {
		return itemExample;
	}

	public void setItemExample(String itemExample) {
		this.itemExample = itemExample;
	}

	public Boolean getOrderable() {
		return orderable;
	}

	public void setOrderable(Boolean orderable) {
		this.orderable = orderable;
	}

	public Boolean getSelectable() {
		return selectable;
	}

	public void setSelectable(Boolean selectable) {
		this.selectable = selectable;
	}

	public Long getTriggerId() {
		return triggerId;
	}

	public void setTriggerId(Long triggerId) {
		this.triggerId = triggerId;
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

	public Integer getDataMarking() {
		return dataMarking;
	}

	public void setDataMarking(Integer dataMarking) {
		this.dataMarking = dataMarking;
	}

}
