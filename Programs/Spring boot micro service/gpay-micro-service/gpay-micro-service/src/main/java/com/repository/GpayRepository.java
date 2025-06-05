package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.Gpay;

@Repository
public interface GpayRepository extends JpaRepository<Gpay,Integer>{

}
