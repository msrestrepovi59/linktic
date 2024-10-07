package com.apirest.Linktic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apirest.Linktic.models.Asegurado;



@Repository
public interface AseguradoRepository extends JpaRepository<Asegurado, Integer> {
	
}
