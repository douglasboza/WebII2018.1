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
import javax.persistence.OptimisticLockException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import javax.transaction.UserTransaction;
import main.java.Departamento;


/**
 *
 * @author douglasboza
 */

@Named
@RequestScoped
public class DepartamentoDAO {
	@PersistenceContext(unitName = "ProjetoPU")
	private EntityManager entityManager;

	@Resource
	private UserTransaction userTransaction;

	public Departamento addNew(Departamento departamento) {
		try {
			userTransaction.begin();
			entityManager.persist(departamento);
			userTransaction.commit();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return departamento;
	}
  
      
       
        
	public List<Departamento> findDepartamento() {
            TypedQuery<Departamento> query = entityManager.createNamedQuery("findAllDepartamentos", Departamento.class);
            return query.getResultList();
	}
        
        @Transactional
        public int removerDepartamento(Long id_departamento) {
           int isSuccessful = entityManager.createQuery("delete from Departamento p where p.id_departamento=:id_departamento")
                    .setParameter("id_departamento", id_departamento)
                    .executeUpdate();
            if (isSuccessful == 0) {
                return 0;
            }else{
                return 1;
            }
        }
        
          public Departamento editarDepartamento(Departamento departamento) {
          try {
			userTransaction.begin();
			entityManager.merge(departamento);
			userTransaction.commit();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return departamento;
        }
          
          

}
