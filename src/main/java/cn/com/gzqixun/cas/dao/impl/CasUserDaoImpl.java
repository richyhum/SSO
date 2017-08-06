package cn.com.gzqixun.cas.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import cn.com.gzqixun.cas.dao.CasUserDao;
import cn.com.gzqixun.cas.entity.CasUser;

@Component("casUserDao")
@EnableTransactionManagement(proxyTargetClass = true)
@Transactional(transactionManager = "transactionManager", readOnly = false)
public class CasUserDaoImpl implements CasUserDao{
	
	@PersistenceContext(unitName = "entityManagerFactory")
    private EntityManager entityManager;

	@Override
	public void save(CasUser casUser) {
		// TODO Auto-generated method stub
		entityManager.persist(casUser);
	}

	@Override
	public void delete(CasUser casUser) {
		// TODO Auto-generated method stub
		entityManager.remove(casUser);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CasUser> load() {
		// TODO Auto-generated method stub
		String sql = "select * from cas_user";
		return this.entityManager.createNativeQuery(sql, CasUser.class)
                .getResultList();
	}

	@Override
	public CasUser findCasUserById(String id) {
		// TODO Auto-generated method stub
		return (CasUser) entityManager.find(CasUser.class, id);
	}

}
