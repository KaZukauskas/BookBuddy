import java.awt.Color;
import java.util.Arrays;
import java.util.Comparator;
import javax.swing.JOptionPane;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;
import javax.swing.table.DefaultTableModel;

public class ListaLivroTela extends javax.swing.JFrame {
    private LivroDAO livroDAO; 
    private DefaultTableModel tableModel;
    
    public ListaLivroTela() {
        super("Lista de livros");
        initComponents();
        setLocationRelativeTo(null);
        livroDAO = new LivroDAO(); 
        tableModel = (DefaultTableModel) listaLivroTelaTable.getModel();
        exibirLivrosNaTabela(); 
        carregarTitulosLivrosNoComboBox(); 
        
        tituloComboBox.addPopupMenuListener(new PopupMenuListener() {
            @Override
            public void popupMenuWillBecomeVisible(PopupMenuEvent e) {
            }

            @Override
            public void popupMenuWillBecomeInvisible(PopupMenuEvent e) {
                destacarLinhaSelecionada();
            }

            @Override
            public void popupMenuCanceled(PopupMenuEvent e) {
            }
        });
    }
        private void destacarLinhaSelecionada() {
        String livroSelecionado = (String) tituloComboBox.getSelectedItem();
        int rowCount = tableModel.getRowCount();

        for (int i = 0; i < rowCount; i++) {
            String tituloNaTabela = (String) tableModel.getValueAt(i, 0);

            if (livroSelecionado.equals(tituloNaTabela)) {
                listaLivroTelaTable.setRowSelectionInterval(i, i);
                listaLivroTelaTable.setSelectionBackground(new Color(173, 216, 230)); 
                listaLivroTelaTable.setSelectionForeground(Color.BLACK); 
                return;
            }
        }

        listaLivroTelaTable.clearSelection();
    }
   
     private void carregarTitulosLivrosNoComboBox() {
    try {
        Livro[] livros = livroDAO.obterLivro();
        for (Livro livro : livros) {
            tituloComboBox.addItem(livro.getTitulo());
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Erro ao carregar os títulos dos livros.", "Erro", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }
}

    public class LivroComparator implements Comparator<Livro> {
    @Override
    public int compare(Livro livro1, Livro livro2) {
        int comparacaoNota = Double.compare(livro2.getNota(), livro1.getNota());
        if (comparacaoNota != 0) {
            return comparacaoNota;
        }

        int comparacaoNumAvaliacoes = Integer.compare(livro2.getNumAvaliacoes(), livro1.getNumAvaliacoes());
        if (comparacaoNumAvaliacoes != 0) {
            return comparacaoNumAvaliacoes;
        }

        return livro1.getTitulo().compareToIgnoreCase(livro2.getTitulo());
    }
}

private void exibirLivrosNaTabela() {
    try {
        Livro[] livros = livroDAO.obterLivro();
        
        Arrays.sort(livros, new LivroComparator());

        LimparTabela();

        for (Livro livro : livros) {
            double mediaNotas = livro.getNota();
            if (livro.getNumAvaliacoes() > 0) {
                mediaNotas = livro.getSomaNotas() / livro.getNumAvaliacoes();
            }

            Object[] row = {
                livro.getTitulo(),
                livro.getGenero(),
                livro.getAutor(),
                mediaNotas
            };
            tableModel.addRow(row);
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Erro ao obter os livros.", "Erro", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }
}

    private void LimparTabela() {
        if (tableModel.getRowCount() > 0) {
            for (int i = tableModel.getRowCount() - 1; i >= 0; i--) {
                tableModel.removeRow(i);
            }
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        listaLivroPanel = new javax.swing.JPanel();
        tituloComboBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaLivroTelaTable = new javax.swing.JTable();
        voltarListaLivroTelaButton = new javax.swing.JButton();
        sairListaLivroTelaButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        listaLivroPanel.setBackground(new java.awt.Color(255, 255, 255));

        tituloComboBox.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        tituloComboBox.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), null), "Título livro:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("MV Boli", 0, 14))); // NOI18N

        listaLivroTelaTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Livro", "Gênero", "Autor(a)", "Nota"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(listaLivroTelaTable);

        voltarListaLivroTelaButton.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        voltarListaLivroTelaButton.setText("Voltar");
        voltarListaLivroTelaButton.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), null));
        voltarListaLivroTelaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarListaLivroTelaButtonActionPerformed(evt);
            }
        });

        sairListaLivroTelaButton.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        sairListaLivroTelaButton.setText("Sair");
        sairListaLivroTelaButton.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), null));
        sairListaLivroTelaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairListaLivroTelaButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout listaLivroPanelLayout = new javax.swing.GroupLayout(listaLivroPanel);
        listaLivroPanel.setLayout(listaLivroPanelLayout);
        listaLivroPanelLayout.setHorizontalGroup(
            listaLivroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listaLivroPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(listaLivroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(listaLivroPanelLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(voltarListaLivroTelaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sairListaLivroTelaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );
        listaLivroPanelLayout.setVerticalGroup(
            listaLivroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listaLivroPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(tituloComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(listaLivroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(voltarListaLivroTelaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sairListaLivroTelaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(listaLivroPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(listaLivroPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sairListaLivroTelaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairListaLivroTelaButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_sairListaLivroTelaButtonActionPerformed

    private void voltarListaLivroTelaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarListaLivroTelaButtonActionPerformed
        DashboardTela dt = new DashboardTela();
        dt.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltarListaLivroTelaButtonActionPerformed

    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel listaLivroPanel;
    private javax.swing.JTable listaLivroTelaTable;
    private javax.swing.JButton sairListaLivroTelaButton;
    private javax.swing.JComboBox<String> tituloComboBox;
    private javax.swing.JButton voltarListaLivroTelaButton;
    // End of variables declaration//GEN-END:variables
}
