/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

import javaapplication2.dao.ClientMapDAO;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rodri
 */
public class TableModel extends JFrame {
    
    DefaultTableModel tableModel = new DefaultTableModel();
    
    // Constructors
    public TableModel(){
        
    }
    
    public TableModel(JTable table){
        initTableModel(table);
    }
    
    // Methods
    public void initTableModel(JTable table){
        tableModel.addColumn("Name");
        tableModel.addColumn("CPF");
        tableModel.addColumn("Phone");
        
        table.setModel(tableModel);
    }
    
    public void writeOnTable(Client client){
        String name = client.getName();
        long cpf = client.getCpf();
        int phone = client.getPhone();
        
        Object[] clientArray = {name, cpf, phone};
        
        tableModel.addRow(clientArray);
    }
    
    public void textBackToField(JTable table,
            JTextField nameField, JTextField cpfField, JTextField phoneField){
        
        ClientMapDAO clientMap = new ClientMapDAO();
        
        int selectedRow = table.getSelectedRow();

        long cpfRow = (long) table.getValueAt(selectedRow, 1);
        
        Client clientToFields = clientMap.searchClient(cpfRow);
        
        String name = clientToFields.getName();
        long cpf = clientToFields.getCpf();
        int phone = clientToFields.getPhone();
        
        nameField.setText(clientToFields.getName());
        cpfField.setText(String.valueOf(cpf));
        phoneField.setText(String.valueOf(phone));
    }
    
    
    
}
