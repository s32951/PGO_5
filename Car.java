public class Car extends Vehicle {
    private int numberOfSeats;

    public Car(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void start() {
        System.out.println("Samochód uruchomiony");
    }

    public void stop() {
        System.out.println("Samochód zatrzymany");
    }
}