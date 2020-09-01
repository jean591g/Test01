public class Broker {

    public static void main(String[] args) {
        // stadier og operationer
        // et objekt følger blue-printet fra den klasse den er en instans af
        Car car1 = new Car();
        Car car2 = new Car();

        if (car1.year == car2.year) {
            System.out.println("Equal!");
        }
        // man kan ikke sammenligne 2 objekter: objektnavn (==) eller objektværdi (equals)?
        if (car1 == car2) {
            System.out.println("Equal!");
        }
        // dot-er som regel en metodekald, så ".equals()" er en metode (ikke et keyword) som også skal have ().
        if (car1.name.equals(car2.name)) {
            System.out.println("Equal!");
        }
    }
}
