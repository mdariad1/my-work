package models;

import services.PrintVisitor;

import java.util.ArrayList;
import java.util.List;

public class Grupa implements Element {
    String title;
    List<Element> subgrupe;

    public Grupa(String title) {
        this.title = title;
        this.subgrupe = new ArrayList<>();
    }

    @Override
    public Element add(Element element) {
        if (this.subgrupe.size() < 2)
            this.subgrupe.add(element);
        else
            System.out.println("Nr maxim de subgrupe atins!");
        return this;
    }

    @Override
    public void accept(PrintVisitor printVisitor) {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Element> getSubgrupe() {
        return subgrupe;
    }

    @Override
    public String toString() {
        return "    " + this.title;
    }
}

