/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 * Clase con métodos utilizados en relación al cliente que se hospeda en el hotel
 * @authors Georgina Akel, Orveo Di Luca, Juan Nunes, Arianne Perret Gentil
 * @version 22/06/2023
 */
public class Booking extends Person {
    //Atributos de la clase
    private String id;
    private String name;
    private String lastName;
    private String email;
    private String gender;
    private String typeRoom;
    private String phoneNumber;
    private String dateIn;
    private String dateOut;
    
    /**
    * Constructor de la clase Booking
    * @param id pasa el número de cédula del huésped
    * @param name pasa el primer nombre del huésped
    * @param lastName pasa el segundo nombre del huésped
    * @param email pasa el email del huésped
    * @param gender pasa el género del huésped
    * @param typeRoom pasa el tipo de habitacion 
    * @param phoneNumber pasa el número del huésped
    * @param dateIn pasa la fecha de llegada del huésped
    * @param dateOut pasa la fecha de salida del huésped
    */
    public Booking(String id, String name, String lastName, String email, String gender, String typeRoom, String phoneNumber, String dateIn, String dateOut){
        super(name, lastName, email, gender, dateIn);
        this.id = id;
        this.typeRoom = typeRoom;
        this.phoneNumber = phoneNumber;
        this.dateOut = dateOut;
    }
    
    /** 
    * Método que retorna la cédula
    * @return cédula del huésped
    */
    public String getId() {
        return id;
    }

    /** 
    * Método que establece el valor de la cédula
    * @param id
    */
    public void setId(String id) {
        this.id = id;
    }

    /** 
    * Método que retorna el tipo de habitacion 
    * @return el tipo de habitacion 
    */
    public String getTypeRoom() {
        return typeRoom;
    }

    /** 
    * Método que establece el tipo de habitacion
    * @param typeRoom
    */
    public void setTypeRoom(String typeRoom) {
        this.typeRoom = typeRoom;
    }

    /** 
    * Método que retorna el número del huésped 
    * @return el número telefonico del huésped
    */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /** 
    * Método que establece número telefonico del huésped
    * @param phoneNumber
    */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /** 
    * Método que retorna la fecha de salida del huésped
    * @return la fecha de salida del huésped
    */
    public String getDateOut() {
        return dateOut;
    }

    /** 
    * Método que establece la fecha de salida del huésped
    * @param dateOut
    */
    public void setDateOut(String dateOut) {
        this.dateOut = dateOut;
    }
    
    
    
}
