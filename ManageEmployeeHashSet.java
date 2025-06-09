/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.gradleprojectCSV;
import java.util.HashSet;
import java.util.HashMap;
import java.util.ArrayList;
/**
 *
 * @author User
 */
public class ManageEmployeeHashSet {
    
     public static void main(String[] args){
        ArrayList<String> employees = new ArrayList<>();
        
        employees.add("Avsidy");
        employees.add("Katrina");
        employees.add("Stephanie");
        
        System.out.println("Employee List:");
        for(String name : employees){
            System.out.println(name);
        }
    }
}
