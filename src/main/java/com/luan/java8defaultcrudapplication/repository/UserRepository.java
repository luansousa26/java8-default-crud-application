package com.luan.java8defaultcrudapplication.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.luan.java8defaultcrudapplication.domain.User;
@SuppressWarnings("unused")
@Repository
public interface UserRepository extends JpaRepository<User, Long>, JpaSpecificationExecutor<User>{

}
