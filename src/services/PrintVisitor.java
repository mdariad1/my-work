package services;

import models.*;

import java.util.List;

public class PrintVisitor implements Visitor{

    Element content;
    @Override
    public void visitAn(An x) {
        System.out.println(x);
        for (Element grupa:x.getGrupe()){
            this.visitGrupa((Grupa) grupa);
        }
    }

    @Override
    public void visitGrupa(Grupa x) {
        System.out.println(x);
        for (Element semigrupa:x.getSubgrupe()){
            this.visitSemigrupa((Semigrupa) semigrupa);
        }
    }

    @Override
    public void visitSemigrupa(Semigrupa x) {
        System.out.println(x);
        for (Element student:x.getStudenti()){
            this.visitStudent((Student) student);
        }
    }

    @Override
    public void visitStudent(Student x) {
        System.out.println(x);
    }

}
