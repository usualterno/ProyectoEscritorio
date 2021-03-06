package Formularios;
//LIBRERÍAS
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import proyectoescritorio.SplashInicio;

public class InicioSesion extends javax.swing.JFrame{
    private SplashInicio splashInicio;
    //MÉTODO PARA ASIGNAR UN VALOR Y TEXTO AL SPLASH
    public InicioSesion(SplashInicio splashInicio){
        this.splashInicio=splashInicio;
        setProgress(0,"Cargando Componentes del Sistema");
        initComponents();
        setProgress(20,"Conectandose a la Base de Datos");
        setProgress(40,"Cargando Módulos");
        setProgress(60,"Módulos Cargados...");
        setProgress(80,"Cargando Interfaces");
        setProgress(90,"Interfaces Cargadas...");
        setProgress(100,"Bienvenido al Sistema");
        setTitle("Inicio Sesión Your Hospital");//TÍTULO DE LA VENTANA
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Acceso.png")).getImage());//PONER IMAGEN ICONO
        setResizable(false);//BLOQUEA EL TAMAÑO DE LA VENTANA
        setLocationRelativeTo(null);//CENTRAR LA VENTANA
        txtusuario.requestFocus();
        Letras(txtusuario);
    }
    private void setProgress(int percent,String information){
        splashInicio.getJLabel().setText(information);
        splashInicio.getJProgressBar().setValue(percent);
        try{
            Thread.sleep(1500);}//TIEMPO QUE DEMORA EL SISTEMA EN CARGAR
        catch(InterruptedException e){
            JOptionPane.showMessageDialog(null,"No se puedo ejecutar la presentación");}
    }
    //CONSTRUCTOR
    public InicioSesion(){
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpiniciosesion = new javax.swing.JPanel();
        lbltitulo = new javax.swing.JLabel();
        lblusuario = new javax.swing.JLabel();
        lblcontrasena = new javax.swing.JLabel();
        btningresar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        btnrecordar = new javax.swing.JButton();
        txtusuario = new javax.swing.JTextField();
        jpcontrasena = new javax.swing.JPasswordField();
        lblfondo = new javax.swing.JLabel();
        lblidiomas = new javax.swing.JLabel();
        cbidiomas = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jpiniciosesion.setBackground(new java.awt.Color(255, 255, 255));
        jpiniciosesion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbltitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbltitulo.setForeground(new java.awt.Color(255, 0, 0));
        lbltitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Acceso.png"))); // NOI18N
        lbltitulo.setText("Inicio de Sesión");
        jpiniciosesion.add(lbltitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        lblusuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblusuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario.png"))); // NOI18N
        lblusuario.setText("Usuario");
        jpiniciosesion.add(lblusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 70, 27));

        lblcontrasena.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblcontrasena.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/contraseña.png"))); // NOI18N
        lblcontrasena.setText("Contraseña");
        jpiniciosesion.add(lblcontrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 90, 27));

        btningresar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btningresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/entrar3a.png"))); // NOI18N
        btningresar.setText("Ingresar");
        btningresar.setMaximumSize(new java.awt.Dimension(113, 25));
        btningresar.setMinimumSize(new java.awt.Dimension(113, 25));
        btningresar.setPreferredSize(new java.awt.Dimension(113, 25));
        btningresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btningresarActionPerformed(evt);
            }
        });
        btningresar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btningresarKeyTyped(evt);
            }
        });
        jpiniciosesion.add(btningresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 120, -1));

        btnsalir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SALIR.PNG"))); // NOI18N
        btnsalir.setText("Salir");
        btnsalir.setMaximumSize(new java.awt.Dimension(133, 25));
        btnsalir.setMinimumSize(new java.awt.Dimension(133, 25));
        btnsalir.setPreferredSize(new java.awt.Dimension(113, 25));
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });
        btnsalir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btnsalirKeyTyped(evt);
            }
        });
        jpiniciosesion.add(btnsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 100, -1));

        btnrecordar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnrecordar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/recordar2.png"))); // NOI18N
        btnrecordar.setText("Recordar Contraseña");
        btnrecordar.setPreferredSize(new java.awt.Dimension(193, 25));
        jpiniciosesion.add(btnrecordar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 200, -1));

        txtusuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtusuario.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(102, 102, 102)));
        txtusuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtusuarioKeyTyped(evt);
            }
        });
        jpiniciosesion.add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 130, 27));

        jpcontrasena.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jpcontrasena.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(102, 102, 102)));
        jpcontrasena.setEchoChar('*');
        jpcontrasena.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jpcontrasenaKeyTyped(evt);
            }
        });
        jpiniciosesion.add(jpcontrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 130, 27));

        lblfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/hospital.gif"))); // NOI18N
        jpiniciosesion.add(lblfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 450, 270));

        lblidiomas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblidiomas.setText("Idiomas");
        jpiniciosesion.add(lblidiomas, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 70, 27));

        cbidiomas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbidiomas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Spanish", "English" }));
        cbidiomas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbidiomasItemStateChanged(evt);
            }
        });
        jpiniciosesion.add(cbidiomas, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 90, 27));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpiniciosesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpiniciosesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //INGRESO AL SISTEMA
    private void btningresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btningresarActionPerformed
        Ingresar();
    }//GEN-LAST:event_btningresarActionPerformed
    //SALIDA DEL SISTEMA
    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnsalirActionPerformed
    //CAMBIO DE IDIOMA
    private void cbidiomasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbidiomasItemStateChanged
        String idioma=cbidiomas.getSelectedItem().toString();
        if(idioma.equals("English")){
            lblusuario.setText("User");
            lblcontrasena.setText("Password");
            btningresar.setText("Log in");
            btnsalir.setText("Exit");
            btnrecordar.setText("Lost Password");
            lbltitulo.setText("Account Login");
            lblidiomas.setText("Languages");
            txtusuario.requestFocus();}
        else{
            lblusuario.setText("Usuario");
            lblcontrasena.setText("Contraseña");
            btningresar.setText("Ingresar");
            btnsalir.setText("Salir");
            btnrecordar.setText("Recordar Contraseña");
            lbltitulo.setText("Inicio Sesión");
            lblidiomas.setText("Idiomas");
            txtusuario.requestFocus();}
    }//GEN-LAST:event_cbidiomasItemStateChanged
    //LIMITACIONES Y TRASFERENCIA DE FOCUS
    private void txtusuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtusuarioKeyTyped
        if(txtusuario.getText().length()==10){
            evt.consume();}//ANULA LAS ACCIONES DEL TECLADO
        char Caracter=evt.getKeyChar();
        int Contador=(int)(Caracter);
        if(evt.getSource()==txtusuario){
            if(Contador==10){
                jpcontrasena.requestFocus();}}
    }//GEN-LAST:event_txtusuarioKeyTyped

    private void jpcontrasenaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jpcontrasenaKeyTyped
        if(jpcontrasena.getText().length()==10){
            evt.consume();}//ANULA LAS ACCIONES DEL TECLADO
        char Caracter=evt.getKeyChar();
        int Contador=(int)(Caracter);
        if(evt.getSource()==jpcontrasena){
            if(Contador==10){
                btningresar.requestFocus();}}
    }//GEN-LAST:event_jpcontrasenaKeyTyped
    //ACCIÓN DEL BOTÓN INGRESAR
    private void btningresarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btningresarKeyTyped
        Ingresar();
    }//GEN-LAST:event_btningresarKeyTyped
    //ACCIÓN DEL BOTÓN SALIR
    private void btnsalirKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnsalirKeyTyped
        System.exit(0);
    }//GEN-LAST:event_btnsalirKeyTyped
    //MÉTODO PARA INGRESAR AL SISTEMA
    public void Ingresar(){
        String user=txtusuario.getText();
        String contrasena=jpcontrasena.getText();
        if(user.equals("admin")&&contrasena.equals("admin")){
            this.dispose();
            Menu menu= new Menu();
            menu.setVisible(true);}
        else{
            if(user.equals("")&&contrasena.equals("")){
                JOptionPane.showMessageDialog(null,"Por favor ingrese los Datos","Error",JOptionPane.ERROR_MESSAGE);
                txtusuario.requestFocus();}
            else{
                JOptionPane.showMessageDialog(null,"Usuario y/o Contraseña Incorrectos","Error",JOptionPane.ERROR_MESSAGE);
                txtusuario.setText("");
                jpcontrasena.setText("");
                txtusuario.requestFocus();}}
    }
    //MÉTODO QUE VALIDA LETRAS
    private void Letras(final JTextField a){
        a.addKeyListener(new KeyAdapter(){
            @Override
            public void keyTyped(KeyEvent KE){
                char c=KE.getKeyChar();
                if(Character.isDigit(c)){//AQUÍ ESTOY COMPARANDO SI ES UN NÚMERO
                    getToolkit().beep();//SONIDO CUANDO NO LEE LA ACCIÓN DEL TECLADO
                    KE.consume();}}});//ANULA EVENTOS DEL TECLADO
    }
    public static void main(String args[]){
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
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable(){
            @Override
            public void run(){
                new InicioSesion().setVisible(true);}});
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btningresar;
    private javax.swing.JButton btnrecordar;
    private javax.swing.JButton btnsalir;
    private javax.swing.JComboBox cbidiomas;
    private javax.swing.JPasswordField jpcontrasena;
    private javax.swing.JPanel jpiniciosesion;
    private javax.swing.JLabel lblcontrasena;
    private javax.swing.JLabel lblfondo;
    private javax.swing.JLabel lblidiomas;
    private javax.swing.JLabel lbltitulo;
    private javax.swing.JLabel lblusuario;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
