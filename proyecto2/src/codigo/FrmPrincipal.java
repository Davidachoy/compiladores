/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringReader;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java_cup.runtime.Symbol;
import javax.swing.JFileChooser;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author javie
 */
public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
        initComponents();
    }
    private void analizarLexico()throws IOException{
        int cont = 1;
        
        String expr = (String) txtReader.getText();
        Lexer lexer = new Lexer(new StringReader(expr));
        String resultado = "LINEA " + cont + "\t\tSIMBOLO\n";
        while (true) {
            Tokens token = lexer.yylex();
            if (token == null) {
                txtLexico.setText(resultado);
                return;
            }
             switch (token) {
            case LINEA:
                cont++;
                resultado += "LINEA " + cont + "\n";
                break;
            case INT:
                resultado += "  <Tipo de dato>\t" + lexer.lexeme + "\n";
                break;
            case FLOAT:
                resultado += "  <Tipo de dato>\t" + lexer.lexeme + "\n";
                break;
            case BOOL:
                resultado += "  <Tipo de dato>\t" + lexer.lexeme + "\n";
                break;
            case CHAR:
                resultado += "  <Tipo de dato>\t" + lexer.lexeme + "\n";
                break;
            case STRING:
                resultado += "  <Tipo de dato>\t" + lexer.lexeme + "\n";
                break;
            case IF:
                resultado += "  <Reservada if>\t" + lexer.lexeme + "\n";
                break;
            case ELIF:
                resultado += "  <Reservada elif>\t" + lexer.lexeme + "\n";
                break;
            case ELSE:
                resultado += "  <Reservada else>\t" + lexer.lexeme + "\n";
                break;
            case WHILE:
                resultado += "  <Reservada while>\t" + lexer.lexeme + "\n";
                break;
            case FOR:
                resultado += "  <Reservada for>\t" + lexer.lexeme + "\n";
                break;
            case DO:
                resultado += "  <Reservada do>\t" + lexer.lexeme + "\n";
                break;
            case RETURN:
                resultado += "  <Reservada return>\t" + lexer.lexeme + "\n";
                break;
            case LECTURA:
                resultado += "  <Reservada lectura>\t" + lexer.lexeme + "\n";
                break;
            case ESCRITURA:
                resultado += "  <Reservada escritura>\t" + lexer.lexeme + "\n";
                break;
            case MAIN:
                resultado += "  <Reservada main>\t" + lexer.lexeme + "\n";
                break;
            case TRUE:
                resultado += "  <Operador booleano>\t" + lexer.lexeme + "\n";
                break;
            case FALSE:
                resultado += "  <Operador booleano>\t" + lexer.lexeme + "\n";
                break;
            case NEGACION:
                resultado += "  <Operador negacion>\t" + lexer.lexeme + "\n";
                break;
            case OPERADOR_UNARIO:
                resultado += "  <Operador unario>\t" + lexer.lexeme + "\n";
                break;
            case SUMA:
                resultado += "  <Operador suma>\t" + lexer.lexeme + "\n";
                break;
            case RESTA:
                resultado += "  <Operador resta>\t" + lexer.lexeme + "\n";
                break;
             case MULTIPLICACION:
                resultado += "  <Operador multiplicacion>\t" + lexer.lexeme + "\n";
                break;
            case DIVISION:
                resultado += "  <Operador division>\t" + lexer.lexeme + "\n";
                break;
            case POTENCIA:
                resultado += "  <Operador potencia>\t" + lexer.lexeme + "\n";
                break;
            case MODULO:
                resultado += "  <Operador modulo>\t" + lexer.lexeme + "\n";
                break;
            case PARENTESIS_ABIERTO:
                resultado += "  <Parentesis de apertura>\t" + lexer.lexeme + "\n";
                break;
            case PARENTESIS_CERRADO:
                resultado += "  <Parentesis de cierre>\t" + lexer.lexeme + "\n";
                break;
            case LLAVE_ABIERTA:
                resultado += "  <Llave de apertura>\t" + lexer.lexeme + "\n";
                break;
            case LLAVE_CERRADA:
                resultado += "  <Llave de cierre>\t" + lexer.lexeme + "\n";
                break;
            case CORCHETE_ABIERTO:
                resultado += "  <Corchete de apertura>\t" + lexer.lexeme + "\n";
                break;
            case CORCHETE_CERRADO:
                resultado += "  <Corchete de cierre>\t" + lexer.lexeme + "\n";
                break;
            case MENOR_QUE:
                resultado += "  <Operador relacional>\t" + lexer.lexeme + "\n";
                break;
            case MENOR_IGUAL:
                resultado += "  <Operador relacional>\t" + lexer.lexeme + "\n";
                break;
            case MAYOR_QUE:
                resultado += "  <Operador relacional>\t" + lexer.lexeme + "\n";
                break;
            case MAYOR_IGUAL:
                resultado += "  <Operador relacional>\t" + lexer.lexeme + "\n";
                break;
            case IGUALES:
                resultado += "  <Operador relacional>\t" + lexer.lexeme + "\n";
                break;
            case DIFERENTES:
                resultado += "  <Operador relacional>\t" + lexer.lexeme + "\n";
                break;
            case CONJUNCION:
                resultado += "  <Operador logico>\t" + lexer.lexeme + "\n";
                break;
            case DISYUNCION:
                resultado += "  <Operador logico>\t" + lexer.lexeme + "\n";
                break;
            case COMA:
                resultado += "  <Coma>\t\t" + lexer.lexeme + "\n";
                break;
            case DOLAR:
                resultado += "  <Dolar>\t\t" + lexer.lexeme + "\n";
                break;
            case PUNTO_COMA:
                resultado += "  <Punto y coma>\t" + lexer.lexeme + "\n";
                break;
            case IGUAL:
                resultado += "  <Operador igual>\t" + lexer.lexeme + "\n";
                break;
            case IDENTIFICADOR:
                resultado += "  <Identificador>\t\t" + lexer.lexeme + "\n";
                break;
             case LITERAL_FLOAT:
                resultado += "  <Literal float>\t\t" + lexer.lexeme + "\n";
                break;
            case LITERAL_INT:
                resultado += "  <Literal int>\t\t" + lexer.lexeme + "\n";
                break;
            case LITERAL_CHAR:
                resultado += "  <Literal char>\t\t" + lexer.lexeme + "\n";
                break;
            case LITERAL_STRING:
                resultado += "  <Literal string>\t" + lexer.lexeme + "\n";
                break;
            case ERROR:
                resultado += "Elemento no definido ->" + lexer.yytext() + "\n";
                break;
            case COMENTARIO_LINEA:
             // Ignorar comentarios de una línea
                break;
            case COMENTARIO_BLOQUE:
             // Ignorar comentarios de una línea
                break;
            default:
                resultado += "  < " + lexer.lexeme + " >\n";
                break;
        }
    }
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtReader = new javax.swing.JTextArea();
        btnArchivo = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnAnalizarLexico = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtLexico = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnAnalizarSintactico = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtSintactico = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtReader.setColumns(20);
        txtReader.setRows(5);
        jScrollPane2.setViewportView(txtReader);

        btnArchivo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnArchivo.setText("Abrir Archivo");
        btnArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArchivoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(btnArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(163, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnArchivo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAnalizarLexico.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAnalizarLexico.setText("Analizar");
        btnAnalizarLexico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalizarLexicoActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton2.setText("Borrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtLexico.setEditable(false);
        txtLexico.setColumns(20);
        txtLexico.setRows(5);
        jScrollPane1.setViewportView(txtLexico);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Analizador Lexico");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAnalizarLexico, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAnalizarLexico, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnAnalizarSintactico.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAnalizarSintactico.setText("Analizar");
        btnAnalizarSintactico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalizarSintacticoActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton3.setText("Borrar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        txtSintactico.setEditable(false);
        txtSintactico.setColumns(20);
        txtSintactico.setRows(5);
        jScrollPane3.setViewportView(txtSintactico);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Analizador Sintactico");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnAnalizarSintactico, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAnalizarSintactico, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(297, 297, 297)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArchivoActionPerformed
         JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File archivo = new File(chooser.getSelectedFile().getAbsolutePath());
        try {
            String ST = new String(Files.readAllBytes(archivo.toPath()));
            txtReader.setText(ST);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnArchivoActionPerformed

    private void btnAnalizarLexicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalizarLexicoActionPerformed
        try {
            // TODO add your handling code here:
            analizarLexico();
        } catch (IOException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAnalizarLexicoActionPerformed

    private void btnAnalizarSintacticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalizarSintacticoActionPerformed
        // TODO add your handling code here:
        String ST = txtReader.getText();
        Sintax s = new Sintax(new codigo.LexerCup(new StringReader(ST)));

        List<String> errores = new ArrayList<>();

        try {
            s.parse();
            s.action_obj.imprimirTablaSimbolos();
            s.action_obj.imprimirCod3D();
            if (errores.isEmpty()) {
                txtSintactico.setText("Analisis realizado correctamente");
                txtSintactico.setForeground(new Color(25, 111, 61));
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Se encontraron los siguientes errores de sintaxis:\n");
                for (String error : errores) {
                    sb.append(error).append("\n");
                }
                txtSintactico.setText(sb.toString());
                txtSintactico.setForeground(Color.red);
            }
    
        } catch (Exception ex) {
            Symbol sym = s.getS();
            errores.add("Error de sintaxis. Linea: " + (sym.right + 1) +
                    " columna: " + (sym.left + 1) + ", Texto: \"" + sym.value + "\"");
            StringBuilder sb = new StringBuilder();
            sb.append("Se encontraron los siguientes errores de sintaxis:\n");
            for (String error : errores) {
                sb.append(error).append("\n");
            }
            txtSintactico.setText(sb.toString());
            txtSintactico.setForeground(Color.red);
        }
    }//GEN-LAST:event_btnAnalizarSintacticoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        txtLexico.setText(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        txtSintactico.setText(null);
    }//GEN-LAST:event_jButton3ActionPerformed
        
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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnalizarLexico;
    private javax.swing.JButton btnAnalizarSintactico;
    private javax.swing.JButton btnArchivo;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea txtLexico;
    private javax.swing.JTextArea txtReader;
    private javax.swing.JTextArea txtSintactico;
    // End of variables declaration//GEN-END:variables
}
