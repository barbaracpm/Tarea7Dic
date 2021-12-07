package com.example.tarea7Dic.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.tarea7Dic.models.dao.AlumnoDao;
import com.example.tarea7Dic.models.entity.Alumno;
import com.example.tarea7Dic.models.entity.Tutor;



@Service
public class AlumnoServiceImpl implements AlumnoService {
	
	@Autowired
	private AlumnoDao alumnoDao;
	

	@Override
	@Transactional(readOnly = true)
	public List<Alumno> findAll() {
		
		return (List<Alumno>) alumnoDao.findAll();
	}
	
	
	@Override
	@Transactional(readOnly = true)
	public Alumno findById(Long id) {
		return alumnoDao.findById(id).orElse(null);
	}
	
	@Override
	@Transactional
	public Alumno save(Alumno alumno) {
		return alumnoDao.save(alumno);
		
	}
	
	@Override
	@Transactional
	public void delete(Long id) {
		alumnoDao.deleteById(id);
		System.out.println("Este metodo eliminará un alumno por id");
	}

	@Override
	@Transactional(readOnly=true)
	public List<Tutor> findAllTutors() {
		
		return alumnoDao.findAllTutors();
	}

}
