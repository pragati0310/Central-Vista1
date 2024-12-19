package com.centralvista.CentralVista.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.centralvista.CentralVista.model.FlatManage;




@Repository
@Qualifier("flatmngRepo")
public interface  FlatManageRepository extends JpaRepository<FlatManage, Long>{

}