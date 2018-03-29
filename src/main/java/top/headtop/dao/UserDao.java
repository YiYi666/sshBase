package top.headtop.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import top.headtop.entity.User;

@Repository
public class UserDao {
	
	private HibernateTemplate template;
	@Autowired
	public UserDao(SessionFactory sessionFactory){
		template = new HibernateTemplate();
	}
	public void saveUser(User user) {
		template.save(user);
	}
	

}
