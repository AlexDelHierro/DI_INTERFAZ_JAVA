package ventana;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Ventana extends JFrame {
public Ventana() {
	this.setSize(500,900);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	this.setTitle("Formulario de reguistro");
	//this.setLocation(100,200);
	this.setLocationRelativeTo(null);
	this.IniciarComponentes();
}

private void IniciarComponentes() {
	JPanel panel = new JPanel();
	//panel.setBackground(Color.BLUE);
	panel.setLayout(null);
	this.getContentPane().add(panel);
	
	JLabel lbUser =new JLabel(); //Añadir textos
	lbUser.setBounds(210,-10,100,50);
	Font font = new Font("Tahoma", Font.BOLD, 20);
	lbUser.setText("Sign Up");
	lbUser.setFont(font);
	panel.add(lbUser);
	
	JLabel lbUser1 =new JLabel(); //Añadir textos
	lbUser1.setBounds(10,10,130,120);
	Font font2 = new Font("Tahoma", Font.BOLD, 14);
	lbUser1.setText("Your basic info");
	lbUser1.setFont(font2);
	panel.add(lbUser1);
	
	JLabel lbUser2 =new JLabel(); //Añadir textos
	lbUser2.setBounds(10,50,100,100);
	lbUser2.setText("Name:");
	panel.add(lbUser2);
	
	JTextField txtUser =new JTextField(); // Añadir inputs 
	txtUser.setBounds(10,120,460,40);
	panel.add(txtUser);
	
	JLabel lbUser3 =new JLabel(); //Añadir textos
	lbUser3.setBounds(10,140,100,100);
	lbUser3.setText("Email:");
	panel.add(lbUser3);
	
	JTextField txtUser1 =new JTextField(); // Añadir inputs 
	txtUser1.setBounds(10,210,460,40);
	panel.add(txtUser1);
	
	JLabel lbPass =new JLabel();
	lbPass.setBounds(10,250,100,50);
	lbPass.setText("Password:");
	panel.add(lbPass);
	
	JPasswordField txtPass =new JPasswordField();
	txtPass.setBounds(10,290,460,40);
	panel.add(txtPass);
	
	JLabel lbUser4 =new JLabel(); //Añadir textos
	lbUser4.setBounds(10,300,100,100);
	lbUser4.setText("Age:");
	panel.add(lbUser4);
	
	//Creamos los radioButtons
	JRadioButton radio1 = new JRadioButton("Under 13");
	JRadioButton radio2 = new JRadioButton("13 or Older");
	
	//Agrupamos los radioButtons para que solo se pueda sleccionar uno
	ButtonGroup buttonGroup = new ButtonGroup();
	buttonGroup.add(radio1);
	buttonGroup.add(radio2);
	
	radio1.setBounds(10, 360, 100, 40);
	radio2.setBounds(10, 390, 100, 40);
	
	panel.add(radio1);
	panel.add(radio2);
	
	JLabel lbUser5 =new JLabel(); //Añadir textos
	lbUser5.setBounds(10,410,100,100);
	lbUser5.setText("Your profile");
	lbUser5.setFont(font2);
	panel.add(lbUser5);
	
	JLabel lbUser6 =new JLabel(); //Añadir textos
	lbUser6.setBounds(10,440,100,100);
	lbUser6.setText("Biography:");
	panel.add(lbUser6);
	
	JTextField txtUser11 =new JTextField(); // Añadir inputs 
	txtUser11.setBounds(10,500,460,100);
	panel.add(txtUser11);
	
	JLabel lbUser7 =new JLabel(); //Añadir textos
	lbUser7.setBounds(10,580,100,100);
	lbUser7.setText("Job Role:");
	panel.add(lbUser7);
	
	String[] roles = {"Front-End Developer", "Back-End Developer", "APP Developer"};
	JComboBox<String> comboBox = new JComboBox<>(roles);
	comboBox.setBounds(10, 650, 460, 30);
	panel.add(comboBox);
	
	JLabel lbUser8 =new JLabel(); //Añadir textos
	lbUser8.setBounds(10,650,100,100);
	lbUser8.setText("Interests:");
	panel.add(lbUser8);
	
	// Crear casillas de verificación (checkboxes)
	JCheckBox checkBox1 = new JCheckBox("Development");
	checkBox1.setBounds(10, 710, 150, 30);
	panel.add(checkBox1);

	JCheckBox checkBox2 = new JCheckBox("Design");
	checkBox2.setBounds(10, 730, 150, 30);
	panel.add(checkBox2);

	JCheckBox checkBox3 = new JCheckBox("Business");
	checkBox3.setBounds(10, 750, 150, 30);
	panel.add(checkBox3);
	
	JButton btEntrar = new JButton();
	btEntrar.setText("Sign Up");
	btEntrar.setBounds(10,800,460,50);
	panel.add(btEntrar);
	
	
	ActionListener oyenteAccion = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent a) {
            String user = txtUser.getText();
            String age = radio1.isSelected() ? "Under 13" : "13 or Older";
            String selectedRole = comboBox.getSelectedItem().toString();
            String interests = "";

            if (checkBox1.isSelected()) {
                interests += "Development, ";
            }
            if (checkBox2.isSelected()) {
                interests += "Design, ";
            }
            if (checkBox3.isSelected()) {
                interests += "Business, ";
            }

            // Eliminar la coma y el espacio extra al final de los intereses
            if (!interests.isEmpty()) {
                interests = interests.substring(0, interests.length() - 2);
            }

            String message = "Nombre: " + user + "\n";
            message += "Edad: " + age + "\n";
            message += "Rol: " + selectedRole + "\n";
            message += "Intereses: " + interests;

            JOptionPane.showMessageDialog(null,
                    "Tus datos:\n" + message,
                    "Registro exitoso",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    };
	
	btEntrar.addActionListener(oyenteAccion);
	
	
	
	
	
	
	
}

private Font newFont(String string, int plain, int i) {
	// TODO Auto-generated method stub
	return null;
}
}
