
public class Apple implements Fruit {

    @Override
    public void showData() {
        System.out.println("Apple type - " + name + " : " + price + " Dkr, " + weight + " gr.");
    }

    private String name;
    private double price;
    private double weight;

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public double getWeight() {
        return weight;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
}
