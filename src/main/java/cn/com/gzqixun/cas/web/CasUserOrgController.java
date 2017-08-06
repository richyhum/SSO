package cn.com.gzqixun.cas.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.com.gzqixun.cas.entity.CasUser;
import cn.com.gzqixun.cas.entity.CasUserOrg;
import cn.com.gzqixun.cas.service.CasUserOrgService;
import cn.com.gzqixun.cas.service.CasUserService;

//@RequestMapping(value = "")
@Component("casUserOrgController")
public class CasUserOrgController {
	
	@Autowired
	private CasUserOrgService casUserOrgService;
	
	@RequestMapping("/add")
    public String add(CasUserOrg casUserOrg)
                throws Exception {
        return "";
    }
}
