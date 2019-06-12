package com.pan.example.testspringbootdemo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pan.example.testspringbootdemo.dao.TbplayerinfoMapper;
import com.pan.example.testspringbootdemo.models.Tbplayerinfo;
import com.pan.example.testspringbootdemo.models.TbplayerinfoExample;

@SpringBootApplication
@MapperScan("com.pan.example.testspringbootdemo.dao")//将项目中对应的mapper类的路径加进来就可以了
public class TestSpringbootDemoApplication {
	private static Logger logger = LoggerFactory.getLogger(TestSpringbootDemoApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(TestSpringbootDemoApplication.class, args);
		
		logger.info("服务器启动完成:");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		while(true){
			System.out.println("输入命令:<stop/test/other...>"); 
			try {
				String str = br.readLine().trim();
				logger.info("后台指令:" + str);
				if(str.equals("stop")){
					break;
				}
				else if(str.equals("testDb")){
					testDb();
				}
				else{
					System.out.println("不接受此命令: " + str);
				}
			} catch (Exception e) {
				logger.error("执行命令失败:遇到致命错误:",e);
			}
		}
		
		System.exit(0);
	}

	/**
	 * testDb
	 */
	private static void testDb() {
		TbplayerinfoMapper playerinfoMapper = SpringContext.getBean(TbplayerinfoMapper.class);
		
		TbplayerinfoExample example = new TbplayerinfoExample();
		TbplayerinfoExample.Criteria criteria = example.createCriteria();
		criteria.andNameLike("user%");
		criteria.andAccountIdBetween(20005L, 20095L);
		example.setOrderByClause("accountId desc");//排序
		
		for (int i = 0; i < 100; i++) {//模拟多线程查询
			final int tId = i;
			new Thread() {
				public void run() {
					while(true) {
						try {
							List<Tbplayerinfo> sList = playerinfoMapper.selectByExample(example);
							if(sList != null && !sList.isEmpty()) {//测试打印
								logger.info(tId + "---测试查询,sList.size=" + sList.size());
//								for (Tbplayerinfo tp : sList) {
//									System.out.println("find.player=" + tp.getName() + "\t" + tp.getAccountId());
//								}
							}else {
								logger.info(tId + "---测试查询,rs=无数据");
							}
							
							Thread.sleep(10);
						} catch (Exception e) {
							e.printStackTrace();
						}
						
					}
				}
			}.start();
		}
	}
}
