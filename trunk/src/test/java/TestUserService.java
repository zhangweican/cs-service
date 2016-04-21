import java.util.Calendar;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.github.pagehelper.PageInfo;
import com.leweiyou.service.mybatis.entry.x.TUserLogin;
import com.leweiyou.service.mybatis.entry.x.TUserLoginExample;
import com.leweiyou.service.service.x.TUserLoginService;

/**
 * Junit test spring mybatis
 * @author zhangweican
 * @version 0.01
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext-service.xml","classpath:spring-mybatis.xml" })
public class TestUserService {

	private static final Logger LOGGER = Logger
			.getLogger(TestUserService.class);

	@Autowired
	private TUserLoginService tUserLoginService;

	//@Test
	public void testInsert() {
		TUserLoginExample e = new TUserLoginExample();
		e.createCriteria().andUsernameEqualTo("U_" + -1);
		tUserLoginService.deleteByExample(e);
		
		int i = -1;
		TUserLogin userInfo = new TUserLogin();
		userInfo.setId(Long.parseLong(i + ""));
		userInfo.setUsername("U_" + i);
		userInfo.setPassword("P_" + i);
		userInfo.setLoginDate(Calendar.getInstance().getTime());
		int result = tUserLoginService.insert(userInfo);
		
		Assert.assertEquals(1, result);
	}
	@Test
	public void testQueryPage() {
		PageInfo<TUserLogin> pi = tUserLoginService.selectByExample(null, 3, 10);
		LOGGER.info("PageInfo:" + pi.toString());
		Assert.assertTrue(pi.getTotal() > 0);
	}
	@Test
	public void testQueryPage2() {
		PageInfo<TUserLogin> pi = tUserLoginService.selectByExample(null, 3, 10);
		LOGGER.info("PageInfo:" + pi.toString());
		Assert.assertTrue(pi.getTotal() > 0);
	}
	//@Test
	public void testSelectOne() {
		TUserLoginExample e = new TUserLoginExample();
		e.createCriteria().andUsernameEqualTo("U_" + -1);
		TUserLogin t = tUserLoginService.selectOne(e);
		LOGGER.info("XXX:" + t.getUsername());
		Assert.assertTrue(t != null);
	}
	//@Test
	public void testDelete() {
		TUserLoginExample e = new TUserLoginExample();
		e.createCriteria().andUsernameEqualTo("U_" + -1);
		int result = tUserLoginService.deleteByExample(e);
		Assert.assertTrue(result == 1);
	}

}