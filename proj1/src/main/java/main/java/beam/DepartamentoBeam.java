/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.beam;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import main.java.DAO.DepartamentoDAO;
import main.java.Departamento;

/**
 *
 * @author douglasboza
 */

@Named(value = "DepartamentoBeam")
@RequestScoped

public class DepartamentoBeam implements Serializable{
    @Inject DepartamentoDAO departamentodao;
    
    private String nome;
    private Departamento departamento = new Departamento();
    private List<Departamento> departamentoList = new ArrayList<>();
   
   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
                System.out.print("aquii213");

        this.nome = nome;
        departamento.setNome(nome);
    }

  
    public List<Departamento> getLista_departamentos() {
        this.departamentoList = departamentodao.findDepartamento();
        
        return departamentoList;
    }
    
    public void excluirDepartamento(int id_rem1){
        Long id_rem = Long.valueOf(id_rem1);
       departamentodao.removerDepartamento(id_rem);
    }
    
    public void editarDepartamento(Departamento departamento){
        this.setDepartamento(departamento);
        this.setNome(departamento.getNome());
        System.out.println("igual aaaa " +departamento);
//      
    }   
    
    public void addDepartamento(Departamento dep_editar) {
        if(dep_editar != null){
            departamentodao.editarDepartamento(departamento);
        }else{
            departamentodao.addNew(this.departamento);
        }
      
    }
    
    

    public Departamento getDepartamento() {
        return departamento;
    }

    
    public void setDepartamento(Departamento departamento) {
        this.setNome(departamento.getNome());
        this.departamento = departamento;
    }
  
    
    
    
}
