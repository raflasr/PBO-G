public class Passenger {
    private String name;
    private String phone;
    private String email;

    public Passenger(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Nama: " + name + "\nNomor Telepon: " + phone + "\nEmail: " + email;
    }
}
