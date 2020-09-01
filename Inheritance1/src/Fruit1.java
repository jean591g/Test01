public class Fruit1 {

    // attributter (eksisterer i klassen) / som privat kan kun tilgås indenfor sammen klasse
    private String fruitName;
    private int weight;

    // constructor med sine parameter hvor man tildeler (assign) variabler til at
    // pege på de 2 forskellige versioner af variablen med samme navn.
    public Fruit1(String fruitName, int weight){
        // this--> attribut (også en variabel) er lige med en variabel
        // (der ikke er attributter eksisterer kun indenfor deres metodes scope.
        this.fruitName = fruitName;
        this.weight = weight;
    }
    // tom kopi af constructor
    //public Fruit1(){
    //}

    public void showFruitName(){ System.out.println(fruitName);
    }
    public void showFruitWeight(){ System.out.println(weight);
    }


}