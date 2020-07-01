package siscalci;

/**
 *
 * @authors Pedro H. Omena Vieira R.A.: 0040481421021 Roger de O. Trevizan R.A.:
 * 0040481422002 Thaynara Alves R.A.: 0040481422028
 */
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class TelaInicial extends javax.swing.JFrame {

    public static boolean translate;

    public TelaInicial() {
        TelaInicial.translate = false;
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        btnFuncoes = new javax.swing.JButton();
        btnDerivadas = new javax.swing.JButton();
        btnIntegrais = new javax.swing.JButton();
        btnSobre = new javax.swing.JButton();
        btUS = new javax.swing.JButton();
        btBR = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuArquivo = new javax.swing.JMenu();
        menuItemFuncoes = new javax.swing.JMenuItem();
        menuItemDerivadas = new javax.swing.JMenuItem();
        menuItemIntegrais = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        itemMenuSair = new javax.swing.JMenuItem();
        menuSobre = new javax.swing.JMenu();
        itemMenuAjuda = new javax.swing.JMenuItem();
        menuTraducao = new javax.swing.JMenu();
        itemMenuBR = new javax.swing.JMenuItem();
        itemMenuUS = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        itemMenuDesenvolvedores = new javax.swing.JMenuItem();
        itemMenuVersao = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema  de Cálculo Integral Direfencial I");
        setBackground(new java.awt.Color(204, 204, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(null);
        setMinimumSize(null);
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        lbTitulo.setBackground(new java.awt.Color(0, 102, 153));
        lbTitulo.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lbTitulo.setOpaque(true);

        btnFuncoes.setBackground(new java.awt.Color(0, 153, 255));
        btnFuncoes.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        btnFuncoes.setForeground(new java.awt.Color(255, 255, 255));
        btnFuncoes.setText("FUNÇÕES");
        btnFuncoes.setToolTipText("Cálculo de funções do 1º e 2º grau");
        btnFuncoes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFuncoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFuncoesActionPerformed(evt);
            }
        });

        btnDerivadas.setBackground(new java.awt.Color(0, 153, 102));
        btnDerivadas.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        btnDerivadas.setForeground(new java.awt.Color(255, 255, 255));
        btnDerivadas.setText("DERIVADAS");
        btnDerivadas.setToolTipText("Cálculo de Derivadas");
        btnDerivadas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDerivadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDerivadasActionPerformed(evt);
            }
        });

        btnIntegrais.setBackground(new java.awt.Color(153, 0, 0));
        btnIntegrais.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        btnIntegrais.setForeground(new java.awt.Color(255, 255, 255));
        btnIntegrais.setText("INTEGRAIS");
        btnIntegrais.setToolTipText("Cálculo de Integrais");
        btnIntegrais.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIntegrais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIntegraisActionPerformed(evt);
            }
        });

        btnSobre.setBackground(new java.awt.Color(0, 0, 0));
        btnSobre.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        btnSobre.setForeground(new java.awt.Color(255, 255, 255));
        btnSobre.setText("SOBRE");
        btnSobre.setToolTipText("Sobre o Programa e Equipe Desenvolvedora");
        btnSobre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSobreActionPerformed(evt);
            }
        });

        btUS.setBackground(new java.awt.Color(204, 204, 204));
        btUS.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        btUS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/usa-40x40.png"))); // NOI18N
        btUS.setToolTipText("Traduzir o sistema para o inglês americano");
        btUS.setBorder(null);
        btUS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btUS.setOpaque(false);
        btUS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUSActionPerformed(evt);
            }
        });

        btBR.setBackground(new java.awt.Color(204, 204, 204));
        btBR.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        btBR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Brazil Flag-40x40.png"))); // NOI18N
        btBR.setToolTipText("Traduzir o sistema para o português do Brasil");
        btBR.setBorder(null);
        btBR.setBorderPainted(false);
        btBR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btBR.setOpaque(false);
        btBR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSobre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btUS, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btBR))
                            .addComponent(btnFuncoes))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDerivadas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIntegrais)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btBR, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btUS, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFuncoes, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnIntegrais, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDerivadas, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSobre, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenuBar1.setAlignmentY(0.4736843F);

        menuArquivo.setText("ARQUIVO");

        menuItemFuncoes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_MASK));
        menuItemFuncoes.setText("Funções");
        menuItemFuncoes.setToolTipText("Cálculo de Funções do 1º e 2º Grau");
        menuItemFuncoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemFuncoesActionPerformed(evt);
            }
        });
        menuArquivo.add(menuItemFuncoes);

        menuItemDerivadas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_MASK));
        menuItemDerivadas.setText("Derivadas");
        menuItemDerivadas.setToolTipText("Cálculo de Derivadas");
        menuItemDerivadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemDerivadasActionPerformed(evt);
            }
        });
        menuArquivo.add(menuItemDerivadas);

        menuItemIntegrais.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.ALT_MASK));
        menuItemIntegrais.setText("Integrais");
        menuItemIntegrais.setToolTipText("Cálculo de Integrais");
        menuItemIntegrais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemIntegraisActionPerformed(evt);
            }
        });
        menuArquivo.add(menuItemIntegrais);
        menuArquivo.add(jSeparator1);

        itemMenuSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        itemMenuSair.setText("Sair");
        itemMenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuSairActionPerformed(evt);
            }
        });
        menuArquivo.add(itemMenuSair);

        jMenuBar1.add(menuArquivo);

        menuSobre.setText("SOBRE");

        itemMenuAjuda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.ALT_MASK));
        itemMenuAjuda.setText("Ajuda");
        itemMenuAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuAjudaActionPerformed(evt);
            }
        });
        menuSobre.add(itemMenuAjuda);

        menuTraducao.setText("Tradução");

        itemMenuBR.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        itemMenuBR.setText("Português - Brasil");
        itemMenuBR.setToolTipText("Traduzir o sistema para o português do Brasil");
        itemMenuBR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuBRActionPerformed(evt);
            }
        });
        menuTraducao.add(itemMenuBR);

        itemMenuUS.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        itemMenuUS.setText("Inglês - Americano");
        itemMenuUS.setToolTipText("Traduzir o sistema para o inglês americano");
        itemMenuUS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuUSActionPerformed(evt);
            }
        });
        menuTraducao.add(itemMenuUS);

        menuSobre.add(menuTraducao);
        menuSobre.add(jSeparator2);

        itemMenuDesenvolvedores.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_MASK));
        itemMenuDesenvolvedores.setText("Desenvolvedores");
        itemMenuDesenvolvedores.setToolTipText("Equipe Desenvolvedora");
        itemMenuDesenvolvedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuDesenvolvedoresActionPerformed(evt);
            }
        });
        menuSobre.add(itemMenuDesenvolvedores);

        itemMenuVersao.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_MASK));
        itemMenuVersao.setText("Versão");
        itemMenuVersao.setToolTipText("Informações sobre Versão e Direitos de Uso");
        itemMenuVersao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuVersaoActionPerformed(evt);
            }
        });
        menuSobre.add(itemMenuVersao);

        jMenuBar1.add(menuSobre);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnIntegraisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIntegraisActionPerformed
        new Integrais().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnIntegraisActionPerformed

    private void menuItemFuncoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemFuncoesActionPerformed
        new OpcaoFuncao().setVisible(true);
        dispose();
    }//GEN-LAST:event_menuItemFuncoesActionPerformed

    private void itemMenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuSairActionPerformed
        if (translate == true) {
            JOptionPane.showMessageDialog(null, "Thank you for using our system!", "Thank You", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, " Obrigado por utilizar o nosso sistema!");
        }
        System.exit(0);
    }//GEN-LAST:event_itemMenuSairActionPerformed

    private void btnFuncoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFuncoesActionPerformed
        new OpcaoFuncao().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnFuncoesActionPerformed

    private void btnDerivadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDerivadasActionPerformed
        new Derivadas().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnDerivadasActionPerformed

    private void btnSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSobreActionPerformed
        new Sobre().setVisible(true);
//        dispose();
    }//GEN-LAST:event_btnSobreActionPerformed

    private void itemMenuAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuAjudaActionPerformed
        if (translate == true) {
            JOptionPane.showMessageDialog(null, "Feature not available on this version of the program! \nWe are sorry...",
                    "Feature not available", JOptionPane.WARNING_MESSAGE,
                    new ImageIcon("D:/Roger Documentos/Documents/NetBeansProjects/SisCalc1/src/Imagens/we_sorry_icon_70x70.png"));
            pack();
        } else {
            JOptionPane.showMessageDialog(null, "Recurso indisponível nesta versão do programa! \nLamentamos...",
                    "Recurso indisponível", JOptionPane.WARNING_MESSAGE,
                    new ImageIcon("D:/Roger Documentos/Documents/NetBeansProjects/SisCalc1/src/Imagens/we_sorry_icon_70x70.png"));
        }
    }//GEN-LAST:event_itemMenuAjudaActionPerformed

    private void menuItemDerivadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemDerivadasActionPerformed
        new Derivadas().setVisible(true);
        dispose();
    }//GEN-LAST:event_menuItemDerivadasActionPerformed

    private void menuItemIntegraisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemIntegraisActionPerformed
        new Derivadas().setVisible(true);
        dispose();
    }//GEN-LAST:event_menuItemIntegraisActionPerformed

    private void btUSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUSActionPerformed
        setTitle("Differential and Integral Calculus I System");
        lbTitulo.setText("<html>Differential and Integral <br> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Calculus I System</html>");
        btnFuncoes.setText(toUpperCase("Functions"));
        btnFuncoes.setToolTipText("1st and 2nd degree functions calculation");
        btnDerivadas.setText(toUpperCase("Derivatives"));
        btnDerivadas.setToolTipText("Derivatives calculation");
        btnIntegrais.setText(toUpperCase("Integrals"));
        btnIntegrais.setToolTipText("Integrals calculation");
        btnSobre.setText(toUpperCase("About"));
        btnSobre.setToolTipText("About the Software and Development Team");
        itemMenuAjuda.setText("Help");
        itemMenuVersao.setText("Version");
        itemMenuVersao.setToolTipText("Informations about the software's Copyrights");
        itemMenuDesenvolvedores.setText("Developers");
        itemMenuDesenvolvedores.setToolTipText("About the Developer's Team");
        itemMenuSair.setText("Exit");
        menuArquivo.setText("ARCHIVE");
        menuItemFuncoes.setText("Functions");
        menuItemFuncoes.setToolTipText("1st and 2nd degree functions calculation");
        menuItemDerivadas.setText("Derivatives");
        menuItemDerivadas.setToolTipText("Derivative calculation");
        menuItemIntegrais.setText("Integrals");
        menuItemIntegrais.setToolTipText("Integrals calculation");
        btnIntegrais.setToolTipText("Integrals calculation");
        menuSobre.setText("ABOUT");
        btUS.setToolTipText("Translate system to american english");
        btBR.setToolTipText("Translate system to brazilian portuguese");
        menuTraducao.setText("Translate");
        itemMenuBR.setText("Portuguese - Brasil");
        itemMenuUS.setText("American English");
        itemMenuBR.setToolTipText("Translate system to brazilian portuguese");
        itemMenuUS.setToolTipText("Translate system to american english");
        pack();

        translate = true;
    }//GEN-LAST:event_btUSActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        if (translate == true) {
            setTitle("Differential and Integral Calculus I System");
            lbTitulo.setText("<html>Differential and Integral <br> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Calculus I System</html>");
            btnFuncoes.setText(toUpperCase("Functions"));
            btnFuncoes.setToolTipText("1st and 2nd degree functions calculation");
            btnDerivadas.setText(toUpperCase("Derivatives"));
            btnDerivadas.setToolTipText("Derivatives calculation");
            btnIntegrais.setText(toUpperCase("Integrals"));
            btnIntegrais.setToolTipText("Integrals calculation");
            btnSobre.setText(toUpperCase("About"));
            btnSobre.setToolTipText("About the Software and Development Team");
            itemMenuAjuda.setText("Help");
            itemMenuVersao.setText("Version");
            itemMenuVersao.setToolTipText("Informations about the software's Copyrights");
            itemMenuDesenvolvedores.setText("Developers");
            itemMenuDesenvolvedores.setToolTipText("About the Developer's Team");
            itemMenuSair.setText("Exit");
            menuArquivo.setText("ARCHIVE");
            menuItemFuncoes.setText("Functions");
            menuItemFuncoes.setToolTipText("1st and 2nd degree functions calculation");
            menuItemDerivadas.setText("Derivatives");
            menuItemDerivadas.setToolTipText("Derivative calculation");
            menuItemIntegrais.setText("Integrals");
            btnIntegrais.setToolTipText("Integrals calculation");
            menuSobre.setText("ABOUT");
            btUS.setToolTipText("Translate system to american english language");
            btBR.setToolTipText("Translate system to brazilian portuguese language");
            menuTraducao.setText("Translate");
            itemMenuBR.setText("Portuguese - Brasil");
            itemMenuUS.setText("American English");
            itemMenuBR.setToolTipText("Translate system to brazilian portuguese language");
            itemMenuUS.setToolTipText("Translate system to american english language");
            pack();

            translate = true;
        } else {
            lbTitulo.setText("<html>&nbsp;&nbsp;Sistema de Cálculo <br>Diferencial Integral I</html>");
            pack();
        }
    }//GEN-LAST:event_formComponentShown

    private void btBRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBRActionPerformed
        TelaInicial t = new TelaInicial();
        dispose();
        t.setVisible(true);
        translate = false;
    }//GEN-LAST:event_btBRActionPerformed

    private void itemMenuBRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuBRActionPerformed
        TelaInicial t = new TelaInicial();
        dispose();
        t.setVisible(true);
        translate = false;
    }//GEN-LAST:event_itemMenuBRActionPerformed

    private void itemMenuUSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuUSActionPerformed
        setTitle("Differential and Integral Calculus I System");
        lbTitulo.setText("<html>Differential and Integral <br> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Calculus I System</html>");
        btnFuncoes.setText(toUpperCase("Functions"));
        btnFuncoes.setToolTipText("1st and 2nd degree functions calculation");
        btnDerivadas.setText(toUpperCase("Derivatives"));
        btnDerivadas.setToolTipText("Derivatives calculation");
        btnIntegrais.setText(toUpperCase("Integrals"));
        btnIntegrais.setToolTipText("Integrals calculation");
        btnSobre.setText(toUpperCase("About"));
        btnSobre.setToolTipText("About the Software and Development Team");
        itemMenuAjuda.setText("Help");
        itemMenuVersao.setText("Version");
        itemMenuVersao.setToolTipText("Informations about the software's Copyrights");
        itemMenuDesenvolvedores.setText("Developers");
        itemMenuDesenvolvedores.setToolTipText("About the Developer's Team");
        itemMenuSair.setText("Exit");
        menuArquivo.setText("Archive");
        menuItemFuncoes.setText("Functions");
        menuItemFuncoes.setToolTipText("1st and 2nd degree functions calculation");
        menuItemDerivadas.setText("Derivatives");
        menuItemDerivadas.setToolTipText("Derivative calculation");
        menuItemIntegrais.setText("Integrals");
        btnIntegrais.setToolTipText("Integrals calculation");
        menuSobre.setText("About");
        btUS.setToolTipText("Translate system to american english language");
        btBR.setToolTipText("Translate system to brazilian portuguese language");
        menuTraducao.setText("Translate");
        itemMenuBR.setText("Portuguese - Brasil");
        itemMenuUS.setText("American English");
        itemMenuBR.setToolTipText("Translate system to brazilian portuguese language");
        itemMenuUS.setToolTipText("Translate system to american english language");
        pack();

        translate = true;
    }//GEN-LAST:event_itemMenuUSActionPerformed

    private void itemMenuDesenvolvedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuDesenvolvedoresActionPerformed
        if (translate == true) {
            JOptionPane.showMessageDialog(null, "<html>Development Team: <br><br>"
                    + "<br> Pedro Henrique Omena Vieira: Software's Review and Translation.<br>"
                    + "<br> Roger de Oliveira Trevizan: Software's Analysis and Development.<br>"
                    + "<br> Thaynara Alves da Silva: Software's Documentation, Design and Final Review.<br>"
                    + "<br><br><br> All the collaborators are, currently, graduating "
                    + "at 2nd Semester of the Systems Analisys and Development by Faculdade de Tecnologia de Americana - SP.",
                    "Sobre os Desenvolvedores", JOptionPane.PLAIN_MESSAGE,
                    new ImageIcon("D:/Roger Documentos/Documents/NetBeansProjects/SisCalc1/src/Imagens/desenvolvedores_icone_150x150.png"));
        } else {
            JOptionPane.showMessageDialog(null, "<html>Equipe de Desenvolvimento: <br><br>"
                    + "<br> Pedro Henrique Omena Vieira: Revisão e Tradução do Software.<br>"
                    + "<br> Roger de Oliveira Trevizan: Análise e Desenvolvimento do Software.<br>"
                    + "<br> Thaynara Alves da Silva: Documentação, Design e Revisão Final do Software.<br>"
                    + "<br><br><br> Todos os colaboradores, atualmente, são graduandos "
                    + "no 2º Semestre de Análise e Desenvolvimento de Sistemas pela Faculdade de Tecnologia de Americana - SP.",
                    "Sobre os Desenvolvedores", JOptionPane.PLAIN_MESSAGE,
                    new ImageIcon("D:/Roger Documentos/Documents/NetBeansProjects/SisCalc1/src/Imagens/desenvolvedores_icone_150x150.png"));
        }
    }//GEN-LAST:event_itemMenuDesenvolvedoresActionPerformed

    private void itemMenuVersaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuVersaoActionPerformed
        new Sobre().setVisible(true);
    }//GEN-LAST:event_itemMenuVersaoActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBR;
    private javax.swing.JButton btUS;
    private javax.swing.JButton btnDerivadas;
    private javax.swing.JButton btnFuncoes;
    private javax.swing.JButton btnIntegrais;
    private javax.swing.JButton btnSobre;
    private javax.swing.JMenuItem itemMenuAjuda;
    private javax.swing.JMenuItem itemMenuBR;
    private javax.swing.JMenuItem itemMenuDesenvolvedores;
    private javax.swing.JMenuItem itemMenuSair;
    private javax.swing.JMenuItem itemMenuUS;
    private javax.swing.JMenuItem itemMenuVersao;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JMenu menuArquivo;
    private javax.swing.JMenuItem menuItemDerivadas;
    private javax.swing.JMenuItem menuItemFuncoes;
    private javax.swing.JMenuItem menuItemIntegrais;
    private javax.swing.JMenu menuSobre;
    private javax.swing.JMenu menuTraducao;
    // End of variables declaration//GEN-END:variables
}
