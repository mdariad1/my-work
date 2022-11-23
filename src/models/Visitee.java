package models;

public interface Visitee {
    <T> T accept(Visitor<T> v);
}
