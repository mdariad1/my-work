package models;

import services.PrintVisitor;

public class Student implements Element{
    String nume;
    String email;


    public Student(String nume, String email) {
        this.nume = nume;
        this.email = email;
    }


    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public Element add(Element element) {
        return this;
    }

    @Override
    public void accept(PrintVisitor printVisitor) {

    }

    @Override
    public String toString() {
        return "            " + this.nume + "," + this.email;
    }
}
