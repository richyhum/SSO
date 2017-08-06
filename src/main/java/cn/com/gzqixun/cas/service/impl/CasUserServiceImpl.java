package cn.com.gzqixun.cas.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.com.gzqixun.cas.dao.CasUserDao;
import cn.com.gzqixun.cas.entity.CasUser;
import cn.com.gzqixun.cas.service.CasUserService;

@Component("casUserService")
public class CasUserServiceImpl implements CasUserService{
	
	@Autowired
	private CasUserDao casUserDao;
	
	@Override
	public void save(CasUser casUser) {
		// TODO Auto-generated method stub
		casUserDao.save(casUser);
	}

	@Override
	public void delete(CasUser casUser) {
		// TODO Auto-generated method stub
		casUserDao.delete(casUser);
	}

	@Override
	public List<CasUser> load() {
		// TODO Auto-generated method stub
		return casUserDao.load();
	}

	@Override
	public CasUser findCasUserById(String id) {
		// TODO Auto-generated method stub
		return casUserDao.findCasUserById(id);
	}

	
    
}
