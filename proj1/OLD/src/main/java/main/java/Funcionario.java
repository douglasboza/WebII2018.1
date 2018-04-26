/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java;

/**
 *
 * @author douglasboza
 */
public class Funcionario {
    
    public String nome;
    public double salario;
    public int id_departamento;
    int id;
    
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

    public int getLotacao() {
        return id_departamento;
    }

    public void setLotacao(int id_departamento) {
        this.id_departamento = id_departamento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
}   
