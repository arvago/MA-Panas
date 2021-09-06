/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import Datos.UsuarioDAO;
import domain.Usuario;
import java.util.List;

/**
 *
 * @author rocky
 */
public class TestManejoDAOUsuario {
    public static void main(String[] args){
       UsuarioDAO usuarioDao = new UsuarioDAO();
       //SELECT
       /*List<Usuario> personas = usuarioDao.select();       
       personas.forEach(user -> {
           System.out.println(user);
       });*/
       
       //INSERT
       /*Usuario addUser = new Usuario("pacomemo8a", "esoTilin");
       usuarioDao.insert(addUser);*/
       
       //UPDATE
       /*Usuario updateUser = new Usuario(4,"memo8a", "esoTilin");
       usuarioDao.update(updateUser);*/
       
       //DELETE
       usuarioDao.delete(4);
   }
}
