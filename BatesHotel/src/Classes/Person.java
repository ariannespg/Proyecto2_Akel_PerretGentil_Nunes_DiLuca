/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 * Clase con métodos utilizados en relación al cliente que se hospeda en el hotel
 * @author @authors Georgina Akel, Orveo Di Luca, Juan Nunes, Arianne Perret Gentil
 * @version 22/06/2023
 */
public class Person {
    private String name;
    private String lastName;
    private String email;
    private String gender;
    private String dateIn;
    
    /**
    * Constructor de la clase Booking
    * @param name pasa el primer nombre del huésped
    * @param lastName pasa el segundo nombre del huésped
    * @param email pasa el email del huésped
    * @param gender pasa el género del huésped
    * @param dateIn pasa la fecha de llegada del huésped
    */
    public Person(String name, String lastName, String email, String gender, String dateIn) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.dateIn = dateIn;
    }
    
    /** 
    * Método que retorna el primer nombre
    * @return primer nombre del huésped
    */
    public String getName() {
        return name;
    }

    /** 
    * Método que cambia el primer nombre del huésped
    * @param name
    */
    public void setName(String name) {
        this.name = name;
    }

    /** 
    * Método que retorna el apellido
    * @return apellido del huésped
    */
    public String getLastName() {
        return lastName;
    }

    /** 
    * Método que cambia el apellido del huésped
    * @param lastName
    */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /** 
    * Método que retorna el email del huésped
    * @return apellido del huésped
    */
    public String getEmail() {
        return email;
    }

    /** 
    * Método que cambia el email del huésped
    * @param email
    */
    public void setEmail(String email) {
        this.email = email;
    }

    /** 
    * Método que retorna el género del huésped
    * @return género del huésped
    */
    public String getGender() {
        return gender;
    }

    /** 
    * Método que cambia el género del huésped
    * @param gender
    */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /** 
    * Método que retorna la fecha de llegada del huésped
    * @return fecha de llegada
    */
    public String getDateIn() {
        return dateIn;
    }

    /** 
    * Método que cambia  la fecha de llegada del huésped
    * @param dateIn
    */
    public void setDateIn(String dateIn) {
        this.dateIn = dateIn;
    }
    
    
    
    
}
