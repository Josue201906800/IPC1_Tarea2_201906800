// 
// Decompiled by Procyon v0.5.36
// 

package controlsistema;

import java.awt.EventQueue;
import javax.swing.UnsupportedLookAndFeelException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import java.awt.event.ActionListener;
import javax.swing.border.Border;
import java.awt.Font;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.LayoutManager;
import org.netbeans.lib.awtextra.AbsoluteLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import java.awt.Component;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Login extends JFrame
{
    private JButton Salir;
    private JLabel Ver;
    private JButton btnIngresar;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JPanel jPanel1;
    private JSeparator jSeparator1;
    private JSeparator jSeparator2;
    private JPasswordField txtpass;
    private JTextField txtusuario;
    
    public Login() {
        this.initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Login");
    }
    
    public void sistema() {
        final String usuario = this.txtusuario.getText();
        final String clave = String.valueOf(this.txtpass.getPassword());
        if (usuario.equals("Josu\u00e9DavidQuiej") && clave.compareTo("201906800") == 0) {
            JOptionPane.showMessageDialog(null, "Acceso Concedido");
            final Sistema form = new Sistema();
            form.setVisible(true);
            this.dispose();
        }
        else {
            JOptionPane.showMessageDialog(null, "Error, el nombre de usuario o la contrase\u00f1a son incorrectos");
            this.txtpass.setText("");
            this.txtusuario.setText("");
        }
    }
    
    private void initComponents() {
        this.jPanel1 = new JPanel();
        this.jLabel1 = new JLabel();
        this.jLabel2 = new JLabel();
        this.txtusuario = new JTextField();
        this.jSeparator1 = new JSeparator();
        this.jLabel3 = new JLabel();
        this.txtpass = new JPasswordField();
        this.jSeparator2 = new JSeparator();
        this.btnIngresar = new JButton();
        this.Ver = new JLabel();
        this.Salir = new JButton();
        this.setDefaultCloseOperation(3);
        this.jPanel1.setBackground(new Color(255, 255, 255));
        this.jPanel1.setLayout((LayoutManager)new AbsoluteLayout());
        this.jLabel1.setIcon(new ImageIcon(this.getClass().getResource("/Imagenes/descargar.png")));
        this.jPanel1.add(this.jLabel1, new AbsoluteConstraints(90, 10, 220, 170));
        this.jLabel2.setFont(new Font("Segoe UI", 1, 14));
        this.jLabel2.setText("Password:");
        this.jPanel1.add(this.jLabel2, new AbsoluteConstraints(90, 300, 90, -1));
        this.txtusuario.setFont(new Font("Segoe UI", 1, 14));
        this.txtusuario.setBorder(null);
        this.jPanel1.add(this.txtusuario, new AbsoluteConstraints(90, 250, 210, -1));
        this.jPanel1.add(this.jSeparator1, new AbsoluteConstraints(90, 270, 210, -1));
        this.jLabel3.setFont(new Font("Segoe UI", 1, 14));
        this.jLabel3.setText("Usuario:");
        this.jPanel1.add(this.jLabel3, new AbsoluteConstraints(90, 220, 90, -1));
        this.txtpass.setFont(new Font("Segoe UI", 1, 14));
        this.txtpass.setBorder(null);
        this.jPanel1.add(this.txtpass, new AbsoluteConstraints(90, 330, 210, -1));
        this.jPanel1.add(this.jSeparator2, new AbsoluteConstraints(90, 350, 210, 10));
        this.btnIngresar.setFont(new Font("Segoe UI", 1, 14));
        this.btnIngresar.setText("Ingresar");
        this.btnIngresar.addActionListener((ActionListener)new Login.Login$1(this));
        this.jPanel1.add(this.btnIngresar, new AbsoluteConstraints(80, 410, 110, 30));
        this.Ver.setIcon(new ImageIcon(this.getClass().getResource("/Imagenes/25.jpg")));
        this.jPanel1.add(this.Ver, new AbsoluteConstraints(300, 320, 80, 40));
        this.Salir.setFont(new Font("Segoe UI", 1, 14));
        this.Salir.setText("Salir");
        this.Salir.addActionListener((ActionListener)new Login.Login$2(this));
        this.jPanel1.add(this.Salir, new AbsoluteConstraints(220, 410, 110, 30));
        final GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel1, GroupLayout.Alignment.TRAILING, -1, 416, 32767));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel1, -1, 512, 32767)));
        this.pack();
    }
    
    private void btnIngresarActionPerformed(final ActionEvent evt) {
        this.sistema();
    }
    
    private void SalirActionPerformed(final ActionEvent evt) {
        System.exit(1);
    }
    
    public static void main(final String[] args) {
        try {
            for (final UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex2) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex2);
        }
        catch (IllegalAccessException ex3) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex3);
        }
        catch (UnsupportedLookAndFeelException ex4) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex4);
        }
        EventQueue.invokeLater((Runnable)new Login.Login$3());
    }
}
