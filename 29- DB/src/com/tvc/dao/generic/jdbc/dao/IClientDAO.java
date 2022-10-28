package com.tvc.dao.generic.jdbc.dao;

import java.util.List;

import com.tvc.domain.Client;

public interface IClientDAO {
	/*
	 * CRUD
	 * C - CREATE
	 * R - REGISTER
	 * U - UPDATE
	 * D - DELETE
	 */
	
	public Integer register(Client client) throws Exception;
	public Integer update (Client client) throws Exception;
	public Client search(String code) throws Exception;
	public List<Client> searchAll() throws Exception;
	public Integer delete(Client client) throws Exception;

}
