/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.beam;

import java.util.ArrayList;
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

@Named(value = "ChefeBeam")
@RequestScoped

public class ChefeBeam {
    private static Database database = new Database();
    private Chefe chefe = new Chefe();
    private int id_funcionario;
    private int id_departamento;
    private static int id = 0;
    
    public ChefeBeam(){
        this.id = this.id+1;
        this.chefe.setId(this.id);
    }
    
    public int getId_funcionario() {
        return id_funcionario;
    }

    public void setId_funcionario(int id_funcionario) {
        this.id_funcionario = id_funcionario;
        this.chefe.setId_funcionario(id_funcionario);
    }

    public int getId_departamento() {
        return id_departamento;
    }

    public void setId_departamento(int id_departamento) {
        this.id_departamento = id_departamento;
        this.chefe.setId_departamento(id_departamento);
        addDatabase();
    }
    
    public void addDatabase() {
        this.database.setLista_chefes(this.chefe);
    }
    
    public ArrayList<Chefe> getLista_chefes() {
        return database.getLista_chefes();
    }
       
}
