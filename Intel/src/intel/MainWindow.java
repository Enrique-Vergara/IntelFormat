/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intel;

import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kique
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
        jTabbedPane1.setBounds(this.getX(), this.getY(), 360, 270);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        tab_archivo = new javax.swing.JPanel();
        btn_buscar = new javax.swing.JButton();
        tab_consola = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        initDir = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        mainText = new javax.swing.JTextArea();
        btn_finalizar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Formato Intel");
        setMinimumSize(new java.awt.Dimension(360, 260));
        setPreferredSize(new java.awt.Dimension(360, 260));
        setResizable(false);

        jTabbedPane1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(360, 260));
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        tab_archivo.setMinimumSize(new java.awt.Dimension(360, 260));
        tab_archivo.setPreferredSize(new java.awt.Dimension(360, 260));

        btn_buscar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btn_buscar.setText("Buscar Archivo");
        btn_buscar.setToolTipText("Archivo.txt");
        btn_buscar.setAlignmentX(0.5F);
        btn_buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_buscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tab_archivoLayout = new javax.swing.GroupLayout(tab_archivo);
        tab_archivo.setLayout(tab_archivoLayout);
        tab_archivoLayout.setHorizontalGroup(
            tab_archivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab_archivoLayout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );
        tab_archivoLayout.setVerticalGroup(
            tab_archivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab_archivoLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(144, 144, 144))
        );

        jTabbedPane1.addTab("Desde Archivo", tab_archivo);

        jLabel1.setText("Dirección de Inicio (decimal):");

        initDir.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        initDir.setText("0");
        initDir.setToolTipText("Decimal");
        initDir.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        initDir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                initDirActionPerformed(evt);
            }
        });

        mainText.setColumns(20);
        mainText.setRows(5);
        jScrollPane1.setViewportView(mainText);

        btn_finalizar.setText("Finalizar");
        btn_finalizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_finalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_finalizarActionPerformed(evt);
            }
        });

        jLabel2.setText("Instrucciones en Hexadecimal:");

        jLabel3.setText("Archivo de salida: ");

        jTextField1.setText("file1");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tab_consolaLayout = new javax.swing.GroupLayout(tab_consola);
        tab_consola.setLayout(tab_consolaLayout);
        tab_consolaLayout.setHorizontalGroup(
            tab_consolaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab_consolaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tab_consolaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(tab_consolaLayout.createSequentialGroup()
                        .addGroup(tab_consolaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(tab_consolaLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1))
                            .addComponent(jLabel2)
                            .addGroup(tab_consolaLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(initDir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 37, Short.MAX_VALUE)
                        .addComponent(btn_finalizar)))
                .addContainerGap())
        );
        tab_consolaLayout.setVerticalGroup(
            tab_consolaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab_consolaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tab_consolaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(tab_consolaLayout.createSequentialGroup()
                        .addGroup(tab_consolaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(initDir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(tab_consolaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(tab_consolaLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(btn_finalizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                .addContainerGap())
        );

        initDir.getAccessibleContext().setAccessibleName("");

        jTabbedPane1.addTab("Introducir Datos", tab_consola);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        // TODO add your handling code here:
        System.out.println("Buscando archivo");

        File workingDirectory = new File(System.getProperty("user.dir"));
        jFileChooser1.setCurrentDirectory(workingDirectory);

        javax.swing.filechooser.FileNameExtensionFilter filter = new javax.swing.filechooser.FileNameExtensionFilter("TEXT FILES", "txt", "text");
        jFileChooser1.setFileFilter(filter);

        int seleccion = jFileChooser1.showOpenDialog(this);

        if (seleccion == javax.swing.JFileChooser.APPROVE_OPTION) {
            File f = jFileChooser1.getSelectedFile();
            try {
                desdeArchivo(f);
            } catch (IOException ex) {
                System.out.println("Error al leer archivo");
            }
        }

    }//GEN-LAST:event_btn_buscarActionPerformed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        // TODO add your handling code here:
        int id = jTabbedPane1.getSelectedIndex();
        if (id == 0) {
            this.setBounds(this.getX(), this.getY(), 360, 260);
        } else {
            this.setBounds(this.getX(), this.getY(), 400, 600);
        }
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btn_finalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_finalizarActionPerformed
        System.out.println("\nObteniendo Datos\n");
        String contents = mainText.getText();

        contents = contents.replace("\n", " ");
        contents = contents.trim().replaceAll(" +", " ");
        contents = contents.toUpperCase();

        List<String> instructions = new ArrayList<>();
        int initialDir = 0;

        if (Integer.parseInt(initDir.getText()) >= 0) {
            initialDir = Integer.parseInt(initDir.getText());
        }

        String name = jTextField1.getText();
        if (name.length() == 0) {
            name = "file1";
        }

        // Lectura de instrucciones
        try {

            String[] splited = contents.split(" ");

            for (int i = 0; i < splited.length; i++) {
                if (isHex(splited[i])) {
                    instructions.add(splited[i]);
                } else {
                    System.out.println("Valor omitido: " + splited[i]);
                }
            }

        } catch (Exception e) {
            System.out.println("Error en obtencion de datos");
            return;
        }
        if (instructions.size() != 0) {
            try {
                formatoIntel(instructions, initialDir, name);
            } catch (IOException ex) {
                Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btn_finalizarActionPerformed

    private void initDirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_initDirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_initDirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // Luis Enrique Vergara Badillo
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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    public void desdeArchivo(File f) throws IOException {
        System.out.println("\nArchivo Seleccionado: " + f);

        List<String> instructions = new ArrayList<>();
        String name = f.getName();
        boolean firstline = true;
        int initialDir = 0;
        boolean type = true; // Tipo de documento txt

        // Lectura de instrucciones
        try {
            Scanner myReader = new Scanner(f);
            while (myReader.hasNextLine()) {

                String data = myReader.nextLine();
                String[] splited = data.split(" ");

                if (firstline) {
                    if (splited.length == 1) { //Tipo 1
                        initialDir = Integer.valueOf(splited[0]);
                        firstline = false;
                        type = true;
                    } else if (splited.length == 2) { //Tipo 2
                        initialDir = Integer.valueOf(splited[0]);
                        firstline = false;
                        type = false;

                        if (isHex(splited[1])) {
                            instructions.add(splited[1]);
                        } else {
                            System.out.println("Valor omitido: " + splited[1]);
                        }

                    }
                } else {

                    if (splited.length > 0) {
                        if (type) {
                            if (isHex(splited[0])) {
                                instructions.add(splited[0]);
                            } else {
                                System.out.println("Valor omitido: " + splited[0]);
                            }
                        } else {
                            try {
                                if (isHex(splited[1])) {
                                    instructions.add(splited[1]);
                                } else {
                                    System.out.println("Valor omitido: " + splited[1]);
                                }
                            } catch (Exception e) {
                                System.out.println("Linea omitida");
                            }
                        }
                    }
                }
            }
            myReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error en lectura de archivo");
            return;
        }
        if (instructions.size() != 0) {
            formatoIntel(instructions, initialDir, name);
        }
    }

    public void formatoIntel(List<String> instructions, int initialDir, String fileName) throws IOException {

        System.out.println("\nGenerando formato Intel\n");
        List<String> lineas = new ArrayList<>();

        // Padding a 16
        while (instructions.size() % 16 != 0) {
            instructions.add("00");
        }

        int i, j, intchecksum;
        String codigoInicio, longitud, direccion, tipoRegistro, datos, checksum = "";
        String linea;

        codigoInicio = ":";
        tipoRegistro = "00";
        longitud = "10";

        int dir = initialDir;

        //Creacion de lineas
        try {
            for (i = 0; i < instructions.size() / 16; i++) {

                j = i * 16;
                intchecksum = 0;
                direccion = getdir(dir);
                System.out.println("Direccion:" +dir);
                linea = codigoInicio + longitud + direccion + tipoRegistro;

                intchecksum += Integer.valueOf(longitud, 16);
                intchecksum += Integer.valueOf(direccion, 16);
                intchecksum += Integer.valueOf(tipoRegistro, 16);

                for (; j < (i * 16) + 16; j++) {
                    linea += instructions.get(j);
                    intchecksum += Integer.valueOf(instructions.get(j), 16);
                }

                checksum = getChecksum(intchecksum);
                linea += checksum;

                lineas.add(linea);
                System.out.println(linea);

                //Actualizar direccion
                dir+=16;
            }
        } catch (Exception e) {
            System.out.println("Error en procesamiento de datos");
            return;
        }

        linea = ":00000001FF";
        lineas.add(linea);
        System.out.println(linea);

        guardarArchivo(lineas, fileName);
    }

    public static String getdir(int x) {
        String hex = Integer.toHexString(x);
        System.out.println("Direccion a hex: "+hex);
        if (hex.length() != 4) {
            String dir = "";
            for (int i = 0; i < (4 - hex.length()); i++) {
                dir += "0";
            }
            hex = dir + hex;
        }
        System.out.println("Direccion a hex 2: "+hex);
        return hex.toUpperCase();
    }

    public String getChecksum(int intchecksum) {
        int checksum = (~(intchecksum & 0xFF) + 1) & 0xFF;
        String res = Integer.toHexString(checksum).toUpperCase();
        
        if(res.length()==1){
            res = '0'+res;
        }
        
        return res;
    }

    private static boolean isHex(String num) {
        if (num.length() != 2) {
            return false;
        }
        try {
            Long.parseLong(num, 16);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    public void guardarArchivo(List<String> lineas, String nombre) throws IOException{

        nombre = nombre.replace(".txt", "");
        nombre = nombre + ".hex";

        System.out.println("\nGuardando archivo " + nombre + "\n");

        try {
            File archivo = new File(nombre);
            BufferedWriter bw;

            bw = new BufferedWriter(new FileWriter(archivo));
            for (int i = 0; i < lineas.size(); i++) {
                bw.write(lineas.get(i) + "\n");
            }
            bw.close();
            
            String text = "Archivo guardado con éxito: "+nombre;
            javax.swing.JOptionPane.showMessageDialog(null, text, "InfoBox: " + "info", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            
        } catch (FileNotFoundException e) {
            System.out.println("Error en escritura de archivo");
            javax.swing.JOptionPane.showMessageDialog(null, "Error al crear archivo", "InfoBox: " + "Error", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            return;
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_finalizar;
    private javax.swing.JFormattedTextField initDir;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextArea mainText;
    private javax.swing.JPanel tab_archivo;
    private javax.swing.JPanel tab_consola;
    // End of variables declaration//GEN-END:variables

}