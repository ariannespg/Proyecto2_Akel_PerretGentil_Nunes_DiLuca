/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 * Clase con métodos utilizados en relación al cliente que se hospeda en el hotel, enfocado en cédula y número de habitacion
 * @author @authors Georgina Akel, Orveo Di Luca, Juan Nunes, Arianne Perret Gentil
 * @version 22/06/2023
 */
public class Historic extends Person {
    //Atributos de la clase
    private String ci;
    private String name;
    private String lastName;
    private String email;
    private String gender;
    private String dateIn;
    private String numRoom;
    
    /**
    * Constructor de la clase Booking
    * @param ci pasa el número de cédula del huésped
    * @param name pasa el primer nombre del huésped
    * @param lastName pasa el apellido del huésped
    * @param email pasa el email del huésped
    * @param gender pasa el género del huésped
    * @param dateIn pasa la fecha de llegada del huésped
    * @param numRoom pasa el número de habitacion
    */
    public Historic(String ci, String name, String lastName, String email, String gender, String dateIn, String numRoom) {
        super(name, lastName, email, gender, dateIn);
        this.ci = ci;
        this.numRoom = numRoom;
    }
    
    /** 
    * Método que retorna la cédula
    * @return cédula del huésped
    */
    public String getCi() {
        return ci;
    }

    /** 
    * Método que establece el valor de la cédula
    * @param ci
    */
    public void setCi(String ci) {
        this.ci = ci;
    }

    /** 
    * Método que retorna el número de habitacion
    * @return número de habitacion
    */
    public String getNumRoom() {
        return numRoom;
    }

    /** 
    * Método que establece el número de habitacion
    * @param numRoom
    */
    public void setNumRoom(String numRoom) {
        this.numRoom = numRoom;
    }
    
    
    
    
}
