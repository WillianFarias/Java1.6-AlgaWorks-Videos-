package com.algaworks.curso.dao;

import com.algaworks.curso.dao.jdbc.JdbcDAOFactory;

public abstract class DAOFactory {
	
	public static DAOFactory getDAOFactory() {
		return new JdbcDAOFactory();
	}
	
	//Métodos abstratos são obrigatorios serem implementados nas clases que os herdao
	public abstract ClienteDAO getClienteDAO();

}
