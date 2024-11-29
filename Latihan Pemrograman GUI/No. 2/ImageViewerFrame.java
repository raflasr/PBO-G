import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ImageViewerFrame extends JFrame {
    private ImageHandler imageHandler;
    private JLabel imageLabel;

    public ImageViewerFrame() {
        setTitle("Image Viewer");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Initialize components
        initComponents();
    }

    private void initComponents() {
        imageLabel = new JLabel("No Image Selected", SwingConstants.CENTER);
        imageLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        imageHandler = new ImageHandler(imageLabel); // Menciptakan objek ImageHandler dengan imageLabel

        // Buttons for controls
        JButton btnOpen = new JButton("Open Image");
        JButton btnZoomIn = new JButton("Zoom In");
        JButton btnZoomOut = new JButton("Zoom Out");
        JButton btnRotate = new JButton("Rotate");
        JButton btnReset = new JButton("Reset");

        // Add action listeners
        btnOpen.addActionListener(e -> imageHandler.openImage());  // Menghubungkan openImage dengan tombol
        btnZoomIn.addActionListener(e -> imageHandler.zoomImage(1.2));  // Menghubungkan zoomIn dengan tombol
        btnZoomOut.addActionListener(e -> imageHandler.zoomImage(0.8)); // Menghubungkan zoomOut dengan tombol
        btnRotate.addActionListener(e -> imageHandler.rotateImage()); // Menghubungkan rotate dengan tombol
        btnReset.addActionListener(e -> imageHandler.resetImage()); // Menghubungkan reset dengan tombol

        // Control Panel
        JPanel controlPanel = new JPanel(new FlowLayout());
        controlPanel.add(btnOpen);
        controlPanel.add(btnZoomIn);
        controlPanel.add(btnZoomOut);
        controlPanel.add(btnRotate);
        controlPanel.add(btnReset);

        // Layout
        setLayout(new BorderLayout());
        add(imageLabel, BorderLayout.CENTER);
        add(controlPanel, BorderLayout.SOUTH);
    }
}
