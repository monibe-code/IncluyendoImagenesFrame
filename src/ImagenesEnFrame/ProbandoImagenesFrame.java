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
	
	public void paintComponent(Graphics g) {
		super.paintComponents(g);
		
		//ponemos una imagen
		File miimagen= new File("src/ImagenesEnFrame/tango.png");
		try {
		imagen = ImageIO.read(miimagen);
		}
		catch (IOException e) {
			System.out.println("La imagen no ha podido encontrarse");
		}
		
		g.drawImage(imagen, 5, 20, null);
		
		//escribimos un texto
		Graphics2D g2= (Graphics2D) g;
		
		
		g2.setFont(new Font("Calibri", Font.BOLD, 20));
		g2.setColor(Color.GREEN.darker());
		g2.drawString("TANGO", 320, 15);
		
		
	}
	
	private Image imagen;
}