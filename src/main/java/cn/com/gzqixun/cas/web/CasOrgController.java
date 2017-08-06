package cn.com.gzqixun.cas.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.com.gzqixun.cas.entity.CasOrg;
import cn.com.gzqixun.cas.entity.CasUser;
import cn.com.gzqixun.cas.service.CasOrgService;
import cn.com.gzqixun.cas.service.CasUserService;

//@RequestMapping(value = "")
@Component("casOrgController")
public class CasOrgController {
	
	@Autowired
	private CasOrgService casOrgService;
	
	@RequestMapping("/add")
    public String add(CasOrg casOrg)
                throws Exception {
        return "";
    }
}
