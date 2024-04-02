package com.appreg.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.appreg.entity.CitizenAppEntity;

public interface CitizenAppRepository extends JpaRepository<CitizenAppEntity,Serializable> {

}
