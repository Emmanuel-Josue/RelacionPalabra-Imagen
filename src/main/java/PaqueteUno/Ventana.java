
package PaqueteUno;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import PaqueteUno.Acciones;



public class Ventana extends JFrame {
    private JPanel panel;
    private JLabel etiqueta1;
    private JButton boton1;
    private JToggleButton botonActivacion1,botonActivacion2,botonActivacion3,botonActivacion4;
    
    
    public Ventana(){
    setSize(1000,750); 
    setDefaultCloseOperation(EXIT_ON_CLOSE);// Indicamos que al cerrar la ventana deje de correr el programa
    setTitle("Diverso 1.4");//Ponemos titulo
    // Como podemos centrar el programa --> centra las letras en el tamaño de la etiqueta no de la ventana
    setLocationRelativeTo(null);
     // Para establecer un tamaño minimo al cual se podra hacer pequeña 
    setMinimumSize(new Dimension(500,500));
     //LLamamos al metodo del panel
     iniciarComponentes();
    }
    
    private void iniciarComponentes(){
    colocarPanel();
    colocarEtiqueta();
    botonActivacion("src/main/java/PaqueteDos/FIND.jpg","src/main/java/PaqueteDos/FIND.jpg","src/main/java/PaqueteDos/FIND.jpg","src/main/java/PaqueteDos/FIND.jpg");
    boton();
    
    }
    
    private void colocarPanel(){
    panel=new JPanel();
    //Deshabilitamos el diseño
    panel.setLayout(null);
    this.getContentPane().add(panel);//No entiend del todo este metodo 
    
    }
    
    private void colocarEtiqueta(){
    etiqueta1=new JLabel();
    etiqueta1.setText("Word");
    etiqueta1.setBounds(100, 25, 800, 55);
    etiqueta1.setHorizontalAlignment(SwingConstants.CENTER);
    etiqueta1.setForeground(Color.GREEN);
    etiqueta1.setFont(new Font("arial",Font.HANGING_BASELINE,35));
    panel.add(etiqueta1);//agregamos la etiqueta al panel
    
    
    }
    
  
    private void botonActivacion(String imagen1,String imagen2,String imagen3,String imagen4){
     
    // Nota: no pude inplementar el metodo gerClass().getResouse("direccion de la imagen");     
        
        
    botonActivacion1=new JToggleButton();
    botonActivacion1.setBounds(200, 100, 250, 250);
    ImageIcon imagenBoton1=new ImageIcon(imagen1);
    botonActivacion1.setIcon(new ImageIcon(imagenBoton1.getImage().getScaledInstance(botonActivacion1.getWidth(),botonActivacion1.getHeight(),Image.SCALE_SMOOTH)));
    panel.add(botonActivacion1);   
    
    botonActivacion2=new JToggleButton();
    botonActivacion2.setBounds(200, 400, 250, 250);
    ImageIcon imagenBoton2=new ImageIcon(imagen2);
    botonActivacion2.setIcon(new ImageIcon(imagenBoton2.getImage().getScaledInstance(botonActivacion2.getWidth(),botonActivacion2.getHeight(),Image.SCALE_SMOOTH)));
    panel.add(botonActivacion2); 
    
    botonActivacion3=new JToggleButton();
    botonActivacion3.setBounds(550, 100, 250, 250);
    ImageIcon imagenBoton3=new ImageIcon(imagen3);
    botonActivacion3.setIcon(new ImageIcon(imagenBoton3.getImage().getScaledInstance(botonActivacion3.getWidth(),botonActivacion3.getHeight(),Image.SCALE_SMOOTH)));
    panel.add(botonActivacion3); 
    
    botonActivacion4=new JToggleButton();
    botonActivacion4.setBounds(550, 400, 250, 250);
    ImageIcon imagenBoton4=new ImageIcon(imagen4);
    botonActivacion4.setIcon(new ImageIcon(imagenBoton4.getImage().getScaledInstance(botonActivacion4.getWidth(),botonActivacion4.getHeight(),Image.SCALE_SMOOTH)));
    panel.add(botonActivacion4); 
        
    
    
    
    }


    
    private void boton(){
        boton1=new JButton("BOTON PROVICIONAL");
        
        boton1.setBounds(850, 600, 100, 50);
        
        panel.add(boton1);
        
        oyenteDeAccion();
    
    }
    
    private void oyenteDeAccion(){
    ActionListener oyenteDeAccion=new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
             Acciones logica=new Acciones();
             String[] arregloImagenes=new String[logica.arregloImagenes().length];
             arregloImagenes=logica.arregloImagenes();
             int[] numeros=new int[logica.numeroAleatorio().length];
             numeros=logica.numeroAleatorio();
             ImageIcon imagenBoton1=new ImageIcon(arregloImagenes[numeros[0]]);
             botonActivacion1.setIcon(new ImageIcon(imagenBoton1.getImage().getScaledInstance(botonActivacion1.getWidth(),botonActivacion1.getHeight(),Image.SCALE_SMOOTH)));
    
             ImageIcon imagenBoton2=new ImageIcon(arregloImagenes[numeros[1]]);
             botonActivacion2.setIcon(new ImageIcon(imagenBoton2.getImage().getScaledInstance(botonActivacion2.getWidth(),botonActivacion2.getHeight(),Image.SCALE_SMOOTH)));
   
             ImageIcon imagenBoton3=new ImageIcon(arregloImagenes[numeros[2]]);
             botonActivacion3.setIcon(new ImageIcon(imagenBoton3.getImage().getScaledInstance(botonActivacion3.getWidth(),botonActivacion3.getHeight(),Image.SCALE_SMOOTH)));
   
             ImageIcon imagenBoton4=new ImageIcon(arregloImagenes[numeros[3]]);
             botonActivacion4.setIcon(new ImageIcon(imagenBoton4.getImage().getScaledInstance(botonActivacion4.getWidth(),botonActivacion4.getHeight(),Image.SCALE_SMOOTH)));
   
              etiqueta1.setText("SI ME EJECUTO");
            
        }
    };
        
    boton1.addActionListener(oyenteDeAccion);
    }
    
    
    
    
    
}
