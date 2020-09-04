public class Apple1 implements Comparable<Apple1>{

    private String color;
    private int weight;

    public Apple1(){}

    // constructor
    public Apple1 (String color, int weight){
        this.color=color;
        this.weight=weight;
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
    public int compareTo(Apple1 a1) {

        if (a1.getWeight() > this.weight){
            return -1;
        }
        if (a1.getWeight() < this.weight){
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Apple1{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
