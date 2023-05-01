package ActividadDiez;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Main {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
		    public void run() {
		        JFrame frame = new JFrame();
		        PuntoUno applet = new PuntoUno();
		        frame.getContentPane().add(applet);
		        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        frame.pack();
		        frame.setVisible(true);
		        applet.init();
		        applet.start();
		    }
		});
	}

}
