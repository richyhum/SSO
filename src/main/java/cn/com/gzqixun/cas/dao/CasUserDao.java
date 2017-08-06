package cn.com.gzqixun.cas.dao;

import java.util.List;

import cn.com.gzqixun.cas.entity.CasUser;

public interface CasUserDao {

	/**
     * @param casUser
     * @return
     */
    void save(CasUser casUser);

    /**
     * @param casUser
     * @return
     */
    void delete(CasUser casUser);

    /**
     * @return
     */
    List<CasUser> load();

    /**
     * @param id
     * @return
     */
    CasUser findCasUserById(String id);
}
