/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sw;
//import static sw.Main.Info;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 산
 */
public class Order extends javax.swing.JFrame {
    int counts = 1;
    Cart cart;
    Cart cart1;

    /**
     * Creates new form Order
     */
    public Order() {
        initComponents();
//        lblUser.setText(Info.getUser_Name());
//        lblRtIme.setText(Info.getUser_RemainTime());
//        lblUtime.setText(Info.getUser_UseTime());

    }

    public void AddTable(String menu, int count, int price) {
        int iCntRow = 0;
        iCntRow = jTable1.getRowCount();
        for (int i = 0; i < jTable1.getRowCount(); i++) {
            if (jTable1.getValueAt(i, 0) == null) {
                iCntRow = i;
                break;
            }
        }

        jTable1.setValueAt(menu, iCntRow, 0);
        jTable1.setValueAt(count, iCntRow, 1);
        jTable1.setValueAt(price, iCntRow, 2);

    }

    public void CountTable(String Menu, int count, int price) {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        String targetValue = Menu;
        int targetRow = -1; // 초기값으로 -1 설정

        for (int row = 0; row < model.getRowCount(); row++) {
            String cellValue = (String) model.getValueAt(row, 0); // 0은 열 인덱스
            if (cellValue.equals(targetValue)) {
                targetRow = row;
                break;
            }
        }
        jTable1.setValueAt(count, targetRow, 1);
        jTable1.setValueAt(count * price, targetRow, 2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Order = new javax.swing.JPanel();
        subPanel = new javax.swing.JPanel();
        btnReset = new javax.swing.JButton();
        btnOrder = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtPrice = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        lblRemainTime = new javax.swing.JLabel();
        lblUsedTime = new javax.swing.JLabel();
        btnAddTime = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        lblUser = new javax.swing.JLabel();
        lblRtIme = new javax.swing.JLabel();
        lblUtime = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Menu = new javax.swing.JTabbedPane();
        Food = new javax.swing.JPanel();
        Ramen = new javax.swing.JPanel();
        RamenBtn = new javax.swing.JButton();
        RamenBtn1 = new javax.swing.JButton();
        Snack = new javax.swing.JPanel();
        Sncak1 = new javax.swing.JPanel();
        Can = new javax.swing.JPanel();
        Topping = new javax.swing.JPanel();
        Cafe = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(970, 535));

        Order.setBackground(new java.awt.Color(35, 35, 35));
        Order.setMinimumSize(new java.awt.Dimension(1072, 606));
        Order.setPreferredSize(new java.awt.Dimension(1072, 606));
        Order.setRequestFocusEnabled(false);

        subPanel.setBackground(new java.awt.Color(80, 80, 80));
        subPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        btnReset.setBackground(new java.awt.Color(204, 204, 204));
        btnReset.setFont(new java.awt.Font("맑은 고딕", 1, 16)); // NOI18N
        btnReset.setText("장바구니 비우기");

        btnOrder.setBackground(new java.awt.Color(204, 204, 204));
        btnOrder.setFont(new java.awt.Font("맑은 고딕", 1, 16)); // NOI18N
        btnOrder.setText("주문하기");

        btnDelete.setBackground(new java.awt.Color(204, 204, 204));
        btnDelete.setFont(new java.awt.Font("맑은 고딕", 1, 16)); // NOI18N
        btnDelete.setText("선택 메뉴 삭제");

        txtPrice.setEditable(false);
        txtPrice.setBackground(new java.awt.Color(204, 204, 204));
        txtPrice.setFont(new java.awt.Font("맑은 고딕", 1, 16)); // NOI18N
        txtPrice.setText("가격 : ");

        lblName.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setText("이름");

        lblRemainTime.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        lblRemainTime.setForeground(new java.awt.Color(255, 255, 255));
        lblRemainTime.setText("잔여시간");

        lblUsedTime.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        lblUsedTime.setForeground(new java.awt.Color(255, 255, 255));
        lblUsedTime.setText("사용시간");

        btnAddTime.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        btnAddTime.setText("시간 충전");

        btnExit.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        btnExit.setText("종료");

        lblUser.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        lblUser.setForeground(new java.awt.Color(255, 255, 255));
        lblUser.setText("홍길동");

        lblRtIme.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        lblRtIme.setForeground(new java.awt.Color(255, 255, 255));
        lblRtIme.setText("00:00");

        lblUtime.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        lblUtime.setForeground(new java.awt.Color(255, 255, 255));
        lblUtime.setText("00:00");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Menu", "Count", "Price"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout subPanelLayout = new javax.swing.GroupLayout(subPanel);
        subPanel.setLayout(subPanelLayout);
        subPanelLayout.setHorizontalGroup(
            subPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(subPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subPanelLayout.createSequentialGroup()
                        .addGroup(subPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(subPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnOrder, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addComponent(txtPrice)))
                    .addGroup(subPanelLayout.createSequentialGroup()
                        .addGroup(subPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblName)
                            .addComponent(lblRemainTime)
                            .addComponent(lblUsedTime))
                        .addGap(95, 99, Short.MAX_VALUE)
                        .addGroup(subPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblRtIme)
                            .addComponent(lblUser)
                            .addComponent(lblUtime))
                        .addGap(18, 18, 18)
                        .addGroup(subPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAddTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        subPanelLayout.setVerticalGroup(
            subPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(subPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(subPanelLayout.createSequentialGroup()
                        .addGroup(subPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblName)
                            .addComponent(lblUser))
                        .addGap(9, 9, 9)
                        .addGroup(subPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRemainTime)
                            .addComponent(lblRtIme))
                        .addGap(9, 9, 9)
                        .addGroup(subPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUsedTime)
                            .addComponent(lblUtime)))
                    .addGroup(subPanelLayout.createSequentialGroup()
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddTime, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(subPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(txtPrice))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(subPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnOrder, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        Menu.setBackground(new java.awt.Color(80, 80, 80));
        Menu.setForeground(new java.awt.Color(255, 255, 255));
        Menu.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N

        Food.setBackground(new java.awt.Color(80, 80, 80));

        javax.swing.GroupLayout FoodLayout = new javax.swing.GroupLayout(Food);
        Food.setLayout(FoodLayout);
        FoodLayout.setHorizontalGroup(
            FoodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 636, Short.MAX_VALUE)
        );
        FoodLayout.setVerticalGroup(
            FoodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 461, Short.MAX_VALUE)
        );

        Menu.addTab("식사", Food);

        Ramen.setBackground(new java.awt.Color(80, 80, 80));

        RamenBtn.setText("Ramen");
        RamenBtn.setToolTipText("");
        RamenBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RamenBtnActionPerformed(evt);
            }
        });

        RamenBtn1.setText("Ramen1");
        RamenBtn1.setToolTipText("");
        RamenBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RamenBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RamenLayout = new javax.swing.GroupLayout(Ramen);
        Ramen.setLayout(RamenLayout);
        RamenLayout.setHorizontalGroup(
            RamenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RamenLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(RamenBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(RamenBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(358, Short.MAX_VALUE))
        );
        RamenLayout.setVerticalGroup(
            RamenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RamenLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(RamenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RamenBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RamenBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(344, Short.MAX_VALUE))
        );

        Menu.addTab("라면", Ramen);

        Snack.setBackground(new java.awt.Color(80, 80, 80));

        javax.swing.GroupLayout SnackLayout = new javax.swing.GroupLayout(Snack);
        Snack.setLayout(SnackLayout);
        SnackLayout.setHorizontalGroup(
            SnackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 636, Short.MAX_VALUE)
        );
        SnackLayout.setVerticalGroup(
            SnackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 461, Short.MAX_VALUE)
        );

        Menu.addTab("간식", Snack);

        Sncak1.setBackground(new java.awt.Color(80, 80, 80));

        javax.swing.GroupLayout Sncak1Layout = new javax.swing.GroupLayout(Sncak1);
        Sncak1.setLayout(Sncak1Layout);
        Sncak1Layout.setHorizontalGroup(
            Sncak1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 636, Short.MAX_VALUE)
        );
        Sncak1Layout.setVerticalGroup(
            Sncak1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 461, Short.MAX_VALUE)
        );

        Menu.addTab("과자", Sncak1);

        Can.setBackground(new java.awt.Color(80, 80, 80));

        javax.swing.GroupLayout CanLayout = new javax.swing.GroupLayout(Can);
        Can.setLayout(CanLayout);
        CanLayout.setHorizontalGroup(
            CanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 636, Short.MAX_VALUE)
        );
        CanLayout.setVerticalGroup(
            CanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 461, Short.MAX_VALUE)
        );

        Menu.addTab("캔음료", Can);

        Topping.setBackground(new java.awt.Color(80, 80, 80));

        javax.swing.GroupLayout ToppingLayout = new javax.swing.GroupLayout(Topping);
        Topping.setLayout(ToppingLayout);
        ToppingLayout.setHorizontalGroup(
            ToppingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 636, Short.MAX_VALUE)
        );
        ToppingLayout.setVerticalGroup(
            ToppingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 461, Short.MAX_VALUE)
        );

        Menu.addTab("토핑", Topping);

        Cafe.setBackground(new java.awt.Color(80, 80, 80));

        javax.swing.GroupLayout CafeLayout = new javax.swing.GroupLayout(Cafe);
        Cafe.setLayout(CafeLayout);
        CafeLayout.setHorizontalGroup(
            CafeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 636, Short.MAX_VALUE)
        );
        CafeLayout.setVerticalGroup(
            CafeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 461, Short.MAX_VALUE)
        );

        Menu.addTab("카페음료", Cafe);

        javax.swing.GroupLayout OrderLayout = new javax.swing.GroupLayout(Order);
        Order.setLayout(OrderLayout);
        OrderLayout.setHorizontalGroup(
            OrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OrderLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(subPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        OrderLayout.setVerticalGroup(
            OrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OrderLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(OrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(subPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Order, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Order, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RamenBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RamenBtnActionPerformed
        boolean status = false;
        int rowCount = jTable1.getRowCount();
        for (int i = 0; i < rowCount; i++) {
            Object value = jTable1.getValueAt(i, 0);
            if (value != null && value.toString().equalsIgnoreCase(cart.getMenu())) {
                status = true;
                break;
            }
        }
        if (!status) {
            // 버튼 최초 클릭시
            
            cart = new Cart(RamenBtn.getText(), 1, 2000);
            AddTable(cart.getMenu(), cart.getCount(), cart.getPrice());
        } else {
            // 수량 추가
            counts = cart.getCount();
            counts += 1;
            cart.setCount(counts);
            CountTable(cart.getMenu(), cart.getCount(), cart.getPrice());
        }

    }//GEN-LAST:event_RamenBtnActionPerformed

    private void RamenBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RamenBtn1ActionPerformed
        boolean status = false;
        int rowCount = jTable1.getRowCount();
        for (int i = 0; i < rowCount; i++) {
            Object value = jTable1.getValueAt(i, 0);
            if (value != null && value.toString().equalsIgnoreCase(RamenBtn1.getText())) {
                status = true;
                break;
            }
        }
        if (!status) {
            // 버튼 최초 클릭시
            cart1 = new Cart(RamenBtn1.getText(), 1, 1000);
            AddTable(cart1.getMenu(), cart1.getCount(), cart1.getPrice());
        } else {
            // 수량 추가
            counts = cart1.getCount();
            counts += 1;
            cart1.setCount(counts);
            CountTable(cart1.getMenu(), cart1.getCount(), cart1.getPrice());
        }
    }//GEN-LAST:event_RamenBtn1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Order().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Cafe;
    private javax.swing.JPanel Can;
    private javax.swing.JPanel Food;
    private javax.swing.JTabbedPane Menu;
    private javax.swing.JPanel Order;
    private javax.swing.JPanel Ramen;
    private javax.swing.JButton RamenBtn;
    private javax.swing.JButton RamenBtn1;
    private javax.swing.JPanel Snack;
    private javax.swing.JPanel Sncak1;
    private javax.swing.JPanel Topping;
    private javax.swing.JButton btnAddTime;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnOrder;
    private javax.swing.JButton btnReset;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblRemainTime;
    private javax.swing.JLabel lblRtIme;
    private javax.swing.JLabel lblUsedTime;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel lblUtime;
    private javax.swing.JPanel subPanel;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
}
