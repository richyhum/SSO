package cn.com.gzqixun.cas.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import cn.com.gzqixun.cas.dao.CasOrgDao;
import cn.com.gzqixun.cas.dao.CasUserDao;
import cn.com.gzqixun.cas.entity.CasOrg;
import cn.com.gzqixun.cas.entity.CasUser;

@Component("casOrgDao")
@EnableTransactionManagement(proxyTargetClass = true)
@Transactional(transactionManager = "transactionManager", readOnly = false)
public class CasOrgDaoImpl implements CasOrgDao{
	
	@PersistenceContext(unitName = "entityManagerFactory")
    private EntityManager entityManager;

	@Override
	public void save(CasOrg casOrg) {
		// TODO Auto-generated method stub
		entityManager.persist(casOrg);
	}

	@Override
	public void delete(CasOrg casOrg) {
		// TODO Auto-generated method stub
		entityManager.remove(casOrg);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CasOrg> load() {
		// TODO Auto-generated method stub
		String sql = "select * from cas_org";
		return this.entityManager.createNativeQuery(sql, CasUser.class)
                .getResultList();
	}

	@Override
	public CasOrg findCasOrgById(String id) {
		// TODO Auto-generated method stub
		return (CasOrg) entityManager.find(CasOrg.class, id);
	}

}
