public class Main {

    public static void main(String[] args){

        Fruit1 fruitA = new Fruit1("Apple", 80);
        Banana fruitB = new Banana("BananaB", 120);
        Banana fruitC = new Banana("BananaC", 100);

        fruitA.showFruitName();
        fruitA.showFruitWeight();
        fruitC.showFruitName();

        fruitB.showFruitName();
        // fruitB.showFruitWeight();
        fruitB.weight();

    }
}
