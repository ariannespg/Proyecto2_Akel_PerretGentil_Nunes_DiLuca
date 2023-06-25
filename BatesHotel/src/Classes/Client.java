/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 * Clase con métodos utilizados en relación al cliente que se hospeda en el hotel
 * @author @authors Georgina Akel, Orveo Di Luca, Juan Nunes, Arianne Perret Gentil
 * @version 22/06/2023
 */
public class Client extends Person {
    //Atributos de la clase
    private String numRoom;
    private String name; 
    private String lastName; 
    private String email; 
    private String gender; 
    private String phone; 
    private String dateIn;
    
    /**
    * Constructor de la clase Booking
    * @param numRoom pasa el número de habitacion
    * @param name pasa el primer nombre del huésped
    * @param lastName pasa el apellido del huésped
    * @param email pasa el email del huésped
    * @param gender pasa el género del huésped
    * @param phone pasa el número de teléfono del huésped
    * @param dateIn pasa la fecha de llegada del huésped
    */
    public Client(String numRoom, String name, String lastName, String email, String gender, String phone, String dateIn) {
        super(name, lastName, email, gender, dateIn);
        this.numRoom = numRoom;
        this.phone = phone;
    }
    
    /** 
    * Método que retorna el número de teléfono del huésped
    * @return número de teléfono
    */
    public String getPhone() {
        return phone;
    }

    /** 
    * Método que establece el número de teléfono del huésped
    * @param phone
    */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    
    
}
