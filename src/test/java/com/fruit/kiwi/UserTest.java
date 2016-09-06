package com.fruit.kiwi;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.fruit.kiwi.DAO.UserDAO;
import com.fruit.kiwi.model.User;



public class UserTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		 context.scan("com.fruit");
		 context.refresh();
		 UserDAO userDAO =(UserDAO) context.getBean("UserDAO");
		 User user =(User) context.getBean("User");

		 user.setName("ganesh");
		 
		 user.setEmail("vemuriganeshg@gmail.com");
		 user.setPassword("ganeshv");
		 user.setMobile("8185956671");
		 user.setAddress("Hyderabad");
		if(userDAO.save(user)==true){
			System.out.println("a");
		}
		else{
			System.out.println("b");
		}
			}

		}
