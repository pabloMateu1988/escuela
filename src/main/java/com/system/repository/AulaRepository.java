package com.system.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.system.model.Aula;
import com.system.model.MateriaDocenteCurso;

@Repository
public interface AulaRepository extends JpaRepository<Aula, Long> {

}
