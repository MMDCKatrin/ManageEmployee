/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.gradleprojectCSV;
import java.util.HashMap;
/**
// *
 * @author User
 */
public class ManageEmployeeHashMap {
    
    public static void main(String[] args){
        HashMap<Integer, String> employees = new HashMap<>();
        
        employees.put(101,"Avsidy");
        employees.put(102,"Katrina");
        employees.put(103,"Stephanie");
        employees.put(102,"Katrina Steph");
        
        System.out.println("Employee List:");
        for(Integer id : employees.keySet()){
            System.out.println("ID: " + id + ", Name: " + employees.get(id));
        }
    }
}
