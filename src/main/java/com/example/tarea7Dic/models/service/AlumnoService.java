package com.example.tarea7Dic.models.service;

import java.util.List;

import com.example.tarea7Dic.models.entity.Alumno;
import com.example.tarea7Dic.models.entity.Tutor;



public interface AlumnoService {
	
	public List<Alumno> findAll();
	public Alumno findById(Long id);
	public Alumno save(Alumno alumno);
	public void delete(Long id);
	
	public List<Tutor>findAllTutors();

}
