package com.funcionarios.apifuncionarios.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.funcionarios.apifuncionarios.models.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long>{
	
	Funcionario findById(long id);
	
}
