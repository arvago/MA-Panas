/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author rocky
 */
public class Usuario {
    private int idUsuario;
    private String username;
    private String password;
    
    public Usuario(){
        
    }
    
    public Usuario(String username, String password){
        this.username = username;
        this.password = password;
    }
    
    public Usuario(int idUsuario, String username, String password){
        this.idUsuario = idUsuario;
        this.username = username;
        this.password = password;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuario{" + "idUsuario=" + idUsuario + ", username=" + username + ", password=" + password + '}';
    }
    
}
