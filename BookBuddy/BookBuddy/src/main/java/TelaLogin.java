
import javax.swing.JOptionPane;

public class TelaLogin extends javax.swing.JFrame {
    public TelaLogin() {
        super("Book Buddy");
        initComponents();
        this.setLocationRelativeTo(null);
        
    }

    @SuppressWarnings("unchecked")
    private boolean isAdmin = false;
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        senhaPasswordField = new javax.swing.JPasswordField();
        usuarioTextField = new javax.swing.JTextField();
        loginButton = new javax.swing.JButton();
        sairButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(460, 320));
        jPanel1.setMinimumSize(new java.awt.Dimension(460, 320));
        jPanel1.setLayout(null);

        senhaPasswordField.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        senhaPasswordField.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), null), "Senha:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("MV Boli", 0, 14))); // NOI18N
        jPanel1.add(senhaPasswordField);
        senhaPasswordField.setBounds(60, 190, 340, 55);

        usuarioTextField.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        usuarioTextField.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), null), "Usuário:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("MV Boli", 0, 14))); // NOI18N
        jPanel1.add(usuarioTextField);
        usuarioTextField.setBounds(60, 130, 340, 55);

        loginButton.setText("Login");
        loginButton.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), null));
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        jPanel1.add(loginButton);
        loginButton.setBounds(70, 260, 120, 45);

        sairButton.setText("Sair");
        sairButton.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), null));
        sairButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairButtonActionPerformed(evt);
            }
        });
        jPanel1.add(sairButton);
        sairButton.setBounds(270, 260, 120, 45);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Logo.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(80, 10, 296, 118);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        String login = usuarioTextField.getText();
        String senha = new String (senhaPasswordField.getPassword());
        
        try {
            Usuario usuario = new Usuario (login, senha);
            UsuarioDAO dao = new UsuarioDAO ();
            
            if (dao.existeUsuario(usuario)) {
                if (login.equals("buddy") && senha.equals("book")) {
                    isAdmin = true;  
            }

            JOptionPane.showMessageDialog(null, "Bem-vindo, " + usuario.getNome() + "!!");
            DashboardTela dt = new DashboardTela();
            dt.setUsuarioAtual(usuario);
            dt.setVisible(true);
            this.dispose();
            } 
            else {
                JOptionPane.showMessageDialog(null, "Usuário não cadastrado.");
                usuarioTextField.setText("");
                senhaPasswordField.setText("");
            }   
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problemas na conexão.");
            e.printStackTrace();
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void sairButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_sairButtonActionPerformed

    public static void main(String args[]) {
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginButton;
    private javax.swing.JButton sairButton;
    private javax.swing.JPasswordField senhaPasswordField;
    private javax.swing.JTextField usuarioTextField;
    // End of variables declaration//GEN-END:variables
}
