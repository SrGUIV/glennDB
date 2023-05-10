/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glenndb;

/**
 *
 * @author aluno
 */
public class Student {
    
    private String name;
    private String lastname;
    private String course;
    private int age;
    
    public Student(String name, String lastname, String course, int age) {
        this.name = name;
        this.lastname = lastname;
        this.course = course;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setCourse(String course) {
        this.course = course;
    }
    
    public String getCourse() {
        return this.course;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public int getAge() {
        return this.age;
    }
    
}
