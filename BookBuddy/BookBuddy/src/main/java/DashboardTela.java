
import javax.swing.JOptionPane;

public class DashboardTela extends javax.swing.JFrame {
    private Usuario usuarioAtual;
    
    public void setUsuarioAtual(Usuario usuario) {
        this.usuarioAtual = usuario;
    }

    public DashboardTela() {
        super("Opções");
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    private boolean isAdmin = false;
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dashboardPanel = new javax.swing.JPanel();
        cadastrarAlterarLivroButton = new javax.swing.JButton();
        avaliarLivroButton = new javax.swing.JButton();
        verListaLivroButton = new javax.swing.JButton();
        fecharButton = new javax.swing.JButton();
        cadastrarUsuarioButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        dashboardPanel.setBackground(new java.awt.Color(255, 255, 255));
        dashboardPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null), "Olá! O que você gostaria de fazer?", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("MV Boli", 0, 14))); // NOI18N

        cadastrarAlterarLivroButton.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        cadastrarAlterarLivroButton.setText("Cadastrar ou alterar livro");
        cadastrarAlterarLivroButton.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(204, 204, 204)));
        cadastrarAlterarLivroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarAlterarLivroButtonActionPerformed(evt);
            }
        });

        avaliarLivroButton.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        avaliarLivroButton.setText("Avaliar livro");
        avaliarLivroButton.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(204, 204, 204)));
        avaliarLivroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avaliarLivroButtonActionPerformed(evt);
            }
        });

        verListaLivroButton.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        verListaLivroButton.setText("Ver lista de livros");
        verListaLivroButton.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(204, 204, 204)));
        verListaLivroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verListaLivroButtonActionPerformed(evt);
            }
        });

        fecharButton.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        fecharButton.setText("Fechar");
        fecharButton.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(204, 204, 204)));
        fecharButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecharButtonActionPerformed(evt);
            }
        });

        cadastrarUsuarioButton.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        cadastrarUsuarioButton.setText("Cadastrar novo usuário");
        cadastrarUsuarioButton.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(204, 204, 204)));
        cadastrarUsuarioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarUsuarioButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dashboardPanelLayout = new javax.swing.GroupLayout(dashboardPanel);
        dashboardPanel.setLayout(dashboardPanelLayout);
        dashboardPanelLayout.setHorizontalGroup(
            dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fecharButton, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadastrarAlterarLivroButton, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadastrarUsuarioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(avaliarLivroButton, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(verListaLivroButton, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        dashboardPanelLayout.setVerticalGroup(
            dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(cadastrarUsuarioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(cadastrarAlterarLivroButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(avaliarLivroButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(verListaLivroButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(fecharButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(dashboardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(dashboardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        dashboardPanel.getAccessibleContext().setAccessibleName("Olá! O que você gostaria de fazer? ");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void avaliarLivroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avaliarLivroButtonActionPerformed
        AvaliarLivro ct = new AvaliarLivro();
        ct.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_avaliarLivroButtonActionPerformed

    private void cadastrarUsuarioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarUsuarioButtonActionPerformed
        if ("buddy".equals(usuarioAtual.getNome()) && "book".equals(usuarioAtual.getSenha())) {
            CadastrarUsuarioTela cut = new CadastrarUsuarioTela();
            cut.setVisible(true); 
            this.dispose(); 
        } 
        else {
            JOptionPane.showMessageDialog(this, "Acesso negado.", "Acesso Negado", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cadastrarUsuarioButtonActionPerformed

    private void cadastrarAlterarLivroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarAlterarLivroButtonActionPerformed
        LivrosTela ct = new LivrosTela();
        ct.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cadastrarAlterarLivroButtonActionPerformed

    private void verListaLivroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verListaLivroButtonActionPerformed
        ListaLivroTela ct = new ListaLivroTela();
        ct.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_verListaLivroButtonActionPerformed

    private void fecharButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecharButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_fecharButtonActionPerformed

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton avaliarLivroButton;
    private javax.swing.JButton cadastrarAlterarLivroButton;
    private javax.swing.JButton cadastrarUsuarioButton;
    private javax.swing.JPanel dashboardPanel;
    private javax.swing.JButton fecharButton;
    private javax.swing.JButton verListaLivroButton;
    // End of variables declaration//GEN-END:variables
}
