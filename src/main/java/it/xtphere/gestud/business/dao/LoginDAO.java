/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.xtphere.business.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author xtphere
 */
@Stateless
public class LoginDAO {
    
    @PersistenceContext
    EntityManager em;
    
    public boolean searchStudent(String username, String password ){
        
        String query= "SELECT u FROM Utente u WHERE u.username = '"+username+"' AND u.password ='"+password+"'";
        
        if (em.createQuery(query).getSingleResult() != null)
            return true;
        
        return false;
    }
}
