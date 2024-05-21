package DoAn;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ConvolveOp;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GUI extends javax.swing.JFrame {

     ArrayList<CongViec> list = new ArrayList<>();
    private int columnIndexForJobTitle;
    private int columnIndexForCompanyName;
    
    QuanLyTuyenDung c = new QuanLyTuyenDung();
    
    DefaultTableModel dtm;
    QuanLyTuyenDung a = new QuanLyTuyenDung();

    DefaultTableModel dtm2;
    QuanLyTuyenDung b = new QuanLyTuyenDung();

    public GUI() {
        initComponents();
        tabShow.setEnabled(false);
        //set table hiden =================
        jPanel1.setVisible(false);

        for (int column = 0; column < tabShow.getColumnCount(); column++) {
            Class<?> col_class = tabShow.getColumnClass(column);
            tabShow.setDefaultEditor(col_class, null);
        }
        dtm2 = new DefaultTableModel();

        dtm = new DefaultTableModel();
        dtm.setColumnIdentifiers(new Object[]{"Mô tả", "Vị trí", "Địa chỉ", "Email", "Phone", "Tên", "Số lượng tuyển", "Lương", "Hạn tuyển", "Giới tính", "Kinh nghiệm"});

        // Thêm dữ liệu vào bảng
        MyDate ngayHetHan = new MyDate("22/10/2024");
        NguoiDangTuyen nguoiDangTuyen1 = new NguoiDangTuyen("Tuyển dụng", "Full-stack", "Hà Nội", "fpt@tuyendung.com", "02222345", "FPT company", 10, 15000000, ngayHetHan);
        a.them(nguoiDangTuyen1);
        NguoiUngTuyen nguoiUngTuyen1 = new NguoiUngTuyen("Ứng tuyển", "Back-end", "Hồ Chí Minh", "vanphutin2902@.com", "0234534245", "Văn Phú Tín", true, "Inter");
        a.them(nguoiUngTuyen1);

        MyDate ngayHetHan2 = new MyDate("20/01/2023");
        NguoiDangTuyen nguoiDangTuyen2 = new NguoiDangTuyen("Tuyển dụng", "Backend Developer", "Cần Thơ", "recruitment@company.com", "02222346", "Company Viettel", 5, 12000000, ngayHetHan2);
        a.them(nguoiDangTuyen2);
        NguoiUngTuyen nguoiUngTuyen2 = new NguoiUngTuyen("Ứng tuyển", "Data Scientist", "Nha Trang", "thanhZuka1@company.com", "0234534223", "Nguyễn Thanh", true, "Junior");
        a.them(nguoiUngTuyen2);

        MyDate ngayHetHan3 = new MyDate("12/05/2024");
        NguoiDangTuyen nguoiDangTuyen3 = new NguoiDangTuyen("Tuyển dụng", "Project Manager", "Hà Nội", "recruitment@company.com", "02222347", "Company Viễn thông Việt Nam – VNPT", 3, 10000000, ngayHetHan3);
        a.them(nguoiDangTuyen3);
        NguoiUngTuyen nguoiUngTuyen3 = new NguoiUngTuyen("Ứng tuyển", "Mobile Developer", "Cà Mau", "nguyenthi.lan2@company.com", "0234534247", "Nguyễn Thị Lan", true, "Senior");
        a.them(nguoiUngTuyen3);

        MyDate ngayHetHan4 = new MyDate("22/10/2024");
        NguoiDangTuyen nguoiDangTuyen4 = new NguoiDangTuyen("Tuyển dụng", "Font-end", "Hà Nội", "recruitment@company.com", "02222348", "Company Cổ Phần VNG", 7, 8000000, ngayHetHan4);
        a.them(nguoiDangTuyen4);
        NguoiUngTuyen nguoiUngTuyen4 = new NguoiUngTuyen("Ứng tuyển", "Data Analyst", "Hải Phòng", "vananh.tran3@company.com", "0234534248", "Trần Vân Anh", false, "Entry-level");
        a.them(nguoiUngTuyen4);

        MyDate ngayHetHan5 = new MyDate("22/10/2025");
        NguoiDangTuyen nguoiDangTuyen5 = new NguoiDangTuyen("Tuyển dụng", "Back-end", "Hồ Chí Minh", "recruitment@company.com", "02222348", " Tập đoàn Intel ", 5, 10000000, ngayHetHan5);
        a.them(nguoiDangTuyen5);
        MyDate ngayHetHan7 = new MyDate("22/10/2027");
        NguoiUngTuyen nguoiUngTuyen5 = new NguoiUngTuyen("Ứng tuyển", "Software Engineer", "Hà Nội", "nam.nguyen@company.com", "0234534248", "Nguyễn Văn Nam", true, "Intermediate");
        a.them(nguoiUngTuyen5);

        MyDate ngayHetHan6 = new MyDate("22/10/2026");
        NguoiDangTuyen nguoiDangTuyen6 = new NguoiDangTuyen("Tuyển dụng", "Full-stack", "Đà Nẵng", "recruitment@company.com", "02222348", "Company Global CyberSoft Việt Nam", 10, 42500000, ngayHetHan6);
        a.them(nguoiDangTuyen6);
        MyDate ngayHetHan8 = new MyDate("22/10/2028");
        NguoiUngTuyen nguoiUngTuyen6 = new NguoiUngTuyen("Ứng tuyển", "Data Scientist", "Hồ Chí Minh", "thanh.le@company.com", "0234534248", "Lê Thanh", false, "Senior");
        a.them(nguoiUngTuyen6);

        // Thêm dữ liệu từ nguoiDangTuyen vào DefaultTableModel
        ArrayList<Object> dataList = new ArrayList<>();
        dataList.add(nguoiDangTuyen1);
        dataList.add(nguoiUngTuyen1);
        dataList.add(nguoiDangTuyen2);
        dataList.add(nguoiUngTuyen2);
        dataList.add(nguoiDangTuyen3);
        dataList.add(nguoiUngTuyen3);
        dataList.add(nguoiDangTuyen4);
        dataList.add(nguoiUngTuyen4);
        dataList.add(nguoiDangTuyen5);
        dataList.add(nguoiUngTuyen5);
        dataList.add(nguoiDangTuyen6);
        dataList.add(nguoiUngTuyen6);

        for (Object obj : dataList) {
            if (obj instanceof NguoiDangTuyen) {
                NguoiDangTuyen nguoiDangTuyen = (NguoiDangTuyen) obj;
                Object[] rowData = {
                    nguoiDangTuyen.getMoTa(),
                    nguoiDangTuyen.getViTri(),
                    nguoiDangTuyen.getDiaDiem(),
                    nguoiDangTuyen.getEmail(),
                    nguoiDangTuyen.getPhone(),
                    nguoiDangTuyen.getTen(),
                    nguoiDangTuyen.getSoLuong(),
                    nguoiDangTuyen.getMucLuong(),
                    nguoiDangTuyen.getNgayHetHan(),
                    null, // Giới tính (chưa biết giới tính từ NguoiDangTuyen)
                    null // Kinh nghiệm (chưa biết kinh nghiệm từ NguoiDangTuyen)
                };
                dtm.addRow(rowData);
            } else if (obj instanceof NguoiUngTuyen) {
                NguoiUngTuyen nguoiUngTuyen = (NguoiUngTuyen) obj;
                 String gioiTinh = nguoiUngTuyen.isGioiTinh() ? "Nam" : "Nữ";
                Object[] rowData = {
                    nguoiUngTuyen.getMoTa(),
                    nguoiUngTuyen.getViTri(),
                    nguoiUngTuyen.getDiaDiem(),
                    nguoiUngTuyen.getEmail(),
                    nguoiUngTuyen.getPhone(),
                    nguoiUngTuyen.getTen(),
                    null, // Số lượng tuyển (chưa biết số lượng từ NguoiUngTuyen)
                    null, // Lương (chưa biết lương từ NguoiUngTuyen)
                    null, // Hạn tuyển (chưa biết hạn tuyển từ NguoiUngTuyen)
                    gioiTinh,
                    nguoiUngTuyen.getKinhNghiem()
                };
                dtm.addRow(rowData);
            }
        }

        // Gán DefaultTableModel cho JTable
        tabShow.setModel(dtm);
        tabShow1.setModel(dtm2);

        rdoKhach.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                loadData(a.getA());
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        labLoc = new javax.swing.JLabel();
        labTim = new javax.swing.JLabel();
        labMT = new javax.swing.JLabel();
        labVT = new javax.swing.JLabel();
        labDC = new javax.swing.JLabel();
        labEmail = new javax.swing.JLabel();
        labPhone = new javax.swing.JLabel();
        labTen = new javax.swing.JLabel();
        labSL = new javax.swing.JLabel();
        labLuong = new javax.swing.JLabel();
        labHT = new javax.swing.JLabel();
        labGT = new javax.swing.JLabel();
        labKN = new javax.swing.JLabel();
        txtVT = new javax.swing.JTextField();
        txtDC = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtTen = new javax.swing.JTextField();
        txtSL = new javax.swing.JTextField();
        txtLuong = new javax.swing.JTextField();
        txtHT = new javax.swing.JTextField();
        txtKN = new javax.swing.JTextField();
        rdoNam = new javax.swing.JRadioButton();
        rdoNu = new javax.swing.JRadioButton();
        listLoc = new javax.swing.JComboBox<>();
        listLocDs = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabShow = new javax.swing.JTable();
        btnTao = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        rdoUV = new javax.swing.JRadioButton();
        rdoKhach = new javax.swing.JRadioButton();
        rdoNTD = new javax.swing.JRadioButton();
        btnNapHs = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtMT = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabShow1 = new javax.swing.JTable();
        labDS = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        labTabTilte = new javax.swing.JLabel();
        btnXoa = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        listLuong = new javax.swing.JComboBox<>();
        listCapBac = new javax.swing.JComboBox<>();
        listVitri = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ỨNG DỤNG TÌM KIẾM VIỆC LÀM");
        setLocation(new java.awt.Point(2, 2));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setForeground(java.awt.Color.red);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("TÌM KIẾM VIỆC LÀM ");

        labLoc.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labLoc.setText("Tìm kiếm");

        labTim.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labTim.setText("Lọc");

        labMT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labMT.setText("Mô tả");

        labVT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labVT.setText("Vị trí");

        labDC.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labDC.setText("Địa chỉ");

        labEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labEmail.setText("Email");

        labPhone.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labPhone.setText("Phone");

        labTen.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labTen.setText("Tên");

        labSL.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labSL.setText("Số lượng");

        labLuong.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labLuong.setText("Lương");

        labHT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labHT.setText("Hạn tuyển");

        labGT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labGT.setText("Giới tính");

        labKN.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labKN.setText("Kinh nghiệm");

        txtVT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVTActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdoNam);
        rdoNam.setSelected(true);
        rdoNam.setText("Nam");
        rdoNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoNamActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdoNu);
        rdoNu.setText("Nữ");
        rdoNu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoNuActionPerformed(evt);
            }
        });

        listLoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả", "Full-stack", "Back-end", "Font-end", "Project Manager", "UI/UX Designer", "Data Scientist", "Web Developer", "DevOps Engineer", "Machine Learning Engineer", "Cybersecurity Specialist" }));
        listLoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listLocActionPerformed(evt);
            }
        });

        listLocDs.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả", "Nhà Tuyển Dụng", "Ứng Viên" }));
        listLocDs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listLocDsActionPerformed(evt);
            }
        });

        tabShow.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabShow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabShowMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabShow);

        btnTao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnTao.setText("Tạo thông tin");
        btnTao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoActionPerformed(evt);
            }
        });

        jLabel2.setBackground(java.awt.Color.pink);
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("    Đăng nhập với....   ");
        jLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        buttonGroup2.add(rdoUV);
        rdoUV.setText("Ứng viên");
        rdoUV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoUVActionPerformed(evt);
            }
        });

        buttonGroup2.add(rdoKhach);
        rdoKhach.setSelected(true);
        rdoKhach.setText("Khách");
        rdoKhach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoKhachActionPerformed(evt);
            }
        });

        buttonGroup2.add(rdoNTD);
        rdoNTD.setText("Nhà tuyển dụng");
        rdoNTD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoNTDActionPerformed(evt);
            }
        });

        btnNapHs.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnNapHs.setText("Nộp hồ sơ");
        btnNapHs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNapHsActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(java.awt.Color.red);
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("LIFE & WORK");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Có làm thì mới có ăn, GENZ tìm việc không khó khăn.");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jLabel5.setText("Ứng dụng tìm kiếm việc ");

        jLabel6.setText(".com");

        txtMT.setText("Mo ta");
        txtMT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMTActionPerformed(evt);
            }
        });

        tabShow1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabShow1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabShow1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabShow1);

        labDS.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labDS.setText("Danh sách thông tin đã tạo ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 188, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(411, 411, 411)
                .addComponent(labDS)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labDS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        labTabTilte.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        labTabTilte.setText("Danh sách Công Việc và Ứng Viên");

        btnXoa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnXoa.setText("Xóa thông tin");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnCapNhat.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCapNhat.setText("Cập nhật");
        btnCapNhat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCapNhatMouseClicked(evt);
            }
        });
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Giúp bạn tìm kiếm nhanh hơn", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        listLuong.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mức Lương từ", "3000000", "9000000", "12000000", "15000000", "20000000", "25000000", "40000000", " " }));
        listLuong.setBorder(null);
        listLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listLuongActionPerformed(evt);
            }
        });

        listCapBac.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cấp bậc", "Senior", "Intermediate", "Entry-level", "Junior", "Inter", "Master", " " }));
        listCapBac.setBorder(null);
        listCapBac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listCapBacActionPerformed(evt);
            }
        });

        listVitri.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vị Trí", "Hà Nội", "Lạng Sơn", "Hồ Chí Minh", "Cần Thơ", "Mũi Né", "Vĩnh Phúc", "Hải Phòng", "Nha Trang", "Đà Nẵng", "Sóc Sơn", "Huế" }));
        listVitri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listVitriActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(listLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(listVitri, 0, 172, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(listCapBac, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listCapBac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listVitri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(175, 175, 175)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(132, 132, 132)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(230, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(labKN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labGT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labHT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labLuong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labSL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labTen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labPhone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labDC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labVT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labMT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labTim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labLoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rdoNam)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rdoNu))
                                    .addComponent(txtVT)
                                    .addComponent(txtDC)
                                    .addComponent(txtEmail)
                                    .addComponent(txtPhone)
                                    .addComponent(txtTen)
                                    .addComponent(txtSL)
                                    .addComponent(txtLuong)
                                    .addComponent(txtHT)
                                    .addComponent(txtKN)
                                    .addComponent(listLoc, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(listLocDs, 0, 1, Short.MAX_VALUE)
                                    .addComponent(txtMT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNapHs)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnTao)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jSeparator1)
                                .addGap(20, 20, 20))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnXoa)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(rdoUV)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(rdoKhach)
                                        .addGap(205, 205, 205)
                                        .addComponent(rdoNTD)
                                        .addGap(46, 46, 46))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(72, 72, 72)
                                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labTabTilte)
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(10, 10, 10)
                .addComponent(labTabTilte)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnXoa)
                                .addComponent(btnCapNhat))
                            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(listLoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labLoc, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labTim)
                            .addComponent(listLocDs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labMT)
                            .addComponent(txtMT))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labVT)
                            .addComponent(txtVT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labDC)
                            .addComponent(txtDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labEmail)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labPhone)
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labTen)
                            .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labSL)
                            .addComponent(txtSL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labLuong)
                            .addComponent(txtLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labHT)
                            .addComponent(txtHT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labGT)
                            .addComponent(rdoNam)
                            .addComponent(rdoNu))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labKN)
                            .addComponent(txtKN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNapHs)
                            .addComponent(btnTao))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rdoUV)
                                    .addComponent(rdoKhach)
                                    .addComponent(rdoNTD, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(5, 5, 5)))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdoNTDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoNTDActionPerformed
        // TODO add your handling code here:
        tabShow.setEnabled(true);
        jPanel1.setVisible(true);
        listCapBac.setSelectedIndex(0);
        dtm.setColumnIdentifiers(new Object[]{"Mô tả", "Vị trí", "Địa chỉ", "Email", "Phone", "Họ tên", "Giới tính", "Kinh nghiệm"});
        loadData(a.getA());

        dtm2 = new DefaultTableModel();
        dtm2.setColumnIdentifiers(new Object[]{"Mô tả", "Vị trí", "Địa chỉ", "Email", "Phone", "Tên công ty", "Số lượng tuyển", "Lương", "Hạn tuyển"}); //, "Giới tính", "Kinh nghiệm"
        tabShow1.setModel(dtm2);
        loadData1(b.getB());

        // set ten 
        labTen.setText("Tên công ty");
        labDS.setText("Danh sách thông tin Đăng tuyển");
        labTabTilte.setText("Danh sách Ứng viên  ");
        // setText = ""
        txtMT.setText("");
        txtVT.setText("");
        txtDC.setText("");
        txtEmail.setText("");
        txtPhone.setText("");
        txtTen.setText("");
        txtKN.setText("");
        txtLuong.setText("");
        txtSL.setText("");
        txtHT.setText("");

        //set visible true
        labMT.setVisible(true);
        txtMT.setVisible(true);
        txtMT.setText("Tuyển Dụng");
        listCapBac.setVisible(true);
        labVT.setVisible(true);
        txtVT.setVisible(true);
        labDC.setVisible(true);
        txtDC.setVisible(true);
        labEmail.setVisible(true);
        txtEmail.setVisible(true);
        labPhone.setVisible(true);
        txtPhone.setVisible(true);
        labTen.setVisible(true);
        txtTen.setVisible(true);
        labSL.setVisible(true);
        txtSL.setVisible(true);
        labLuong.setVisible(true);
        txtLuong.setVisible(true);
        labHT.setVisible(true);
        txtHT.setVisible(true);
        btnCapNhat.setVisible(true);
        btnXoa.setVisible(true);

        btnTao.setVisible(true);
        btnTao.setText("Đăng tuyển");
        btnNapHs.setText("Tuyển");
        btnNapHs.setVisible(true);

        //set visible false
        labGT.setVisible(false);
        rdoNam.setVisible(false);
        rdoNu.setVisible(false);
        labKN.setVisible(false);
        txtKN.setVisible(false);
        labTim.setVisible(false);
        listLocDs.setVisible(false);
        listLuong.setVisible(false);
        

    }//GEN-LAST:event_rdoNTDActionPerformed

    private void rdoKhachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoKhachActionPerformed
        // TODO add your handling code here:
        listCapBac.setSelectedIndex(0);
        listLuong.setSelectedIndex(0);
        // vô hiệu hóa table 
        tabShow.setEnabled(false);

//        jPanel1.setVisible(false);
        jPanel1.setVisible(false);
        dtm.setColumnIdentifiers(new Object[]{"Mô tả", "Vị trí", "Địa chỉ", "Email", "Phone", "Tên", "Số lượng tuyển", "Lương", "Hạn tuyển", "Giới tính", "Kinh nghiệm"});
        loadData(a.getA());
        loadData1(b.getB());

        // set ten 
        labTen.setText("Tên");

        labTim.setVisible(true);
        listLocDs.setVisible(true);
        listCapBac.setVisible(true);
        
        //set visible false
        btnTao.setVisible(false);
        btnNapHs.setVisible(false);
        labTabTilte.setText("Danh sách Công Việc và Ứng Viên");

        labMT.setVisible(false);
        txtMT.setVisible(false);
        labVT.setVisible(false);
        txtVT.setVisible(false);
        labDC.setVisible(false);
        txtDC.setVisible(false);
        labEmail.setVisible(false);
        txtEmail.setVisible(false);
        labPhone.setVisible(false);
        txtPhone.setVisible(false);
        labTen.setVisible(false);
        txtTen.setVisible(false);
        labGT.setVisible(false);
        rdoNam.setVisible(false);
        rdoNu.setVisible(false);
        labSL.setVisible(false);
        txtSL.setVisible(false);
        labLuong.setVisible(false);
        txtLuong.setVisible(false);
        labHT.setVisible(false);
        txtHT.setVisible(false);
        labKN.setVisible(false);
        txtKN.setVisible(false);
        btnCapNhat.setVisible(false);
        btnXoa.setVisible(false);

        JOptionPane.showMessageDialog(this, "Bạn đang đăng nhập với tư cách " + rdoKhach.getText() + "\nVui lòng đăng nhập để Ứng tuyển hoặc Tuyển dụng !!");


    }//GEN-LAST:event_rdoKhachActionPerformed

    private void hideComponents() {
        // Ẩn các nút hoặc nhãn theo tùy chọn
//       jPanel1.setVisible(false);

        jPanel1.setVisible(false);
        btnTao.setVisible(false);
        btnNapHs.setVisible(false);
        
        btnCapNhat.setVisible(false);
        btnXoa.setVisible(false);
        labMT.setVisible(false);
        txtMT.setVisible(false);
        labVT.setVisible(false);
        txtVT.setVisible(false);
        labDC.setVisible(false);
        txtDC.setVisible(false);
        labEmail.setVisible(false);
        txtEmail.setVisible(false);
        labPhone.setVisible(false);
        txtPhone.setVisible(false);
        labTen.setVisible(false);
        txtTen.setVisible(false);
        labGT.setVisible(false);
        rdoNam.setVisible(false);
        rdoNu.setVisible(false);
        labSL.setVisible(false);
        txtSL.setVisible(false);
        labLuong.setVisible(false);
        txtLuong.setVisible(false);
        labHT.setVisible(false);
        txtHT.setVisible(false);
        labKN.setVisible(false);
        txtKN.setVisible(false);
        JOptionPane.showMessageDialog(this, "Bạn đang đăng nhập với tư cách " + rdoKhach.getText() + "\nVui lòng đăng nhập để Ứng tuyển hoặc Tuyển dụng !!");

    }

    private void rdoUVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoUVActionPerformed
        // TODO add your handling code here:
        listLuong.setSelectedIndex(0);
        tabShow.setEnabled(true);

        dtm.setColumnIdentifiers(new Object[]{"Mô tả", "Vị trí", "Địa chỉ", "Email", "Phone", "Tên công ty", "Số lượng tuyển", "Lương", "Hạn tuyển"}); //, "Giới tính", "Kinh nghiệm"
        loadData(a.getA());

        jPanel1.setVisible(true);
        dtm2 = new DefaultTableModel();
        dtm2.setColumnIdentifiers(new Object[]{"Mô tả", "Vị trí", "Địa chỉ", "Email", "Phone", "Họ tên", "Giới tính", "Kinh nghiệm"});
        tabShow1.setModel(dtm2);
        loadData1(b.getB());

        // set ten 
        txtMT.setText("Ứng Tuyển");
        labTen.setText("Họ tên");
        labTabTilte.setText("Danh sách Nhà tuyển dụng ");
        labDS.setText("Danh sách thông tin đã tạo");
        // visible false
        labSL.setVisible(false);
        txtSL.setVisible(false);
        labLuong.setVisible(false);
        txtLuong.setVisible(false);
        labHT.setVisible(false);
        txtHT.setVisible(false);
        labTim.setVisible(false);
        listLocDs.setVisible(false);
        listCapBac.setVisible(false);
        txtMT.setText("");
        txtVT.setText("");
        txtDC.setText("");
        txtEmail.setText("");
        txtPhone.setText("");
        txtTen.setText("");
        txtKN.setText("");
        txtLuong.setText("");
        txtSL.setText("");
        txtHT.setText("");

        //set visible true
        btnNapHs.setVisible(true);
        btnNapHs.setText("Nộp hồ sơ");
        btnTao.setVisible(true);
        btnTao.setText("Tạo thông tin");

        labMT.setVisible(true);
        txtMT.setVisible(true);
        txtMT.setText("Ứng tuyển");
        labVT.setVisible(true);
        txtVT.setVisible(true);
        labDC.setVisible(true);
        txtDC.setVisible(true);
        labEmail.setVisible(true);
        txtEmail.setVisible(true);
        labPhone.setVisible(true);
        txtPhone.setVisible(true);
        labTen.setVisible(true);
        txtTen.setVisible(true);
        labGT.setVisible(true);
        rdoNam.setVisible(true);
        rdoNu.setVisible(true);
        labKN.setVisible(true);
        txtKN.setVisible(true);
        btnCapNhat.setVisible(true);
        btnXoa.setVisible(true);
         listLuong.setVisible(true);


    }//GEN-LAST:event_rdoUVActionPerformed

    private void btnTaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoActionPerformed
        // TODO add your handling code here:
//      txtMT.setText("Ứng viên");
        if ("Ứng tuyển".equalsIgnoreCase(txtMT.getText())) {
            txtMT.setText("Ứng tuyển");
        }
        if ("Tuyển Dụng".equals(txtMT.getText())) {
            txtMT.setText("Tuyển Dụng");
        }

        if (txtTen.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Không được để trống !", "Lỗi", JOptionPane.ERROR_MESSAGE);
        } else {
            CongViec y = null;
//            String mt = txtMT.getText();
            String vt = txtVT.getText();
            String diaChi = txtDC.getText();
            String email = txtEmail.getText();
            String phone = txtPhone.getText();
            String ten = txtTen.getText();

            if (rdoUV.isSelected()) {

                boolean gt = gioiTinh;
                String kn = txtKN.getText();
                y = new NguoiUngTuyen("Ứng Tuyển", vt, diaChi, email, phone, ten, gioiTinh, kn);
            } else if (rdoNTD.isSelected()) {

                String slText = txtSL.getText();
                String luongText = txtLuong.getText();
                String ngayHHText = txtHT.getText();

                // Kiểm tra nếu không phải boolean, null, hoặc chuỗi rỗng
                if (!"true".equalsIgnoreCase(slText) && !"false".equalsIgnoreCase(slText) && slText != null && !slText.isEmpty()
                        && !"true".equalsIgnoreCase(luongText) && !"false".equalsIgnoreCase(luongText) && luongText != null && !luongText.isEmpty()
                        && ngayHHText != null && !ngayHHText.isEmpty()) {

                    try {
                        int sl = Integer.parseInt(slText);
                        long luong = Long.parseLong(luongText);
                        MyDate ngayHH = new MyDate(ngayHHText);
                        y = new NguoiDangTuyen("Nhà tuyển dụng", vt, diaChi, email, phone, ten, sl, luong, ngayHH);
//                        b.them(y);
//                        loadData1(b.getA());
                    } catch (NumberFormatException e) {
                        // Xử lý khi người dùng nhập không phải là số
                        JOptionPane.showMessageDialog(this, "Vui lòng nhập số lượng tuyển và lương là các số nguyên, và ngày hết hạn là định dạng ngày (dd/MM/yyyy).");
                    }
                } else {
                    // Bỏ qua vì giá trị không phù hợp
                }
            }

            txtVT.setText("");
            txtDC.setText("");
            txtEmail.setText("");
            txtPhone.setText("");
            txtTen.setText("");
            txtKN.setText("");
            txtLuong.setText("");
            txtSL.setText("");
            txtHT.setText("");

            a.them(y);
            loadData(a.getA());
            b.them(y);
            loadData1(b.getA());
        }
    }//GEN-LAST:event_btnTaoActionPerformed

    private boolean gioiTinh;
    private void rdoNuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoNuActionPerformed
        // TODO add your handling code here:
        gioiTinh = false;
        gioiTinh = true;
    }//GEN-LAST:event_rdoNuActionPerformed

    private void rdoNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoNamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoNamActionPerformed


    private void listLocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listLocActionPerformed
        // TODO add your handling code here:
        String selectedPosition = (String) listLoc.getSelectedItem();
//        ArrayList<CongViec> filteredList = a.timKiem(selectedPosition);

        if ("Tất cả".equals(selectedPosition)) {
            // Show all jobs
            loadData(a.getA());
        } else {
            ArrayList<CongViec> filteredList = a.timKiem(selectedPosition);

            if (filteredList.isEmpty()) {
                // Display a message indicating an empty list
                JOptionPane.showMessageDialog(this, "Không có công việc nào cho vị trí này.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            } else {
                // Update your table or UI with the filtered list
                updateUIWithFilteredList(filteredList);
            }
        }

    }//GEN-LAST:event_listLocActionPerformed

    private void updateUIWithFilteredList(ArrayList<CongViec> filteredList) {
        // Add your code here to update the UI with the filtered list
        loadData(filteredList);
        // Additional UI update code if needed
    }

    private void listLocDsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listLocDsActionPerformed
        // TODO add your handling code here:
        int selectedPosition = listLocDs.getSelectedIndex();

        switch (selectedPosition) {
            case 0:
                // Display all jobs
                loadData(a.getA());
                break;
            case 1:
                // Display jobs of type NguoiDangTuyen
                loadData(a.locDS("NguoiDangTuyen"));
                break;
            case 2:
                // Display jobs of type NguoiUngTuyen
                loadData(a.locDS("NguoiUngTuyen"));
                break;
        }

    }//GEN-LAST:event_listLocDsActionPerformed

    private void btnNapHsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNapHsActionPerformed
        // TODO add your handling code here:

        if (btnNapHs.getText().equalsIgnoreCase("Nộp hồ sơ")) {
            int selectedRow = tabShow.getSelectedRow();
            if(selectedRow < 1){
                    JOptionPane.showMessageDialog(null, "Nộp đơn thất bại. Vui lòng nhấn vào hàng trên bảng !!.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
            if (selectedRow != -1) {
                // Trích xuất thông tin từ hàng đã chọn
                String jobTitle = (String) tabShow.getValueAt(selectedRow, columnIndexForJobTitle);
                String companyName = (String) tabShow.getValueAt(selectedRow, columnIndexForCompanyName);

                // Thực hiện logic nộp đơn (đặt phương thức nộp đơn của bạn ở đây)
                boolean applicationSubmitted = submitApplication(jobTitle, companyName);

                // Hiển thị thông báo thành công hoặc thất bại
                if (applicationSubmitted) {
                    JOptionPane.showMessageDialog(null, "Nộp đơn thành công cho công việc: " + jobTitle);
                } else {
                    JOptionPane.showMessageDialog(null, "Nộp đơn thất bại. Vui lòng thử lại.", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        if (btnNapHs.getText().equalsIgnoreCase("Tuyển")) {
            int selectedRow = tabShow.getSelectedRow();
            if(selectedRow < 1){
                    JOptionPane.showMessageDialog(null, "Nộp đơn thất bại. Vui lòng nhấn vào hàng trên bảng !!.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
            if (selectedRow != -1) {
                // Trích xuất thông tin từ hàng đã chọn
                String jobTitle = (String) tabShow.getValueAt(selectedRow, columnIndexForJobTitle);
                String companyName = (String) tabShow.getValueAt(selectedRow, columnIndexForCompanyName);

                // Thực hiện logic nộp đơn (đặt phương thức nộp đơn của bạn ở đây)
                boolean applicationSubmitted = submitApplication(jobTitle, companyName);

                // Hiển thị thông báo thành công hoặc thất bại
                if (applicationSubmitted) {
                    JOptionPane.showMessageDialog(null, "Chúc mừng, tuyển dụng thành công ứng viên" );
                } else {
                    JOptionPane.showMessageDialog(null, "Tuyển dụng thất bại. Vui lòng thử lại.", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btnNapHsActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        int row = tabShow1.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(null, "Xoá thất bại. Không có hàng nào được chọn.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Bạn có muốn xoá không  ");
            dtm2.removeRow(row);
            
        }

//        txtMT.setText("");
        txtVT.setText("");
        txtDC.setText("");
        txtEmail.setText("");
        txtPhone.setText("");
        txtTen.setText("");
        txtKN.setText("");
        txtLuong.setText("");
        txtSL.setText("");
        txtHT.setText("");

    }//GEN-LAST:event_btnXoaActionPerformed

    private void tabShow1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabShow1MouseClicked
        // TODO add your handling code here:
        int selectedRow = tabShow1.getSelectedRow();

        if (selectedRow != -1 && rdoUV.isSelected()) {
            Object gioiTinhValue = tabShow1.getValueAt(selectedRow, 7);
            txtMT.setText("Ứng Tuyển");
            txtVT.setText(tabShow1.getValueAt(selectedRow, 1).toString());
            txtDC.setText(tabShow1.getValueAt(selectedRow, 2).toString());
            txtEmail.setText(tabShow1.getValueAt(selectedRow, 3).toString());
            txtPhone.setText(tabShow1.getValueAt(selectedRow, 4).toString());
            txtTen.setText(tabShow1.getValueAt(selectedRow, 5).toString());
            txtKN.setText(tabShow1.getValueAt(selectedRow, 7).toString());

            if (gioiTinhValue != null) {
                // Nếu giới tính là Nam
                if (gioiTinhValue.equals(true)) {
                    rdoNam.setSelected(true);
                    rdoNu.setSelected(false);
                } // Nếu giới tính là Nữ
                else if (gioiTinhValue.equals(false)) {
                    rdoNam.setSelected(false);
                    rdoNu.setSelected(true);
                }
            }
        }
        if (selectedRow != -1 && rdoNTD.isSelected()) {
            txtMT.setText("Tuyển dụng");
            txtVT.setText(tabShow1.getValueAt(selectedRow, 1).toString());
            txtDC.setText(tabShow1.getValueAt(selectedRow, 2).toString());
            txtEmail.setText(tabShow1.getValueAt(selectedRow, 3).toString());
            txtPhone.setText(tabShow1.getValueAt(selectedRow, 4).toString());
            txtTen.setText(tabShow1.getValueAt(selectedRow, 5).toString());
            txtSL.setText(tabShow1.getValueAt(selectedRow, 6).toString());
            txtLuong.setText(tabShow1.getValueAt(selectedRow, 7).toString());
            txtHT.setText(tabShow1.getValueAt(selectedRow, 8).toString());
        }

    }//GEN-LAST:event_tabShow1MouseClicked

    private void updateCandidateInfo() {
        // Retrieve updated information from the UI components

    }

    private void txtVTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVTActionPerformed

    private void tabShowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabShowMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_tabShowMouseClicked

    private void txtMTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMTActionPerformed

    private void btnCapNhatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCapNhatMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCapNhatMouseClicked

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        //String moTa, String viTri, String diaDiem, String email, String phone, String tenNguoi, boolean gioiTinh
        String mt = txtMT.getText();
        String vt = txtVT.getText();
        String dc = txtDC.getText();
        String email = txtEmail.getText();
        String phone = txtPhone.getText();
        String ten = txtTen.getText();
        CongViec y;
        int row = tabShow1.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(null, "Cập nhật thất bại. Không có hàng nào được chọn.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
        if (rdoUV.isSelected()) {
            // boolean gioiTinh ,String kinhNghiem
            Boolean gioiTinh = rdoNam.isSelected();
            String kn = txtKN.getText();
            y = new NguoiUngTuyen(mt, vt, dc, email, phone, ten, gioiTinh, kn);
        } else {
            // int soLuong, long mucLuong, MyDate ngayHetHan
            Integer sl = Integer.parseInt(txtSL.getText());
            Long luong = Long.parseLong(txtLuong.getText());
            MyDate hanTuyen = new MyDate(txtHT.getText());
            y = new NguoiDangTuyen(mt, vt, dc, email, phone, ten, sl, luong, hanTuyen);
        }

        int chon = JOptionPane.showConfirmDialog(rootPane, "Có muốn cập nhật thông tin ?");
        if (chon == JOptionPane.YES_OPTION) {
            int index = tabShow1.getSelectedRow();
            ArrayList<CongViec> c = b.getB();
            c.set(index, y);
            b.setB(c);
            loadData1(b.getB());
   
        } else {
            JOptionPane.showConfirmDialog(rootPane, "Không cập nhật thông tin");
        }

    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void listLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listLuongActionPerformed
        
        try {
        Long selectedPosition = Long.parseLong(listLuong.getSelectedItem().toString());

        if ("Mức Lương từ".equals(listLuong.getSelectedItem().toString())) {
            // Show all jobs
            loadData(a.getA());
        } else {
            ArrayList<CongViec> filteredList = a.loc_luong(selectedPosition);

            if (filteredList.isEmpty()) {
                // Display a message indicating an empty list
                JOptionPane.showMessageDialog(this, "Không có lương phù hợp.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                listLuong.setSelectedIndex(0);
            } else {
                // Update your table or UI with the filtered list
                updateUIWithFilteredList(filteredList);
                
            }
        }
    } catch (NumberFormatException e) {
        // Handle the case where the selected item is not a valid numeric string
        if ("Mức Lương từ".equals(listLuong.getSelectedItem().toString())) {
            // Show all jobs
            loadData(a.getA());
        } else {
            // Display a message indicating an invalid selection
            JOptionPane.showMessageDialog(this, "Lựa chọn không hợp lệ.", "Thông báo", JOptionPane.ERROR_MESSAGE);
        }
    
}


    }//GEN-LAST:event_listLuongActionPerformed

    private void listCapBacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listCapBacActionPerformed
        // TODO add your handling code here:
        String selectedPosition = (String) listCapBac.getSelectedItem();
        if ("Cấp bậc".equals(selectedPosition)) {
            // Show all jobs
            loadData(a.getA());
        } else {
            ArrayList<CongViec> filteredList = a.loc_capBac(selectedPosition);

            if (filteredList.isEmpty()) {
                // Display a message indicating an empty list
                JOptionPane.showMessageDialog(this, "Không có công việc nào cho cấp bậc này.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                listCapBac.setSelectedIndex(0);
            } else {
                // Update your table or UI with the filtered list
                updateUIWithFilteredList(filteredList);
            }
        }
    }//GEN-LAST:event_listCapBacActionPerformed

    private void listVitriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listVitriActionPerformed
        // TODO add your handling code here:
         String selectedPosition = (String) listVitri.getSelectedItem();
        if ("Cấp bậc".equals(selectedPosition)) {
            // Show all jobs
            loadData(a.getA());
        } else {
            ArrayList<CongViec> filteredList = a.loc_viTri(selectedPosition);

            if (filteredList.isEmpty()) {
                // Display a message indicating an empty list
                JOptionPane.showMessageDialog(this, "Không có công việc nào cho vị trí này.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                listVitri.setSelectedIndex(0);
            } else {
                // Update your table or UI with the filtered list
                updateUIWithFilteredList(filteredList);
            }
        }
    }//GEN-LAST:event_listVitriActionPerformed


    
    private boolean submitApplication(String jobTitle, String companyName) {
        // Thực hiện logic nộp đơn và trả về true nếu thành công, false nếu thất bại
        // Đây chỉ là một giả định, bạn cần thay thế bằng logic thực tế của bạn
        return true;
    }

    private void loadData(ArrayList a) {
        dtm.getDataVector().clear(); // Xóa dữ liệu hiện tại trong bảng
        

        if (rdoNTD.isSelected()) {
            for (Object obj : a) {

                if (obj instanceof NguoiUngTuyen) {
                    NguoiUngTuyen uv = (NguoiUngTuyen) obj;
                    dtm.addRow(new Object[]{uv.getMoTa(), uv.getViTri(), uv.getDiaDiem(), uv.getEmail(), uv.getPhone(), uv.getTen(), uv.isGioiTinh(), uv.getKinhNghiem()});
                }
            }
        } else if (rdoKhach.isSelected()) {
            for (Object obj : a) {
                if (obj instanceof NguoiDangTuyen) {
                    NguoiDangTuyen ntd = (NguoiDangTuyen) obj;
                    dtm.addRow(new Object[]{ntd.getMoTa(), ntd.getViTri(), ntd.getDiaDiem(), ntd.getEmail(), ntd.getPhone(), ntd.getTen(), ntd.getSoLuong(), ntd.getMucLuong(), ntd.getNgayHetHan()});
                } else if (obj instanceof NguoiUngTuyen) {
                    NguoiUngTuyen uv = (NguoiUngTuyen) obj;
                    dtm.addRow(new Object[]{uv.getMoTa(), uv.getViTri(), uv.getDiaDiem(), uv.getEmail(), uv.getPhone(), uv.getTen(), null, null, null, uv.isGioiTinh(), uv.getKinhNghiem()});
                }
            }
        } else if (rdoUV.isSelected()) {
            for (Object obj : a) {

                if (obj instanceof NguoiDangTuyen) {
                    NguoiDangTuyen ntd = (NguoiDangTuyen) obj;
                    dtm.addRow(new Object[]{ntd.getMoTa(), ntd.getViTri(), ntd.getDiaDiem(), ntd.getEmail(), ntd.getPhone(), ntd.getTen(), ntd.getSoLuong(), ntd.getMucLuong(), ntd.getNgayHetHan()});

                }
            }
        }
    }
    //=================== ADD INFO ==========

    private void loadData1(ArrayList b) {
        dtm2.setRowCount(0);
        if (rdoNTD.isSelected()) {
            for (Object obj : b) {
                if (obj instanceof NguoiDangTuyen) {
                    NguoiDangTuyen ntd = (NguoiDangTuyen) obj;
                    dtm2.addRow(new Object[]{ntd.getMoTa(), ntd.getViTri(), ntd.getDiaDiem(), ntd.getEmail(), ntd.getPhone(), ntd.getTen(), ntd.getSoLuong(), ntd.getMucLuong(), ntd.getNgayHetHan()});
                }
            }
        } else if (rdoKhach.isSelected()) {
            for (Object obj : b) {
                if (obj instanceof NguoiDangTuyen) {
                    NguoiDangTuyen ntd = (NguoiDangTuyen) obj;
                    dtm2.addRow(new Object[]{ntd.getMoTa(), ntd.getViTri(), ntd.getDiaDiem(), ntd.getEmail(), ntd.getPhone(), ntd.getTen(), ntd.getSoLuong(), ntd.getMucLuong(), ntd.getNgayHetHan()});
                } else if (obj instanceof NguoiUngTuyen) {
                    NguoiUngTuyen uv = (NguoiUngTuyen) obj;
                    dtm2.addRow(new Object[]{uv.getMoTa(), uv.getViTri(), uv.getDiaDiem(), uv.getEmail(), uv.getPhone(), uv.getTen(), null, null, null, uv.isGioiTinh(), uv.getKinhNghiem()});
                }
            }
        } else if (rdoUV.isSelected()) {
            for (Object obj : b) {
                if (obj instanceof NguoiUngTuyen) {
                    NguoiUngTuyen uv = (NguoiUngTuyen) obj;
                    dtm2.addRow(new Object[]{uv.getMoTa(), uv.getViTri(), uv.getDiaDiem(), uv.getEmail(), uv.getPhone(), uv.getTen(), uv.isGioiTinh(), uv.getKinhNghiem()});
                }
            }
        }
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GUI gui = new GUI(); // Tạo một đối tượng GUI3
                gui.setVisible(true); // Hiển thị cửa sổ

                // Ẩn các thành phần ngay khi cửa sổ được hiển thị
                gui.hideComponents();

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnNapHs;
    private javax.swing.JButton btnTao;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labDC;
    private javax.swing.JLabel labDS;
    private javax.swing.JLabel labEmail;
    private javax.swing.JLabel labGT;
    private javax.swing.JLabel labHT;
    private javax.swing.JLabel labKN;
    private javax.swing.JLabel labLoc;
    private javax.swing.JLabel labLuong;
    private javax.swing.JLabel labMT;
    private javax.swing.JLabel labPhone;
    private javax.swing.JLabel labSL;
    private javax.swing.JLabel labTabTilte;
    private javax.swing.JLabel labTen;
    private javax.swing.JLabel labTim;
    private javax.swing.JLabel labVT;
    private javax.swing.JComboBox<String> listCapBac;
    private javax.swing.JComboBox<String> listLoc;
    private javax.swing.JComboBox<String> listLocDs;
    private javax.swing.JComboBox<String> listLuong;
    private javax.swing.JComboBox<String> listVitri;
    private javax.swing.JRadioButton rdoKhach;
    private javax.swing.JRadioButton rdoNTD;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JRadioButton rdoUV;
    private javax.swing.JTable tabShow;
    private javax.swing.JTable tabShow1;
    private javax.swing.JTextField txtDC;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHT;
    private javax.swing.JTextField txtKN;
    private javax.swing.JTextField txtLuong;
    private javax.swing.JButton txtMT;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtSL;
    private javax.swing.JTextField txtTen;
    private javax.swing.JTextField txtVT;
    // End of variables declaration//GEN-END:variables
}
