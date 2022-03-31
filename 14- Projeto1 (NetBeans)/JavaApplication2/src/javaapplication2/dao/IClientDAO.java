/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package javaapplication2.dao;

import javaapplication2.Client;

/**
 *
 *  CRUD stands for:
 *  CREATE
 *  READ
 *  UPDATE
 *  DELETE
 * 
 * @author rodri
 */
public interface IClientDAO {
    
    public void registerClient(Client client);
    
    public void  deleteClient(long cpf);
    
    public void editClient(Client client);
    
    public Client searchClient(long cpf);
    
    public boolean checkIfClientOnList(long cpf);
    
    //public boolean checkFieldsCondition(Client client);
    
}
