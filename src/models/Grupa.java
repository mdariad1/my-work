package models;

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
    public void add(Element element) {
        if (this.subgrupe.size() < 2)
            this.subgrupe.add(element);
        else
            System.out.println("Nr maxim de subgrupe atins!");
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
    public <T> T accept(Visitor<T> v) {
        return v.visitGrupa(this);
    }

    @Override
    public String toString() {
        return "    " + this.title;
    }
}
}
