/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glenndb;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author aluno
 */
public class StudentDAO {
    
    private BufferedWriter writer;
    
    public void add(Student student) {
        
        try{
            
            writer = new BufferedWriter(new FileWriter("DB.txt", true));
            writer.write(System.lineSeparator());
            
            writer.write(student.getName());
            writer.write(System.lineSeparator() + student.getLastname());
            writer.write(System.lineSeparator() + student.getCourse());
            writer.write(System.lineSeparator() + student.getAge());
            
            writer.write(System.lineSeparator());
            
            writer.close(); 
            
        } catch (IOException e){
            
            e.printStackTrace();
            
        }
        
    }
    
    
    
}
