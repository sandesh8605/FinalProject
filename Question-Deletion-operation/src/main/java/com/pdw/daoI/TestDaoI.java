package com.pdw.daoI;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pdw.entity.Test;
@Repository
public interface TestDaoI extends JpaRepository<Test,String>{

}