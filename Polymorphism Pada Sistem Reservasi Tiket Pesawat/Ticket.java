public abstract class Ticket {
    protected double baseFare;

    public Ticket(double baseFare) {
        this.baseFare = baseFare;
    }

    public abstract double calculateFare();

    public abstract String getDetails();
}
