
package javaapplication2.dao;

import java.util.List;
import java.util.HashMap;
import java.util.Map;
import javaapplication2.Client;
import javax.swing.JOptionPane;

/**
 *
 * @author rodri
 */
public class ClientMapDAO implements IClientDAO {

    public static Map<Long, Client> clientMap = new HashMap<>();

    @Override
    public boolean checkIfClientOnList(long cpf){
        for(Long key: clientMap.keySet()){
            if(key.equals(cpf)){
                return true;
            }
        }
        return false;
    }
    
    @Override
    public void registerClient(Client client) {
        
        long cpf = client.getCpf();
        
        if(checkIfClientOnList(cpf)){
            JOptionPane.showMessageDialog(null, "User already registered ...");
        }else{
            clientMap.put(cpf, client);
            JOptionPane.showMessageDialog(null, "User registered successfuly!");
        }
        
    }

    @Override
    public void deleteClient(long cpf) {
        if(checkIfClientOnList(cpf)){
            clientMap.remove(cpf);
            JOptionPane.showMessageDialog(null, "User removed ...");
        }else{
            JOptionPane.showMessageDialog(null, "User is not on list ...");
        }
    }

    @Override
    public void editClient(Client client) { 
        System.out.println("===> Inside the editClient method ...");
        Long cpf = client.getCpf();
        if(checkIfClientOnList(cpf)){
            clientMap.remove(cpf);
            clientMap.put(cpf, client);
            JOptionPane.showMessageDialog(null, "User edited\n successfully!");
        }
        System.out.println("===> Ending editClient method ...");
    }

    @Override
    public Client searchClient(long cpf) {
        Client requestedClient = null;
        if(checkIfClientOnList(cpf)){
            requestedClient = clientMap.get(cpf);
        } else{
            JOptionPane.showMessageDialog(null, "Client not found ...");
        }
        return requestedClient;
    }
    
   
    
}
