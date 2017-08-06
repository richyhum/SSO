package cn.com.gzqixun.cas.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import cn.com.gzqixun.cas.dao.CasOrgDao;
import cn.com.gzqixun.cas.dao.CasUserDao;
import cn.com.gzqixun.cas.dao.CasUserOrgDao;
import cn.com.gzqixun.cas.entity.CasOrg;
import cn.com.gzqixun.cas.entity.CasUser;
import cn.com.gzqixun.cas.entity.CasUserOrg;

@Component("casUserOrgDao")
@EnableTransactionManagement(proxyTargetClass = true)
@Transactional(transactionManager = "transactionManager", readOnly = false)
public class CasUserOrgDaoImpl implements CasUserOrgDao{
	
	@PersistenceContext(unitName = "entityManagerFactory")
    private EntityManager entityManager;

	@Override
	public void save(CasUserOrg casUserOrg) {
		// TODO Auto-generated method stub
		entityManager.persist(casUserOrg);
	}

	@Override
	public void delete(CasUserOrg casUserOrg) {
		// TODO Auto-generated method stub
		entityManager.remove(casUserOrg);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CasUserOrg> load() {
		// TODO Auto-generated method stub
		String sql = "select * from cas_user_org";
		return this.entityManager.createNativeQuery(sql, CasUser.class)
                .getResultList();
	}

	@Override
	public CasUserOrg findCasUserOrgById(String id) {
		// TODO Auto-generated method stub
		return (CasUserOrg) entityManager.find(CasUserOrg.class, id);
	}

}
