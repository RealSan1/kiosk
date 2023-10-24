package sw;
import java.awt.event.ActionEvent;
import java.sql.*;
import javax.swing.JOptionPane;
import static sw.Main.orcle_ID;
import static sw.Main.orcle_PW;
import static sw.Main.orcle_url;

public class Sing_Up extends javax.swing.JFrame {
    
    boolean status = false; //중복검사 확인 (중복 검사버튼을 누르지 않으면 회원가입 불가)
    
    public Sing_Up() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Sing = new javax.swing.JPanel();
        Sing_Up_Label = new javax.swing.JLabel();
        Input_ID_text = new javax.swing.JTextField();
        Sing_button = new javax.swing.JButton();
        Cancel_button = new javax.swing.JButton();
        Input_Name_text = new javax.swing.JTextField();
        Input_PW_text = new javax.swing.JTextField();
        Input_RPW_text = new javax.swing.JTextField();
        Duplicate_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Sing.setBackground(new java.awt.Color(35, 35, 35));
        Sing.setMinimumSize(new java.awt.Dimension(356, 402));
        Sing.setPreferredSize(new java.awt.Dimension(356, 402));

        Sing_Up_Label.setFont(new java.awt.Font("맑은 고딕", 1, 24)); // NOI18N
        Sing_Up_Label.setForeground(new java.awt.Color(255, 255, 255));
        Sing_Up_Label.setText("회원가입");

        Input_ID_text.setBackground(new java.awt.Color(25, 25, 25));
        Input_ID_text.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        Input_ID_text.setForeground(new java.awt.Color(255, 255, 255));
        Input_ID_text.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        Input_ID_text.setText("ID");
        Input_ID_text.setActionCommand("<Not Set>");
        Input_ID_text.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Input_ID_text.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        Sing_button.setBackground(new java.awt.Color(211, 211, 211));
        Sing_button.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        Sing_button.setText("계정 생성");
        Sing_button.setEnabled(false);
        Sing_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sing_buttonActionPerformed(evt);
            }
        });

        Cancel_button.setBackground(new java.awt.Color(211, 211, 211));
        Cancel_button.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        Cancel_button.setText("취소");
        Cancel_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cancel_buttonActionPerformed(evt);
            }
        });

        Input_Name_text.setBackground(new java.awt.Color(25, 25, 25));
        Input_Name_text.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        Input_Name_text.setForeground(new java.awt.Color(255, 255, 255));
        Input_Name_text.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        Input_Name_text.setText("이름");
        Input_Name_text.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        Input_PW_text.setBackground(new java.awt.Color(25, 25, 25));
        Input_PW_text.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        Input_PW_text.setForeground(new java.awt.Color(255, 255, 255));
        Input_PW_text.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        Input_PW_text.setText("비밀번호");
        Input_PW_text.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        Input_RPW_text.setBackground(new java.awt.Color(25, 25, 25));
        Input_RPW_text.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        Input_RPW_text.setForeground(new java.awt.Color(255, 255, 255));
        Input_RPW_text.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        Input_RPW_text.setText("비밀번호 확인");
        Input_RPW_text.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        Duplicate_button.setBackground(new java.awt.Color(211, 211, 211));
        Duplicate_button.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        Duplicate_button.setText("중복 확인");
        Duplicate_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Duplicate_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SingLayout = new javax.swing.GroupLayout(Sing);
        Sing.setLayout(SingLayout);
        SingLayout.setHorizontalGroup(
            SingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SingLayout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addGroup(SingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SingLayout.createSequentialGroup()
                        .addGroup(SingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Input_RPW_text, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Input_Name_text, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Input_PW_text, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(SingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, SingLayout.createSequentialGroup()
                                    .addComponent(Cancel_button)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Sing_button, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(SingLayout.createSequentialGroup()
                                    .addComponent(Input_ID_text, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(Duplicate_button))))
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SingLayout.createSequentialGroup()
                        .addComponent(Sing_Up_Label)
                        .addGap(123, 123, 123))))
        );
        SingLayout.setVerticalGroup(
            SingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SingLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(Sing_Up_Label)
                .addGap(27, 27, 27)
                .addGroup(SingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Input_ID_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Duplicate_button))
                .addGap(18, 18, 18)
                .addComponent(Input_Name_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Input_PW_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Input_RPW_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(SingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cancel_button)
                    .addComponent(Sing_button))
                .addContainerGap(89, Short.MAX_VALUE))
        );

        getContentPane().add(Sing, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Sing_buttonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_Sing_buttonActionPerformed
        try {
            String sql = "insert into USERS(USER_ID, USER_PW, USER_NAME)" + "values (?,?,?)"; // DML 명령어
            Connection con = DriverManager.getConnection(Main.orcle_url, Main.orcle_ID, Main.orcle_PW); // DB 연결
            PreparedStatement pstmt = con.prepareStatement(sql);
            // DB 접근과정
            if(status == false){
                JOptionPane.showMessageDialog(null, "중복확인 해주세요");
                
            }
            else{
                
                pstmt.setString(1, Input_ID_text.getText());
                pstmt.setString(2, Input_PW_text.getText());
                pstmt.setString(3, Input_Name_text.getText());
                pstmt.executeUpdate(); //입력값 DB 업데이트
                JOptionPane.showMessageDialog(null, "회원가입 완료");
                dispose();
            }
        } catch (SQLException ex) {
            System.err.println("Sing_Up Error");
        }
    }//GEN-LAST:event_Sing_buttonActionPerformed

    private void Cancel_buttonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_Cancel_buttonActionPerformed
        //창 닫기
        dispose();
    }//GEN-LAST:event_Cancel_buttonActionPerformed

    private void Duplicate_buttonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_Duplicate_buttonActionPerformed
        try{
        String sql = "select USER_ID from users"; //sql명령문
            Connection con = DriverManager.getConnection(orcle_url, orcle_ID, orcle_PW); // DB 연결
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            // DB 접근과정
            
            while(rs.next()){ 
                String User_ID = rs.getString("User_ID");
                if(User_ID.equals(Input_ID_text.getText())){
                    JOptionPane.showMessageDialog(null, "중복된 아이디 입니다.");
                } else{
                    status = true;
                    Sing_button.setEnabled(status); //중복이 아니면 가입버튼 활성화
                }
            }
            
        } catch (SQLException ex) {
            System.err.println("Duplicate Error");
        }
            
    }//GEN-LAST:event_Duplicate_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(Sing_Up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sing_Up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sing_Up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sing_Up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sing_Up().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel_button;
    private javax.swing.JButton Duplicate_button;
    private javax.swing.JTextField Input_ID_text;
    private javax.swing.JTextField Input_Name_text;
    private javax.swing.JTextField Input_PW_text;
    private javax.swing.JTextField Input_RPW_text;
    private javax.swing.JPanel Sing;
    private javax.swing.JLabel Sing_Up_Label;
    private javax.swing.JButton Sing_button;
    // End of variables declaration//GEN-END:variables
}