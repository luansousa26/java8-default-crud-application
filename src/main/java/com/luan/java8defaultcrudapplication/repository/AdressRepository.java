package com.luan.java8defaultcrudapplication.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.luan.java8defaultcrudapplication.domain.Address;

@SuppressWarnings("unused")
@Repository
public interface AdressRepository extends JpaRepository<Address, Long>, JpaSpecificationExecutor<Address>{
}
