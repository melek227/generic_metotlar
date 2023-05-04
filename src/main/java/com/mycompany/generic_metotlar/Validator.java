/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.generic_metotlar;

/**
 *
 * @author melek
 */
public class Validator {
    
    

    public <T extends IEntity> void validate(T entity){ //publicden sonra konan <T> ifadesiyle validator nesnesinin generic olduğunu belirttik
        //generic kısıt için <T> ifadesine "extends IEntity" ekledik


    }

    void validate(Customer customer) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
    

