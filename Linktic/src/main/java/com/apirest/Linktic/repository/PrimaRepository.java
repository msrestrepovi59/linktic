package com.apirest.Linktic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apirest.Linktic.models.Prima;



@Repository
public interface PrimaRepository extends JpaRepository<Prima, Integer> {}