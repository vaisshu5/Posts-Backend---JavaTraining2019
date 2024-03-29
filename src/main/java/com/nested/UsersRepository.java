package com.nested;

import org.springframework.data.repository.CrudRepository;

public interface UsersRepository extends CrudRepository<User, Integer>{
	
	User findById(int id);
	
	User findByEmpName(String empName);

}
