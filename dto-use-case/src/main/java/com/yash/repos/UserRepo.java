package com.yash.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.yash.entities.User;

@Repository
public interface UserRepo extends JpaRepository<User, String> {

	@Query( "select  u.username,u.userimage from User u where u.username=?1")
	List<Object[]> getUserInfo(@Param("username")String username);

}
