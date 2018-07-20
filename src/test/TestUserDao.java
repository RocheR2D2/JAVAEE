package test;

import bean.User;
import dao.UserDao;

public class TestUserDao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user = new User();
		user.setEmail("rocher2d2@gmail.com");
		user.setMdp("22222222");
		
		UserDao userdao = new UserDao(user.getEmail(), user.getMdp());
		//System.out.println(userdao.connection());
		System.out.println(userdao.addUser());
	}

}
