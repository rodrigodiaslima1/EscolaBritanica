package Tests;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.tvc.dao.generic.jdbc.ConnectionFactory;
import com.tvc.dao.generic.jdbc.dao.ClientDAO;
import com.tvc.dao.generic.jdbc.dao.IClientDAO;
import com.tvc.domain.Client;

public class DatabaseTests {

	private IClientDAO clientDAOSystem;

	/*
	 * @Test public void connectDB() throws Exception { clientDAO = new ClientDAO();
	 * 
	 * Connection connection = ConnectionFactory.getConnection();
	 * connection.close(); }
	 */

	
	 @Test 
	 public void registerTest() throws Exception{
		 System.out.println("===> Register Test: ");
		 clientDAOSystem = new ClientDAO();
	  
		 Client client1 = new Client(); 
		 client1.setCode("505");
		 client1.setName("George Robinson"); 
		 
		 Integer countRegistration = clientDAOSystem.register(client1); 
		 Assert.assertTrue(countRegistration == 1);
		 
		 Client clientDB = clientDAOSystem.search("505");
		 assertNotNull(clientDB);
		 assertEquals(client1.getCode(), clientDB.getCode());
		 assertEquals(client1.getName(), clientDB.getName());
		 
		 Integer countDeletion = clientDAOSystem.delete(clientDB);
		 assertTrue(countDeletion == 1);
	  
	 }
	 
	 @Test
	 public void searchTest() throws Exception{
		 System.out.println("\n===> Search Test: ");
		 clientDAOSystem = new ClientDAO();
		 
		 Client client = new Client();
		 client.setCode("707");
		 client.setName("Jonas Meinberg");
		 Integer countRegistration = clientDAOSystem.register(client);
		 assertTrue(countRegistration == 1);
		 
		 Client clientDB = clientDAOSystem.search("707");
		 assertNotNull(clientDB);
		 assertEquals(client.getCode(), clientDB.getCode());
		 assertEquals(client.getName(), clientDB.getName());
		 
		 System.out.print(clientDB.getId());
		 System.out.print(" | " + clientDB.getCode());
		 System.out.print(" | " + clientDB.getName());
		 System.out.println();
		 
	 }
	 
	 @Test
	 public void searchAllTest() throws Exception{
		 System.out.println("\n===> Search All Test: ");
		 clientDAOSystem = new ClientDAO();
		 List<Client> clients = new ArrayList<>();
		 
		 clients = clientDAOSystem.searchAll();
		 
		 clients.stream().forEach(client->{
			 
			 System.out.print(client.getId());
			 System.out.print(" | " + client.getCode());
			 System.out.print(" | " + client.getName());
			 System.out.println();
			 
		 });
		 
	 }
	 
	 
	 @Test
	 public void updateTest() throws Exception{
		 System.out.println("\n===> Update Test: ");
		 clientDAOSystem = new ClientDAO();
		 
		 Client client = new Client();
		 client.setCode("606");
		 client.setName("Dexter Bird");
		 Integer countRegistration = clientDAOSystem.register(client);
		 assertTrue(countRegistration == 1);
		 System.out.println("===> Registration completed");
		 
		 Client clientDB = clientDAOSystem.search("606");
		 assertNotNull(clientDB);
		 assertEquals(client.getCode(), clientDB.getCode());
		 assertEquals(client.getName(), clientDB.getName());
		 System.out.println("===> Search completed");
		 
		 clientDB.setCode("6062");
		 clientDB.setName("Dexter Bird Williamson");
		 Integer countUpdate = clientDAOSystem.update(clientDB);
		 Assert.assertTrue(countUpdate == 1);
		 System.out.println("===> Update completed");
		 
		 Client clientDB1 = clientDAOSystem.search("606");
		 assertNull(clientDB1);
		 
		 Client clientDB2 = clientDAOSystem.search("6062");
		 assertNotNull(clientDB2);
		 assertEquals(clientDB.getId(), clientDB2.getId());
		 assertEquals(clientDB.getCode(), clientDB2.getCode());
		 assertEquals(clientDB.getName(), clientDB2.getName());
		 
		 List<Client> list = clientDAOSystem.searchAll();
		 list.stream().forEach(c ->{
			 System.out.print(client.getId());
			 System.out.print(" | " + clientDB2.getCode());
			 System.out.print(" | " + clientDB2.getName());
			 System.out.println();
		 });
		 
	 }
	 
	 
	 @Test
	 public void deleteTest() throws Exception {
		 System.out.println("\n===> Delete Test: ");
		 ClientDAO clientDAOSystem = new ClientDAO();
		 
		 Client client = new Client();
		 client.setCode("909");
		 client.setName("Herman Schneider Anguson");
		 Integer countRegistration = clientDAOSystem.register(client);
		 assertTrue(countRegistration == 1);
		 System.out.println("===> Registration completed");
		 
		 Integer countDeletion = clientDAOSystem.delete(client);
		 assertTrue(countDeletion == 1);
		 System.out.println("===> Deletion completed");
	 }
	 

}



















