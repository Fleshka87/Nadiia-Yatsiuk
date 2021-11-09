package homework5;

import java.util.Objects;

public abstract class Birds {
    String name;
    String type;

    public Birds(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void iAm (){
        System.out.println("I am"+this.type);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Birds birds = (Birds) o;
        return Objects.equals(name, birds.name) && Objects.equals(type, birds.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type);
    }

    @Override
    public String toString() {
        return "Birds{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
