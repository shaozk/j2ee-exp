package dao;

import org.springframework.stereotype.Repository;

@Repository("testDao")
public class TestDaoImpl implements TestDao{

	@Override
	public void visitdao(String str) {

		System.out.println("用户权限："+str+";成功访问！！");
	}
}
