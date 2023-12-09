
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class CadastrarUsuarioTela extends javax.swing.JFrame {

    public CadastrarUsuarioTela() {
        super ("Castrar usúario");
        initComponents();
        preencherGenerosComboBox();
        setLocationRelativeTo(null);
    }
    private void preencherGenerosComboBox() {
    try {
        GeneroDAO generoDAO = new GeneroDAO();
        String[] generos = generoDAO.obterGeneros();
        generoFav01ComboBox.setModel(new DefaultComboBoxModel<>(generos));
        generoFav02ComboBox.setModel(new DefaultComboBoxModel<>(generos));
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Erro ao obter os gêneros.");
        e.printStackTrace();
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        cadastrarUsuarioPanel = new javax.swing.JPanel();
        nomeNovoUsuarioTextField = new javax.swing.JTextField();
        emailNovoUsuarioTextField = new javax.swing.JTextField();
        idadeNovoUsuarioTextField = new javax.swing.JTextField();
        sexoNovoUsuarioTextField = new javax.swing.JTextField();
        cadastrarNovoUsuarioButton = new javax.swing.JButton();
        cancelarNovoUsuarioButton = new javax.swing.JButton();
        senhaNovoUsuarioPasswordField = new javax.swing.JPasswordField();
        generoFav01ComboBox = new javax.swing.JComboBox<>();
        generoFav02ComboBox = new javax.swing.JComboBox<>();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cadastrarUsuarioPanel.setBackground(new java.awt.Color(255, 255, 255));
        cadastrarUsuarioPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastrar novo usuário:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("MV Boli", 0, 14))); // NOI18N

        nomeNovoUsuarioTextField.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        nomeNovoUsuarioTextField.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), null), "Nome:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("MV Boli", 0, 14))); // NOI18N

        emailNovoUsuarioTextField.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        emailNovoUsuarioTextField.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), null), "Email:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("MV Boli", 0, 14))); // NOI18N

        idadeNovoUsuarioTextField.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        idadeNovoUsuarioTextField.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), null), "Idade:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("MV Boli", 0, 14))); // NOI18N

        sexoNovoUsuarioTextField.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        sexoNovoUsuarioTextField.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), null), "Sexo:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("MV Boli", 0, 14))); // NOI18N

        cadastrarNovoUsuarioButton.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        cadastrarNovoUsuarioButton.setText("Cadastrar");
        cadastrarNovoUsuarioButton.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), null));
        cadastrarNovoUsuarioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarNovoUsuarioButtonActionPerformed(evt);
            }
        });

        cancelarNovoUsuarioButton.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        cancelarNovoUsuarioButton.setText("Cancelar");
        cancelarNovoUsuarioButton.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), null));
        cancelarNovoUsuarioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarNovoUsuarioButtonActionPerformed(evt);
            }
        });

        senhaNovoUsuarioPasswordField.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        senhaNovoUsuarioPasswordField.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), null), "Senha:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("MV Boli", 0, 14))); // NOI18N

        generoFav01ComboBox.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), null), "Gênero Favorito 01:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("MV Boli", 0, 14))); // NOI18N

        generoFav02ComboBox.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), null), "Gênero Favorito 02:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("MV Boli", 0, 14))); // NOI18N

        javax.swing.GroupLayout cadastrarUsuarioPanelLayout = new javax.swing.GroupLayout(cadastrarUsuarioPanel);
        cadastrarUsuarioPanel.setLayout(cadastrarUsuarioPanelLayout);
        cadastrarUsuarioPanelLayout.setHorizontalGroup(
            cadastrarUsuarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadastrarUsuarioPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(cadastrarUsuarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(cadastrarUsuarioPanelLayout.createSequentialGroup()
                        .addComponent(cadastrarNovoUsuarioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                        .addComponent(cancelarNovoUsuarioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(nomeNovoUsuarioTextField)
                    .addComponent(emailNovoUsuarioTextField)
                    .addGroup(cadastrarUsuarioPanelLayout.createSequentialGroup()
                        .addComponent(idadeNovoUsuarioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                        .addComponent(sexoNovoUsuarioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(senhaNovoUsuarioPasswordField)
                    .addComponent(generoFav01ComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(generoFav02ComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        cadastrarUsuarioPanelLayout.setVerticalGroup(
            cadastrarUsuarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadastrarUsuarioPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(nomeNovoUsuarioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(emailNovoUsuarioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(cadastrarUsuarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idadeNovoUsuarioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sexoNovoUsuarioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(senhaNovoUsuarioPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(generoFav01ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(generoFav02ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(cadastrarUsuarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastrarNovoUsuarioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelarNovoUsuarioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(cadastrarUsuarioPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(cadastrarUsuarioPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarNovoUsuarioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarNovoUsuarioButtonActionPerformed
        String nome = nomeNovoUsuarioTextField.getText();
        String email = emailNovoUsuarioTextField.getText();
        String idade = idadeNovoUsuarioTextField.getText();
        String sexo = sexoNovoUsuarioTextField.getText();
        char[] senhaChars = senhaNovoUsuarioPasswordField.getPassword();
        String senha = new String(senhaChars);
        String genero_fav01 = (String) generoFav01ComboBox.getSelectedItem();
        String genero_fav02 = (String) generoFav02ComboBox.getSelectedItem();


        if (nome.isEmpty() || email.isEmpty() || idade.isEmpty() || sexo.isEmpty() || senha.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
    }
        if (genero_fav01 == null || genero_fav02 == null) {
        JOptionPane.showMessageDialog(this, "Selecione os gêneros favoritos.", "Erro", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try (Connection conexao = ConexaoBD.obtemConexao()) {
        String sql = "INSERT INTO tb_usuario (nome, email, idade, sexo, senha, genero_fav01, genero_fav02) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement preparedStatement = conexao.prepareStatement(sql)) {
            preparedStatement.setString(1, nome);
            preparedStatement.setString(2, email);
            preparedStatement.setString(3, idade);
            preparedStatement.setString(4, sexo);
            preparedStatement.setString(5, senha);
            preparedStatement.setString(6, (String) generoFav01ComboBox.getSelectedItem());
            preparedStatement.setString(7, (String) generoFav02ComboBox.getSelectedItem());

            preparedStatement.executeUpdate();
        }

        JOptionPane.showMessageDialog(this, "Usuário cadastrado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            nomeNovoUsuarioTextField.setText("");
            emailNovoUsuarioTextField.setText("");
            idadeNovoUsuarioTextField.setText("");
            sexoNovoUsuarioTextField.setText("");
            senhaNovoUsuarioPasswordField.setText("");
            
            DashboardTela dt = new DashboardTela();
            dt.setVisible(true);
            this.dispose();

            } 
            catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao cadastrar usuário: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cadastrarNovoUsuarioButtonActionPerformed

    private void cancelarNovoUsuarioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarNovoUsuarioButtonActionPerformed
        DashboardTela dt = new DashboardTela();
        dt.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelarNovoUsuarioButtonActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarUsuarioTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrarNovoUsuarioButton;
    private javax.swing.JPanel cadastrarUsuarioPanel;
    private javax.swing.JButton cancelarNovoUsuarioButton;
    private javax.swing.JTextField emailNovoUsuarioTextField;
    private javax.swing.JComboBox<String> generoFav01ComboBox;
    private javax.swing.JComboBox<String> generoFav02ComboBox;
    private javax.swing.JTextField idadeNovoUsuarioTextField;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField nomeNovoUsuarioTextField;
    private javax.swing.JPasswordField senhaNovoUsuarioPasswordField;
    private javax.swing.JTextField sexoNovoUsuarioTextField;
    // End of variables declaration//GEN-END:variables
}
