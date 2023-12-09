import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class LivrosTela extends javax.swing.JFrame {

    public LivrosTela() {
        super ("Gerenciamento de livros");
        initComponents();
        preencherGenerosComboBox();
        setLocationRelativeTo(null);
        buscarLivro();
        
    }
   private void preencherGenerosComboBox() {
    try {
        GeneroDAO generoDAO = new GeneroDAO();
        String[] generos = generoDAO.obterGeneros();
        generoComboBox.setModel(new DefaultComboBoxModel<>(generos));
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Erro ao obter os gêneros.");
        e.printStackTrace();
    }
}
  public void preencherLivrosComboBox() {
    try {
        LivroDAO livroDAO = new LivroDAO();
        Livro[] livros = livroDAO.obterLivro();
        
        String[] titulos = new String[livros.length];
        for (int i = 0; i < livros.length; i++) {
            titulos[i] = livros[i].getTitulo();
        }
        
        DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>(titulos);
        livrosComboBox.setModel(comboBoxModel);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Erro ao obter os livros.");
        e.printStackTrace();
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        livroTelaPanel = new javax.swing.JPanel();
        livrosComboBox = new javax.swing.JComboBox<>();
        tituloTextField = new javax.swing.JTextField();
        autorTextField = new javax.swing.JTextField();
        novoLivroButton = new javax.swing.JButton();
        atualizarLivroButton = new javax.swing.JButton();
        removerLivroButton = new javax.swing.JButton();
        mostrarListaButton = new javax.swing.JButton();
        cancelarButton = new javax.swing.JButton();
        generoComboBox = new javax.swing.JComboBox<>();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        livroTelaPanel.setBackground(new java.awt.Color(255, 255, 255));
        livroTelaPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null), "Gerenciamento de livros:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("MV Boli", 0, 14))); // NOI18N

        livrosComboBox.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        livrosComboBox.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), null), "Selecione o livro:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("MV Boli", 0, 14))); // NOI18N
        livrosComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                livrosComboBoxActionPerformed(evt);
            }
        });

        tituloTextField.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        tituloTextField.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), null), "Título:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("MV Boli", 0, 14))); // NOI18N
        tituloTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tituloTextFieldActionPerformed(evt);
            }
        });

        autorTextField.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        autorTextField.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), null), "Autor(a):", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("MV Boli", 0, 14))); // NOI18N
        autorTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autorTextFieldActionPerformed(evt);
            }
        });

        novoLivroButton.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        novoLivroButton.setText("Novo");
        novoLivroButton.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), null));
        novoLivroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoLivroButtonActionPerformed(evt);
            }
        });

        atualizarLivroButton.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        atualizarLivroButton.setText("Atualizar");
        atualizarLivroButton.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), null));
        atualizarLivroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarLivroButtonActionPerformed(evt);
            }
        });

        removerLivroButton.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        removerLivroButton.setText("Remover");
        removerLivroButton.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), null));
        removerLivroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerLivroButtonActionPerformed(evt);
            }
        });

        mostrarListaButton.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        mostrarListaButton.setText("Mostrar lista");
        mostrarListaButton.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), null));
        mostrarListaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarListaButtonActionPerformed(evt);
            }
        });

        cancelarButton.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        cancelarButton.setText("Cancelar");
        cancelarButton.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), null));
        cancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarButtonActionPerformed(evt);
            }
        });

        generoComboBox.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        generoComboBox.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), null), "Gênero:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("MV Boli", 0, 14))); // NOI18N
        generoComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generoComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout livroTelaPanelLayout = new javax.swing.GroupLayout(livroTelaPanel);
        livroTelaPanel.setLayout(livroTelaPanelLayout);
        livroTelaPanelLayout.setHorizontalGroup(
            livroTelaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(livroTelaPanelLayout.createSequentialGroup()
                .addGroup(livroTelaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(livroTelaPanelLayout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(cancelarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(livroTelaPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(livroTelaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(autorTextField)
                            .addComponent(tituloTextField)
                            .addComponent(livrosComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, livroTelaPanelLayout.createSequentialGroup()
                                .addGroup(livroTelaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(novoLivroButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(removerLivroButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                                .addGroup(livroTelaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(atualizarLivroButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(mostrarListaButton, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)))
                            .addComponent(generoComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        livroTelaPanelLayout.setVerticalGroup(
            livroTelaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(livroTelaPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(livrosComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(tituloTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(generoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(autorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(livroTelaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(novoLivroButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(atualizarLivroButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(livroTelaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(removerLivroButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mostrarListaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(cancelarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(livroTelaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(livroTelaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void novoLivroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoLivroButtonActionPerformed
        String titulo = tituloTextField.getText();
        String genero = (String) generoComboBox.getSelectedItem();
        String autor = autorTextField.getText();

    if (titulo == null || titulo.length() == 0 || genero == null || genero.length() == 0) {
        JOptionPane.showMessageDialog(null, "Preencha os campos!");
    } 
    else {
        try {
            int opcao = JOptionPane.showConfirmDialog(null, "Confirmar inserção?");
            if (opcao == JOptionPane.YES_OPTION) {
                Livro livro = new Livro(titulo, genero, autor);
                LivroDAO livroDAO = new LivroDAO();
                livroDAO.inserirLivro(livro);
                tituloTextField.setText("");
                generoComboBox.setSelectedItem("");
                autorTextField.setText("");
                JOptionPane.showMessageDialog(null, "Livro cadastrado com sucesso!");
                buscarLivro();
            }
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problemas técnicos.");
            e.printStackTrace();
        }
    }
    }//GEN-LAST:event_novoLivroButtonActionPerformed

    
    private void livrosComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_livrosComboBoxActionPerformed
         String tituloSelecionado = (String) livrosComboBox.getSelectedItem();
    if (tituloSelecionado != null) {
        try {
            LivroDAO livroDAO = new LivroDAO();
            Livro livro = livroDAO.obterLivroPorTitulo(tituloSelecionado);
            
            if (livro != null) {
                tituloTextField.setText(livro.getTitulo());
                generoComboBox.setSelectedItem(livro.getGenero());
                autorTextField.setText(livro.getAutor());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar informações do livro selecionado.");
            e.printStackTrace();
        }
    } else {
        tituloTextField.setText("");
        generoComboBox.setSelectedItem("");
        autorTextField.setText("");
    }
    }//GEN-LAST:event_livrosComboBoxActionPerformed

    private void tituloTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tituloTextFieldActionPerformed
    }//GEN-LAST:event_tituloTextFieldActionPerformed
    
    private void atualizarLivroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarLivroButtonActionPerformed
         int opcao = JOptionPane.showConfirmDialog(null, "Confirmar atualização?");

    if (opcao == JOptionPane.YES_OPTION) {
        try {
            
            int idLivroSelecionado = obterIdLivroPorTitulo((String) livrosComboBox.getSelectedItem());

            LivroDAO livroDAO = new LivroDAO();
            Livro livro = livroDAO.obterLivroPorId(idLivroSelecionado);

            livro.setGenero((String) generoComboBox.getSelectedItem());
            livro.setAutor(autorTextField.getText());
            livro.setTitulo(tituloTextField.getText());

            livroDAO.atualizarLivro(livro);

            JOptionPane.showMessageDialog(null, "Livro atualizado!");
            buscarLivro();
            tituloTextField.setText("");
            generoComboBox.setSelectedItem("");
            autorTextField.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problemas técnicos.");
            e.printStackTrace();
        }
    }
    }//GEN-LAST:event_atualizarLivroButtonActionPerformed

    private void removerLivroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerLivroButtonActionPerformed
    int opcao = JOptionPane.showConfirmDialog(null,"Remover livro?");
        if (opcao == JOptionPane.YES_OPTION){
            try{
                String titulo = tituloTextField.getText();
                Livro livro = new Livro(titulo, null, null);
                LivroDAO cd = new LivroDAO();
                cd.removerLivro(livro);
                JOptionPane.showMessageDialog(null, "Livro removido com sucesso");
                buscarLivro();
                tituloTextField.setText("");
                generoComboBox.setSelectedItem("");
                autorTextField.setText("");
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(null, "Erro inesperado!");
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_removerLivroButtonActionPerformed

    private void mostrarListaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarListaButtonActionPerformed
        ListaLivroTela ct = new ListaLivroTela();
        ct.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mostrarListaButtonActionPerformed

    private void cancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarButtonActionPerformed
        DashboardTela dt = new DashboardTela();
        dt.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelarButtonActionPerformed

    private void generoComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generoComboBoxActionPerformed
    }//GEN-LAST:event_generoComboBoxActionPerformed

    private void autorTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_autorTextFieldActionPerformed
    }//GEN-LAST:event_autorTextFieldActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LivrosTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atualizarLivroButton;
    private javax.swing.JTextField autorTextField;
    private javax.swing.JButton cancelarButton;
    private javax.swing.JComboBox<String> generoComboBox;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel livroTelaPanel;
    private javax.swing.JComboBox<String> livrosComboBox;
    private javax.swing.JButton mostrarListaButton;
    private javax.swing.JButton novoLivroButton;
    private javax.swing.JButton removerLivroButton;
    private javax.swing.JTextField tituloTextField;
    // End of variables declaration//GEN-END:variables

   private void buscarLivro() {
    try {
        LivroDAO cd = new LivroDAO();
        Livro[] titulosLivros = cd.obterLivro();
        
        String[] titulos = new String[titulosLivros.length];
        for (int i = 0; i < titulosLivros.length; i++) {
            titulos[i] = titulosLivros[i].getTitulo();
        }
        
        livrosComboBox.setModel(new DefaultComboBoxModel<>(titulos));
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Não foi possível obter a lista de livros.");
        e.printStackTrace();
    }
}
   private int obterIdLivroPorTitulo(String titulo) {
     int idLivro = 0; 

    try {
        LivroDAO livroDAO = new LivroDAO();
        Livro livro = livroDAO.obterLivroPorTitulo(titulo);

        if (livro != null) {
            idLivro = livro.getId_livro();
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Erro ao obter ID do livro.");
        e.printStackTrace();
    }

    return idLivro;
}
}
