package polymorphism;

public class Zoo {
    public static void main(String[] args) {
       // implicit up cast
        Dog barky = new Dog();
        barky.fetch();
        barky.makeSound();

        Animal flo = new Dog(); // polymorphism
        flo.makeSound();
        flo = new Cat();
        flo.makeSound();


        /*
         *  Creating an up class will make it, so you can not access that subclass methods unless it's an override
         *  Type casting an object. This allows access to methods by down casting from Animal to Cat
         *  ** do not cast from Cat to Dog. Only from super to sub.
         */
        ((Cat)flo).scratch();

        feed(barky);  // Dog
        feed(flo);    // Cat

    }

    /***
     * Takes instance of Animal and feeds it with appropriate food.
     * @param animal an object of Cat or Dag
     */
    public static void feed(Animal animal){
        if(animal instanceof Dog){
            System.out.println("Here's dog food!");
        } else if(animal instanceof Cat){
            System.out.println("Here's cat food!");
        } else {
            System.out.println("Can't feed that thing.");
        }

    }

}
