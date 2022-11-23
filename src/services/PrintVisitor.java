package services;

import models.*;

import java.util.List;

public class PrintVisitor implements Visitor{

    List<Element> contents;

    Element content;
    @Override
    public void visitAn(An x) {
        this.contents = x.getGrupe();
    }

    @Override
    public void visitGrupa(Grupa x) {
        this.contents = x.getSubgrupe();
    }

    @Override
    public void visitSemigrupa(Semigrupa x) {
        this.contents = x.getStudenti();
    }

    @Override
    public void visitStudent(Student x) {
        this.content = x;
    }



}
