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

public class Departamento {
    String nome;
    int id_chefe;
    int id;
    
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getChefe() {
        return id_chefe;
    }

    public void setId_Chefe(int id_chefe) {
        this.id_chefe = id_chefe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
