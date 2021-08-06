package com.system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.system.model.Aula;


@Repository
public interface AulaRepository extends JpaRepository<Aula, Long> {

}
