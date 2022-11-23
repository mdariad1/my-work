package models;

import services.PrintVisitor;

public interface Element {
    Element add(Element element);

    void accept(PrintVisitor printVisitor);
}
