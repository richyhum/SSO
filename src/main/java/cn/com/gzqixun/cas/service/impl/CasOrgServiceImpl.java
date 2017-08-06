package cn.com.gzqixun.cas.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.com.gzqixun.cas.dao.CasOrgDao;
import cn.com.gzqixun.cas.dao.CasUserDao;
import cn.com.gzqixun.cas.entity.CasOrg;
import cn.com.gzqixun.cas.entity.CasUser;
import cn.com.gzqixun.cas.service.CasOrgService;
import cn.com.gzqixun.cas.service.CasUserService;

@Component("casOrgService")
public class CasOrgServiceImpl implements CasOrgService{
	
	@Autowired
	private CasOrgDao casOrgDao;
	
	@Override
	public void save(CasOrg casUser) {
		// TODO Auto-generated method stub
		casOrgDao.save(casUser);
	}

	@Override
	public void delete(CasOrg casUser) {
		// TODO Auto-generated method stub
		casOrgDao.delete(casUser);
	}

	@Override
	public List<CasOrg> load() {
		// TODO Auto-generated method stub
		return casOrgDao.load();
	}

	@Override
	public CasOrg findCasOrgById(String id) {
		// TODO Auto-generated method stub
		return casOrgDao.findCasOrgById(id);
	}

    
}
