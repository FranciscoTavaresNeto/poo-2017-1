package pkg10.interfaces;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

// anti-padrão Smart GUI (tela inteligente)
public class JanelaPrincipal extends javax.swing.JFrame {
    
    private ICaixaEletronico caixa;
    
    public JanelaPrincipal() {
        initComponents();
        // preencher o combo com as cédulas
        Cedula[] cedulas = Cedula.values();        
        DefaultComboBoxModel model =
                new DefaultComboBoxModel(cedulas);        
        cbCedulas.setModel(model);
        // instanciar um CaixaEletronico
        caixa = new CaixaEletronico();
        
        lbSaldo.setText(caixa.getSaldo()+"");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfQuantidade = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbCedulas = new javax.swing.JComboBox<>();
        btAbastece = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lbSaldo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfValor = new javax.swing.JTextField();
        btSaque = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Caixa Eletrônico");
        setResizable(false);

        jLabel2.setText("Quantidade");

        jLabel3.setText("Cédula");

        cbCedulas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btAbastece.setText("Abastece");
        btAbastece.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAbasteceActionPerformed(evt);
            }
        });

        jLabel1.setText("Saldo:");

        lbSaldo.setText("jLabel5");

        jLabel4.setText("Valor do saque:");

        btSaque.setText("Saque");
        btSaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaqueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(lbSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(tfValor, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                            .addComponent(tfQuantidade))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbCedulas, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btAbastece, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(btSaque))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbCedulas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAbastece))
                .addGap(46, 46, 46)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSaque))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAbasteceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAbasteceActionPerformed
        System.out.println(tfQuantidade.getText());
        System.out.println(cbCedulas.getSelectedItem());
        
        int quantidade = Integer.parseInt(tfQuantidade.getText());
        Cedula cedula = (Cedula) cbCedulas.getSelectedItem();
        
        caixa.abastece(quantidade, cedula);
        
        System.out.println(caixa.getSaldo());
        
        lbSaldo.setText(caixa.getSaldo() + "");
        
        lbSaldo.setText(Integer.toString(caixa.getSaldo()));
    }//GEN-LAST:event_btAbasteceActionPerformed

    private void btSaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaqueActionPerformed
        // TODO add your handling code here:
        int valor = Integer.parseInt(tfValor.getText());
        
        try {
            
            caixa.saque(valor);
            JOptionPane.showMessageDialog(this, 
                    "Saque efetuado com sucesso",
                    "Sucesso",
                    JOptionPane.INFORMATION_MESSAGE);
            
        } catch (CedulaIndisponivelException ex) {
            
            JOptionPane.showMessageDialog(this, 
                    "Não há cédulas para saque",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
            
        } catch (SaldoInsuficienteException ex) {
            
            JOptionPane.showMessageDialog(this, 
                    "Saldo insuficiente para saque",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
            
        } catch (Exception ex) {
            
            JOptionPane.showMessageDialog(this, 
                    "Ocorreu um erro inesperado",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
            
        }
        
        lbSaldo.setText(Integer.toString(caixa.getSaldo()));
    }//GEN-LAST:event_btSaqueActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAbastece;
    private javax.swing.JButton btSaque;
    private javax.swing.JComboBox<String> cbCedulas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbSaldo;
    private javax.swing.JTextField tfQuantidade;
    private javax.swing.JTextField tfValor;
    // End of variables declaration//GEN-END:variables
}
