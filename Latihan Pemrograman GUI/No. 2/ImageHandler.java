import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class ImageHandler {
    private JLabel imageLabel;
    private Image currentImage;
    private Image originalImage;
    private double scale = 1.0;

    public ImageHandler(JLabel imageLabel) {
        this.imageLabel = imageLabel; // Menyambungkan ImageHandler dengan imageLabel dari frame
    }

    public void openImage() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new javax.swing.filechooser.FileFilter() {
            @Override
            public boolean accept(File f) {
                return f.isDirectory() || f.getName().toLowerCase().matches(".*\\.(jpg|jpeg|png|gif)");
            }

            @Override
            public String getDescription() {
                return "Image Files (JPG, PNG, GIF)";
            }
        });

        int result = fileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            try {
                File selectedFile = fileChooser.getSelectedFile();
                originalImage = ImageIO.read(selectedFile);
                currentImage = originalImage;
                updateImage(); // Memperbarui tampilan setelah gambar dibuka
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Failed to open image: " + e.getMessage());
            }
        }
    }

    public void zoomImage(double scaleFactor) {
        if (currentImage != null) {
            scale *= scaleFactor;  // Menyesuaikan skala gambar
            updateImage();  // Memperbarui gambar yang ditampilkan
        }
    }

    public void rotateImage() {
        if (currentImage != null) {
            BufferedImage bufferedImage = new BufferedImage(currentImage.getWidth(null),
                    currentImage.getHeight(null), BufferedImage.TYPE_INT_ARGB);
            Graphics2D g2d = bufferedImage.createGraphics();
            g2d.rotate(Math.toRadians(90), bufferedImage.getWidth() / 2.0, bufferedImage.getHeight() / 2.0);
            g2d.drawImage(currentImage, 0, 0, null);
            g2d.dispose();

            currentImage = bufferedImage;  // Menyimpan gambar yang telah diputar
            updateImage();  // Memperbarui gambar yang ditampilkan
        }
    }

    public void resetImage() {
        if (originalImage != null) {
            currentImage = originalImage;  // Mengembalikan gambar ke kondisi semula
            scale = 1.0;  // Mengatur ulang skala
            updateImage();  // Memperbarui gambar yang ditampilkan
        }
    }

    private void updateImage() {
        if (currentImage != null) {
            int width = (int) (currentImage.getWidth(null) * scale);  // Menyesuaikan lebar
            int height = (int) (currentImage.getHeight(null) * scale);  // Menyesuaikan tinggi
            Image scaledImage = currentImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);
            imageLabel.setIcon(new ImageIcon(scaledImage));  // Menampilkan gambar baru di JLabel
            imageLabel.setText("");  // Menghapus teks "No Image Selected"
        }
    }
}
