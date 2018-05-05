/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.beam;

import br.ufrn.imd.web2.encryption.EncryptionBean;
import br.ufrn.imd.web2.encryption.EncryptionException;
import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import main.java.TextoObj;

/**
 *
 * @author douglasboza
 */

@Named(value = "EncriptarBean")
@RequestScoped
public class EncriptarBean implements Serializable{
    String texto;
    String texto_comp;
    String texto_hash;
    String texto_encrypted;
    String resultado;
    TextoObj texto_obj = new TextoObj();
    EncryptionBean enc = new EncryptionBean();

    public EncriptarBean() throws Exception {
        enc.initialize();
    }
	
    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
        texto_obj.setTexto(texto);
    }
    
    public void setEncrypt() throws IllegalArgumentException, EncryptionException{
        setTexto_encrypted(enc.encrypt(texto_obj.getTexto()) );
        texto_obj.setTexto_encrypted(getTexto_encrypted());
    }
    
    public void setHash() throws IllegalArgumentException, EncryptionException{
        setTexto_hash( enc.hash(texto_obj.getTexto()) );
        texto_obj.setTexto_hash(getTexto_hash());
    }
    
    public void comparar() throws IllegalArgumentException, EncryptionException{
        if( getTexto_hash().equals(enc.hash( getTexto_comp()))){
            setResultado("Hash: "+getTexto_hash()+" Texto: "+getTexto_comp());
        }else{
            if( getTexto_encrypted().equals(enc.encrypt(getTexto_comp()))){
                setResultado("Encriptação: "+getTexto_encrypted()+" Texto: "+getTexto_comp());
            }else{
                setResultado("O texto não confere");
            }
        }
        
               
    }
    

    public String getTexto_hash() {
        return texto_hash;
    }

    public void setTexto_hash(String texto_hash) {
        this.texto_hash = texto_hash;
    }

    public String getTexto_encrypted() {
        return texto_encrypted;
    }

    public void setTexto_encrypted(String texto_encrypted) {
        this.texto_encrypted = texto_encrypted;
    }

    public String getTexto_comp() {
        return texto_comp;
    }

    public void setTexto_comp(String texto_comp) {
        this.texto_comp = texto_comp;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
    
    
    
    
    
    
    
    
    
    
    
}       
