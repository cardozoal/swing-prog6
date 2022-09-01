import javax.swing.*;

public class VentanaTest extends JFrame {
    JPanel panel;
    JLabel texto;
    JButton boton;
    JTextField areatexto;
    JRadioButton btnradio;
    /* JComboBox cajacombo; */
    JCheckBox cajacheck;


public VentanaTest(){

    panel = new JPanel();
    texto = new JLabel();
    boton = new JButton();
    areatexto = new JTextField(20);
    btnradio = new JRadioButton();
    /* cajacombo = new JComboBox(); */
    cajacheck = new JCheckBox("Ingles");


this.add(panel);
panel.add(texto);
panel.add(boton);
panel.add(areatexto);
panel.add(btnradio);
/* panel.add(cajacombo); */
panel.add(cajacheck);


texto.setText("Nombre");
areatexto.setText("");
boton.setText("Aceptar");
btnradio.setText("Activar");
/* cajacombo.setText(text:"Sobre Mi"); */
    }
}