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

    public void set_sirname(String sirname) {
        this.m_sirname = sirname;
    }

    public void set_gender(Gender gender) {
        this.m_gender = gender;
    }

    /** method to check if 2 people are the same people*/
    static public boolean equals(Person p1, Person p2){
        return p1.m_name == p2.m_name && p1.m_sirname == p2.m_sirname && p1.m_gender == p2.m_gender;
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
        System.out.println("p1 equals p2?");
        System.out.println(Person.equals(p1, p2));
        System.out.println("setting p1 to Jeroen Weltens, Male...");
        p1.set_name("Jeroen");
        p1.set_sirname("Weltens");
        p1.set_gender(Gender.MALE);
        System.out.println("p1 equals to p2?");
        System.out.println(Person.equals(p1, p2));
    }
}


