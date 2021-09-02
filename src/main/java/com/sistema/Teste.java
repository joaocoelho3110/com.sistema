package com.sistema;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.sistema.usuario.Usuario;


public class Teste {
	
	private static EntityManagerFactory entityManegerFactory = Persistence.createEntityManagerFactory ("teste");
	private static EntityManager entityManeger = entityManegerFactory.createEntityManager();
	
	public static void main(String[] args) {
		
		Usuario usuario = entityManeger.find(Usuario.class, 1);
		System.out.println("Identificação do usuario: " + usuario.getId());
		System.out.println("Nome do usuario " + usuario.getNome() );
		
	}
}	