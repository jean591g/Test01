public class Pear1 implements Comparable<Pear1>{

    private String color;
    private int weight;

    public Pear1(){}

    // constructor
    public Pear1 (String color, int weight){
        this.color = color;
        this.weight = weight;
        }


    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(Pear1 p1) {

        if (p1.getWeight() > this.weight){
            return -1;
        }
        if (p1.getWeight() < this.weight){
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Pear1{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
