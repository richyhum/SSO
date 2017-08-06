package cn.com.gzqixun.cas.service;

import java.util.List;

import cn.com.gzqixun.cas.entity.CasOrg;

public interface CasOrgService {

	/**
     * @param casUser
     * @return
     */
    void save(CasOrg CasOrg);

    /**
     * @param casUserDao
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
