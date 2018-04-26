/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.DAO;

import java.util.ArrayList;
import java.util.List;
import main.java.Chefe;
import main.java.Departamento;
import main.java.Funcionario;

/**
 *q
 * @author douglasboza
 */
public class Database {

   private ArrayList<Funcionario> lista_funcionarios = new ArrayList();
   private ArrayList<Departamento> lista_departamentos = new ArrayList();
   private ArrayList<Chefe> lista_chefes = new ArrayList();
   


    public ArrayList<Funcionario> getLista_funcionarios() {
        return lista_funcionarios;
    }

    public void setLista_funcionarios(Funcionario fun) {
        this.lista_funcionarios.add(fun);
    }

    public ArrayList<Departamento> getLista_departamentos() {
        return lista_departamentos;
    }

    public void setLista_departamentos(Departamento dep) {
        this.lista_departamentos.add(dep);
    }

    public ArrayList<Chefe> getLista_chefes() {
        return lista_chefes;
    }

    public void setLista_chefes(Chefe che) {
        this.lista_chefes.add(che);
    }
    
    
}