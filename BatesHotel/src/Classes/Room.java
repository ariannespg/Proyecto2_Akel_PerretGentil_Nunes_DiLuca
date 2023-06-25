/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 * Clase con métodos utilizados en relación a la habitacion
 * @author @authors Georgina Akel, Orveo Di Luca, Juan Nunes, Arianne Perret Gentil
 * @version 22/06/2023
 */
public class Room {
    private String numRoom; 
    private String typeRoom;
    private String floor;
    
    /**
    * Constructor de la clase Room
    * @param numRoom pasa el número de habitacion
    * @param typeRoom pasa el tipo de habitacion
    * @param floor pasa el piso de habitacion
    */
    public Room(String numRoom, String typeRoom, String floor) {
        this.numRoom = numRoom;
        this.typeRoom = typeRoom;
        this.floor = floor;
    }
    
    //========================Getters and Setters=========================
    /** 
    * Método que retorna el número de habitacion
    * @return número de habitacion
    */
    public String getNumRoom() {
        return numRoom;
    }

    /** 
    * Método que cambia el número de habitacion
    * @param num_room
    */
    public void setNumRoom(String num_room) {
        this.numRoom = num_room;
    }

    /** 
    * Método que retorna el tipo de habitacion
    * @return tipo de habitacion
    */
    public String getTypeRoom() {
        return typeRoom;
    }

    /** 
    * Método que cambia el tipo de habitacion
    * @param type_room
    */
    public void setTypeRoom(String type_room) {
        this.typeRoom = type_room;
    }

    /** 
    * Método que retorna el piso de habitacion
    * @return piso de habitacion
    */
    public String getFloor() {
        return floor;
    }

    /** 
    * Método que cambia el piso de habitacion
    * @param floor
    */
    public void setFloor(String floor) {
        this.floor = floor;
    }

    
    
    
}
