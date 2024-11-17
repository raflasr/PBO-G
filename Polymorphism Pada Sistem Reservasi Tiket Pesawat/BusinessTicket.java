public class BusinessTicket extends Ticket {
    public BusinessTicket(double baseFare) {
        super(baseFare);
    }

    @Override
    public double calculateFare() {
        return baseFare * 1.25; // Tambahan 25%
    }

    @Override
    public String getDetails() {
        return "Tiket Pesawat (Bisnis) - Tambahan 25%\nFasilitas: Bagasi 30 kg, makanan premium, akses lounge.";
    }
}
