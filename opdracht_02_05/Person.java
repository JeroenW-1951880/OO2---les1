package com.jetbrains;
import java.util.*;

/** class to hold information of a person
 * includes the main to test the class
 * @author Jeroen Weltens
 */
public class Person {
    enum Gender{MALE, FEMALE};
    private String m_name;
    private String m_sirname;
    private Gender m_gender;

    public String get_name(){
        return m_name;
    }

    public String get_sirname(){
        return m_sirname;
    }

    public Gender get_gender(){
        return m_gender;
    }

    public void set_name(String name){
        this.m_name = name;
    }

    public void setM_sirname(String sirname) {
        this.m_sirname = sirname;
    }

    public void setM_gender(Gender gender) {
        this.m_gender = gender;
    }

    /** constructor with arguments*/
    Person(String name, String sirname, Gender gender){
        m_name = name;
        m_sirname = sirname;
        m_gender = gender;
    }

    /** default constructor (no functonality)*/
    Person(){}

    /** main method to test the Person class*/
    public static void main(String[] args) {
        Person p1 = new Person(), p2 = new Person("Jeroen", "Weltens", Gender.MALE);
        System.out.println("p1: " + p1.get_name());//no name
        System.out.println("p2: " + p2.get_name());
        p1.set_name("Dirk");
        System.out.println("setting name of p1...");
        System.out.println("p1: " + p1.get_name());
    }
}


