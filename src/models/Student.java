package models;

public class Student implements Element,Visitee{
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
    public <T> T accept(Visitor<T> v) {
        return v.visitStudent(this);
    }

    @Override
    public void add(Element element) {
    }

    @Override
    public String toString() {
        return "    " + this.nume + "," + this.email;
    }
}
