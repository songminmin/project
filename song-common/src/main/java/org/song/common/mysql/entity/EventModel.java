package org.song.common.mysql.entity;

import java.util.List;

public class EventModel {

	/**开启*/
	public static final int EVENT_STATUS_OPEN = 1;
	/**关闭*/
	public static final int EVENT_STATUS_CLOSE = 0;

	/**未申请*/
	public static final int EVENT_AUTH_UNAPPLY = -1;
	/**已申请、待审核*/
	public static final int EVENT_AUTH_APPLY = 0;
	/**已授权*/
	public static final int EVENT_AUTH_AGREE = 1;
	/**已拒绝*/
	public static final int EVENT_AUTH_REFUSE = 2;
	/**使用者停用*/
	public static final int EVENT_AUTH_USER_STOP = 3;
	/**提供方取消*/
	public static final int EVENT_AUTH_PROVIDER_CANCEL = 4;
	/**使用者取消申请*/
	public static final int EVENT_AUTH_USER_CANCEL = 5;

	/**允许补数据*/
	public static final int EVENT_PROC_STATUS_EXECUTE_START = 0;
	/**补数据进行中*/
	public static final int EVENT_PROC_STATUS_EXECUTEING = 1;
	/**感知历史数据*/
	public static final int EVENT_PROC_STATUS_EXECUTE_HISTOSY = 3;
	/**感知历史数据进行中*/
	public static final int EVENT_PROC_STATUS_EXECUTEING_HISTORY = 4;
	/**感知历史数据完成*/
	public static final int EVENT_PROC_STATUS_EXECUTE_HISTORY_END = 2;
	
	private Long eventId;

	private String eventName;

	private Long actionAppId;

	private Long actionId;

	private Long triggerAppId;
	
	private Long triggerId;

	private String eventContact;

	private String eventUrlParam;

	private String eventHeaderParam;

	private String eventBodyParam;

	private Integer eventStatus;

	private Integer triggerAuthStatus;

	private Integer actionAuthStatus;

	private String eventRemark;

	private Boolean canSkip;

	private Boolean mustOrderd;

	private Boolean historyStatus;

	private Integer procStatus;

	private Long triggerApplyTime;
	
	private Long actionApplyTime;

	private Long triggerAuthTime;
	
	private Long actionAuthTime;
	
	private Long enabledTime;

	private Long createTime;

	private Long lastModifyTime;

	private Boolean isDel;

	private Integer eventRetryPeriod;

	private Integer eventRetryPeriodUnit;

	private Integer eventRetryMaxTime;
	
	private List<EventItemRecord> items;
	
	private List<AdminRecord> contacts;
	
	public List<AdminRecord> getContacts() {
		return contacts;
	}

	public void setContacts(List<AdminRecord> contacts) {
		this.contacts = contacts;
	}

	public EventModel(String eventName, 
			Long triggerAppId, Long triggerId, String eventBodyParam,
			Boolean canSkip, Boolean mustOrderd, List<AdminRecord> contacts) {
		super();
		this.eventName = eventName;
		this.actionAppId = 91L;
		this.actionId = 882L;
		this.triggerAppId = triggerAppId;
		this.triggerId = triggerId;
		this.eventBodyParam = eventBodyParam;
		this.eventStatus = EVENT_STATUS_CLOSE;
		this.eventRemark = "eventRemark";
		this.canSkip = canSkip;
		this.mustOrderd = mustOrderd;
		this.historyStatus = true;
		this.procStatus = EVENT_PROC_STATUS_EXECUTE_HISTOSY;
		this.createTime = System.currentTimeMillis();
		this.lastModifyTime = System.currentTimeMillis();
		this.isDel = false;
		this.eventRetryPeriod = 10;
		this.eventRetryPeriodUnit = 2;
		this.eventRetryMaxTime = 3;
		this.contacts = contacts;
	}

	public List<EventItemRecord> getItems() {
		return items;
	}

	public void setItems(List<EventItemRecord> items) {
		this.items = items;
	}

	public Long getEventId() {
		return eventId;
	}

	public void setEventId(Long eventId) {
		this.eventId = eventId;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public Long getActionAppId() {
		return actionAppId;
	}

	public void setActionAppId(Long actionAppId) {
		this.actionAppId = actionAppId;
	}

	public Long getTriggerId() {
		return triggerId;
	}

	public void setTriggerId(Long triggerId) {
		this.triggerId = triggerId;
	}

	public Long getTriggerAppId() {
		return triggerAppId;
	}

	public void setTriggerAppId(Long triggerAppId) {
		this.triggerAppId = triggerAppId;
	}

	public Long getActionId() {
		return actionId;
	}

	public void setActionId(Long actionId) {
		this.actionId = actionId;
	}

	public String getEventContact() {
		return eventContact;
	}

	public void setEventContact(String eventContact) {
		this.eventContact = eventContact;
	}

	public String getEventUrlParam() {
		return eventUrlParam;
	}

	public void setEventUrlParam(String eventUrlParam) {
		this.eventUrlParam = eventUrlParam;
	}

	public String getEventHeaderParam() {
		return eventHeaderParam;
	}

	public void setEventHeaderParam(String eventHeaderParam) {
		this.eventHeaderParam = eventHeaderParam;
	}

	public String getEventBodyParam() {
		return eventBodyParam;
	}

	public void setEventBodyParam(String eventBodyParam) {
		this.eventBodyParam = eventBodyParam;
	}

	public Integer getEventStatus() {
		return eventStatus;
	}

	public void setEventStatus(Integer eventStatus) {
		this.eventStatus = eventStatus;
	}

	public Integer getTriggerAuthStatus() {
		return triggerAuthStatus;
	}

	public void setTriggerAuthStatus(Integer triggerAuthStatus) {
		this.triggerAuthStatus = triggerAuthStatus;
	}

	public Integer getActionAuthStatus() {
		return actionAuthStatus;
	}

	public void setActionAuthStatus(Integer actionAuthStatus) {
		this.actionAuthStatus = actionAuthStatus;
	}

	public String getEventRemark() {
		return eventRemark;
	}

	public void setEventRemark(String eventRemark) {
		this.eventRemark = eventRemark;
	}

	public Boolean getCanSkip() {
		return canSkip;
	}

	public void setCanSkip(Boolean canSkip) {
		this.canSkip = canSkip;
	}

	public Boolean getMustOrderd() {
		return mustOrderd;
	}

	public void setMustOrderd(Boolean mustOrderd) {
		this.mustOrderd = mustOrderd;
	}

	public Boolean getHistoryStatus() {
		return historyStatus;
	}

	public void setHistoryStatus(Boolean historyStatus) {
		this.historyStatus = historyStatus;
	}

	public Integer getProcStatus() {
		return procStatus;
	}

	public void setProcStatus(Integer procStatus) {
		this.procStatus = procStatus;
	}

	public Long getTriggerApplyTime() {
		return triggerApplyTime;
	}

	public void setTriggerApplyTime(Long triggerApplyTime) {
		this.triggerApplyTime = triggerApplyTime;
	}

	public Long getActionApplyTime() {
		return actionApplyTime;
	}

	public void setActionApplyTime(Long actionApplyTime) {
		this.actionApplyTime = actionApplyTime;
	}

	public Long getTriggerAuthTime() {
		return triggerAuthTime;
	}

	public void setTriggerAuthTime(Long triggerAuthTime) {
		this.triggerAuthTime = triggerAuthTime;
	}

	public Long getActionAuthTime() {
		return actionAuthTime;
	}

	public void setActionAuthTime(Long actionAuthTime) {
		this.actionAuthTime = actionAuthTime;
	}

	public Long getEnabledTime() {
		return enabledTime;
	}

	public void setEnabledTime(Long enabledTime) {
		this.enabledTime = enabledTime;
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

	/*public Integer getRunningState() {
		return runningState;
	}

	public void setRunningState(Integer runningState) {
		this.runningState = runningState;
	}

	public Boolean getEventRetryStatus() {
		return eventRetryStatus;
	}

	public void setEventRetryStatus(Boolean eventRetryStatus) {
		this.eventRetryStatus = eventRetryStatus;
	}

	public String getCurrentOrderidValue() {
		return currentOrderidValue;
	}

	public void setCurrentOrderidValue(String currentOrderidValue) {
		this.currentOrderidValue = currentOrderidValue;
	}*/

	public Boolean getIsDel() {
		return isDel;
	}

	public void setIsDel(Boolean isDel) {
		this.isDel = isDel;
	}

	public Integer getEventRetryPeriod() {
		return eventRetryPeriod;
	}

	public void setEventRetryPeriod(Integer eventRetryPeriod) {
		this.eventRetryPeriod = eventRetryPeriod;
	}

	public Integer getEventRetryPeriodUnit() {
		return eventRetryPeriodUnit;
	}

	public void setEventRetryPeriodUnit(Integer eventRetryPeriodUnit) {
		this.eventRetryPeriodUnit = eventRetryPeriodUnit;
	}

	public Integer getEventRetryMaxTime() {
		return eventRetryMaxTime;
	}

	public void setEventRetryMaxTime(Integer eventRetryMaxTime) {
		this.eventRetryMaxTime = eventRetryMaxTime;
	}

	@Override
	public String toString() {
		return "EventModel [eventId=" + eventId + ", eventName=" + eventName + ", actionAppId=" + actionAppId
				+ ", actionId=" + actionId + ", triggerAppId=" + triggerAppId + ", triggerId=" + triggerId
				+ ", eventContact=" + eventContact + ", eventUrlParam=" + eventUrlParam + ", eventHeaderParam="
				+ eventHeaderParam + ", eventBodyParam=" + eventBodyParam + ", eventStatus=" + eventStatus
				+ ", triggerAuthStatus=" + triggerAuthStatus + ", actionAuthStatus=" + actionAuthStatus
				+ ", eventRemark=" + eventRemark + ", canSkip=" + canSkip + ", mustOrderd=" + mustOrderd
				+ ", historyStatus=" + historyStatus + ", procStatus=" + procStatus + ", triggerApplyTime="
				+ triggerApplyTime + ", actionApplyTime=" + actionApplyTime + ", triggerAuthTime=" + triggerAuthTime
				+ ", actionAuthTime=" + actionAuthTime + ", enabledTime=" + enabledTime + ", createTime=" + createTime
				+ ", lastModifyTime=" + lastModifyTime + ", isDel=" + isDel + ", eventRetryPeriod=" + eventRetryPeriod
				+ ", eventRetryPeriodUnit=" + eventRetryPeriodUnit + ", eventRetryMaxTime=" + eventRetryMaxTime
				+ ", items=" + items + ", contacts=" + contacts + "]";
	}

}
