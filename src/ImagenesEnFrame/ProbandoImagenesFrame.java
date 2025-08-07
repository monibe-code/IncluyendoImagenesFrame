package ImagenesEnFrame;
import java.awt.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;


public class ProbandoImagenesFrame {
	public static void main (String[] args) {
		//TODO Auto-generated method stub
		MarcoImagen mimarco = new MarcoImagen();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
	}
}

class MarcoImagen extends JFrame{
	public MarcoImagen() {
		setTitle("Marco con Imagen");
		setBounds(550,200,700,700);
		
		LaminaConImagen milamina= new LaminaConImagen();
		add(milamina);
		milamina.setForeground(Color.BLACK);
		
		
	}
}

class LaminaConImagen extends JPanel{
	
	public LaminaConImagen() {
		try {
			imagen = ImageIO.read(new File("src/ImagenesEnFrame/bola.gif"));
			}
			catch (IOException e) {
				System.out.println("La imagen no ha podido encontrarse");
			}
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponents(g);
		
		int anchuraImagen= imagen.getWidth(this);
		int alturaImagen = imagen.getHeight(this);
		g.drawImage(imagen, 0, 0, null);
		
		for(int i=0; i<200; i++) {
			for(int j=0; j<150; j++) {
				if(i+j>0)
				g.copyArea(0, 0, anchuraImagen, alturaImagen, i*anchuraImagen, j*alturaImagen);
				
			}
		}
		
	}
	
	private Image imagen;
}