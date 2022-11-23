package models;

import services.PrintVisitor;

import java.util.ArrayList;
import java.util.List;

public class Semigrupa implements Element, Visitee, {

    String title;
    List<Element> studenti;

    public Semigrupa(String title) {
        this.title = title;
        this.studenti = new ArrayList<>();
    }

    @Override
    public void add(Element element) {
        if (this.studenti.size() < 15)
            this.studenti.add((Student) element);
        else
            System.out.println("Nr maxim de studenti atins!");

    }

    @Override
    public <T> T accept(Visitor<T> v) {
        return v.visitSemigrupa(this);
    }

    public List<Element> getStudenti() {
        return studenti;
    }

    @Override
    public String toString() {
        return "    " + this.title;
    }
}
