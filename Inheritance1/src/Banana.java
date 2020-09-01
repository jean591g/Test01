public class Banana extends Fruit1 {

    // nedarver metoder og attributter fra klassen Fruit1:
    // alt det der står i Fruit1 klassen eksisterer også i Banana klassen (også usynligt).

    // private String fruitName;
    // private int weight;

    // constructor (ligner en metode som kaldes, når der bliver instantieret (skabt) et objekt)
    // parametre i parantesen
    public Banana (String fruitName, int weight){
        // nedarver constructor fra Fruit1 tak til 'super' keywordet
        // 'super' kalder superklassens constructor:
        super(fruitName, weight);
    }
    // tom kopi af constructor
    //public Banana (){
    //}


    public void weight(){
        System.out.print("The fruit weight is: ");
        super.showFruitWeight();
        System.out.print(" grams.");
    }

}
