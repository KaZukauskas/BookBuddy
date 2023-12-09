import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class AvaliarLivro extends javax.swing.JFrame {

    private Connection connection;
    
    private static String usuario = "avnadmin";
    private static String senha = "AVNS_8Vfe-DPq9B_VjGTaU8-";
    private static String host = "mysql-c34d481-projetoa3.aivencloud.com";
    private static String porta = "25503";
    private static String bd = "db_bookbuddy";
    
    public AvaliarLivro() {
        initComponents();
        avaliarButton.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        avaliarButtonActionPerformed(evt);
    }
});

        setLocationRelativeTo(null);
        connection = obtemConexao();
        preencherLivrosComboBox();
    }
    
    public static Connection obtemConexao (){
        try {
            Connection c = DriverManager.getConnection(
                "jdbc:mysql://" + host + ":" + porta + "/" + bd + "?user=" + usuario + 
                "&password=" + senha + 
                "&useTimezone=true&serverTimezone=America/Sao_Paulo");
            return c;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
     private void preencherLivrosComboBox() {
        try {
            String query = "SELECT titulo FROM tb_livro";
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();

            DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();
            while (resultSet.next()) {
                comboBoxModel.addElement(resultSet.getString("titulo"));
            }
            jComboBox1.setModel(comboBoxModel);

            resultSet.close();
            statement.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao obter os livros.");
            e.printStackTrace();
        }
    }

    private void avaliarButtonActionPerformed(java.awt.event.ActionEvent evt) {
        try {
    String livroSelecionado = (String) jComboBox1.getSelectedItem();
    double nota = Double.parseDouble(notaLivroTextField.getText());

    if (nota < 0 || nota > 10) {
        JOptionPane.showMessageDialog(null, "Por favor, insira uma nota entre 0 e 10.");
        return; 
    }

    String querySelect = "SELECT nota, num_avaliacoes, soma_notas FROM tb_livro WHERE titulo = ?";
    try (PreparedStatement selectStatement = connection.prepareStatement(querySelect)) {
        selectStatement.setString(1, livroSelecionado);
        ResultSet resultSet = selectStatement.executeQuery();

        if (resultSet.next()) {
            double notaAtual = resultSet.getDouble("nota");
            int numAvaliacoesAtual = resultSet.getInt("num_avaliacoes");
            double somaNotasAtual = resultSet.getDouble("soma_notas");

            double novaNota = (somaNotasAtual + nota) / (numAvaliacoesAtual + 1);

            String queryUpdate = "UPDATE tb_livro SET nota = ?, num_avaliacoes = ?, soma_notas = ? WHERE titulo = ?";
            try (PreparedStatement updateStatement = connection.prepareStatement(queryUpdate)) {
                updateStatement.setDouble(1, novaNota);
                updateStatement.setInt(2, numAvaliacoesAtual + 1);
                updateStatement.setDouble(3, somaNotasAtual + nota);
                updateStatement.setString(4, livroSelecionado);
                updateStatement.executeUpdate();

                JOptionPane.showMessageDialog(null, "Nota atribuída com sucesso!");
            }
        }

        resultSet.close();
    } catch (SQLException sqlException) {
        sqlException.printStackTrace();
    }
} catch (NumberFormatException numberFormatException) {
    JOptionPane.showMessageDialog(null, "Por favor, insira uma nota válida.");
} catch (Exception e) {
    JOptionPane.showMessageDialog(null, "Erro ao atribuir a nota.");
    e.printStackTrace();
}
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        avaliarLivroPanel = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        notaLivroTextField = new javax.swing.JTextField();
        voltarLivrosTelaButton = new javax.swing.JButton();
        avaliarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        avaliarLivroPanel.setBackground(new java.awt.Color(255, 255, 255));
        avaliarLivroPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), null));

        jComboBox1.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        jComboBox1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), null), "Escolha o livro:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("MV Boli", 0, 14))); // NOI18N
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        notaLivroTextField.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        notaLivroTextField.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), null), "Nota:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("MV Boli", 0, 14))); // NOI18N
        notaLivroTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notaLivroTextFieldActionPerformed(evt);
            }
        });

        voltarLivrosTelaButton.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        voltarLivrosTelaButton.setText("Voltar");
        voltarLivrosTelaButton.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), null));
        voltarLivrosTelaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarLivrosTelaButtonActionPerformed(evt);
            }
        });

        avaliarButton.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        avaliarButton.setText("Avaliar");
        avaliarButton.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), null));

        javax.swing.GroupLayout avaliarLivroPanelLayout = new javax.swing.GroupLayout(avaliarLivroPanel);
        avaliarLivroPanel.setLayout(avaliarLivroPanelLayout);
        avaliarLivroPanelLayout.setHorizontalGroup(
            avaliarLivroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(avaliarLivroPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(avaliarLivroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(avaliarLivroPanelLayout.createSequentialGroup()
                        .addComponent(avaliarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                        .addComponent(voltarLivrosTelaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, 340, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, avaliarLivroPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(notaLivroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139))
        );
        avaliarLivroPanelLayout.setVerticalGroup(
            avaliarLivroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(avaliarLivroPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(notaLivroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(avaliarLivroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(voltarLivrosTelaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(avaliarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(avaliarLivroPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(avaliarLivroPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void voltarLivrosTelaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarLivrosTelaButtonActionPerformed
        DashboardTela dt = new DashboardTela();
        dt.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltarLivrosTelaButtonActionPerformed

    private void notaLivroTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notaLivroTextFieldActionPerformed
    }//GEN-LAST:event_notaLivroTextFieldActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton avaliarButton;
    private javax.swing.JPanel avaliarLivroPanel;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JTextField notaLivroTextField;
    private javax.swing.JButton voltarLivrosTelaButton;
    // End of variables declaration//GEN-END:variables
}