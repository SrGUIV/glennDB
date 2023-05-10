/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glenndb;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


/**
 *
 * @author aluno
 */
public class GlennDB {
    
    /**
     * Cria arquivo DB.txt se ainda não existir
     */
    private static void startDatabase() {;
        try {
            File db = new File("DB.txt");
            if (!db.exists()) {
                db.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        GlennDB.startDatabase();
        
        //Panel panel = new Panel();
        System.out.printf("%s%n %s%n %s%n %n",
                           "--------------", 
                           "GlennDB", 
                           "--------------");
        
        Scanner scan = new Scanner(System.in);
        
        while (true)  {
            
            System.out.println("Insira os dados do aluno \n");

            System.out.print("Primeiro nome: ");
            String name = scan.nextLine();

            System.out.print("Sobrenome: ");
            String lastname = scan.nextLine();

            System.out.print("Idade: ");
            int age = scan.nextInt();
            scan.nextLine();
            
            System.out.print("Curso: ");
            String course = scan.nextLine();

            Student student = new Student(name, lastname, course, age);
            StudentDAO studentDAO = new StudentDAO();

            studentDAO.add(student);
            
            System.out.println("\nRegistrado com sucesso! \n");

            System.out.println("Deseja inserir mais algum aluno? (S/N)");
            String continueExecution = scan.nextLine();

            if (continueExecution.toLowerCase().equals("n")) {
                scan.close();
                break;
            }
        }
    }
    
    
}
