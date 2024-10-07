package com.apirest.Linktic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apirest.Linktic.models.Amparo;



@Repository
public interface AmparoRepository extends JpaRepository<Amparo, Integer> {}