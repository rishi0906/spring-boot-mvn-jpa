package com.dating.test.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dating.test.model.SampleModelClass;

public interface DatingDaoRepository extends JpaRepository<SampleModelClass,Long> {

	public SampleModelClass findByprospectNo(String pan);

	
}
