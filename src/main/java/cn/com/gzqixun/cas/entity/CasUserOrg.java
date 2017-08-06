package cn.com.gzqixun.cas.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="cas_user_org")
public class CasUserOrg {
	
	@Id  
    @GeneratedValue 
	private String id; 			// 编号
	private String userOrgId;	// 身份id
	private String isMain;		// 是否主身份
	private String isDisabled;	// 身份禁用
	
	@OneToOne
	private CasUser casUser;	// 用户
	@OneToOne
	private CasOrg casOrg;		// 组织机构
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserOrgId() {
		return userOrgId;
	}
	public void setUserOrgId(String userOrgId) {
		this.userOrgId = userOrgId;
	}
	public String getIsMain() {
		return isMain;
	}
	public void setIsMain(String isMain) {
		this.isMain = isMain;
	}
	public String getIsDisabled() {
		return isDisabled;
	}
	public void setIsDisabled(String isDisabled) {
		this.isDisabled = isDisabled;
	}
	public CasUser getCasUser() {
		return casUser;
	}
	public void setCasUser(CasUser casUser) {
		this.casUser = casUser;
	}
	public CasOrg getCasOrg() {
		return casOrg;
	}
	public void setCasOrg(CasOrg casOrg) {
		this.casOrg = casOrg;
	}
	
}
