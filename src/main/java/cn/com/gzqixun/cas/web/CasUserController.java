package cn.com.gzqixun.cas.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.com.gzqixun.cas.entity.CasUser;
import cn.com.gzqixun.cas.service.CasUserService;

@Component("casUserController")
@Controller
public class CasUserController {
	
	@Autowired
	private CasUserService casUserService;
	
	@RequestMapping(path="/addUser", method = RequestMethod.GET)
    public String add(CasUser casUser)
                throws Exception {
		casUser = new CasUser();
		casUser.setId("1");
		casUser.setLoginName("hello");
		casUser.setPassword("hello");
		casUser.setEmail("420111169@qq.com");
		casUserService.save(casUser);
        return "";
    }
	
	@RequestMapping(path="/loadUser")
    public CasUser get(CasUser casUser)
                throws Exception {
        return casUserService.findCasUserById(casUser.getId());
    }
	
	@RequestMapping(path="/loadUser")
    public List<CasUser> load()
                throws Exception {
        return casUserService.load();
    }
}
