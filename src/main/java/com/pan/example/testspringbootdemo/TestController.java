package com.pan.example.testspringbootdemo;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pan.example.testspringbootdemo.dao.TbaccountMapper;
import com.pan.example.testspringbootdemo.models.Tbaccount;
import com.pan.example.testspringbootdemo.models.TbaccountExample;

/**
 * 测试
 * @author Pan
 *
 */
@RestController
public class TestController {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	/**
	 * 测试http接口: http://127.0.0.1:8080/hello
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	@ResponseBody
	public String hello(HttpServletRequest request) {
		String ip = IpUtil.getIpAddr(request);
		logger.info("your ip=" + ip);
		
		return "hello,你的ip=" + ip + ",当前时间:" + new Date().toString();
	}
	
	/**
	 * 测试数据库: http://127.0.0.1:8080/hello?username=pan&update=true
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/addUser", method = RequestMethod.GET)
	@ResponseBody
	public String addUser(HttpServletRequest request) {
		String username=request.getParameter("username");
		String update=request.getParameter("update");//强制更新
		
//		System.out.println("username is:"+username);
		
		if(username == null || username.isEmpty()) {
			return "测试数据库,rs=请输入[用户名],当前时间:" + new Date().toString();
		}
		
		//测试查询数据库
		TbaccountMapper accountMapper = SpringContext.getBean(TbaccountMapper.class);
		
		TbaccountExample example = new TbaccountExample();
		TbaccountExample.Criteria criteria = example.createCriteria();
		criteria.andLoginNameEqualTo(username);
		
		List<Tbaccount> sList = accountMapper.selectByExample(example);
		if(sList != null && !sList.isEmpty()) {
			if(update != null && update.equals("true")) {//强制删除
				for (Tbaccount ta : sList) {
					logger.info("delte.account=" + ta);
					accountMapper.deleteByPrimaryKey(ta.getId());
				}
			}else {
				return "测试数据库,rs=[用户名重复],size=" + sList.size() + ",当前时间:" + new Date().toString();
			}
		}
		
		Tbaccount account = accountMapper.selectByPrimaryKey(922347716000012L);//作为模板
		logger.info("模板.account=" + account);
		
		//修改参数
		account.setId(System.currentTimeMillis());
		account.setLoginName(username);
		account.setCreateTime(new Date());
		
		int rs = accountMapper.insert(account);
		
		logger.info("accountMapper.insert=" + rs);
		
		return "测试数据库,rs=" + rs + ",当前时间:" + new Date().toString();
	}
	
	/**
	 * 测试数据库: http://127.0.0.1:8080/findUser?username=pan
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/findUser", method = RequestMethod.GET)
	@ResponseBody
	public String findUser(HttpServletRequest request) {
		String username=request.getParameter("username");
		
		if(username == null || username.isEmpty()) {
			return "测试查询,rs=请输入[用户名],当前时间:" + new Date().toString();
		}
		
		//测试查询数据库
		TbaccountMapper accountMapper = SpringContext.getBean(TbaccountMapper.class);
		
		TbaccountExample example = new TbaccountExample();
		TbaccountExample.Criteria criteria = example.createCriteria();
		criteria.andLoginNameEqualTo(username);
		
		List<Tbaccount> sList = accountMapper.selectByExample(example);
		if(sList != null && !sList.isEmpty()) {
			StringBuffer sb = new StringBuffer();
			sb.append("测试查询,当前时间:" + new Date().toString());
			sb.append("<br/>");
			
			for (Tbaccount ta : sList) {
				logger.info("find.account=" + ta);
				sb.append(ta);
				sb.append("<br/>");
				
//				accountMapper.deleteByPrimaryKey(ta.getId());//测试删除
			}
			
			return sb.toString();
		}else {
			return "测试查询,rs=无数据,当前时间:" + new Date().toString();
		}
	}
}
