package cn.com.gzqixun.cas.dao;

import java.util.List;

import cn.com.gzqixun.cas.entity.CasOrg;

public interface CasOrgDao {

	/**
     * @param casOrg
     * @return
     */
    void save(CasOrg casOrg);

    /**
     * @param casOrg
     * @return
     */
    void delete(CasOrg casOrg);

    /**
     * @return
     */
    List<CasOrg> load();

    /**
     * @param id
     * @return
     */
    CasOrg findCasOrgById(String id);
    
    
}
