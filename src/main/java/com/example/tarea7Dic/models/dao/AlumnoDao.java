package com.example.tarea7Dic.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.tarea7Dic.models.entity.Alumno;
import com.example.tarea7Dic.models.entity.Tutor;

public interface AlumnoDao extends CrudRepository <Alumno, Long> {
	

	@Query("from Tutor")
	public List<Tutor>findAllTutors();

}
