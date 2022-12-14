package gross_calculator;

import person.Person;

// ctr shift F10
public class GrossPayCalculator {
    // POJOs Plain old Java objects
    public record Player(String name, int HP, int MP){

    }
    public static void main(String[] args) {
        Player person = new Player("Damian",100, 55);

        System.out.println(person.name() + "\nHP: " + person.HP() + "\nMP: " + person.MP() );
        Person player = new Person();
        player.setName("Damian");
        player.setAge(41);

        System.out.println("Name: " + player.getName() + "\nAge: " + player.getAge());


    }

    public static void printArray(int[] a) {
        for(int x: a){
            System.out.print(x + " ");
        }
        System.out.println();
    }
    public static void bubbleSort(int[] l){

        for(int i = 0; i < l.length; i++){
            for(int j = 0; j < l.length -1-i; j++){
                if(l[j]>l[j+1]){
                    int temp = l[j];
                    l[j]=l[j+1];
                    l[j+1]=temp;
                }
            }
        }
    }
    /**
     * Overloading a method
     */
    public static void overload(int age) {

    }
    public static void overload(int age,int strength){

    }
}
