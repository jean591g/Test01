
public class Mazda extends Fourwheeler {

    // public Mazda(String name, String model, String color){
    //    super(name, model, color);
    // }

    // man kan kun kald en metode indenfor en metode/konstruktors scope.
    // override: en nedarvet eksisterende metode, som man vil ændre på (overskrives - skriv metoden forfra):
    @Override
    public void numberOfWheels() {
        super.numberOfWheels();
        System.out.print(" plus two extra.");
    }
}

