package cn.com.gzqixun.cas.service;

import java.util.List;

import cn.com.gzqixun.cas.entity.CasUser;

public interface CasUserService {

	/**
     * @param casUser
     * @return
     */
    void save(CasUser casUser);

    /**
     * @param casUserDao
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
