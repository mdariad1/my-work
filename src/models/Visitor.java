package models;

public interface Visitor<T>{
    public T visitAn(An x);
    public T visitGrupa(Grupa x);
    public T visitSemigrupa(Semigrupa x);
    public T visitStudent(Student x);
}
