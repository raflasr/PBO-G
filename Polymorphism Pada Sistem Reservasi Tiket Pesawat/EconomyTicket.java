public class EconomyTicket extends Ticket {
    public EconomyTicket(double baseFare) {
        super(baseFare);
    }

    @Override
    public double calculateFare() {
        return baseFare * 0.9; // Diskon 10%
    }

    @Override
    public String getDetails() {
        return "Tiket Pesawat (Ekonomi) - Diskon 10%\nFasilitas: Bagasi 20 kg, makanan ringan.";
    }
}
