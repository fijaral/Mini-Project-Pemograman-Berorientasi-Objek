import java.util.Scanner;
import javax.swing.*;
import java.awt.*;

public class MainGUI {
    static int jumlah = 0;          
    static final int TARGET = 5;    

    // Mode GUI
    static void jalankan() {
        jumlah = 0;

        JFrame frame = new JFrame("Program Data Mahasiswa");
        frame.setSize(700, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(1, 2, 10, 0));   // kiri & kanan

        // Form Input
        JPanel panelKiri = new JPanel(new BorderLayout());
        panelKiri.setBackground(Color.WHITE);
        panelKiri.setBorder(BorderFactory.createEmptyBorder(10, 15, 10, 10));
        JPanel form = new JPanel(new GridLayout(8, 1, 5, 5));
        form.setBackground(Color.WHITE);

        JTextField txtNama = new JTextField();
        JTextField txtNim = new JTextField();
        JTextField txtNilai = new JTextField();
        JLabel lblInfo = new JLabel("Mahasiswa ke-1 dari " + TARGET);
        JButton btnProses = new JButton("Simpan & Tampilkan");

        form.add(new JLabel("Nama"));
        form.add(txtNama);
        form.add(new JLabel("NIM"));
        form.add(txtNim);
        form.add(new JLabel("Nilai"));
        form.add(txtNilai);
        form.add(lblInfo);
        form.add(btnProses);

        panelKiri.add(form, BorderLayout.NORTH);

        // Output Data
        JPanel panelKanan = new JPanel(new BorderLayout());
        panelKanan.setBackground(new Color(0xF3F4F6));
        panelKanan.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 15));

        JTextArea areaOutput = new JTextArea();
        areaOutput.setEditable(false);
        areaOutput.setBackground(new Color(0xF3F4F6));
        areaOutput.setForeground(new Color(0x374151));
        areaOutput.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 13));

        panelKanan.add(new JLabel("Output Data"), BorderLayout.NORTH);
        panelKanan.add(new JScrollPane(areaOutput), BorderLayout.CENTER);

        frame.add(panelKiri);
        frame.add(panelKanan);

        // Aksi tombol
        btnProses.addActionListener(e -> {
            Scanner input = new Scanner(txtNilai.getText().trim());

            if (txtNama.getText().trim().isEmpty() || txtNim.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Nama dan NIM tidak boleh kosong!");
            } else if (!input.hasNextInt()) {
                JOptionPane.showMessageDialog(frame, "Nilai harus berupa bilangan bulat!");
            } else {
                Mahasiswa mhs = new Mahasiswa();
                mhs.nama = txtNama.getText().trim();
                mhs.nim = txtNim.getText().trim();
                mhs.nilai = input.nextInt();

                jumlah++;

                String garis = "";
                for (int i = 0; i < 30; i++) {
                    garis += "=";
                }

                areaOutput.append(garis + "\n");
                areaOutput.append("Mahasiswa ke-" + jumlah + "\n");
                areaOutput.append(mhs.tampilkanData() + "\n");
                areaOutput.append(mhs.cekKelulusan() + "\n\n");

                txtNama.setText("");
                txtNim.setText("");
                txtNilai.setText("");

                if (jumlah >= TARGET) {
                    lblInfo.setText("Selesai (" + TARGET + " mahasiswa)");
                    btnProses.setEnabled(false);
                } else {
                    lblInfo.setText("Mahasiswa ke-" + (jumlah + 1) + " dari " + TARGET);
                }
            }
        });

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}