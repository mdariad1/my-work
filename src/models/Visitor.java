package models;

public interface Visitor{
    public void visitAn(An x);
    public void visitGrupa(Grupa x);
    public void visitSemigrupa(Semigrupa x);
    public void visitStudent(Student x);
}
