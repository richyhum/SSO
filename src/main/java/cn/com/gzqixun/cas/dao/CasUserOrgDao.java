package cn.com.gzqixun.cas.dao;

import java.util.List;

import cn.com.gzqixun.cas.entity.CasOrg;
import cn.com.gzqixun.cas.entity.CasUserOrg;

public interface CasUserOrgDao {

	/**
     * @param casOrg
     * @return
     */
    void save(CasUserOrg casUserOrg);

    /**
     * @param casOrg
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
