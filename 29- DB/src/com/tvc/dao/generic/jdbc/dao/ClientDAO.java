package com.tvc.dao.generic.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.tvc.dao.generic.jdbc.ConnectionFactory;
import com.tvc.domain.Client;

public class ClientDAO implements IClientDAO{

	//===============================================================
	
	@Override
	public Integer register(Client client) throws Exception {
		Connection connection = null;
		PreparedStatement stm = null;
		
		try {
			connection = ConnectionFactory.getConnection();
			String sql = getSqlRegister();
			stm = connection.prepareStatement(sql);
			addParameterRegister(stm, client);
			
			return stm.executeUpdate();
			
		} catch(Exception e) {
			throw e;
		}finally {
			closeConnection(connection, stm, null);
		}
		
	}
	
	public void addParameterRegister(
			PreparedStatement stm, Client client) throws SQLException{
		stm.setString(2, client.getName());
		stm.setString(1, client.getCode());
	}
	
	public String getSqlRegister() {
		StringBuilder sb = new StringBuilder();
		sb.append("insert into tb_client values ");
		sb.append("(nextval('sq_tb_client'), ?, ?)");
		
		return sb.toString();
	}

	//===============================================================
	
	@Override
	public Integer update(Client client) throws Exception {
		Connection connection = null;
		PreparedStatement stm = null;
		
		try {
			connection = ConnectionFactory.getConnection();
			String sql = getSqlUpdate();
			stm = connection.prepareStatement(sql);
			addParameterUpdate(stm, client);
			
			return stm.executeUpdate();
			
		} catch(Exception e) {
			throw e;
		}finally {
			closeConnection(connection, stm, null);
		}
		
	}
	
	public void addParameterUpdate(
			PreparedStatement stm, Client client) throws SQLException{
		stm.setString(1, client.getName());
		stm.setString(2, client.getCode());
		stm.setLong(3, client.getId());
	}
	
	public String getSqlUpdate() {
		StringBuilder sb = new StringBuilder();
		sb.append("update tb_client ");
		sb.append("set name = ?, code = ? ");
		sb.append("where id = ?");
		
		return sb.toString();
	}
	
	//===============================================================

	@Override
	public Client search(String code) throws Exception {
		Connection connection = null;
		PreparedStatement stm = null;
		Client client = null;
		ResultSet rs = null;
		
		try {
			connection = ConnectionFactory.getConnection();
			String sql = getSqlSearch();
			stm = connection.prepareStatement(sql);
			addParameterSearch(stm, code);
			rs = stm.executeQuery();
			
			if(rs.next()) {
				client = new Client();
				Long id = rs.getLong("id");
				String name = rs.getString("name");
				String cd = rs.getString("code");
				
				client.setId(id);
				client.setCode(cd);
				client.setName(name);
			}
			
			
		}catch(Exception e) {
			throw e;
		} finally {
			closeConnection(connection, stm, rs);
		}
		
		return client;
	}
	
	public void addParameterSearch(PreparedStatement stm, String code) throws SQLException{
		stm.setString(1, code);
	}
	
	public String getSqlSearch() {
		StringBuilder sb = new StringBuilder();
		sb.append("select * from tb_client ");
		sb.append("where code = ?");
		
		return sb.toString();
	}
	
	//===============================================================

	@Override
	public List<Client> searchAll() throws Exception {
		List<Client> clients = new ArrayList<>();
		Connection connection = null;
		PreparedStatement stm = null;
		ResultSet rs = null;
		Client client = null;
		
		try {
			connection = ConnectionFactory.getConnection();
			String sql = getSqlSearchAll();
			stm = connection.prepareStatement(sql);
			rs = stm.executeQuery();
			
			while(rs.next()) {
				client = new Client();
				Long id = rs.getLong("id");
				String code = rs.getString("code");
				String name = rs.getString("name");
				
				client.setId(id);
				client.setCode(code);
				client.setName(name);
				
				clients.add(client);
			}
			
			
		}catch(Exception e) {
			throw e;
		} finally {
			closeConnection(connection, stm, rs);
		}
		
		return clients;
	}
	
	public String getSqlSearchAll() {
		StringBuilder sb = new StringBuilder();
		sb.append("select * from tb_client");
		
		return sb.toString();
	}
	
	//===============================================================

	@Override
	public Integer delete(Client client) throws Exception {
		Connection connection = null;
		PreparedStatement stm = null;
		
		try {
			connection = ConnectionFactory.getConnection();
			String sql = getSqlDelete();
			stm = connection.prepareStatement(sql);
			addParameterDelete(stm, client);
			
			return stm.executeUpdate();
			
			
		}catch(Exception e) {
			throw e;
		} finally {
			closeConnection(connection, stm, null);
		}
		
	}
	
	public String getSqlDelete() {
		StringBuilder sb = new StringBuilder();
		sb.append("delete from tb_client ");
		sb.append("where code = ?");
		
		return sb.toString();
	}
	
	public void addParameterDelete(
			PreparedStatement stm, Client client) throws SQLException{
		stm.setString(1, client.getCode());
	}
	
	//===============================================================

	private void closeConnection(
			Connection connection, 
			PreparedStatement stm,
			ResultSet rs) {
		
		try {
			
			if(connection != null && !connection.isClosed()) {
			connection.close();
			
			if(stm != null && !stm.isClosed()) {
				stm.close();
			}
			
			if(rs != null && !rs.isClosed()) {
				rs.close();
			}
			
		}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
}






















