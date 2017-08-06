package cn.com.gzqixun.cas.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.com.gzqixun.cas.dao.CasUserDao;
import cn.com.gzqixun.cas.dao.CasUserOrgDao;
import cn.com.gzqixun.cas.entity.CasUser;
import cn.com.gzqixun.cas.entity.CasUserOrg;
import cn.com.gzqixun.cas.service.CasUserOrgService;
import cn.com.gzqixun.cas.service.CasUserService;

@Component("casUserOrgService")
public class CasUserOrgServiceImpl implements CasUserOrgService{
	
	@Autowired
	private CasUserOrgDao casUserOrgDao;
	
	@Override
	public void save(CasUserOrg casUserOrg) {
		// TODO Auto-generated method stub
		casUserOrgDao.save(casUserOrg);
	}

	@Override
	public void delete(CasUserOrg casUserOrg) {
		// TODO Auto-generated method stub
		casUserOrgDao.delete(casUserOrg);
	}

	@Override
	public List<CasUserOrg> load() {
		// TODO Auto-generated method stub
		return casUserOrgDao.load();
	}

	@Override
	public CasUserOrg findCasUserOrgById(String id) {
		// TODO Auto-generated method stub
		return casUserOrgDao.findCasUserOrgById(id);
	}

	
    
}
