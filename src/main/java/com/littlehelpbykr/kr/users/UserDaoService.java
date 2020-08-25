package com.littlehelpbykr.kr.users;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

//@Component
@Repository
@Transactional
public class UserDaoService {
	@Autowired
	private UserRepository userRepository;
	
	@PersistenceContext
	private EntityManager entityManager;
	public long insert(User user){
		entityManager.persist(user);
		return user.getId();
	}

	static {

	}

	// get all users
	public List<User> getUsers() {
		return userRepository.findAll();
	}

	// add user
	public User addUser(User user) {
		return userRepository.save(user);
	}

	// get specific user
	public User getUser(int id) {
		return userRepository.findById(id);
	}
	
	//Delete User
	public void removeUser(User user){
		 userRepository.delete(user);
	}

}
