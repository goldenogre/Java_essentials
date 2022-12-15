package interfaces;

public interface Product {
    // must be constant; static and final
    // implicit public and abstract ...
    String getName();
    void setName(String name);
    // default otherwise methods are abstract
    default double getPrice(){ return 50;}
    default void setPrice(double price){}
}
