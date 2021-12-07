package com.example.tarea7Dic.models.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.tarea7Dic.models.entity.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario, Long>{
	
public Usuario findByUsername(String username); 
	
	//el 1 se refiere al primer parámetro (string username)
	@Query("select u from Usuario u where u.username=?1")
	public Usuario findByUsername2(String username);

}
