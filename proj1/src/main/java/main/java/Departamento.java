/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.NamedQuery;

/**
 *
 * @author douglasboza
 */


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@NamedQuery(name = "findAllDepartamentos", query = "SELECT e FROM Departamento e")


public class Departamento implements Serializable{
    String nome;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_departamento;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getId_departamento() {
        return id_departamento;
    }

    public void setId_departamento(Long id_departamento) {
        this.id_departamento = id_departamento;
    }
    

    
}
