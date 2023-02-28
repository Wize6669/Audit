/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.epn.web.b2022.g3.audit.caso.estudio;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

/**
 *
 * @author luism
 */
public class User {
    private static Collection<User> defaultUsers;
    static{
        defaultUsers  = new ArrayList<>();
        defaultUsers.add(new User("willman.andrade@cucurl.gob.ec", "1234"));
        defaultUsers.add(new User("guido.chiriboga@cucurl.gob.ec", "1234"));
        defaultUsers.add(new User("dalton.bacigalupo@cucurl.gob.ec", "1234"));
        defaultUsers.add(new User("marlon.cadena@cucurl.gob.ec", "1234"));
    }
    
    private String username;
    private String password;
    private Instant startInstant;
    private Instant endInstant;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Instant getStartInstant() {
        return startInstant;
    }

    public Instant getEndInstant() {
        return endInstant;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setStartInstant(Instant startInstant) {
        this.startInstant = startInstant;
    }

    public void setEndInstant(Instant endInstant) {
        this.endInstant = endInstant;
    }
    
    public static User auth(String username,String password){
        Predicate<User> checkUsername = t->t.username.equals(username);
        Predicate<User> checkPassword = t->t.password.equals(password);
        
        return defaultUsers
                .stream()
                .filter(checkUsername)
                .filter(checkPassword)
                .findFirst()
                .orElse(null);
    }
    
}
