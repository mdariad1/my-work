package models;

import services.PrintVisitor;

import java.util.ArrayList;
import java.util.List;

public class An implements Element {

    String title;
    List<Element> grupe;

    public An(String title) {
        this.title = title;
        this.grupe = new ArrayList<>();
    }

    @Override
    public Element add(Element element) {
        this.grupe.add(element);
        return this;
    }

    @Override
    public void accept(PrintVisitor printVisitor) {
        printVisitor.visitAn(this);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Element> getGrupe() {
        return grupe;
    }


    @Override
    public String toString() {
        return this.title;
    }
}
