/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.DAO;

import java.util.List;
import javax.annotation.Resource;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.UserTransaction;
import main.java.Funcionario;

/**
 *
 * @author douglasboza
 */

@Named
@RequestScoped
public class FuncionarioDAO {
	@PersistenceContext(unitName = "ProjetoPU")
	private EntityManager entityManager;

	@Resource
	private UserTransaction userTransaction;

	public Funcionario addNew(Funcionario funcionario) {
		try {
			userTransaction.begin();
			entityManager.persist(funcionario);
			userTransaction.commit();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return funcionario;
	}
  
      
       
        
	public List<Funcionario> findFuncionarios() {
            return null;
//            TypedQuery<Funcionario> query = entityManager.createNamedQuery("findAllMedicos", Funcionario.class);
//            return query.getResultList();
	}

}
