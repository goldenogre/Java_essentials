package overriding;

public class Square extends Rectangle{
    // overload: Keeps name but changes signature
    // Override: Keeps signature but changes body
    public void print(String what){
        System.out.println("I am a " + what);
    }
    @Override // not required... but encouraged.
    public double calculatePerimeter(){
        // rectangle (2*length) + (2 * width);

        return sides * length; // it's the
    }

}
