public class FirstClassTicket extends Ticket {
    public FirstClassTicket(double baseFare) {
        super(baseFare);
    }

    @Override
    public double calculateFare() {
        return baseFare * 1.5; // Tambahan 50%
    }

    @Override
    public String getDetails() {
        return "Tiket Pesawat (First Class) - Tambahan 50%\nFasilitas: Bagasi 40 kg, makanan eksklusif, kursi tidur, akses lounge VIP.";
    }
}
