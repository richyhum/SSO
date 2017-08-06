package cn.com.gzqixun.cas.service;

import java.util.List;

import cn.com.gzqixun.cas.entity.CasUser;
import cn.com.gzqixun.cas.entity.CasUserOrg;

public interface CasUserOrgService {

	/**
     * @param casUser
     * @return
     */
    void save(CasUserOrg casUserOrg);

    /**
     * @param casUserDao
     * @return
     */
    void delete(CasUserOrg casUserOrg);

    /**
     * @return
     */
    List<CasUserOrg> load();

    /**
     * @param id
     * @return
     */
    CasUserOrg findCasUserOrgById(String id);
}
