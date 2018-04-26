/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.beam;

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
    private Chefe chefe = new Chefe();
    private Funcionario fun = new Funcionario();
    private String nome = "";
    private double salario = 0;
    private Departamento departamento = new Departamento();
    private static Database database = new Database();


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
        chefe.setDpto(departamento);
    }

    public static Database getDatabase() {
        return database;
    }

    public static void setDatabase(Database database) {
        ChefeBeam.database = database;
    }
    
    
}
