package com.fruit.kiwi.DAO;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import com.fruit.kiwi.model.User;
@Repository
@Transactional
public interface UserDAO {
	
	public boolean save(User user);
	public boolean update(User user);
	public boolean delete(User user);
	public List<User> list();
    public User isValidUser(String name,String password);

}
