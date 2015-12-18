/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.xtphere.gestud.presentation;

import it.xtphere.business.dao.LoginDAO;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author xtphere
 */
@Named
@SessionScoped
public class LoginPresenter implements Serializable{
    
    @Inject
    private LoginDAO loginDAO;
    
    private String username;
    private String password;

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
    
    public String login(String username, String password){
        
        try{
            if( username.equals("admin") && password.equals("admin"))
            return "loginAmministratore.xhtml?faces-redirect=true";
            else
            if( !username.equals("admin") && password.equals("admin"))
                throw new UsernameException();
            else
            if( username.equals("admin") && !password.equals("admin"))
                throw new PasswordException();
            else
            {
                if( loginDAO.searchStudent(username, password))
                    return "loginStudente.xhtml?faces-redirect=true";
                else
                    throw new UsernameException();
            }
        }catch(UsernameException | PasswordException e){
            e.printStackTrace();
        }
        return "";
    }
    
    public class UsernameException extends Exception
    {
        //Parameterless Constructor
        public UsernameException() {}

        //Constructor that accepts a message
        public UsernameException(String message)
        {
           super("Username errato");
        }
    }
    
    public class PasswordException extends Exception
    {
        //Parameterless Constructor
        public PasswordException() {}

        //Constructor that accepts a message
        public PasswordException(String message)
        {
           super("Password errata");
        }
    }
}
