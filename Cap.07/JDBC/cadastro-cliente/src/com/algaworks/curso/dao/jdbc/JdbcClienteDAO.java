package com.algaworks.curso.dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.algaworks.curso.dao.ClienteDAO;
import com.algaworks.curso.dao.DAOException;
import com.algaworks.curso.modelo.Cliente;

public class JdbcClienteDAO implements ClienteDAO {

	private Connection connection;

	public JdbcClienteDAO(Connection connection) {
		// super();
		this.connection = connection;
	}

	@Override
	public void salvar(Cliente cliente) {

		try {
			String sql = String.format("insert into cliente (nome) values ('%s')", cliente.getNome());

			// https://www.guj.com.br/t/o-que-e-preparedstatement-e-para-que-serve/86774/2
			// Trata o SQL para evitar erros
			/*
			 * Uma instrução SQL é pré-compilada e armazenada em um objeto
			 * PreparedStatement. Esse objeto pode ser usado para executar eficientemente
			 * essa instrução várias vezes.
			 * https://docs.oracle.com/javase/7/docs/api/java/sql/PreparedStatement.html
			 */
			PreparedStatement ps = this.connection.prepareStatement(sql);
			// comitando no banco
			ps.executeUpdate();
		} catch (SQLException e) {

			throw new DAOException("Erro ao salvar clente", e);
		} finally {
			try {
				this.connection.close();
			} catch (SQLException e) {
			}
		}
	}

	@Override
	public Cliente buscarPeloCodigo(Long codigo) {

		Cliente cliente = null;

		try {

			String sql = String.format("select * from cliente where codigo = %d", codigo);
			PreparedStatement ps = this.connection.prepareStatement(sql);

			// ResultSet é uma especie de tabela
			ResultSet rs = ps.executeQuery();

			// Enquanto tiver algo no rs, ou seja na tabela retornada o while sera executado
			while (rs.next()) {
				cliente = new Cliente();
				cliente.setCodigo(rs.getLong("codigo"));
				cliente.setNome(rs.getString("nome"));
			}

		} catch (SQLException e) {

			throw new DAOException("Erro ao buscar clente", e);
		} finally {
			try {
				this.connection.close();
			} catch (Exception e) {
			}
		}

		return cliente;

	}

	@Override
	public List<Cliente> buscarTodos() {
		
		List<Cliente> clientes = new ArrayList<>();
		
		try {
			
			String sql = "select * from cliente";
			PreparedStatement ps = this.connection.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				Cliente cliente = new Cliente();
				cliente.setCodigo(rs.getLong("codigo"));
				cliente.setNome(rs.getString("nome"));
				
				clientes.add(cliente);
			}

		} catch (SQLException e) {

			throw new DAOException("Erro ao buscar clente", e);
		} finally {
			try {
				this.connection.close();
			} catch (Exception e) {
			}
		}

		return clientes;
	}

}
