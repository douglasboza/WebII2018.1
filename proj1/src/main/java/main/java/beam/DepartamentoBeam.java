/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.beam;

import java.io.Serializable;
import java.util.ArrayList;
import javax.ejb.Stateless;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import main.java.Chefe;
import main.java.DAO.Database;
import main.java.Departamento;
import main.java.Funcionario;

/**
 *
 * @author douglasboza
 */

@Named(value = "DepartamentoBeam")
@RequestScoped

public class DepartamentoBeam implements Serializable{
    private String nome;
    private static int id = 0;
    private Departamento departamento = new Departamento();
    private static Database database = new Database();
    
    public DepartamentoBeam(){
        this.id = this.id+1;
        this.departamento.setId(this.id);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
        departamento.setNome(nome);
        database.setLista_departamentos(departamento);
    }

  
    public ArrayList<Departamento> getLista_departamentos() {
        System.out.println( database.getLista_departamentos() );
        return database.getLista_departamentos();
    }
    
    
    
}
