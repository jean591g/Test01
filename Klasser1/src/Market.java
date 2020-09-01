
public class Market {

    public static void main(String[] args)  {
        // instantiere nye objekter af klassen for at kunne bruge medtoder med dem
        Apple a = new Apple();
        Apple b = new Apple();

        a.setName("Pink Lady");
        a.setPrice(4.5);
        a.setWeight(79.8);
        b.setName("Golden");
        b.setPrice(4.5);
        b.setWeight(85.2);

        System.out.println("\n-----\n");

        // System.out.println(a.getName() + ": " + a.getPrice() + " Dkr.");
        // System.out.println(b.getName() + ": " + b.getPrice() + " Dkr.");

        a.showData();
        b.showData();

        System.out.println("\n-----\n");

        try {
            if (a.getName().equals(b.getName())) {
                System.out.println("Same name.");
            } else {
                System.out.println("Not same name.");
            }
            if (a.getPrice() == b.getPrice()) {
                System.out.println("Equal prices.");
            } else {
                System.out.println("Not equal prices.");
            }
            if (a.getWeight() == b.getWeight()) {
                System.out.println("Equal weights.");
            } else {
                System.out.println("Not equal weights.");
            }
        } catch (Exception e)   {
            System.out.println("Error type: " + e);
        }
    }
}
