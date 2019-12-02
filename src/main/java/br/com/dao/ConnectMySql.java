package br.com.dao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class ConnectMySql {
	
	private static EntityManager em;
	
	public static EntityManager getEntityManagerFactory() {
		
		if(em == null) {
			em = Persistence.createEntityManagerFactory("mySqlConnector").createEntityManager();
			System.out.println(" Passou conexao ");
		}
		return em;
	}
	
	

}
