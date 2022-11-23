package models;

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
    public void add(Element element) {
        this.grupe.add(element);
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
    public <T> T accept(Visitor<T> v) {
        return v.visitAn(this);
    }

    @Override
    public String toString() {
        return this.title;
    }
}
