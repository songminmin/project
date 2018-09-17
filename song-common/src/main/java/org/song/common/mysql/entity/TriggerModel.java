package org.song.common.mysql.entity;

import java.util.List;

public class TriggerModel extends TriggerRecord{
	
	/**数据表*/
	public static final int TRIGGER_TYPE_TABLE = 1;
	/**接口方式*/
	public static final int TRIGGER_TYPE_INTERFACE = 2;
	/**主动推送*/
	public static final int TRIGGER_TYPE_DIRECT = 3;

	/**GET请求*/
	public static final int TRIGGER_METHOD_GET = 1;
	/**POST请求*/
	public static final int TRIGGER_METHOD_POST = 2;
	/**PUT请求*/
	public static final int TRIGGER_METHOD_PUT = 3;
	/**DELETE请求*/
	public static final int TRIGGER_METHOD_DELETE = 4;

	/**开启*/
	public static final int TRIGGER_STATUS_OPEN = 1;
	/**关闭*/
	public static final int TRIGGER_STATUS_CLOSE = 0;

	/**秒*/
	public static final int TRIGGER_PERIOD_UNIT_SEC = 1;
	/**分*/
	public static final int TRIGGER_STATUS_UNIT_MIN = 2;
	/**时*/
	public static final int TRIGGER_STATUS_UNIT_HOUR = 3;
	/**天*/
	public static final int TRIGGER_STATUS_UNIT_DAY = 4;

	/**正常运行*/
	public static final int PAUSE_STATUS_SUC = 0;
	/**异常暂停*/
	public static final int PAUSE_STATUS_EXCEPTION = 1;
	/**清空暂停*/
	public static final int PAUSE_STATUS_CLEAR = 2;

	private Long triggerId;

	private String triggerName;

	private String triggerDocLink;

	private String triggerTableName;

	private Integer triggerType;

	private Integer triggerMethod;

	private String triggerUrl;

	private Integer triggerPeriod;

	private Integer triggerPeriodUnit;

	private String triggerDesc;

	private Long appId;

	private Long connectionId;

	private Integer triggerLimit;

	private Integer triggerStatus;

	private Boolean triggerUsed;

	private String triggerNumber;

	private String triggerRemark;

	private Integer pauseStatus;

	private String pauseCause;

	private Long createTime;

	private Long lastModifyTime;

	private Boolean isDel;

	public Long getTriggerId() {
		return triggerId;
	}

	public void setTriggerId(Long triggerId) {
		this.triggerId = triggerId;
	}

	public String getTriggerName() {
		return triggerName;
	}

	public void setTriggerName(String triggerName) {
		this.triggerName = triggerName;
	}

	public String getTriggerDocLink() {
		return triggerDocLink;
	}

	public void setTriggerDocLink(String triggerDocLink) {
		this.triggerDocLink = triggerDocLink;
	}

	public String getTriggerTableName() {
		return triggerTableName;
	}

	public void setTriggerTableName(String triggerTableName) {
		this.triggerTableName = triggerTableName;
	}

	public Integer getTriggerType() {
		return triggerType;
	}

	public void setTriggerType(Integer triggerType) {
		this.triggerType = triggerType;
	}

	public Integer getTriggerMethod() {
		return triggerMethod;
	}

	public void setTriggerMethod(Integer triggerMethod) {
		this.triggerMethod = triggerMethod;
	}

	public String getTriggerUrl() {
		return triggerUrl;
	}

	public void setTriggerUrl(String triggerUrl) {
		this.triggerUrl = triggerUrl;
	}

	public Integer getTriggerPeriod() {
		return triggerPeriod;
	}

	public void setTriggerPeriod(Integer triggerPeriod) {
		this.triggerPeriod = triggerPeriod;
	}

	public String getTriggerDesc() {
		return triggerDesc;
	}

	public void setTriggerDesc(String triggerDesc) {
		this.triggerDesc = triggerDesc;
	}

	public Long getAppId() {
		return appId;
	}

	public void setAppId(Long appId) {
		this.appId = appId;
	}

	public Long getConnectionId() {
		return connectionId;
	}

	public void setConnectionId(Long connectionId) {
		this.connectionId = connectionId;
	}

	public Integer getTriggerLimit() {
		return triggerLimit;
	}

	public void setTriggerLimit(Integer triggerLimit) {
		this.triggerLimit = triggerLimit;
	}

	public Integer getTriggerStatus() {
		return triggerStatus;
	}

	public void setTriggerStatus(Integer triggerStatus) {
		this.triggerStatus = triggerStatus;
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

	public String getTriggerNumber() {
		return triggerNumber;
	}

	public void setTriggerNumber(String triggerNumber) {
		this.triggerNumber = triggerNumber;
	}

	public String getTriggerRemark() {
		return triggerRemark;
	}

	public void setTriggerRemark(String triggerRemark) {
		this.triggerRemark = triggerRemark;
	}

	public Integer getTriggerPeriodUnit() {
		return triggerPeriodUnit;
	}

	public void setTriggerPeriodUnit(Integer triggerPeriodUnit) {
		this.triggerPeriodUnit = triggerPeriodUnit;
	}

	public Boolean getTriggerUsed() {
		return triggerUsed;
	}

	public void setTriggerUsed(Boolean triggerUsed) {
		this.triggerUsed = triggerUsed;
	}

	public Integer getPauseStatus() {
		return pauseStatus;
	}

	public void setPauseStatus(Integer pauseStatus) {
		this.pauseStatus = pauseStatus;
	}

	public String getPauseCause() {
		return pauseCause;
	}

	public void setPauseCause(String pauseCause) {
		this.pauseCause = pauseCause;
	}

	public Boolean getIsDel() {
		return isDel;
	}

	public void setIsDel(Boolean isDel) {
		this.isDel = isDel;
	}
	
	private List<TriggerDataItemRecord> dataItems;

	public List<TriggerDataItemRecord> getDataItems() {
		return dataItems;
	}

	public void setDataItems(List<TriggerDataItemRecord> dataItems) {
		this.dataItems = dataItems;
	}
	
	public TriggerModel(String triggerName, String triggerTableName,
			Integer triggerType, Long appId, Long connectionId,
			List<TriggerDataItemRecord> dataItems) {
		this.triggerName = triggerName;
		this.triggerDocLink = "triggerDocLink";
		this.triggerTableName = triggerTableName;
		this.triggerType = triggerType;
		this.triggerPeriod = 1;
		this.triggerPeriodUnit = 1;
		this.triggerDesc = "triggerDescDB";
		this.appId = appId;
		this.connectionId = connectionId;
		this.triggerLimit = 100;
		this.triggerStatus = TRIGGER_STATUS_CLOSE;
		this.triggerUsed = false;
		this.triggerRemark = "triggerRemarkDB";
		this.pauseStatus = PAUSE_STATUS_SUC;
		this.createTime = System.currentTimeMillis();
		this.lastModifyTime = System.currentTimeMillis();
		this.isDel = false;
		this.dataItems = dataItems;
	}

	public TriggerModel(String triggerName,
			Integer triggerType, String triggerUrl, Long appId,
			List<TriggerDataItemRecord> dataItems, boolean needLimit) {
		this.triggerName = triggerName;
		this.triggerDocLink = "triggerDocLink";
		this.triggerType = triggerType;
		this.triggerUrl = triggerUrl;
		this.triggerPeriod = 1;
		this.triggerPeriodUnit = 1;
		this.triggerDesc = "triggerDescInterface";
		this.appId = appId;
		this.triggerLimit = 100;
		this.triggerStatus = TRIGGER_STATUS_CLOSE;
		this.triggerUsed = false;
		this.triggerRemark = "triggerRemarkInterface";
		this.pauseStatus = PAUSE_STATUS_SUC;
		this.createTime = System.currentTimeMillis();
		this.lastModifyTime = System.currentTimeMillis();
		this.isDel = false;
		this.dataItems = dataItems;
	}
	
	public TriggerModel(String triggerName, int triggerType, String triggerNumber, Long appId,
			List<TriggerDataItemRecord> dataItems) {
		this.triggerName = triggerName;
		this.triggerDocLink = "triggerDocLink";
		this.triggerType = triggerType;
		this.triggerNumber = triggerNumber;
		this.triggerDesc = "triggerDescDirect";
		this.appId = appId;
		this.triggerStatus = TRIGGER_STATUS_CLOSE;
		this.triggerUsed = false;
		this.triggerRemark = "triggerRemarkDirect";
		this.pauseStatus = PAUSE_STATUS_SUC;
		this.createTime = System.currentTimeMillis();
		this.lastModifyTime = System.currentTimeMillis();
		this.isDel = false;
		this.dataItems = dataItems;
	}

	@Override
	public String toString() {
		return "TriggerModel [triggerId=" + triggerId + ", triggerName=" + triggerName + ", triggerDocLink="
				+ triggerDocLink + ", triggerTableName=" + triggerTableName + ", triggerType=" + triggerType
				+ ", triggerMethod=" + triggerMethod + ", triggerUrl=" + triggerUrl + ", triggerPeriod=" + triggerPeriod
				+ ", triggerPeriodUnit=" + triggerPeriodUnit + ", triggerDesc=" + triggerDesc + ", appId=" + appId
				+ ", connectionId=" + connectionId + ", triggerLimit=" + triggerLimit + ", triggerStatus="
				+ triggerStatus + ", triggerUsed=" + triggerUsed + ", triggerNumber=" + triggerNumber
				+ ", triggerRemark=" + triggerRemark + ", pauseStatus=" + pauseStatus + ", pauseCause=" + pauseCause
				+ ", createTime=" + createTime + ", lastModifyTime=" + lastModifyTime + ", isDel=" + isDel
				+ ", dataItems=" + dataItems + "]";
	}
}
