package OOP_TuHoc_JAVA;

import OOP_TuHoc_JAVA.I_DanhSachHocSinh;
import OOP_TuHoc_JAVA.I_Date;
import OOP_TuHoc_JAVA.I_HocSinh;
import OOP_TuHoc_JAVA.I_KhoiA;
import OOP_TuHoc_JAVA.I_KhoiB;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class I_HocSinhGUI extends JFrame {
    private I_DanhSachHocSinh danhSachHocSinh;
    private JTextArea textArea;

    public I_HocSinhGUI() {
        danhSachHocSinh = new I_DanhSachHocSinh();

        // Tạo các thành phần giao diện
        JButton btnDocFile = new JButton("Đọc từ File");
        JButton btnGhiFile = new JButton("Ghi vào File");
        JButton btnThemSinhVien = new JButton("Thêm Sinh Viên");
        JButton btnDemHocBong = new JButton("Đếm Học Bổng");

        textArea = new JTextArea();
        textArea.setEditable(false);

        // Thêm các thành phần vào JFrame
        add(btnDocFile);
        add(btnGhiFile);
        add(btnThemSinhVien);
        add(btnDemHocBong);
        add(new JScrollPane(textArea));

        // Xử lý sự kiện khi nút "Đọc từ File" được nhấn
        btnDocFile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                danhSachHocSinh.docFile("Danhsachhocsinh.txt");
                hienThiThongTin();
            }
        });

        // Xử lý sự kiện khi nút "Ghi vào File" được nhấn
        btnGhiFile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                danhSachHocSinh.ghiFile("in_Danhsachhocsinh.txt");
                JOptionPane.showMessageDialog(null, "Đã ghi thông tin vào file.");
            }
        });

        // Xử lý sự kiện khi nút "Thêm Sinh Viên" được nhấn
        btnThemSinhVien.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                themSinhVien();
                hienThiThongTin();
            }
        });

       // Xử lý sự kiện khi nút "Đếm Học Bổng" được nhấn
        btnDemHocBong.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int soSinhVienNhanHocBong = danhSachHocSinh.demSV_nhanHB();
                JOptionPane.showMessageDialog(null, "Số sinh viên nhận học bổng là: " + soSinhVienNhanHocBong);
            }
        });


        // Cấu hình JFrame
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void hienThiThongTin() {
        textArea.setText("");
        for (I_HocSinh x : danhSachHocSinh.hs) {
            textArea.append(x + "\n");
        }
    }

    private void themSinhVien() {
        String maSV = JOptionPane.showInputDialog("Nhập mã sinh viên (ví dụ: KhoiA003): ");
        String hoTen = JOptionPane.showInputDialog("Nhập họ tên: ");
        String lop = JOptionPane.showInputDialog("Nhập tên lớp học: ");
        String ngaySinh = JOptionPane.showInputDialog("Nhập ngày sinh (ví dụ: 22/10/2002): ");
        boolean gioiTinh = Boolean.parseBoolean(JOptionPane.showInputDialog("Nhập giới tính (true hoặc false): "));
        double mon1 = Double.parseDouble(JOptionPane.showInputDialog("Nhập điểm môn 1: "));
        double mon2 = Double.parseDouble(JOptionPane.showInputDialog("Nhập điểm môn 2: "));
        double mon3 = Double.parseDouble(JOptionPane.showInputDialog("Nhập điểm môn 3: "));

        // Thêm sinh viên mới vào danh sách
        if (maSV.startsWith("KhoiA")) {
            danhSachHocSinh.hs.add(new I_KhoiA(maSV, hoTen, lop, new I_Date(ngaySinh), gioiTinh, mon1, mon2, mon3));
        } else {
            danhSachHocSinh.hs.add(new I_KhoiB(maSV, hoTen, lop, new I_Date(ngaySinh), gioiTinh, mon1, mon2, mon3));
        }

        JOptionPane.showMessageDialog(null, "Đã thêm sinh viên.");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new I_HocSinhGUI();
            }
        });
    }
}
