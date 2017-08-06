package cn.com.gzqixun.cas.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cas_org")
public class CasOrg {

	@Id  
    @GeneratedValue
	private String id;			// 组织机构id
	private String orgName;		// 组织机构名字 
	private String orgType;		// 组织机构类型
	private String orgOrder;	// 组织机构排序
	private String bsid;		// 节点
	private String parentBsid;	// 父节点
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public String getOrgType() {
		return orgType;
	}
	public void setOrgType(String orgType) {
		this.orgType = orgType;
	}
	public String getOrgOrder() {
		return orgOrder;
	}
	public void setOrgOrder(String orgOrder) {
		this.orgOrder = orgOrder;
	}
	public String getBsid() {
		return bsid;
	}
	public void setBsid(String bsid) {
		this.bsid = bsid;
	}
	public String getParentBsid() {
		return parentBsid;
	}
	public void setParentBsid(String parentBsid) {
		this.parentBsid = parentBsid;
	}
}
