/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 *
 * @author douglasboza
 */

@Entity
@PrimaryKeyJoinColumn(name="id_funcionario")
@NamedQuery(name = "findAllChefes", query = "select e from Chefe e")

public class Chefe extends Funcionario{ 

//    int id;
    int id_departamento;
//    int id_funcionario;

//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//    
    
        
    public int getId_departamento() {
        return id_departamento;
    }

    public void setId_departamento(int id_departamento) {
        this.id_departamento = id_departamento;
    }

//    public int getId_funcionario() {
//        return id_funcionario;
//    }
//
//    public void setId_funcionario(int id_funcionario) {
//        this.id_funcionario = id_funcionario;
//    }
    

    
    
}
