import java.util.HashMap;
import java.util.Random;

public class Responder {
    private HashMap<String, String> responses;
    private Random random;

    public Responder() {
        responses = new HashMap<>();
        random = new Random();
        fillResponses();
    }

    public String generateResponse(String input) {
        for (String key : responses.keySet()) {
            if (input.contains(key)) {
                return responses.get(key);
            }
        }

        // Jika tidak ditemukan respons yang cocok, berikan respons acak.
        return "loading " + random.nextInt(100) + "%";
    }

    private void fillResponses() {
        responses.put("java", "java, java, java");
        responses.put("halo", "Halo juga!");
        responses.put("berlutut", "Tidak perlu berlutut, semuanya baik-baik saja.");
        responses.put("wifi", "Coba restart router Anda.");
        responses.put("error", "Silakan berikan lebih banyak detail tentang masalah error Anda.");
    }
}
